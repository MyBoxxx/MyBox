package GUI_final;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

@SuppressWarnings("serial")
public class Aboutus_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void init() {
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
		setBounds(100, 100, 800, 700);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setBackground(Color.WHITE);		
		setTitle("About Us");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
	    contentPane.setLayout(null);
	    JLabel join = new JLabel();
	    join.setIcon(new ImageIcon("src/GUI_final/about_us.jpg"));
	    join.setBounds(0, -267, 800, 770);
		contentPane.add(join);
		
		
	    contentPane.setLayout(null);
	    JLabel Names = new JLabel();	
	    Names.setIcon(new ImageIcon("src/GUI_final/names.jpg"));
	    Names.setLocation(10, 276);
	    Names.setSize(887, 492);	   
		contentPane.add(Names);
	}

}
