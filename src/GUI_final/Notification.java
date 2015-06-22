package GUI_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;
import javax.swing.JLabel;
import java.awt.Font;

public class Notification extends AbstractGUI {

	private JPanel contentPane;
	public static   JFrame frame;
	private static  JPanel panel;	
	private static String text;	
	public JTable table;
	private JButton btnBack;
	private JScrollPane scrollPane;
	private JLabel notificationLabel;

	public Notification() {
        panel = new JPanel();   //
        panel.setBackground(SystemColor.textHighlight);
        table = new JTable(){
			public boolean isCellEditable(int rowIndex,int colIndex) {
				return false;
			}
		};
       
       btnBack = new JButton("Back");
       btnBack.setOpaque(false);
       btnBack.setContentAreaFilled(false); 
       btnBack.setBorderPainted(false);
       btnBack.setIcon(new ImageIcon("images/back.png"));
       btnBack.setBounds(656, 487, 128, 75);
      
       panel.setLayout(null);
       panel.add(btnBack);        
     
       scrollPane = new JScrollPane(table);   
       scrollPane.setBounds(0, 85, 784, 402);
       scrollPane.getViewport().setBackground(java.awt.Color.WHITE);
       panel.add(scrollPane);               
       //frame = new JFrame();
       getContentPane().setBackground(SystemColor.textHighlight);
       getContentPane().add(panel);         //adding panel to the frame
       
       notificationLabel = new JLabel("New label");
       notificationLabel.setIcon(new ImageIcon("images/Notification-Center.png"));
       notificationLabel.setBounds(0, 0, 784, 86);
       panel.add(notificationLabel);
       setSize(800, 600); //setting frame size 
       setResizable(false);
	}

	

	public static JPanel getPanel() {
		return panel;
	}

	public static void setPanel(JPanel panel) {
		Notification.panel = panel;
	}

	public static String getText() {
		return text;
	}

	public static void setText(String text) {
		Notification.text = text;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}


	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JLabel getNotificationLabel() {
		return notificationLabel;
	}

	public void setNotificationLabel(JLabel notificationLabel) {
		this.notificationLabel = notificationLabel;
	}

}
