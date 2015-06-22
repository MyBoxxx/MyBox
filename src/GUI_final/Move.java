package GUI_final;
import javax.swing.JDialog;
import javax.swing.JTree;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;

import java.awt.Dimension;
import javax.swing.JButton;

public class Move extends JDialog {
	JTree tree;
	public Move() {
		 tree = new JTree();
		 JScrollPane scrollPane = new JScrollPane(tree);
		 scrollPane.setPreferredSize(new Dimension(200, 200));
		 scrollPane.setEnabled(false);
		getContentPane().add(scrollPane, BorderLayout.NORTH);
		
		JButton button_1 = new JButton("New button");
		getContentPane().add(button_1, BorderLayout.SOUTH);
		
		JButton button = new JButton("New button");
		getContentPane().add(button, BorderLayout.WEST);
		
	}

}
