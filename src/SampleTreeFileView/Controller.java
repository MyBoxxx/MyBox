package SampleTreeFileView;

import java.awt.Desktop;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import Client.MainClient;
import Client.myBoxClient;
>>>>>>> refs/heads/master
=======
import Client.MainClient;
import Client.myBoxClient;
>>>>>>> refs/heads/master
=======
import Client.MainClient;
import Client.myBoxClient;
>>>>>>> refs/heads/master
import Controlers.*;
import Entity.Folder_Entity;
import GUI_final.*;

public class Controller extends AbstractTransfer{
    private Model model;
    private View view;
    
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
    
<<<<<<< HEAD
<<<<<<< HEAD
    private TreeSelectionListener treeSelectionListener;
    
=======
>>>>>>> refs/heads/master
=======
>>>>>>> refs/heads/master
    
    public Controller(Model model, View view){
        this.model = model;
        this.model.setUserID(myBoxClient.getCurrUser().getIDuser());
        this.view = view; 
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void contol(){        
        //TO-DO
    	openFileActionListener = new ActionListener() {
    		
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
						model.setNewFile(fileChooser.getSelectedFile());
						sendToServer(model);
					}
    			} catch(Throwable t) {
    				//showThrowable(t);
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
       
}
    
