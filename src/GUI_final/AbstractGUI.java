package GUI_final;

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
<<<<<<< HEAD
<<<<<<< HEAD
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Client.MainClient;
import Entity.*;
import Client.*;
/**
 * this class is Abstract Gui  that extends JFrame
 * @author jacob
 *
 */
=======
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * this class is Abstract Gui  that extends JFrame
 * @author jacob
 *
 */
@SuppressWarnings("serial")
>>>>>>> refs/heads/master
=======
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * this class is Abstract Gui  that extends JFrame
 * @author jacob
 *
 */
@SuppressWarnings("serial")
>>>>>>> refs/heads/master
public abstract class AbstractGUI extends JFrame
{
	protected JButton backButton=null;

	/**
	 * constructor
	 * add window Listener 
	 */
	public AbstractGUI(){
		this.addWindowListener(new Exit());
	}
	/**
	 * constructor
	 *  
	 */
	public AbstractGUI(int i){
		
	}
	public void displayInfoMessage(String message,String title,int messageType)
	{
		JOptionPane.showMessageDialog(this, message, title,messageType);
	}
	

	
	
	/**
	 * This method adds an action listener to back to menu button.
	 * @param listener
	 */
	public void addBackActionListener(ActionListener listener){
		backButton.addActionListener(listener);
	}
	/**
	 * Inner class that we press on Exit button - update the status of Employee to 0 (Disconnected) and exit from program
	 * @author jacob
	 *
	 */
	class Exit implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			 //Disconect en1 = new Disconect(MainClient.clien.getCurrUser(),"updateStatus0");
				/*try {
					MainClient.clien.sendToServer("UpdateStatus " + MainClient.clien.getCurrUser().getUsername());
					System.exit(1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				*/
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}
