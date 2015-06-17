package SampleTreeFileView;

import java.awt.Desktop;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
<<<<<<< HEAD
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
=======
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
>>>>>>> refs/heads/master

import org.apache.commons.io.FileUtils;

import Client.MainClient;
import Client.myBoxClient;
import Controlers.*;
<<<<<<< HEAD
import Entity.Folder_Entity;
import Entity.MyFile;
=======
import Entity.FileTreeUpdate;
import Entity.Folder_Entity;
import Entity.MyFile;
import Entity.UpLoadFile;
>>>>>>> refs/heads/master
import GUI_final.*;

public class Controller extends AbstractTransfer{
    private Model model;
<<<<<<< HEAD
    private View view;
=======
    public void setModel(Model model) {
		this.model = model;
	}

	public Model getModel() {
		return model;
	}
	private View view;
>>>>>>> refs/heads/master
    
    //private ActionListener actionListener;
    private ActionListener openFileActionListener;
    
    private ActionListener settingsActionListener;
    private ActionListener logoutActionListener;
    
    private ActionListener createNewFolderActionListener;
    private ActionListener uploadFileActionListener;
    private ActionListener searchActionListener;
    
    private ActionListener createNewGroupActionListener;
    private ActionListener askToJoinActionListener;
    
    private ActionListener moveActionListener;
    private ActionListener deleteActionListener;
    private ActionListener renameActionListener;
    
    private ActionListener myFileActionListener; 
    private ActionListener sharedWithMeActionListener;
    private ActionListener trashActionListener;
    RecycleBinScreen recycle;
    
    private ActionListener aboutUsActionListener;
    private ActionListener helpActionListener;
    
    private TreeSelectionListener treeSelectionListener;
    
    
    public Controller(Model model, View view){
        this.model = model;
<<<<<<< HEAD
        this.model.setUserID(myBoxClient.getCurrUser().getIDuser());
=======
>>>>>>> refs/heads/master
        this.view = view; 
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void contol(){   
    	System.out.println("MainControlerEnable");
		MainClient.clien.setCurrController(this); // Set The Current Controller to this	
        //TO-DO
    	openFileActionListener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			FileTreeUpdate filetree = new FileTreeUpdate();
    			filetree.setUser(MainClient.clien.currUser);
    			sendToServer(filetree);
    			// TODO Auto-generated method stub
<<<<<<< HEAD
    			try {
    				//((Desktop) model.getDesktop()).open(view.getCurrentFile());
    			} catch(Throwable t) {
    				//showThrowable(t);
    			}
=======
>>>>>>> refs/heads/master
    			
    		}
    	};
        //TO-DO    	
    	settingsActionListener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			try {
    				//((Desktop) model.getDesktop()).open(view.getCurrentFile());
    			} catch(Throwable t) {
    				//showThrowable(t);
    			}
    			
    		}
    	};
        //TO-DO
    	logoutActionListener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			try {
    				//((Desktop) model.getDesktop()).open(view.getCurrentFile());
    			} catch(Throwable t) {
    				//showThrowable(t);
    			}
    			
    		}
    	};
    	
    	createNewFolderActionListener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			try {
    			File model = new File("\\file.exe");
    			CreateFolderScreen view = new CreateFolderScreen();
    			CreateFolder_Controller controllere = new CreateFolder_Controller(model,view);
    			controllere.control();
    			view.setVisible(true);
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
					JFileChooser fileChooser = new JFileChooser();
					int returnValue = fileChooser.showOpenDialog(view.getGui());
					if (returnValue == JFileChooser.APPROVE_OPTION) {
<<<<<<< HEAD
						fileChooser.getSelectedFile();
						MyFile newFile = new MyFile(fileChooser.getSelectedFile());
		      		      
					      newFile.mybytearray = FileUtils.readFileToByteArray(fileChooser.getSelectedFile());
					      model.setNewFile(newFile);
						
						
						
						//model.setNewFile(fileChooser.getSelectedFile());
						sendToServer(model);
=======
						UpLoadFile newFile = new UpLoadFile(fileChooser.getSelectedFile());
		      		     
					      newFile.mybytearray = FileUtils.readFileToByteArray(fileChooser.getSelectedFile());
					      //model.setNewFile(newFile);
					      
					      newFile.setUser(MainClient.clien.currUser);
						
						
						//model.setNewFile(fileChooser.getSelectedFile());
						sendToServer(newFile);
>>>>>>> refs/heads/master
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
    				//((Desktop) model.getDesktop()).open(view.getCurrentFile());
    			} catch(Throwable t) {
    				//showThrowable(t);
    			}
    			
    		}
    	};
    	
    	createNewGroupActionListener = new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			try {
    				//((Desktop) model.getDesktop()).open(view.getCurrentFile());
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
    				sendToServer(model);
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
<<<<<<< HEAD
=======
    				sendToServer(model);
>>>>>>> refs/heads/master
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
		
		view.getMntmCreateNewGroup().addActionListener(createNewGroupActionListener);
		view.getMntmAskToJoin().addActionListener(askToJoinActionListener);
		
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
                DefaultMutableTreeNode node =
                    (DefaultMutableTreeNode)tse.getPath().getLastPathComponent();
               // model.showChildren(node);
               // view.setFileDetails((File)node.getUserObject());
            }
        };

		view.getTree().addTreeSelectionListener(treeSelectionListener);
		
    }
	public void setVisible(boolean b) {
	 view.setVisible(b);
	}

	public void repaint() {
		view.repaint();
		
	}
	public void UpdateTree()
	{
		System.out.println(model.getTreeModel().toString());
		
		view.getTree().setModel((TreeModel) model.getTreeModel());
		//
		
		
		
		
		
		//new JTree(model.getTreeModel()));
		view.getTree().repaint();
		view.repaint();
	}
       
	
	
    public void setTableData() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                if (model.getFileTableModel()==null) {
                    model.setFileTableModel(new FileTableModel());
                    view.getTable().setModel(model.getFileTableModel());
                }
                //view.getTable().getSelectionModel().removeListSelectionListener(listSelectionListener);
                model.getFileTableModel().setFiles(model.getFileTableModel().getFiles());
                //table.getSelectionModel().addListSelectionListener(listSelectionListener);
                if (!model.cellSizesSet) {
                    Icon icon = view.fileSystemView.getSystemIcon(model.getFileTableModel().getFile(0));

                    // size adjustment to better account for icons
                    view.getTable().setRowHeight( icon.getIconHeight()+view.rowIconPadding );

                    /*setColumnWidth(0,-1);
                    setColumnWidth(3,60);
                    table.getColumnModel().getColumn(3).setMaxWidth(120);
                    setColumnWidth(4,-1);
                    setColumnWidth(5,-1);
                    setColumnWidth(6,-1);
                    setColumnWidth(7,-1);
                    setColumnWidth(8,-1);
                    setColumnWidth(9,-1);
                     */
                    model.cellSizesSet = true;
                    view.getTable().repaint();
                    repaint();
                }
            }
        });
    }
}
    
