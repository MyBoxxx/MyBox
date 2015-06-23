package GUI_final;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import java.awt.Panel;
import java.awt.Color;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;












import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Help_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtSharingAndFolders;
	private JTextField txtManageAccount;
	private JTextField txtSinginHelp;
	private JTextField txtSpaceAndStorage;
	private JTextField txtPhotosAndVidoes;
	private JTextField txtUpload;
	private Share share = new Share();
	private SingIn sign = new SingIn();
	private Manage manage = new Manage();
	private Storage storage = new Storage();
	private Sharing sharing = new Sharing();
	private DelAndRec delANDrec = new DelAndRec();
	private JLabel helpLabel;
	private JButton PhotosButton;
	private JButton Settingbutton ;
	private JButton Loginbutton;
	private JButton accountButton;
	private JButton storageButton;
	private JButton Syncingbutton;
	private JButton backButton;
	

	/**
	 * Launch the application.
	 */
	public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help_GUI frame = new Help_GUI();
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
	public Help_GUI()  {
		setTitle("Help");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
	  
	    helpLabel = new JLabel();
	    helpLabel.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/help.jpg")));
	    helpLabel.setLocation(143, 401);
	    helpLabel.setSize(150, 150);
	    helpLabel.setBounds(166, 11, 472, 198);
	    helpLabel.setBackground(Color.WHITE);
		contentPane.add(helpLabel);
		
		    
		    
		PhotosButton = new JButton();
		PhotosButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sharing.init();
			}
		});
		PhotosButton.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/photos.png")));
		PhotosButton.setBackground(Color.WHITE);
		PhotosButton.setBounds(339, 329, 74, 74);
		contentPane.add(PhotosButton);
		
		Settingbutton = new JButton();
		Settingbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//setVisible(false);
				share.init();
			}
		});
		Settingbutton.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/sharing.png")));
		Settingbutton.setBackground(Color.WHITE);
		Settingbutton.setToolTipText("");
		Settingbutton.setBounds(40, 220, 74, 74);
		contentPane.add(Settingbutton);
		
		
		Loginbutton = new JButton();
		Loginbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				manage.init();
			}
		});
		Loginbutton.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/login.png")));
		Loginbutton.setBackground(Color.WHITE);
		Loginbutton.setBounds(634, 220, 74, 74);
		contentPane.add(Loginbutton);
		
		accountButton = new JButton();
		accountButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sign.init();
			}
		});
		accountButton.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/account.png")));
		accountButton.setBackground(Color.WHITE);
		accountButton.setBounds(339, 220, 74, 74);
		contentPane.add(accountButton);
		
		storageButton = new JButton();
		storageButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				storage.init();
			}
		});
		storageButton.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/storage.png")));
		storageButton.setBackground(Color.WHITE);
		storageButton.setBounds(40, 329, 74, 74);
		contentPane.add(storageButton);
		
		Syncingbutton = new JButton();
		Syncingbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				delANDrec.init();
			}
		});
		Syncingbutton.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/syncing.png")));
		Syncingbutton.setBackground(Color.WHITE);
		Syncingbutton.setBounds(634, 329, 74, 74);
		contentPane.add(Syncingbutton);
		
		txtSharingAndFolders = new JTextField();
		txtSharingAndFolders.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSharingAndFolders.setForeground(SystemColor.textHighlightText);
		txtSharingAndFolders.setBackground(SystemColor.textHighlight);
		txtSharingAndFolders.setText("Sharing and folders");
		txtSharingAndFolders.setBounds(311, 403, 192, 20);
		txtSharingAndFolders.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(txtSharingAndFolders);
		txtSharingAndFolders.setColumns(10);
		
		txtManageAccount = new JTextField();
		txtManageAccount.setForeground(SystemColor.textHighlightText);
		txtManageAccount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtManageAccount.setBackground(SystemColor.textHighlight);
		txtManageAccount.setText("Manage account\r\n");
		txtManageAccount.setBounds(608, 298, 148, 20);
		txtManageAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(txtManageAccount);
		txtManageAccount.setColumns(10);
		
		txtSinginHelp = new JTextField();
		txtSinginHelp.setBackground(SystemColor.textHighlight);
		txtSinginHelp.setForeground(SystemColor.textHighlightText);
		txtSinginHelp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSinginHelp.setText("Sing-in help");
		txtSinginHelp.setBounds(330, 298, 112, 20);
		txtSinginHelp.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(txtSinginHelp);
		txtSinginHelp.setColumns(10);
		
		txtSpaceAndStorage = new JTextField();
		txtSpaceAndStorage.setBackground(SystemColor.textHighlight);
		txtSpaceAndStorage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSpaceAndStorage.setForeground(SystemColor.textHighlightText);
		txtSpaceAndStorage.setText("Space and storage");
		txtSpaceAndStorage.setBounds(10, 403, 228, 20);
		txtSpaceAndStorage.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(txtSpaceAndStorage);
		txtSpaceAndStorage.setColumns(10);
		
		txtPhotosAndVidoes = new JTextField();
		txtPhotosAndVidoes.setBackground(SystemColor.textHighlight);
		txtPhotosAndVidoes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPhotosAndVidoes.setForeground(SystemColor.textHighlightText);
		txtPhotosAndVidoes.setText("Delete and Recovery");
		txtPhotosAndVidoes.setBounds(592, 403, 164, 20);
		txtPhotosAndVidoes.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(txtPhotosAndVidoes);
		txtPhotosAndVidoes.setColumns(10);
		
		txtUpload = new JTextField();
		txtUpload.setForeground(SystemColor.textHighlightText);
		txtUpload.setBackground(SystemColor.textHighlight);
		txtUpload.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUpload.setText("Sharing");
		txtUpload.setBounds(40, 298, 74, 20);
		txtUpload.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(txtUpload);
		txtUpload.setColumns(10);
		
		backButton = new JButton();
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		backButton.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/back.png")));
		backButton.setBackground(Color.WHITE);
		backButton.setBounds(302, 446, 128, 76);
		contentPane.add(backButton);
		
	}

	public JTextField getTxtSharingAndFolders() {
		return txtSharingAndFolders;
	}

	public void setTxtSharingAndFolders(JTextField txtSharingAndFolders) {
		this.txtSharingAndFolders = txtSharingAndFolders;
	}

	public JTextField getTxtManageAccount() {
		return txtManageAccount;
	}

	public void setTxtManageAccount(JTextField txtManageAccount) {
		this.txtManageAccount = txtManageAccount;
	}

	public JTextField getTxtSinginHelp() {
		return txtSinginHelp;
	}

	public void setTxtSinginHelp(JTextField txtSinginHelp) {
		this.txtSinginHelp = txtSinginHelp;
	}

	public JTextField getTxtSpaceAndStorage() {
		return txtSpaceAndStorage;
	}

	public void setTxtSpaceAndStorage(JTextField txtSpaceAndStorage) {
		this.txtSpaceAndStorage = txtSpaceAndStorage;
	}

	public JTextField getTxtPhotosAndVidoes() {
		return txtPhotosAndVidoes;
	}

	public void setTxtPhotosAndVidoes(JTextField txtPhotosAndVidoes) {
		this.txtPhotosAndVidoes = txtPhotosAndVidoes;
	}

	public JTextField getTxtUpload() {
		return txtUpload;
	}

	public void setTxtUpload(JTextField txtUpload) {
		this.txtUpload = txtUpload;
	}

	public Share getShare() {
		return share;
	}

	public void setShare(Share share) {
		this.share = share;
	}

	public SingIn getSign() {
		return sign;
	}

	public void setSign(SingIn sign) {
		this.sign = sign;
	}

	public Manage getManage() {
		return manage;
	}

	public void setManage(Manage manage) {
		this.manage = manage;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public Sharing getSharing() {
		return sharing;
	}

	public void setSharing(Sharing sharing) {
		this.sharing = sharing;
	}

	public DelAndRec getDelANDrec() {
		return delANDrec;
	}

	public void setDelANDrec(DelAndRec delANDrec) {
		this.delANDrec = delANDrec;
	}

	public JLabel getHelpLabel() {
		return helpLabel;
	}

	public void setHelpLabel(JLabel helpLabel) {
		this.helpLabel = helpLabel;
	}

	public JButton getPhotosButton() {
		return PhotosButton;
	}

	public void setPhotosButton(JButton photosButton) {
		PhotosButton = photosButton;
	}

	public JButton getSettingbutton() {
		return Settingbutton;
	}

	public void setSettingbutton(JButton settingbutton) {
		Settingbutton = settingbutton;
	}

	public JButton getLoginbutton() {
		return Loginbutton;
	}

	public void setLoginbutton(JButton loginbutton) {
		Loginbutton = loginbutton;
	}

	public JButton getAccountButton() {
		return accountButton;
	}

	public void setAccountButton(JButton accountButton) {
		this.accountButton = accountButton;
	}

	public JButton getStorageButton() {
		return storageButton;
	}

	public void setStorageButton(JButton storageButton) {
		this.storageButton = storageButton;
	}

	public JButton getSyncingbutton() {
		return Syncingbutton;
	}

	public void setSyncingbutton(JButton syncingbutton) {
		Syncingbutton = syncingbutton;
	}

	public JButton getBackButton() {
		return backButton;
	}

	public void setBackButton(JButton backButton) {
		this.backButton = backButton;
	}
	
	
	
}
