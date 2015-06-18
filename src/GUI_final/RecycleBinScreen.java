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
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.Point;

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
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JMenuItem RestoreAdd;
	private JMenuItem DeleteAdd;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecycleBinScreen frame = new RecycleBinScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RecycleBinScreen() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRecycleBin = new JLabel("Recycle Bin");
		lblRecycleBin.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRecycleBin.setBounds(333, 25, 105, 47);
		contentPane.add(lblRecycleBin);
		
		String columnNames[] = { "File Name", "Delete Date", "Is Restorable", "Original Path" };
        String dataValues[][] = { {"Effective Java", "Joshua Bloch", "Addision-Wesley", "May 08th 2008", "346", "5"},
                {"Thinking in Java", "Bruce Eckel", "Prentice Hall", "Feb 26th 2006", "1150", "4"}};
        tableModel = new DefaultTableModel(dataValues, columnNames);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);
        scrollPane.setLocation(10, 68);
        scrollPane.setSize(784,357);
        scrollPane.setBounds(10,68,784,357);
        table.setVisible(true);
        contentPane.add(scrollPane, BorderLayout.CENTER );
        
        JPopupMenu popupMenu = new JPopupMenu();
        RestoreAdd = new JMenuItem("Restore this file");
        DeleteAdd = new JMenuItem("Delete this file");
        
                
        popupMenu.add(RestoreAdd);
        popupMenu.add(DeleteAdd);
        
        table.setComponentPopupMenu(popupMenu);
        table.addMouseListener(new TableMouseListener(table));
	}
	
	public void actionPerformed(ActionEvent event) {
	        JMenuItem menu = (JMenuItem) event.getSource();
	        if (menu == RestoreAdd) {
	            addNewRow();
	        } else if (menu == DeleteAdd) {
	            removeCurrentRow();
	        }
	    }
	     
	    private void addNewRow() { 
	    	int selectedRow = table.getSelectedRow();
	    	Object file = table.getValueAt(selectedRow, 0);
	    	Object Restore = table.getValueAt(selectedRow, 2);
	    	
	    	int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to Restore this file?", "Warning",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
      
	    	if (p == JOptionPane.YES_OPTION) {
	    		if (Restore.toString() == "No")
		    	{
		    		JOptionPane.showMessageDialog(null, "The file "+file.toString()+ " is not restorable", "Access Denide", JOptionPane.INFORMATION_MESSAGE);
		    	} else{
		    		tableModel.removeRow(selectedRow);
		    		JOptionPane.showMessageDialog(null, "The file "+file.toString()+ " restored", "File restored", JOptionPane.INFORMATION_MESSAGE);
		    	}
	    	} else if (p == JOptionPane.NO_OPTION) {
	    		JOptionPane.showMessageDialog(null, "Nothing restored", "Message", JOptionPane.INFORMATION_MESSAGE);
	    	}

	    }
	     
	    private void removeCurrentRow() {
	        int selectedRow = table.getSelectedRow();
	        Object file = table.getValueAt(selectedRow, 0);
            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete this file?", "Warning",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
          
            if (p == JOptionPane.YES_OPTION) {
            	tableModel.removeRow(selectedRow);
            	 JOptionPane.showMessageDialog(null, "The file "+file.toString()+ " deleted", "File deleted", JOptionPane.INFORMATION_MESSAGE);
            } else if (p == JOptionPane.NO_OPTION) {
            	 JOptionPane.showMessageDialog(null, "Nothing deleted", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
	    }
}


