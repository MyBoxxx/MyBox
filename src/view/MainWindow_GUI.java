package view;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;



public class MainWindow_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JProgressBarb jp = new JProgressBarb();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow_GUI frame = new MainWindow_GUI();
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
			frame.setLayout(new FlowLayout());
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
			
			frame.add(prg);
			frame.add(btn);
			
			
			
			
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
	public MainWindow_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(48, 180, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("About Us");
		button.setBounds(48, 238, 117, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Help");
		button_1.setBounds(48, 96, 117, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Settings");
		button_2.setBounds(48, 39, 117, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Sign Out");
		button_3.setBounds(194, 96, 117, 29);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Create Group");
		button_4.setBounds(194, 39, 117, 29);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Upload");
		button_5.setBounds(194, 180, 117, 29);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Create Folder");
		button_6.setBounds(194, 238, 117, 29);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("Ask To Join/Remove");
		button_7.setBounds(245, 639, 117, 29);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("Recycle Bin");
		button_8.setBounds(454, 639, 117, 29);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("Notifications");
		button_9.setBounds(616, 639, 117, 29);
		contentPane.add(button_9);
		
		textField = new JTextField();
		textField.setBounds(390, 31, 385, 42);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
