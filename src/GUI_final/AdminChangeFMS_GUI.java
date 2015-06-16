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

import GUI_final.AdminAddPeopleToGroup;
import GUI_final.AdminDeletePeopleToGroup;
import GUI_final.Limitpeopleingroup;

public class AdminChangeFMS_GUI extends AbstractGUI {

	public JPanel contentPane;
	private JTabbedPane tabbedPane ;
	private Limitpeopleingroup limit;
	private AdminAddPeopleToGroup add;
	private AdminDeletePeopleToGroup delete;
	private JButton HomeButton;	
		
	/**
	 * Create the frame.
	 */
	public AdminChangeFMS_GUI() {
		super();
		limit = new Limitpeopleingroup();
		add = new AdminAddPeopleToGroup();
		delete = new AdminDeletePeopleToGroup();
		HomeButton = new JButton();
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().add(tabbedPane);
		tabbedPane.setBounds(10, 34, 764, 517);
		contentPane.add(tabbedPane);
		
			
			limit.setBackground(SystemColor.textHighlight);
			
			tabbedPane.addTab("Limit", limit);
			limit.setLayout(null);
		
		
		add.setBackground(SystemColor.textHighlight);
		tabbedPane.addTab("Add", add);
		add.setLayout(null);
		
		add.setBackground(SystemColor.textHighlight);
		delete.setBackground(SystemColor.textHighlight);
		tabbedPane.addTab("Delete", delete);
		delete.setLayout(null);
		HomeButton.setBounds(647, 0, 89, 31);
		HomeButton .setIcon(new ImageIcon("src/GUI_final/home.png"));
		contentPane.add(HomeButton);
	}
	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}

	public Limitpeopleingroup getLimit() {
		return limit;
	}

	public void setLimit(Limitpeopleingroup limit) {
		this.limit = limit;
	}

	public AdminAddPeopleToGroup getAdd() {
		return add;
	}

	public void setAdd(AdminAddPeopleToGroup add) {
		this.add = add;
	}

	public AdminDeletePeopleToGroup getDelete() {
		return delete;
	}

	public void setDelete(AdminDeletePeopleToGroup delete) {
		this.delete = delete;
	}

	public JButton getHomeButton() {
		return HomeButton;
	}

	public void setHomeButton(JButton homeButton) {
		HomeButton = homeButton;
	}
}
