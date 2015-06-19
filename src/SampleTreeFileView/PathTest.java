package SampleTreeFileView;

import java.util.Enumeration;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class PathTest {
    public PathTest() {
        // Create the root node, I'm assuming that the delimited strings will have
        // different string value at index 0
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("U_1");

        // Create the tree model and add the root node to it
        DefaultTreeModel model = new DefaultTreeModel(root);
        // Create the tree with the new model
        JTree tree = new JTree(model);
        tree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }

			private void jTree1ValueChanged(TreeSelectionEvent evt) {
				System.out.println(replaceTreePath(evt));
				
			}

			private String replaceTreePath(TreeSelectionEvent evt) {
				return evt.getPath().toString().substring(1, evt.getPath().toString().length()-1).replace(", ", "/");
			}
        });
        //tree.setRootVisible(false);
        
        // Build the tree from the various string samples
        buildTreeFromString(model, "U_1/eyal/bla/Node 4/");
        buildTreeFromString(model, "U_1/eyal/Node 3/Node 5/");
        buildTreeFromString(model, "Node 1/Node 2/Node 3/Node 6/");
        buildTreeFromString(model, "Node 1/Node 2/Node 4/Node 5/");
        buildTreeFromString(model, "Node 1/Node 1/Node 3/Node 5/");
        
        for (int i = 0; i < tree.getRowCount(); i++) {
            tree.expandRow(i);
        }
       
        // UI
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(tree);
        f.setSize(300, 300);
        f.setLocation(200, 200);
        f.setVisible(true);
    }

    /**
     * Builds a tree from a given forward slash delimited string.
     * 
     * @param model The tree model
     * @param str The string to build the tree from
     */
    private void buildTreeFromString(final DefaultTreeModel model, final String str) {
        // Fetch the root node
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();

        // Split the string around the delimiter
        String [] strings = str.split("/");
        
        // Create a node object to use for traversing down the tree as it 
        // is being created
        DefaultMutableTreeNode node = root;
        
        // Iterate of the string array
        for (String s: strings) {
        	System.out.println(s);
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

    public static void main(String[] args) {
        new PathTest();
    }
}
