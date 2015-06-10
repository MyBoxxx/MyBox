package SampleTreeFileView;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.File;
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
import javax.swing.JMenuBar;

import java.awt.BorderLayout;

import javax.swing.border.EmptyBorder;
import javax.swing.tree.TreeModel;

import Entity.User_Entity;

public class View extends JFrame{

    /** Title of the application */
     static final String APP_TITLE = "MyBox";

    /** Provides nice icons and names for files. */
     FileSystemView fileSystemView;

    /** currently selected File. */
     File currentFile;


	/** Main GUI container */
     static JPanel gui;



	/** File-system tree. Built Lazily */
     JTree tree;
     JPanel fileView;
    
    /** Directory listing */
     JTable table;
     JProgressBar progressBar;
    

    /* File controls. */
     JButton openFile;
     JButton deleteFile;
     JButton newFile;
     JButton moveFile;
    
     /* File details. */
     JLabel fileName;
     JTextField path;
     JLabel date;
     JLabel size;
     JCheckBox readable;
     

	JCheckBox writable;
     JCheckBox executable;
     JRadioButton isDirectory;
     JRadioButton isFile;

    /* GUI options/containers for new File/Directory creation.  Created lazily. */
     JPanel newFilePanel;
     JRadioButton newTypeFile;
     JTextField name;
	 Dimension preferredSize;
	 Container fileDetailsLabels;
	JPanel simpleOutput;
	JButton renameFile;
	JPanel southRadio;
	JRadioButton newTypeDirectory;
	JLabel label;
	
	JPanel detailView;
	JPanel fileMainDetails;
	 
	
	/*menu but*/
	JButton btnNotifications;
	JLabel lblLogInAs;
	JMenuItem mntmHelp;
	JMenuItem mntmTrash;
	JCheckBoxMenuItem chckbxmntmSharedWithMe;
	JCheckBoxMenuItem chckbxmntmMyFiles;
	JMenuItem mntmRename;
	JMenuItem mntmDelete;
	JMenuItem mntmMove;
	JMenuItem mntmAskToJoin;
	JMenuItem mntmCreateNewGroup;
	JMenuItem mntmSearch;
	JMenuItem mntmLogOut;
	JMenuItem mntmSettings;
	JMenuItem mntmCreateNewFolder;
	JMenuItem mntmUploadfile;
	JMenuItem mntmAboutUs;
	
	public View(User_Entity user) {
		      		getGui();
		            fileSystemView = FileSystemView.getFileSystemView();
		           // show the file system roots.
		            File[] roots = fileSystemView.getRoots();
		            for (File fileSystemRoot : roots) {
		                DefaultMutableTreeNode node = new DefaultMutableTreeNode(fileSystemRoot);
		                //root.add( node );
		                //showChildren(node);
		                //
		                File[] files = fileSystemView.getFiles(fileSystemRoot, true);
		                for (File file : files) {
		                    if (file.isDirectory()) {
		                        node.add(new DefaultMutableTreeNode(file));
		                    }
		                }
		                //
		            }
		            Dimension widePreferred = new Dimension(200,150);
		            
		            simpleOutput = new JPanel(new BorderLayout(3,3));
		            progressBar = new JProgressBar();
		            simpleOutput.add(progressBar, BorderLayout.EAST);
		            progressBar.setVisible(false);
		    		    		                        
		    		detailView = new JPanel(new BorderLayout(3,3));
		    		    		                                   // fileTableModel = new FileTableModel();
		            
		            //table.getSelectionModel().addListSelectionListener(listSelectionListener);
		            JScrollPane tableScroll = new JScrollPane(table);
		            Dimension d = tableScroll.getPreferredSize();
		            tableScroll.setPreferredSize(new Dimension((int)d.getWidth(), (int)d.getHeight()/2));
		            detailView.add(tableScroll, BorderLayout.CENTER);
		            
		            tree = new JTree((TreeModel) null);
		            tree.setVisibleRowCount(15);
		            tree.setRootVisible(false);
		            tree.setBounds(0, 0, 200, 150);
		            tree.setSize(new Dimension(200, 150));

		           // tree = new JTree(treeModel);
		            tree.setRootVisible(false);
		           //tree.addTreeSelectionListener(treeSelectionListener);
		            tree.setCellRenderer(new FileTreeCellRenderer());
		            tree.expandRow(0);
		            JScrollPane treeScroll = new JScrollPane(tree);
		            
		            // as per trashgod tip
		            tree.setVisibleRowCount(15);
		            
		            treeScroll.setColumnHeaderView(tree);
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
		size = new JLabel();
		fileDetailsValues.add(size);
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
		            
		JToolBar toolBar = new JToolBar();
		// mnemonics stop working in a floated toolbar
		toolBar.setFloatable(false);

		openFile = new JButton("Open");
		openFile.setMnemonic('o');
		
		toolBarInit(toolBar);
				
		 fileView = new JPanel(new BorderLayout(3,3));
		
		fileView.add(toolBar,BorderLayout.NORTH);
		fileView.add(fileMainDetails,BorderLayout.CENTER);
		
		detailView.add(fileView, BorderLayout.SOUTH);
		
		JSplitPane splitPane = new JSplitPane(
		JSplitPane.HORIZONTAL_SPLIT,
		treeScroll,
		detailView);
		gui.add(splitPane, BorderLayout.CENTER);
		
		gui.add(simpleOutput, BorderLayout.SOUTH);

	JMenuBar menuBar = new JMenuBar();
	gui.add(menuBar, BorderLayout.NORTH);
	initMenuBar(menuBar,user.getUsername());
	
   }

	private void toolBarInit(JToolBar toolBar) {
		toolBar.add(openFile);
        
        // Check the actions are supported on this platform!
		//openFile.setEnabled(desktop.isSupported(Desktop.Action.OPEN));
		
		toolBar.addSeparator();
		
		newFile = new JButton("New");
		
		newFile.setMnemonic('n');
		
		toolBar.add(newFile);
		
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
		
		readable = new JCheckBox("Read  ");
		readable.setMnemonic('a');
		//readable.setEnabled(false);
		toolBar.add(readable);
		
		writable = new JCheckBox("Write  ");
		writable.setMnemonic('w');
		//writable.setEnabled(false);
		toolBar.add(writable);
		
		executable = new JCheckBox("Execute");
		executable.setMnemonic('x');
		//executable.setEnabled(false);
		toolBar.add(executable);

		
	}

	public JButton getOpenFile() {
		// TODO Auto-generated method stub
		return openFile;
	}
	
	public FileSystemView getFileSystemView() {
		return fileSystemView;
	}

	public void setFileSystemView(FileSystemView fileSystemView) {
		this.fileSystemView = fileSystemView;
	}

	public File getCurrentFile() {
		return currentFile;
	}

	public void setCurrentFile(File currentFile) {
		this.currentFile = currentFile;
	}

	public JTree getTree() {
		return tree;
	}

	public void setTree(JTree tree) {
		this.tree = tree;
	}

	public JTable getTable() {
		if(table == null ){
    		table = new JTable();
    		//table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    		table.setAutoCreateRowSorter(true);
            table.setShowVerticalLines(false);
		}
		return table;
	}
public JMenuBar initMenuBar(JMenuBar menuBar,String UserName)
	{

JMenu mnMybox = new JMenu("MyBox");
menuBar.add(mnMybox);

 mntmSettings = new JMenuItem("Settings");
mnMybox.add(mntmSettings);

 mntmLogOut = new JMenuItem("Log Out");
mnMybox.add(mntmLogOut);

JMenu mnFile = new JMenu("File");
menuBar.add(mnFile);

 mntmCreateNewFolder = new JMenuItem("Create File / Folder");

mnFile.add(mntmCreateNewFolder);

 mntmUploadfile = new JMenuItem("UploadFile");


mnFile.add(mntmUploadfile);

 mntmSearch = new JMenuItem("Search");
mnFile.add(mntmSearch);

JMenu mnGroup = new JMenu("Group");
menuBar.add(mnGroup);

 mntmCreateNewGroup = new JMenuItem("Create New Group");
mnGroup.add(mntmCreateNewGroup);

 mntmAskToJoin = new JMenuItem("Ask to Join");
mnGroup.add(mntmAskToJoin);

JMenu mnEdit = new JMenu("Edit");
menuBar.add(mnEdit);

 mntmMove = new JMenuItem("Move");

mnEdit.add(mntmMove);


 mntmDelete = new JMenuItem("Delete");
mnEdit.add(mntmDelete);

 mntmRename = new JMenuItem("ReName");
mnEdit.add(mntmRename);

JMenu mnView = new JMenu("Go");
menuBar.add(mnView);

JCheckBoxMenuItem chckbxmntmMyFiles = new JCheckBoxMenuItem("My Files");
mnView.add(chckbxmntmMyFiles);

 chckbxmntmSharedWithMe = new JCheckBoxMenuItem("Shared With Me");
mnView.add(chckbxmntmSharedWithMe);

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

 lblLogInAs = new JLabel("Log in as : " + UserName);
menuBar.add(lblLogInAs);

 btnNotifications = new JButton("notifications");
menuBar.add(btnNotifications);
return menuBar;

	}
	
 	public void setTable(JTable table) {
		this.table = table;
	}

	public JProgressBar getProgressBar() {
		return progressBar;
	}

	public void setProgressBar(JProgressBar progressBar) {
		this.progressBar = progressBar;
	}

	public JButton getDeleteFile() {
		return deleteFile;
	}

	public void setDeleteFile(JButton deleteFile) {
		this.deleteFile = deleteFile;
	}

	public JButton getNewFile() {
		return newFile;
	}

	public void setNewFile(JButton newFile) {
		this.newFile = newFile;
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

	public void setSize(JLabel size) {
		this.size = size;
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

	public JPanel getSimpleOutput() {
		return simpleOutput;
	}

	public void setSimpleOutput(JPanel simpleOutput) {
		this.simpleOutput = simpleOutput;
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
		this.openFile = openFile;
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

	public JCheckBoxMenuItem getChckbxmntmSharedWithMe() {
		return chckbxmntmSharedWithMe;
	}

	public void setChckbxmntmSharedWithMe(JCheckBoxMenuItem chckbxmntmSharedWithMe) {
		this.chckbxmntmSharedWithMe = chckbxmntmSharedWithMe;
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

	public JMenuItem getMntmAskToJoin() {
		return mntmAskToJoin;
	}

	public void setMntmAskToJoin(JMenuItem mntmAskToJoin) {
		this.mntmAskToJoin = mntmAskToJoin;
	}

	public JMenuItem getMntmCreateNewGroup() {
		return mntmCreateNewGroup;
	}

	public void setMntmCreateNewGroup(JMenuItem mntmCreateNewGroup) {
		this.mntmCreateNewGroup = mntmCreateNewGroup;
	}

	public JMenuItem getMntmSearch() {
		return mntmSearch;
	}

	public void setMntmSearch(JMenuItem mntmSearch) {
		this.mntmSearch = mntmSearch;
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
	
	public JPanel getGui() {
		  if (gui==null) {
	            gui = new JPanel(new BorderLayout(3,3));
	            gui.setBorder(new EmptyBorder(5,5,5,5));
	            setBounds(100, 100, 800	, 600);
	            gui.setBounds(100, 100, 800	, 600);
	            setContentPane(gui);
		  }
		return gui;
	}
	
	private void setFileDetails(File file) {
	    currentFile = file;
	    Icon icon = fileSystemView.getSystemIcon(file);
	    fileName.setIcon(icon);
	    fileName.setText(fileSystemView.getSystemDisplayName(file));
	    path.setText(file.getPath());
	    date.setText(new Date(file.lastModified()).toString());
	    size.setText(file.length() + " bytes");
	    readable.setSelected(file.canRead());
	    writable.setSelected(file.canWrite());
	    executable.setSelected(file.canExecute());
	    isDirectory.setSelected(file.isDirectory());

	    isFile.setSelected(file.isFile());

	    JFrame f = (JFrame) gui.getTopLevelAncestor();
	    if (f!=null) {
	        f.setTitle(
	            APP_TITLE +
	            " :: " +
	            fileSystemView.getSystemDisplayName(file) );
	    }

	    gui.repaint();
	}
	
	private void showThrowable(Throwable t) {
	    t.printStackTrace();
	    JOptionPane.showMessageDialog(
	        gui,
	        t.toString(),
	        t.getMessage(),
	        JOptionPane.ERROR_MESSAGE
	        );
	    gui.repaint();
	}

}


	
	
	

