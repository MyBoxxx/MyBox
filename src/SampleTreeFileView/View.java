package SampleTreeFileView;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.File;
import java.net.URL;
import java.sql.Date;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.JMenuBar;

import java.awt.BorderLayout;

import javax.swing.border.EmptyBorder;
import javax.swing.tree.TreeModel;

import Client.MainClient;
import Client.myBoxClient;
import Controlers.LogIn_Controller;
import Entity.User_Entity;
import GUI_final.AbstractGUI;

import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View extends AbstractGUI{

    /** Title of the application */
     static final String APP_TITLE = "MyBox";

	/** Main GUI container */
     static JPanel gui;
 	private static DefaultMutableTreeNode root;
 	private JTree tree;
 	private JMenuBar menuBar;
 	private JTable table;
 	private JScrollPane scrollPane;
   

	JPanel fileView;
    

    /* File controls. */
     JButton DownloadFile;
     JButton deleteFile;
     JButton newDir;
     JButton moveFile;
    
     /* File details. */
     JLabel fileName;
     JTextField path;
     JLabel date;
     JLabel fsize;
     JCheckBox readable;
     

	JCheckBox writable;
     JCheckBox executable;

    /* GUI options/containers for new File/Directory creation.  Created lazily. */
     JPanel newFilePanel;
     JRadioButton newTypeFile;
     JTextField name;
	 Dimension preferredSize;
	 Container fileDetailsLabels;
	JButton renameFile;
	JPanel southRadio;
	JRadioButton newTypeDirectory;
	JLabel label;
	 public FileSystemView fileSystemView;
	 public int rowIconPadding = 6;
	JPanel detailView;
	JPanel fileMainDetails;
    private JRadioButton isDirectory;
    private JRadioButton isFile;
	
	/*menu but*/
	JButton btnNotifications;
	JLabel lblLogInAs;
	JMenuItem mntmHelp;
	JMenuItem mntmTrash;
	JCheckBoxMenuItem chckbxmntmMyFiles;
	JMenuItem mntmRename;
	JMenuItem mntmDelete;
	JMenuItem mntmMove;
	JMenuItem mntmGroupActions;
	JMenuItem mntmLogOut;
	JMenuItem mntmSettings;
	JMenuItem mntmCreateNewFolder;
	JMenuItem mntmUploadfile;
	JMenuItem mntmAboutUs;
	private JButton edit;
	private JToolBar toolBar_1;
	private JMenuItem Download;
	private JMenuItem mntmEditFile;
	
	
	
	public View() {
		getGui();
		// show the file system roots.
		Dimension widePreferred = new Dimension(200,150);
		    		    		                        
		detailView = new JPanel(new BorderLayout(3,3));
		scrollPane = new JScrollPane();
		Dimension d = scrollPane.getPreferredSize();
		scrollPane.setPreferredSize(new Dimension((int)d.getWidth(), (int)d.getHeight()/2));
		detailView.add(scrollPane);
		            
		table = new JTable(){
			public boolean isCellEditable(int rowIndex,int colIndex) {
				return false;
			}
		};
		scrollPane.setViewportView(table);
		table.setVisible(true);
		    		
		JScrollPane treeScroll = new JScrollPane();
		treeScroll.setEnabled(false);
		Dimension preferredSize = treeScroll.getPreferredSize();
		treeScroll.setPreferredSize( widePreferred );
		            
		// details for a File
		fileMainDetails = new JPanel(new BorderLayout(4,2));
		fileMainDetails.setBorder(new EmptyBorder(0,6,0,6));

		JPanel fileDetailsLabels = new JPanel(new GridLayout(0,1,2,2));
		fileMainDetails.add(fileDetailsLabels, BorderLayout.WEST);
		                                                        
		JPanel fileDetailsValues = new JPanel(new GridLayout(0,1,2,2));
		fileMainDetails.add(fileDetailsValues, BorderLayout.CENTER);
		                            
		fileDetailsLabels.add(new JLabel("File", JLabel.TRAILING));
		fileName = new JLabel();
		fileDetailsValues.add(fileName);
		fileDetailsLabels.add(new JLabel("Path/name", JLabel.TRAILING));
		path = new JTextField(5);
		path.setEditable(false);
		fileDetailsValues.add(path);
		fileDetailsLabels.add(new JLabel("Last Modified", JLabel.TRAILING));
		date = new JLabel();
		fileDetailsValues.add(date);
		fileDetailsLabels.add(new JLabel("File size", JLabel.TRAILING));
		fsize = new JLabel();
		fileDetailsValues.add(fsize);
		fileDetailsLabels.add(new JLabel("Type", JLabel.TRAILING));

		JPanel flags = new JPanel(new FlowLayout(FlowLayout.LEADING,4,0));
		isDirectory = new JRadioButton("Directory");
		isDirectory.setEnabled(false);
		flags.add(isDirectory);

		isFile = new JRadioButton("File");
		isFile.setEnabled(false);
		flags.add(isFile);
		fileDetailsValues.add(flags);

		int count = fileDetailsLabels.getComponentCount();
		
		
		            
		toolBar_1 = new JToolBar();
		// mnemonics stop working in a floated toolbar
		toolBar_1.setFloatable(false);

		DownloadFile = new JButton("Download");
		DownloadFile.setMnemonic('o');
		
		toolBarInit(toolBar_1);
				
		 fileView = new JPanel(new BorderLayout(3,3));
		
		fileView.add(toolBar_1,BorderLayout.NORTH);
		fileView.add(fileMainDetails,BorderLayout.CENTER);
		
		detailView.add(fileView, BorderLayout.SOUTH);
		
		JSplitPane splitPane = new JSplitPane(
		JSplitPane.HORIZONTAL_SPLIT,
		treeScroll,
		detailView);
		tree = new JTree();		
		tree.setScrollsOnExpand(true);
		treeScroll.setColumnHeaderView(tree);
		gui.add(splitPane, BorderLayout.CENTER);
	
   }

	public JRadioButton getIsDirectory() {
		return isDirectory;
	}

	public void setIsDirectory(JRadioButton isDirectory) {
		this.isDirectory = isDirectory;
	}

	public JRadioButton getIsFile() {
		return isFile;
	}

	public void setIsFile(JRadioButton isFile) {
		this.isFile = isFile;
	}

	public JTable getTable() {
		return table;
	}

	private void toolBarInit(JToolBar toolBar) {
		
		edit = new JButton("Edit  ");
		edit.setMnemonic('o');
		toolBar_1.add(edit);
		toolBar.add(DownloadFile);
        
        // Check the actions are supported on this platform!
		//openFile.setEnabled(desktop.isSupported(Desktop.Action.OPEN));
		
		toolBar.addSeparator();
		
		newDir = new JButton("New Directory");
		
		newDir.setMnemonic('n');
		
		toolBar.add(newDir);
		
		moveFile = new JButton("Move");
		moveFile.setMnemonic('c');
		
		
		toolBar.add(moveFile);
		
		renameFile = new JButton("Rename");
		renameFile.setMnemonic('r');
		
		
		toolBar.add(renameFile);
		
		deleteFile = new JButton("Delete");
		deleteFile.setMnemonic('d');
		
		toolBar.add(deleteFile);
		
		toolBar.addSeparator();
		


		
	}

	

	public JButton getDownloadFile() {
		return DownloadFile;
	}

	public void setDownloadFile(JButton downloadFile) {
		DownloadFile = downloadFile;
	}

	public JButton getEdit() {
		return edit;
	}

	public void setEdit(JButton edit) {
		this.edit = edit;
	}

	public JPanel getGui() {
		  if (gui==null) {
	            gui = new JPanel(new BorderLayout(3,3));
	            gui.setBorder(new EmptyBorder(5,5,5,5));
	            setBounds(100, 100, 800	, 600);
	            
	            menuBar = new JMenuBar();
	            setJMenuBar(menuBar);
	            
	            JMenu mnMybox = new JMenu("MyBox");
	            menuBar.add(mnMybox);
	            
	             mntmSettings = new JMenuItem("Settings");
	             mnMybox.add(mntmSettings);
	             
	              mntmLogOut = new JMenuItem("Log Out");
	              mnMybox.add(mntmLogOut);
	              
	              JMenu mnFile = new JMenu("File");
	              menuBar.add(mnFile);
	              
	              mntmCreateNewFolder = new JMenuItem("Create Folder");
	               
	              mnFile.add(mntmCreateNewFolder);
	               
	              mntmUploadfile = new JMenuItem("UploadFile");
	                
	                
	              mnFile.add(mntmUploadfile);
	              
	              Download = new JMenuItem("Download");
	              mnFile.add(Download);
	                 
	                 JMenu mnGroup = new JMenu("Group");
	                 menuBar.add(mnGroup);
	                 
	                  mntmGroupActions = new JMenuItem("Group Actions");
	                  mnGroup.add(mntmGroupActions);
	                   
	                   JMenu mnEdit = new JMenu("Edit");
	                   menuBar.add(mnEdit);
	                   
	                    mntmMove = new JMenuItem("Move");
	                    
	                    mnEdit.add(mntmMove);
	                    
	                    
	                     mntmDelete = new JMenuItem("Delete");
	                     mnEdit.add(mntmDelete);
	                     
	                      mntmRename = new JMenuItem("ReName");
	                      mnEdit.add(mntmRename);
	                      
	                      mntmEditFile = new JMenuItem("Edit File");
	                      mnEdit.add(mntmEditFile);
	                      
	                      JMenu mnView = new JMenu("Go");
	                      menuBar.add(mnView);
	                       
	                        mntmTrash = new JMenuItem("Trash");
	                        mnView.add(mntmTrash);
	                        
	                        JMenu mnHelp_1 = new JMenu("Help");
	                        menuBar.add(mnHelp_1);
	                        
	                         mntmAboutUs = new JMenuItem("About Us");
	                         mnHelp_1.add(mntmAboutUs);
	                         
	                          mntmHelp = new JMenuItem("Help");
	                          mnHelp_1.add(mntmHelp);
	                          
	                          JMenuItem mntmNewMenuItem = new JMenuItem("                    ");
	                          menuBar.add(mntmNewMenuItem);
	                          
	                           lblLogInAs = new JLabel("Log in as : " + MainClient.clien.currUser.getUsername());
	                           menuBar.add(lblLogInAs);
	                           
	                            btnNotifications = new JButton("notifications");
	                            menuBar.add(btnNotifications);
	            gui.setBounds(100, 100, 800	, 600);
	            setContentPane(gui);
		  }
		return gui;
	}
	public JButton getOpenFile() {
		// TODO Auto-generated method stub
		return DownloadFile;
	}
	
 	public void setTable(JTable table) {
		this.table = table;
	}



	public JButton getDeleteFile() {
		return deleteFile;
	}

	public void setDeleteFile(JButton deleteFile) {
		this.deleteFile = deleteFile;
	}

	public JButton getNewFile() {
		return newDir;
	}

	public void setNewFile(JButton newFile) {
		this.newDir = newFile;
	}

	public JButton getMoveFile() {
		return moveFile;
	}

	public void setMoveFile(JButton moveFile) {
		this.moveFile = moveFile;
	}

	public JLabel getFileName() {
		return fileName;
	}

	public void setFileName(JLabel fileName) {
		this.fileName = fileName;
	}

	public JTextField getPath() {
		return path;
	}

	public void setPath(JTextField path) {
		this.path = path;
	}

	public JLabel getDate() {
		return date;
	}

	public void setDate(JLabel date) {
		this.date = date;
	}

	public void setfSize(JLabel size) {
		this.fsize = size;
	}

	public JLabel getFsize() {
		return fsize;
	}

	public void setFsize(JLabel fsize) {
		this.fsize = fsize;
	}

	public JCheckBox getReadable() {
		return readable;
	}

	public void setReadable(JCheckBox readable) {
		this.readable = readable;
	}

	public JCheckBox getWritable() {
		return writable;
	}

	public void setWritable(JCheckBox writable) {
		this.writable = writable;
	}

	public JCheckBox getExecutable() {
		return executable;
	}

	public void setExecutable(JCheckBox executable) {
		this.executable = executable;
	}


	public JPanel getNewFilePanel() {
		return newFilePanel;
	}

	public void setNewFilePanel(JPanel newFilePanel) {
		this.newFilePanel = newFilePanel;
	}

	public JRadioButton getNewTypeFile() {
		return newTypeFile;
	}

	public void setNewTypeFile(JRadioButton newTypeFile) {
		this.newTypeFile = newTypeFile;
	}


	public void setName(JTextField name) {
		this.name = name;
	}

	public Dimension getPreferredSize() {
		return preferredSize;
	}

	public void setPreferredSize(Dimension preferredSize) {
		this.preferredSize = preferredSize;
	}

	public Container getFileDetailsLabels() {
		return fileDetailsLabels;
	}

	public void setFileDetailsLabels(Container fileDetailsLabels) {
		this.fileDetailsLabels = fileDetailsLabels;
	}


	public JButton getRenameFile() {
		return renameFile;
	}

	public void setRenameFile(JButton renameFile) {
		this.renameFile = renameFile;
	}

	public JPanel getSouthRadio() {
		return southRadio;
	}

	public void setSouthRadio(JPanel southRadio) {
		this.southRadio = southRadio;
	}

	public JRadioButton getNewTypeDirectory() {
		return newTypeDirectory;
	}

	public void setNewTypeDirectory(JRadioButton newTypeDirectory) {
		this.newTypeDirectory = newTypeDirectory;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JPanel getDetailView() {
		return detailView;
	}

	public void setDetailView(JPanel detailView) {
		this.detailView = detailView;
	}

	public JPanel getFileMainDetails() {
		return fileMainDetails;
	}

	public void setFileMainDetails(JPanel fileMainDetails) {
		this.fileMainDetails = fileMainDetails;
	}

	public static void setGui(JPanel gui) {
		View.gui = gui;
	}

	public void setOpenFile(JButton openFile) {
		this.DownloadFile = openFile;
	}
	public JPanel getFileView() {
		return fileView;
	}

	public void setFileView(JPanel fileView) {
		this.fileView = fileView;
	}

	public JButton getBtnNotifications() {
		return btnNotifications;
	}

	public void setBtnNotifications(JButton btnNotifications) {
		this.btnNotifications = btnNotifications;
	}

	public JLabel getLblLogInAs() {
		return lblLogInAs;
	}

	public void setLblLogInAs(String lblLogInAs) {
		this.lblLogInAs.setText("login as : " + lblLogInAs);
	}

	public JMenuItem getMntmHelp() {
		return mntmHelp;
	}

	public void setMntmHelp(JMenuItem mntmHelp) {
		this.mntmHelp = mntmHelp;
	}

	public JMenuItem getMntmTrash() {
		return mntmTrash;
	}

	public void setMntmTrash(JMenuItem mntmTrash) {
		this.mntmTrash = mntmTrash;
	}


	public JCheckBoxMenuItem getChckbxmntmMyFiles() {
		return chckbxmntmMyFiles;
	}

	public void setChckbxmntmMyFiles(JCheckBoxMenuItem chckbxmntmMyFiles) {
		this.chckbxmntmMyFiles = chckbxmntmMyFiles;
	}

	public JMenuItem getMntmRename() {
		return mntmRename;
	}

	public void setMntmRename(JMenuItem mntmRename) {
		this.mntmRename = mntmRename;
	}

	public JMenuItem getMntmDelete() {
		return mntmDelete;
	}

	public void setMntmDelete(JMenuItem mntmDelete) {
		this.mntmDelete = mntmDelete;
	}

	public JMenuItem getMntmMove() {
		return mntmMove;
	}

	public void setMntmMove(JMenuItem mntmMove) {
		this.mntmMove = mntmMove;
	}

	public JMenuItem getMntmGroupActions() {
		return mntmGroupActions;
	}

	public void setMntmGroupActions(JMenuItem mntmGroupActions) {
		this.mntmGroupActions = mntmGroupActions;
	}


	public JMenuItem getMntmLogOut() {
		return mntmLogOut;
	}

	public void setMntmLogOut(JMenuItem mntmLogOut) {
		this.mntmLogOut = mntmLogOut;
	}

	public JMenuItem getMntmSettings() {
		return mntmSettings;
	}

	public void setMntmSettings(JMenuItem mntmSettings) {
		this.mntmSettings = mntmSettings;
	}

	public JMenuItem getMntmCreateNewFolder() {
		return mntmCreateNewFolder;
	}

	public void setMntmCreateNewFolder(JMenuItem mntmCreateNewFolder) {
		this.mntmCreateNewFolder = mntmCreateNewFolder;
	}

	public JMenuItem getMntmUploadfile() {
		return mntmUploadfile;
	}

	public void setMntmUploadfile(JMenuItem mntmUploadfile) {
		this.mntmUploadfile = mntmUploadfile;
	}

	public JMenuItem getMntmAboutUs() {
		return mntmAboutUs;
	}

	public void setMntmAboutUs(JMenuItem mntmAboutUs) {
		this.mntmAboutUs = mntmAboutUs;
	}

	public static String getAppTitle() {
		return APP_TITLE;
	}
	
//	public DefaultMutableTreeNode getTreeModel() {
//		if (root==null)
//		{
//			root = new DefaultMutableTreeNode("U_"+MainClient.clien.getCurrUser().getIDuser());
//		}
//		return root;
//	}
//
//	public void setTreeModel(DefaultMutableTreeNode root) {
//		this.root = root;
//	}
//	
//	public DefaultTreeModel getModel() {
//		if (model==null)
//		{
//			model = new DefaultTreeModel(getTreeModel());
//		}
//		return model;
//	}
//
//	public void setModel(DefaultTreeModel model) {
//		this.model = model;
//	}

public void setTree(JTree tree) {
	this.tree = tree;
}

public JTree getTree() {
		return tree;
	}
	
}


	
	
	

