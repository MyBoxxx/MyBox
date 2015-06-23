//package GUI_final;
//
//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//import java.awt.Insets;
//import java.awt.SystemColor;
//
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.UIManager;
//import javax.swing.border.EmptyBorder;
//
//import java.awt.Color;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//import javax.swing.JTabbedPane;
//import javax.swing.JButton;
//
//import Entity.AdminChangeFMS_Entity;
//
//import com.mysql.jdbc.StringUtils;
//
//
//
//public class AdminChangeFMS_GUI extends AbstractGUI {
//
//	public JPanel contentPane;
//
//
//	private JTabbedPane tabbedPane ;
//	private Limitpeopleingroup limit;
//	private AdminAddPeopleToGroupFMS add;
//	private AdminDeletePeopleToGroupFMS delete;
//	public JFrame frame;
//	private JButton homeButton;
//	private Statement statement;
//	private ResultSet resultSet;
//	
//	private Statement statement1;
//	private ResultSet resultSet1;
//	
//	private Statement statement2;
//	private ResultSet resultSet2;
//
//	//private ResultSetMetaData metaData;
//	private String GroupLimiter = new String();
//	private String groupName = new String();
//	static AdminChangeFMS_Entity admin_en = new AdminChangeFMS_Entity();
//
//	private int IDgroup;
//	private int groupLimit;
//	ArrayList <String> groups = new ArrayList<String>();
//		
//	
//	public void init(){
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AdminChangeFMS_GUI frame = new AdminChangeFMS_GUI();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//	
//	/**
//	 * Create the frame.
//	 */
//	public AdminChangeFMS_GUI( ) {
//		super();
//		this.admin_en = admin_en;
//		//First SQL query -- get all groups
//		 try {
//	            Class.forName("com.mysql.jdbc.Driver").newInstance();
//	            Connection con = DriverManager.getConnection(
//	                    "jdbc:mysql://localhost:3306/mybox", "root", "");
//	            String sql = "select GroupName "+
//						"from mybox.groups";
//
//	            
//	           
//	            statement = con.createStatement();
//	            resultSet = statement.executeQuery(sql);	      
//	            while (resultSet.next()) {
//		            String FileName = resultSet.getString("GroupName");
//		            if(FileName != null) groups.add(FileName);
//	            }          		            
//	              	            	            
//		 } catch (Exception e) {	 
//			 System.out.println(e);
//		 }
//		 
//		 String listString = String.join(" ", groups);	        
//         String[] data = listString.split("\\s+");
//         System.out.println(getADMIN().getCurrentQuantity());
//		///Second SQL query - get id group from group name
//		 try {
//		 Class.forName("com.mysql.jdbc.Driver").newInstance();
//         Connection con1 = DriverManager.getConnection(
//                 "jdbc:mysql://localhost:3306/mybox", "root", "");
//         String sql1 = "SELECT IDGroup "+
//        		 "FROM mybox.groups "+
//        		 "where GroupName = '" +data[1] +"';";    
//               
//
//         statement1 = con1.createStatement();
//         resultSet1 = statement1.executeQuery(sql1);
//         
//        while(resultSet1.next()) 
//        	IDgroup = resultSet1.getInt("IDGroup");
//		 } catch (Exception e) {	 
//			 System.out.println(e);
//		 }
//		 
//		 
//		 System.out.println(IDgroup);
//		///third SQL query -- get current group limit
//		 try {
//	            Class.forName("com.mysql.jdbc.Driver").newInstance();
//	            Connection con2 = DriverManager.getConnection(
//	                    "jdbc:mysql://localhost:3306/mybox", "root", "");
//	            String sql2 = "select  GroupLimit "+
//						"from  mybox.groups "+
//						"where  groups.IDGroup = '"+ IDgroup +"';";
//
//
//	            statement2 = con2.createStatement();
//	            resultSet2 = statement2.executeQuery(sql2);
//	            
//	            while(resultSet2.next()) {
//	            	groupLimit = resultSet2.getInt("GroupLimit");
//	            }
//	           
//	            
//		 } catch (Exception e) {	 
//			 System.out.println(e);
//		 }
//		 
//		 GroupLimiter = String.valueOf(groupLimit);
//		 
//		 
//		 limit = new Limitpeopleingroup(GroupLimiter,groups);
//		
//		limit.getBtnOk().setLocation(10, 422);
//		limit.getBtnCancel().setLocation(530, 422);
//		limit.getBtnCancel().setSize(150, 56);
//		limit.getBtnOk().setSize(150, 56);
//		limit.getLimitLabel().setLocation(159, 11);
//		limit.getLimitLabel().setSize(619, 246);
//		add = new AdminAddPeopleToGroupFMS();
//		delete = new AdminDeletePeopleToGroupFMS();
//		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
//		UIManager.getDefaults().put("TabbedPane.contentBorderInsets", new Insets(0,0,0,0));
//		UIManager.getDefaults().put("TabbedPane.tabsOverlapBorder", true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 800, 600);
//		contentPane = new JPanel();
//		contentPane.setBackground(SystemColor.textHighlight);
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		getContentPane().add(tabbedPane);
//		getTabbedPane().setBounds(10, 34, 764, 517);
//		contentPane.add(tabbedPane);
//		
//		
//		limit.setBackground(SystemColor.textHighlight);		
//		getTabbedPane().addTab("Limit", limit);
//		limit.setLayout(null);
//		
//		
//		add.setBackground(SystemColor.textHighlight);
//		getTabbedPane().addTab("Add", add);
//		
//		
//		add.setBackground(SystemColor.textHighlight);
//		delete.setBackground(SystemColor.textHighlight);
//		getTabbedPane().addTab("Delete", delete);
//		delete.setLayout(null);
//		
//		homeButton = new JButton("");
//		homeButton.setBounds(657, 0, 80, 30);
//		homeButton.setIcon(new ImageIcon("images/home.png"));
//		contentPane.add(homeButton);
//		
//	
//	}
//	public JFrame getFrame() {
//		return frame;
//	}
//
//	public void setFrame(JFrame frame) {
//		this.frame = frame;
//	}
//
//	public JButton getHomeButton() {
//		return homeButton;
//	}
//
//	public void setHomeButton(JButton homeButton) {
//		this.homeButton = homeButton;
//	}
//
//	public JTabbedPane getTabbedPane() {
//		return tabbedPane;
//	}
//
//	public void setTabbedPane(JTabbedPane tabbedPane) {
//		this.tabbedPane = tabbedPane;
//	}
//
//	public Limitpeopleingroup getLimit() {
//		return limit;
//	}
//
//	public void setLimit(Limitpeopleingroup limit) {
//		this.limit = limit;
//	}	
//	
//	public AdminAddPeopleToGroupFMS getAdd() {
//		return add;
//	}
//
//	public void setAdd(AdminAddPeopleToGroupFMS add) {
//		this.add = add;
//	}
//
//	public AdminDeletePeopleToGroupFMS getDelete() {
//		return delete;
//	}
//
//	public void setDelete(AdminDeletePeopleToGroupFMS delete) {
//		this.delete = delete;
//	}
//
//	public Statement getStatement() {
//		return statement;
//	}
//
//	public void setStatement(Statement statement) {
//		this.statement = statement;
//	}
//
//	public ResultSet getResultSet() {
//		return resultSet;
//	}
//
//	public void setResultSet(ResultSet resultSet) {
//		this.resultSet = resultSet;
//	}
//
//	public Statement getStatement1() {
//		return statement1;
//	}
//
//	public void setStatement1(Statement statement1) {
//		this.statement1 = statement1;
//	}
//
//	public ResultSet getResultSet1() {
//		return resultSet1;
//	}
//
//	public void setResultSet1(ResultSet resultSet1) {
//		this.resultSet1 = resultSet1;
//	}
//
//	
//
//	
//
//	public String getGroupLimiter() {
//		return GroupLimiter;
//	}
//
//	public void setGroupLimiter(String groupLimiter) {
//		GroupLimiter = groupLimiter;
//	}
//
//	public int getGroupLimit() {
//		return groupLimit;
//	}
//
//	public void setGroupLimit(int groupLimit) {
//		this.groupLimit = groupLimit;
//	}
//
//	public int getIDgroup() {
//		return IDgroup;
//	}
//
//	public void setIDgroup(int iDgroup) {
//		IDgroup = iDgroup;
//	}
//
//	public ArrayList<String> getGroups() {
//		return groups;
//	}
//
//	public void setGroups(ArrayList<String> groups) {
//		this.groups = groups;
//	}
//	
//	public Statement getStatement2() {
//		return statement2;
//	}
//
//	public void setStatement2(Statement statement2) {
//		this.statement2 = statement2;
//	}
//
//	public ResultSet getResultSet2() {
//		return resultSet2;
//	}
//
//	public void setResultSet2(ResultSet resultSet2) {
//		this.resultSet2 = resultSet2;
//	}
//
//	public String getGroupName() {
//		return groupName;
//	}
//
//	public void setGroupName(String groupName) {
//		this.groupName = groupName;
//	}
//	
//	public void setADMIN(AdminChangeFMS_Entity admin_en){
//		this.admin_en = admin_en;
//	}
//	
//	public AdminChangeFMS_Entity getADMIN(){
//		return admin_en;
//	}
//	
//	
//}
