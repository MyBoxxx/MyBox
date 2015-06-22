package GUI_final;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 



import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;
import javax.swing.JButton;



public class RecycleBinScreen extends AbstractGUI  {


	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnRestore;
	
	public RecycleBinScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRecycleBin = new JLabel("Recycle Bin");
		lblRecycleBin.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRecycleBin.setBounds(333, 25, 105, 47);
		contentPane.add(lblRecycleBin);
		
        table = new JTable(){
			public boolean isCellEditable(int rowIndex,int colIndex) {
				return false;
			}
		};
        scrollPane = new JScrollPane(table);
        scrollPane.setLocation(10, 68);
        scrollPane.setSize(784,357);
        scrollPane.setBounds(10,68,784,357);
        table.setVisible(true);
        contentPane.add(scrollPane, BorderLayout.CENTER );
        
         btnRestore = new JButton("Restore");
    
        btnRestore.setBounds(333, 470, 253, 82);
        contentPane.add(btnRestore);
	}

	public JButton getBtnRestore() {
		return btnRestore;
	}

	public void setBtnRestore(JButton btnRestore) {
		this.btnRestore = btnRestore;
	}

	public JTable getTable() {
		return table;
	}


	public void setTable(JTable table) {
		this.table = table;
	}


	public JScrollPane getScrollPane() {
		return scrollPane;
	}


	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

}


