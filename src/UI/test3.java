package UI;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.MouseAdapter;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import java.awt.event.*;

public class test3 {

	public void initialize() throws MalformedURLException {
		  URL url = new URL("http://i.imgur.com/6Bq6MQr.gif");
		    Icon icon = new ImageIcon(url);
		    JLabel label = new JLabel(icon);
		    label.addMouseListener(new MouseAdapter() {
		        public void mouseClicked(MouseEvent me) {
		          System.out.println("CLICKED");
		        }
		      });
		    JFrame f = new JFrame("Animation");
		    f.getContentPane().add(label);
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    f.pack();
		    f.setLocationRelativeTo(null);
		    f.setVisible(true);
	}

}
