package SampleTreeFileView;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class Model {
	
	/** File-system tree. Built Lazily */
	private JTree tree;
	private DefaultTreeModel treeModel;

    /** currently selected File. */
    private File currentFile;
    
    /** Used to open/edit/print files. */
    private Desktop desktop;
	

public void showRootFile() {
    // ensure the main files are displayed
    tree.setSelectionInterval(0,0);
}

private TreePath findTreePath(File find) {
    for (int ii=0; ii<tree.getRowCount(); ii++) {
        TreePath treePath = tree.getPathForRow(ii);
        Object object = treePath.getLastPathComponent();
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)object;
        File nodeFile = (File)node.getUserObject();

        if (nodeFile==find) {
            return treePath;
        }
    }
    // not found!
    return null;
}
/*
private void deleteFile(Component gui) {
    if (currentFile==null) {
        showErrorMessage("No file selected for deletion.","Select File");
        return;
    }
    int result = JOptionPane.showConfirmDialog(gui, "Are you sure you want to delete this file?","Delete File",JOptionPane.ERROR_MESSAGE);
    if (result==JOptionPane.OK_OPTION) {
        try {
            System.out.println("currentFile: " + currentFile);
            TreePath parentPath = findTreePath(currentFile.getParentFile());
            System.out.println("parentPath: " + parentPath);
            DefaultMutableTreeNode parentNode =
                (DefaultMutableTreeNode)parentPath.getLastPathComponent();
            System.out.println("parentNode: " + parentNode);

            boolean directory = currentFile.isDirectory();
            boolean deleted = currentFile.delete();
            if (deleted) {
                if (directory) {
                    // delete the node..
                    TreePath currentPath = findTreePath(currentFile);
                    System.out.println(currentPath);
                    DefaultMutableTreeNode currentNode =
                        (DefaultMutableTreeNode)currentPath.getLastPathComponent();

                    treeModel.removeNodeFromParent(currentNode);
                }

                showChildren(parentNode);
            } else {
                String msg = "The file '" +
                    currentFile +
                    "' could not be deleted.";
                showErrorMessage(msg,"Delete Failed");
            }
        } catch(Throwable t) {
            showThrowable(t);
        }
    }
    gui.repaint();
}
/*
private void newFile() {
    if (currentFile==null) {
        showErrorMessage("No location selected for new file.","Select Location");
        return;
    }

    if (newFilePanel==null) {
        newFilePanel = new JPanel(new BorderLayout(3,3));

        southRadio = new JPanel(new GridLayout(1,0,2,2));
        newTypeFile = new JRadioButton("File", true);
        newTypeDirectory = new JRadioButton("Directory");
        ButtonGroup bg = new ButtonGroup();
        bg.add(newTypeFile);
        bg.add(newTypeDirectory);
        southRadio.add( newTypeFile );
        southRadio.add( newTypeDirectory );

        name = new JTextField(15);

        newFilePanel.add( new JLabel("Name"), BorderLayout.WEST );
        newFilePanel.add( name );
        newFilePanel.add( southRadio, BorderLayout.SOUTH );
    }

    int result = JOptionPane.showConfirmDialog(
        gui,
        newFilePanel,
        "Create File",
        JOptionPane.OK_CANCEL_OPTION);
    if (result==JOptionPane.OK_OPTION) {
        try {
            boolean created;
            File parentFile = currentFile;
            if (!parentFile.isDirectory()) {
                parentFile = parentFile.getParentFile();
            }
            File file = new File( parentFile, name.getText() );
            if (newTypeFile.isSelected()) {
                created = file.createNewFile();
            } else {
                created = file.mkdir();
            }
            if (created) {

                TreePath parentPath = findTreePath(parentFile);
                DefaultMutableTreeNode parentNode =
                    (DefaultMutableTreeNode)parentPath.getLastPathComponent();

                if (file.isDirectory()) {
                    // add the new node..
                    DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(file);

                    TreePath currentPath = findTreePath(currentFile);
                    DefaultMutableTreeNode currentNode =
                        (DefaultMutableTreeNode)currentPath.getLastPathComponent();

                    treeModel.insertNodeInto(newNode, parentNode, parentNode.getChildCount());
                }

                showChildren(parentNode);
            } else {
                String msg = "The file '" +
                    file +
                    "' could not be created.";
                showErrorMessage(msg, "Create Failed");
            }
        } catch(Throwable t) {
            showThrowable(t);
        }
    }
    gui.repaint();
}
private void setColumnWidth(int column, int width) {
    TableColumn tableColumn = table.getColumnModel().getColumn(column);
    if (width<0) {
        // use the preferred width of the header..
        label = new JLabel( (String)tableColumn.getHeaderValue() );
        Dimension preferred = label.getPreferredSize();
        // altered 10->14 as per camickr comment.
        width = (int)preferred.getWidth()+14;
    }
    tableColumn.setPreferredWidth(width);
    tableColumn.setMaxWidth(width);
    tableColumn.setMinWidth(width);
}

/** Add the files that are contained within the directory of this node.
Thanks to Hovercraft Full Of Eels. */
/*
private void showChildren(final DefaultMutableTreeNode node) {
    tree.setEnabled(false);
    progressBar.setVisible(true);
    progressBar.setIndeterminate(true);

    SwingWorker<Void, File> worker = new SwingWorker<Void, File>() {
        @Override
        public Void doInBackground() {
            File file = (File) node.getUserObject();
            if (file.isDirectory()) {
                File[] files = fileSystemView.getFiles(file, true); //!!
                if (node.isLeaf()) {
                    for (File child : files) {
                        if (child.isDirectory()) {
                            publish(child);
                        }
                    }
                }
                setTableData(files);
            }
            return null;
        }

        @Override
        protected void process(List<File> chunks) {
            for (File child : chunks) {
                node.add(new DefaultMutableTreeNode(child));
            }
        }

        @Override
        protected void done() {
            progressBar.setIndeterminate(false);
            progressBar.setVisible(false);
            tree.setEnabled(true);
        }
    };
    worker.execute();
}

public boolean MoveFile() throws IOException {

	if (currentFile==null) {
        showErrorMessage("No file selected for deletion.","Select File");
        return false;
    }
	
 	try{
 		 
 	   File afile = currentFile;
 	   //todo --> tree and choose option open 
 	   
 	   String new_path = null;
	if(afile.renameTo(new File( new_path  +""+ afile.getName()))){
 		System.out.println("File is moved successful!");
 	   }else{
 		System.out.println("File is failed to move!");
 	   }

 	}catch(Exception e){
 		e.printStackTrace();
 	}
	return true;
}
*/
/** Update the File details view with the details of this File. */
/*
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


private void showErrorMessage(String errorMessage, String errorTitle) {
    JOptionPane.showMessageDialog(
        gui,
        errorMessage,
        errorTitle,
        JOptionPane.ERROR_MESSAGE
        );
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
*/
/** Update the table on the EDT */
/*
private void setTableData(final File[] files) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            if (fileTableModel==null) {
                fileTableModel = new FileTableModel();
                table.setModel(fileTableModel);
            }
            table.getSelectionModel().removeListSelectionListener(listSelectionListener);
            fileTableModel.setFiles(files);
            table.getSelectionModel().addListSelectionListener(listSelectionListener);
            if (!cellSizesSet) {
                Icon icon = fileSystemView.getSystemIcon(files[0]);

                // size adjustment to better account for icons
                table.setRowHeight( icon.getIconHeight()+rowIconPadding );

                setColumnWidth(0,-1);
                setColumnWidth(3,60);
                table.getColumnModel().getColumn(3).setMaxWidth(120);
                setColumnWidth(4,-1);
                setColumnWidth(5,-1);
                setColumnWidth(6,-1);
                setColumnWidth(7,-1);
                setColumnWidth(8,-1);
                setColumnWidth(9,-1);

                cellSizesSet = true;
            }
        }
    });
}
*/

public Object getDesktop() {
	// TODO Auto-generated method stub
	return null;
}

public void setDesktop(Desktop desktop) {
	this.desktop = desktop;
}




}
