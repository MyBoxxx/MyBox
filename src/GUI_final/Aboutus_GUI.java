package GUI_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Aboutus_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aboutus_GUI frame = new Aboutus_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws MalformedURLException 
	 */
	public Aboutus_GUI() throws MalformedURLException {
		setBackground(Color.WHITE);
		
		
		
		setTitle("About Us");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 651);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		URL url2 = new URL("http://ktstrust.org/wp-content/uploads/2013/12/about-us-banner.jpg");
	    Icon icon2 = new ImageIcon(url2);
	    contentPane.setLayout(null);
	    JLabel label2 = new JLabel(icon2);	    
	    label2.setBounds(0, -267, 701, 770);
		contentPane.add(label2);
		
		URL url3 = new URL("http://i.imgur.com/nVXl0Op.jpg");
	    Icon icon3 = new ImageIcon(url3);
	    contentPane.setLayout(null);
	    JLabel label3 = new JLabel(icon3);	    
	    label3.setLocation(10, 276);
	    label3.setSize(887, 492);
	   
		contentPane.add(label3);
	}

}
