package SampleTreeFileView;

import java.awt.Desktop;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;

import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeSelectionModel;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

import org.apache.commons.io.FileUtils;

import server.FileTable;
import Client.MainClient;
import Client.myBoxClient;
import Controlers.*;
import Entity.FileTreeUpdate;
import Entity.Folder_Entity;
import Entity.MyFile;
import Entity.UpLoadFile;
import Entity.User_Entity;
import GUI_final.*;
import Controlers.*;

public class Controller extends AbstractTransfer{
    private Model model;
    private transient FileModel filemodel;
    private View view; 
    
    
    //GUIs
    RecycleBinScreen recycle;
    GroupActions group;
    Settings_GUI settings;
    
    
    
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
		
    	openFileActionListener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    		}
    	};
		
    	view.getEdit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyFile temp = new MyFile();
				temp.setId(Integer.parseInt(view.getTable().getValueAt(view.getTable().getSelectedRow(),0).toString()));
		        temp.setFileName(view.getTable().getValueAt(view.getTable().getSelectedRow(),1).toString());
		          temp.setPath(view.getTable().getValueAt(view.getTable().getSelectedRow(),2).toString());
		    
		           
				temp.setFsize(Integer.parseInt(view.getTable().getValueAt(view.getTable().getSelectedRow(),3).toString()));
		     		//temp.setCreatedTime(Date.parse(view.getDate().setText(view.getTable().getValueAt(view.getTable().getSelectedRow(),4).toString())));
					
					if(view.getTable().getValueAt(view.getTable().getSelectedRow(),7).toString().equals("1")){
						view.getIsDirectory().setSelected(true);
						view.getIsFile().setSelected(false);
					}
					else{
						view.getIsDirectory().setSelected(false);
						view.getIsFile().setSelected(true);
				
						}
			}
    	}		
		);
    	
    	settingsActionListener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			try{
    			if(settings==null)
				{
    			settings = new Settings_GUI();
				Settings_Controller setting_control = new Settings_Controller(MainClient.clien.currUser,settings);
				settings.setType(Type.NORMAL);
				settings.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				view.dispose();
				settings.setVisible(true);
				setting_control.control();
				}

    			else group.toFront();
    			
    			} catch(Throwable t) {
    				//showThrowable(t);
    			}
    			
    		}
    	};
        //TO-DO
    	logoutActionListener = new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			view.dispose();
    			LoginMain.main(null);
    			}				
    		};					
    	
    	
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
    	
    	GroupActionsListener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			try {
    					if(group==null)
    					{
    					group = new GroupActions();
    					GroupAction_controller GroupA = new GroupAction_controller(MainClient.clien.currUser,group);
    					group.setType(Type.NORMAL);
    					group.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    					view.dispose();
    					group.setVisible(true);
    					GroupA.contol();
    					}
   
    				else group.toFront();
    			} catch(Throwable t) {
    				//showThrowable(t);
    			}
    			
    		}
    	};
    	
    	moveActionListener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			try {

    			} catch(Throwable t) {
    				//showThrowable(t);
    			}
    			
    		}
    	};	
    	
    	deleteActionListener = new ActionListener() {
    	
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			try {
    			} catch(Throwable t) {
    				//showThrowable(t);
    			}
    			
    		}
    	};
    	
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
		trashActionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					if(recycle == null){
						recycle = new RecycleBinScreen();
						recycle.setType(Type.POPUP);
						recycle.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						recycle.setVisible(true);
						}
					else recycle.toFront();
						
					}
				 catch(Throwable t) {
					//showThrowable(t);
				}
				
			}
		};
		helpActionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					RecycleBinScreen recycle = new RecycleBinScreen();
					recycle.setVisible(true);
					
				}
				catch(Throwable t){
					
				}
				
			}
		};
		//top menu
	
		view.getMntmSettings().addActionListener(settingsActionListener);
		view.getMntmLogOut().addActionListener(logoutActionListener);
		view.getMntmCreateNewFolder().addActionListener(createNewFolderActionListener);
		view.getMntmUploadfile().addActionListener(uploadFileActionListener);
		view.getMntmSearch().addActionListener(searchActionListener);
		view.getMntmGroupActions().addActionListener(GroupActionsListener);
		view.getMntmTrash().addActionListener(trashActionListener);
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
		
		//tree
		treeSelectionListener = new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent tse){
            		model.setCurrPath(replaceTreePath(tse));
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
	        	
		            view.getFileName().setText(view.getTable().getValueAt(view.getTable().getSelectedRow(),1).toString());
		            view.getPath().setText(view.getTable().getValueAt(view.getTable().getSelectedRow(),2).toString());
		    
		            if(view.getTable().getValueAt(view.getTable().getSelectedRow(),3)!=null){
					view.getFsize().setText(view.getTable().getValueAt(view.getTable().getSelectedRow(),3).toString());
		            		}
		            else 	view.getFsize().setText("");

		     		view.getDate().setText(view.getTable().getValueAt(view.getTable().getSelectedRow(),4).toString());
					
					if(view.getTable().getValueAt(view.getTable().getSelectedRow(),7).toString().equals("1")){
						view.getIsDirectory().setSelected(true);
						view.getIsFile().setSelected(false);
					}
					else{
						view.getIsDirectory().setSelected(false);
						view.getIsFile().setSelected(true);
					}
	        	}
	        
	       
	    });		
    
    	
    	}

	public void refreshListAndTree(){
		
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
		
		view.getTable().setModel(message.getTablemodel());
		view.getTable().repaint();
	}
	
//	public void UpdateTree()
//	{
//		view.getTree().setModel((TreeModel) view.g);
//		view.getTree().repaint();
//		view.repaint();
//	}
	
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
	
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("U_"+MainClient.clien.getCurrUser().getIDuser());
		DefaultTreeModel treemodel = new DefaultTreeModel(root);
		for (String string : dir) {
			buildTreeFromString(treemodel, string);
		}
		
		
		if (view.getChckbxmntmSharedWithMe().isEnabled())
		{
			for (String string : shared) {
				buildTreeFromString(treemodel, string);
			}
		}

	  
	     
		view.getTree().setModel(treemodel);
		view.getTree().getSelectionModel();
		view.getTree().setRootVisible(false);
		view.getTree().getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		view.getTree().invalidate();
		view.getTree().validate();
		view.getTree().repaint();
		for (int i = 0; i < view.getTree().getRowCount(); i++) {
	    	  view.getTree().expandRow(i);
	    	 
	        }
		
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

    
	
}
    