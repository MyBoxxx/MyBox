package view;

import java.awt.*;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import javax.swing.filechooser.FileView;

import java.awt.event.*;
import java.io.File;
import java.io.IOException;




public class AbstractGUI extends javax.swing.JFrame {

	private static final Container JavaFileView = null;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JProgressBar jp = new JProgressBar();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbstractGUI frame = new AbstractGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public class JProgressBarb{
		final static int interval = 1000;
		int i;
		Timer t;
		
		JButton btn;
		
		JProgressBar prg;
		
		public JProgressBarb(){
			JFrame frame = new JFrame();
			frame.getContentPane().setLayout(new FlowLayout());
			btn = new JButton("Start");
			
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae){
					i=0;
					t.start();
					btn.setEnabled(false);
				}
			});
			
			prg = new JProgressBar(0,20);
			prg.setValue(0);
			prg.setStringPainted(true);
			
			frame.getContentPane().add(prg);
			frame.getContentPane().add(btn);
			
			
			
			
			t = new Timer(interval, new ActionListener() {
				
				public void actionPerformed(ActionEvent ae) {
					if (i==20)
					{
						t.stop();
						btn.setEnabled(true);
					}
					else
					{
						i++;
						prg.setValue(i);
					}
				}
			});
		frame.setVisible(true);
		frame.setSize(300,300);
		
		}
	}
	/**
	 * Create the frame.
	 */
	public AbstractGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMybox = new JMenu("MyBox");
		menuBar.add(mnMybox);
		
		JMenuItem mntmSettings = new JMenuItem("Settings");
		mnMybox.add(mntmSettings);
		
		JMenuItem mntmLogOut = new JMenuItem("Log Out");
		mnMybox.add(mntmLogOut);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmCreateNewFolder = new JMenuItem("Create New Folder");
		mnFile.add(mntmCreateNewFolder);
		
		JMenuItem mntmUploadfile = new JMenuItem("UploadFile");
		mnFile.add(mntmUploadfile);
		
		JMenuItem mntmSearch = new JMenuItem("Search");
		mnFile.add(mntmSearch);
		
		JMenu mnGroup = new JMenu("Group");
		menuBar.add(mnGroup);
		
		JMenuItem mntmCreateNewGroup = new JMenuItem("Create New Group");
		mnGroup.add(mntmCreateNewGroup);
		
		JMenuItem mntmAskToJoin = new JMenuItem("Ask to Join");
		mnGroup.add(mntmAskToJoin);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmCopy = new JMenuItem("Move");
		mnEdit.add(mntmCopy);
		
		JMenuItem mntmPaste = new JMenuItem("Select NON");
		mnEdit.add(mntmPaste);
		
		JMenuItem mntmSelectAll = new JMenuItem("Select All");
		mnEdit.add(mntmSelectAll);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mnEdit.add(mntmDelete);
		
		JMenuItem mntmRename = new JMenuItem("ReName");
		mnEdit.add(mntmRename);
		
		JMenu mnHelp = new JMenu("Edit");
		menuBar.add(mnHelp);
		
		JMenu mnView = new JMenu("Go");
		menuBar.add(mnView);
		
		JCheckBoxMenuItem chckbxmntmMyFiles = new JCheckBoxMenuItem("My Files");
		mnView.add(chckbxmntmMyFiles);
		
		JCheckBoxMenuItem chckbxmntmSharedWithMe = new JCheckBoxMenuItem("Shared With Me");
		mnView.add(chckbxmntmSharedWithMe);
		
		JMenuItem mntmTrash = new JMenuItem("Trash");
		mnView.add(mntmTrash);
		
		JMenu mnHelp_1 = new JMenu("Help");
		menuBar.add(mnHelp_1);
		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mnHelp_1.add(mntmAboutUs);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mnHelp_1.add(mntmHelp);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("                    ");
		menuBar.add(mntmNewMenuItem);
		
		JLabel lblLogInAs = new JLabel("Log in as : Eyalpano@gmail.com");
		menuBar.add(lblLogInAs);
		
		JButton btnNotifications = new JButton("notifications");
		menuBar.add(btnNotifications);
		contentPane = new JPanel();
		
		
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
	}
}
