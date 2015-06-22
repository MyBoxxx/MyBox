package GUI_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicFileChooserUI;

import java.io.File;
import java.net.MalformedURLException;
import java.nio.file.*;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Component;

import javax.swing.Box;

import java.awt.Color;
import java.awt.Panel;
import java.awt.Canvas;

import javax.swing.JMenuBar;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import Controlers.LoginMain;

import com.thehowtotutorial.splashscreen.JSplash;

import java.awt.ScrollPane;
import java.awt.Label;

public class Splash {
	public JFrame frame;

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Launch the application.
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	public static void main() throws InterruptedException, MalformedURLException {
		//JSplash splashs = new JSplash(URL , false, false, false, null);
		
			JSplash splashs = new JSplash(Splash.class.getResource("Cloud printing.png"), true, true, false, "V1",null,Color.RED,Color.BLACK);
			splashs.splashOn();
			//call Method;
			splashs.setProgress(20, "Init");
			Thread.sleep(500);
			splashs.setProgress(40, "Loading");
			Thread.sleep(500);
			splashs.setProgress(60, "Applying Configs");
			Thread.sleep(500);
			splashs.setProgress(80, "Making JAVA");
			Thread.sleep(500);
			splashs.setProgress(100, "100 Ein ma");
			Thread.sleep(1500);
			splashs.splashOff();	

	/**
	 * Create the application.
	 */

		LoginMain.main(null);
	

	/**
	 * Initialize the contents of the frame.
	 */
	
	}
}