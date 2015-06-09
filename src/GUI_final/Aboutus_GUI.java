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
	private JLabel join;
	private JLabel Names;
	

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
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
<<<<<<< HEAD
	
	    join = new JLabel();
	    join.setIcon(new ImageIcon("src/GUI_final/about_us.jpg"));
	    join.setBounds(0, -267, 701, 770);
		contentPane.add(join);			
	    
	    Names = new JLabel();	
	    Names.setIcon(new ImageIcon("src/GUI_final/names.jpg"));
	    Names.setLocation(10, 276);
	    Names.setSize(887, 492);	   
		contentPane.add(Names);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JLabel getJoin() {
		return join;
	}

	public void setJoin(JLabel join) {
		this.join = join;
	}

	public JLabel getNames() {
		return Names;
	}

	public void setNames(JLabel names) {
		Names = names;
=======
		
	    contentPane.setLayout(null);
	    JLabel join = new JLabel();
	    join.setIcon(new ImageIcon("src/GUI_final/about_us.jpg"));
	    join.setBounds(0, -267, 701, 770);
		contentPane.add(join);
		
		
	    contentPane.setLayout(null);
	    JLabel Names = new JLabel();	
	    Names.setIcon(new ImageIcon("src/GUI_final/names.jpg"));
	    Names.setLocation(10, 276);
	    Names.setSize(887, 492);	   
		contentPane.add(Names);
>>>>>>> branch 'ofir' of https://github.com/MyBoxxx/MyBox.git
	}

}
