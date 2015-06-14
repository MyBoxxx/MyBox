package GUI_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTabbedPane;
import javax.swing.JButton;

public class AdminChangeFMS_GUI extends JFrame {

	private JPanel contentPane;
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	Limitpeopleingroup limit = new Limitpeopleingroup();
	AdminAddPeopleToGroup add = new AdminAddPeopleToGroup();
	AdminDeletePeopleToGroup delete = new AdminDeletePeopleToGroup();
	private final JButton HomeButton = new JButton();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminChangeFMS_GUI frame = new AdminChangeFMS_GUI();
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
	public AdminChangeFMS_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().add(tabbedPane);
		tabbedPane.setBounds(10, 11, 764, 540);
		contentPane.add(tabbedPane);
		
		
		add.setBackground(SystemColor.textHighlight);
		tabbedPane.addTab("Add", add);
		add.setLayout(null);
		
		add.setBackground(SystemColor.textHighlight);
		delete.setBackground(SystemColor.textHighlight);
		tabbedPane.addTab("Delete", delete);
		delete.setLayout(null);
		
			
			limit.setBackground(SystemColor.textHighlight);
			tabbedPane.addTab("Limit", limit);
			limit.setLayout(null);
		HomeButton.setBounds(647, 0, 89, 31);
		HomeButton .setIcon(new ImageIcon("src/GUI_final/home.png"));
		contentPane.add(HomeButton);
	}
}
