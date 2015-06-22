package SampleTreeFileView;

import java.awt.Desktop;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.tools.FileObject;
import javax.xml.transform.OutputKeys;

import org.apache.commons.io.FileUtils;
import org.apache.commons.vfs.FileListener;
import org.apache.commons.vfs.FileSystemManager;
import org.apache.commons.vfs.VFS;
import org.apache.commons.vfs.impl.DefaultFileMonitor;

import server.FileTable;
import Client.MainClient;
import Controlers.*;
import Entity.DeleteFile;
import Entity.DownloadFile_Entity;
import Entity.EditFile_Entity;
import Entity.GetNotification_Entity;
import Entity.Move_Entity;
import Entity.MyFile;
import Entity.RecycleScreen_Entity;
import Entity.Rename_Entity;
import Entity.UpLoadFile;
import GUI_final.*;

public class Controller extends AbstractTransfer{
    private Model model;
    private View view; 
    
    /** Used to open/edit/print files. */
    private Desktop desktop;
    
    //GUIs
    GroupActions group;
    Settings_GUI settings;
    Settings_Controller setting_control;
    GroupAction_controller GroupA;
 
    RecycleBinScreen recycle;
    RecycleScreen_Entity recyMod ;
	RecycleBin_controller recyCon;
    
	Notification_Controller notificationCon;
	Notification notificationGui;
	GetNotification_Entity notificationEnt;
	
    //private ActionListener actionListener;
    private ActionListener openFileActionListener;
    private ActionListener settingsActionListener;
    private ActionListener logoutActionListener;
    private ActionListener createNewFolderActionListener;
    private ActionListener uploadFileActionListener;
    private ActionListener searchActionListener;
    private ActionListener GroupActionsListener;
    private ActionListener moveActionListener;
    private ActionListener deleteActionListener;
    private ActionListener renameActionListener;
    private ActionListener myFileActionListener; 
    private ActionListener sharedWithMeActionListener;
    private ActionListener trashActionListener;
    private ActionListener aboutUsActionListener;
    private ActionListener helpActionListener;
    private TreeSelectionListener treeSelectionListener;
    private ActionListener editFileActionListener;
    private ActionListener downloadFileActionListener;
    private ActionListener notficationActionListener;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view; 
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
//    private int systemexit() {
//		System.gc();
//		java.awt.Window win[] = java.awt.Window.getWindows(); 
//		for(int i=0;i<win.length;i++){ 
//		    win[i].dispose(); 
//		    win[i]=null;
//		} 
//		return 0;
//	}

	public void contol(){   
    	System.out.println("MainControlerEnable");
		MainClient.clien.setCurrController(this); // Set The Current Controller to this	
		model.setCurrPath("U_"+MainClient.clien.currUser.getIDuser()+"");
		model.setGetroot("U_"+MainClient.clien.currUser.getIDuser()+"");
		refreshListAndTree();
		desktop = Desktop.getDesktop();
		model.setMyCurrFile(new MyFile());
		
		//************************* notification
		notificationGui = new Notification();
		notificationGui.setVisible(false);
		notificationEnt = new GetNotification_Entity();
		notificationEnt.setUser(MainClient.clien.getCurrUser());
		sendToServer(notificationEnt);
		notificationCon = new Notification_Controller(notificationEnt, notificationGui);
		notificationGui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		 notficationActionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//sendToServer(new RecycleScreen_Entity());
				try {
					if(notificationGui.isVisible()==false){
						notificationGui.setVisible(true);
						notificationGui.toFront();
						notificationCon.control();
					}
					else notificationGui.toFront();
						
					}
				 catch(Throwable t) {
					//showThrowable(t);
				}
				
			}
		};
		
    	//*********************************** Edit  Files 
    	editFileActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        EditFile_Entity Edit = new EditFile_Entity(model.getMyCurrFile());
		        Edit.setUser(MainClient.clien.currUser);
		        sendToServer(Edit);
			}
    	};
    	
    	//*********************************** Download  Files 

    	downloadFileActionListener =  new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        DownloadFile_Entity download = new DownloadFile_Entity(model.getMyCurrFile());
		        download.setUser(MainClient.clien.currUser);
		        sendToServer(download);
			}
    	};

    	//*********************************** Settings! 
    	settings = new Settings_GUI();
    	 setting_control = new Settings_Controller(MainClient.clien.currUser,settings);
    	settings.setType(Type.NORMAL);
    	settings.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    	settings.setVisible(false);
    	setting_control.control();
    	settingsActionListener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			try{
    			if(settings.isVisible()==false)
				{
				view.setVisible(false);
				settings.setVisible(true);
				}
    			else settings.toFront();
    			
    			} catch(Throwable t) {
    				//showThrowable(t);
    			}
    			
    		}
    	};
    	
    	//*********************************** logOut 
    	logoutActionListener = new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			try {
					MainClient.clien.closeConnection();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    			}				
    		};					
    	
    	//*********************************** new Folder 
    	createNewFolderActionListener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			try {
    			MyFile modelDir = new MyFile();
    			modelDir.setPath(model.getCurrPath());
    			CreateFolderScreen viewDir = new CreateFolderScreen();
    			CreateFolder_Controller controllerDir = new CreateFolder_Controller(modelDir,viewDir);
    			controllerDir.control();
    			viewDir.setVisible(true);
    			} catch(Throwable t) {
    				//showThrowable(t);
    			}
    			
    		}
    	};
    	
    	//*********************************** upload! 
    	uploadFileActionListener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			try {
    				final JFileChooser fc = new JFileChooser();
					int returnValue = fc.showOpenDialog(view.getGui());
					if (returnValue == JFileChooser.APPROVE_OPTION) {
						UpLoadFile newFile = new UpLoadFile();
						File file= fc.getSelectedFile();
						newFile.getMyfile().setFileName(file.getName());
						newFile.getMyfile().setPath(model.getCurrPath());
						newFile.getMyfile().setOwner(MainClient.clien.currUser.getIDuser());
						newFile.getMyfile().setIsDeleted(0);
						newFile.getMyfile().setIsDir(0);
						newFile.getMyfile().setFSize(file.length());		      		    
					    newFile.getMyfile().mybytearray = FileUtils.readFileToByteArray(fc.getSelectedFile());
					    newFile.setUser(MainClient.clien.currUser);				
						sendToServer(newFile);
					}
    			} catch(Throwable t) {
    				System.out.println("Error Send!!");
    				t.printStackTrace();
    			}
    			
    		}
    	};
    	
    	//*********************************** search! 
    	searchActionListener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			try {
    				Object result = JOptionPane.showInputDialog(view, "Enter name:");

    			} catch(Throwable t) {
    				//showThrowable(t);
    			}
    			
    		}
    	};
    	
    	//*********************************** GroupActions
  	
    	group = new GroupActions();
    	GroupA = new GroupAction_controller(MainClient.clien.currUser,group);
    	group.setType(Type.NORMAL);
    	group.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    	group.setVisible(false);
    	GroupA.contol();
    	GroupActionsListener = new ActionListener() {
   		
   		@Override
   		public void actionPerformed(ActionEvent e) {
   			try{
   			if(group.isVisible()==false)
				{
				view.setVisible(false);
				group.setVisible(true);
				}
   			else group.toFront();
   			
   			} catch(Throwable t) {
   				//showThrowable(t);
   			}
   			
   		}
   	};
    	
    	
    	//*********************************** move File 
    	moveActionListener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			String[] stockArr = model.getDir().toArray(new String[model.getDir().size()]);
    			JComboBox jcb = new JComboBox(stockArr);
    			jcb.addItem("U_"+MainClient.clien.getCurrUser().getIDuser());
    			jcb.removeItem(model.getCurrPath());
    			jcb.setEditable(false);
    			Icon micon = new ImageIcon(EditGroup.class.getResource("/images_icons/office-moving-icon1.png"));
    			int choice = JOptionPane.showOptionDialog( null, jcb, "Select Where to Move", JOptionPane.OK_CANCEL_OPTION, 0, micon , null, null);
    			if(choice == JOptionPane.OK_OPTION && view.getTable().getValueAt(view.getTable().getSelectedRow(),7).toString().equals("0")){
    				Move_Entity moving = new Move_Entity(model.getMyCurrFile());
    				moving.getFile().setPath(jcb.getSelectedItem().toString());
    				moving.setUser(MainClient.clien.currUser);
    				sendToServer(moving);
    			}
    			
    		}
    	};	
    	
    	
    	//*********************************** delete 
    	deleteActionListener = new ActionListener() {
    	
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			try {
    				DeleteFile delete = new DeleteFile(model.getMyCurrFile());
    				delete.setUser(MainClient.clien.currUser);
    				sendToServer(delete);
    			} catch(Throwable t) {
    				//showThrowable(t);
    			}
    			
    		}
    	};
    	
    	
    	//*********************************** about
		aboutUsActionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					Aboutus_GUI aset = new Aboutus_GUI();
					aset.setType(Type.POPUP);
					aset.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					aset.setVisible(true);
					}
				 catch(Throwable t) {
					//showThrowable(t);
				}
				
			}
		};
		
		
		//*********************************** trash 
		 recycle = new RecycleBinScreen();
		 recycle.setVisible(false);
		 recyMod = new RecycleScreen_Entity();
		 recyCon = new RecycleBin_controller(recyMod, recycle);
		 recyCon.control();
		 recycle.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		trashActionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//sendToServer(new RecycleScreen_Entity());
				try {
					if(recycle.isVisible()==false){
						recycle.setVisible(true);
						recycle.toFront();
					}
					else recycle.toFront();
						
					}
				 catch(Throwable t) {
					//showThrowable(t);
				}
				
			}
		};
		
		
		//************************************ help!!!
		helpActionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
				
				}
				catch(Throwable t){
					
				}
				
			}
		};
		renameActionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 String renameTo = JOptionPane.showInputDialog(view.getGui(), "New Name");
				 if(renameTo != null ) 
				 {
					 Rename_Entity renameFile = new Rename_Entity(model.getMyCurrFile());
					 renameFile.getFile().setFileName(renameTo);
					 renameFile.setUser(MainClient.clien.currUser);
	    			 sendToServer(renameFile);
				 }

				// TODO Auto-generated method stub
				
			}
		};
		//top menu
	
		view.getMntmSettings().addActionListener(settingsActionListener);
		view.getMntmLogOut().addActionListener(logoutActionListener);
		view.getMntmCreateNewFolder().addActionListener(createNewFolderActionListener);
		view.getMntmUploadfile().addActionListener(uploadFileActionListener);

		view.getMntmGroupActions().addActionListener(GroupActionsListener);
		view.getMntmTrash().addActionListener(trashActionListener);
		
		view.getEdit().addActionListener(editFileActionListener);
		view.getDownloadFile().addActionListener(downloadFileActionListener);
		view.getMntmMove().addActionListener(moveActionListener);
		view.getMntmDelete().addActionListener(deleteActionListener);
		view.getMntmRename().addActionListener(renameActionListener);
		view.getMntmAboutUs().addActionListener(aboutUsActionListener);
		view.getMntmHelp().addActionListener(helpActionListener);
		view.getOpenFile().addActionListener(openFileActionListener);
		view.getNewFile().addActionListener(createNewFolderActionListener);
		view.getMoveFile().addActionListener(moveActionListener);
		view.getRenameFile().addActionListener(renameActionListener);
		view.getDeleteFile().addActionListener(deleteActionListener);
		view.getBtnNotifications().addActionListener(notficationActionListener);
		//tree
		treeSelectionListener = new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent tse){
            		model.setCurrPath(replaceTreePath(tse));
            		//refreshListAndTree();
            		sendToServer(new FileModel(model.getCurrPath(), MainClient.clien.currUser));
            		
            }

			private String replaceTreePath(TreeSelectionEvent tse) {
				return tse.getPath().toString().substring(model.getGetroot().length()+3, tse.getPath().toString().length()-1).replace(", ", "/");
			}
			
			
        };

		view.getTree().addTreeSelectionListener(treeSelectionListener);
		view.getTable().getSelectionModel().addListSelectionListener(new ListSelectionListener(){
	        
		public void valueChanged(ListSelectionEvent event) {
	            // do some actions here, for example
	            // print first column value from selected row
	        		
	        		model.getMyCurrFile().setId( Integer.parseInt( view.getTable().getValueAt(view.getTable().getSelectedRow(),0).toString() ) );
		            view.getFileName().setText(view.getTable().getValueAt(view.getTable().getSelectedRow(),1).toString());
	        		model.getMyCurrFile().setFileName( view.getTable().getValueAt(view.getTable().getSelectedRow(),1).toString()  );
		            view.getPath().setText(view.getTable().getValueAt(view.getTable().getSelectedRow(),2).toString());
		            model.getMyCurrFile().setPath(view.getTable().getValueAt(view.getTable().getSelectedRow(),2).toString());
		            if(view.getTable().getValueAt(view.getTable().getSelectedRow(),3)!=null){
					view.getFsize().setText(view.getTable().getValueAt(view.getTable().getSelectedRow(),3).toString());
		            		}
		            else 	view.getFsize().setText("");

		     		view.getDate().setText(view.getTable().getValueAt(view.getTable().getSelectedRow(),4).toString());
					
					if(view.getTable().getValueAt(view.getTable().getSelectedRow(),7).toString().equals("1")){
						model.getMyCurrFile().setIsDir(1);
						view.getIsDirectory().setSelected(true);
						view.getIsFile().setSelected(false);
					}
					else{
						model.getMyCurrFile().setIsDir(0);
						view.getIsDirectory().setSelected(false);
						view.getIsFile().setSelected(true);
					}
	        	}
	        
	       
	    });		
    
    	
    	}

	public void refreshListAndTree(){
		view.getTable().removeAll();
		view.getTree().removeAll();
		view.getTable().revalidate();
		view.getTree().revalidate();
		model.setMyCurrFile(new MyFile());
		sendToServer(new DirectoryTreeModel(MainClient.clien.currUser));
		sendToServer(new FileModel(model.getCurrPath(), MainClient.clien.currUser));
	}

	public void setVisible(boolean b) {
	 view.setVisible(b);
	}

	public void repaint() {
		view.repaint();
		
	}
	
	public void refreseList(FileTable message){
		view.getTable().removeAll();
		view.getTable().setModel(message.getTablemodel());
		view.getTable().revalidate();
		view.getTable().repaint();
	}
	

	
     public void updateFileTable(FileModel filetable)
     {
    	 
    	 view.getTable().setModel(filetable.getFileTable());
    	 view.getTable().validate();
     	 
         view.getFileName().setText("");
            view.getPath().setText("");
			view.getFsize().setText("");
			view.getDate().setText("");
			
			view.getIsDirectory().setSelected(false);
			view.getIsFile().setSelected(false);
		
     }
	
     public void ShowMessage(String msg) {
    	 JOptionPane.showMessageDialog(view, msg);
	}

	public void setTree(ArrayList<String> dir, ArrayList<String> shared) {
		model.setDir(dir);
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("U_"+MainClient.clien.getCurrUser().getIDuser());
		DefaultTreeModel treemodel = new DefaultTreeModel(root);
		for (String string : dir) {
			buildTreeFromString(treemodel, string);
		}
		   
		view.getTree().setModel(treemodel);
		view.getTree().setRootVisible(false);
		
		ImageIcon leafIcon = new ImageIcon(getClass().getResource("/images_icons/folder.gif"));
		if (leafIcon != null) {
			DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
			renderer.setLeafIcon(leafIcon);
			view.getTree().setCellRenderer(renderer);
			} else {
				System.err.println("Leaf icon missing; using default.");
			}
		view.getTree().getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		view.getTree().invalidate();
		view.getTree().validate();
		view.getTree().repaint();
		for (int i = 0; i < view.getTree().getRowCount(); i++) {
	    	  view.getTree().expandRow(i);
	    	 
	        }
		
		
	}
	
	
	public void RecycleBin(RecycleScreen_Entity rce){
		recyCon.Repaint(rce);
	}

    /**
     * Builds a tree from a given forward slash delimited string.
     * 
     * @param model The tree model
     * @param str The string to build the tree from
     */
    private void buildTreeFromString(final DefaultTreeModel model1, final String str) {
        // Fetch the root node
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model1.getRoot();

        // Split the string around the delimiter
        String [] strings = str.split("/");
        
        // Create a node object to use for traversing down the tree as it 
        // is being created
        DefaultMutableTreeNode node = root;
        
        // Iterate of the string array
        for (String s: strings) {
            // Look for the index of a node at the current level that
            // has a value equal to the current string
            int index = childIndex(node, s);

            // Index less than 0, this is a new node not currently present on the tree
            if (index < 0) {
                // Add the new node
                DefaultMutableTreeNode newChild = new DefaultMutableTreeNode(s);
                
                node.insert(newChild, node.getChildCount());
                node = newChild;
            }
            // Else, existing node, skip to the next string
            else {
                node = (DefaultMutableTreeNode) node.getChildAt(index);
            }
        }
    }

    /**
     * Returns the index of a child of a given node, provided its string value.
     * 
     * @param node The node to search its children
     * @param childValue The value of the child to compare with
     * @return The index
     */
    private int childIndex(final DefaultMutableTreeNode node, final String childValue) {
        Enumeration<DefaultMutableTreeNode> children = node.children();
        DefaultMutableTreeNode child = null;
        int index = -1;

        while (children.hasMoreElements() && index < 0) {
            child = children.nextElement();

            if (child.getUserObject() != null && childValue.equals(child.getUserObject())) {
                index = node.getIndex(child);
            }
        }

        return index;
    }

	public void openFile(String string) throws IOException {
		desktop.open(new File(string));		
	}

	public void GetNotification(GetNotification_Entity message) {
		notificationCon.populate(message);
		
	}

    
	
}
    