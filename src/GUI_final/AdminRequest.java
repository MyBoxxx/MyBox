package GUI_final;


import java.sql.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.table.TableColumn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.EventQueue;
import java.awt.SystemColor;

public class AdminRequest extends AbstractGUI {
	public static   JFrame frame;
	private static  JPanel panel;	
	private static AdminAddPeopleToGroup admin_add;
	private static AdminDeletePeopleToGroup admin_del;
	private static AdminChangePermission admin_ch;
	private static AdminCreateGroup admin_cr;
	private static String text;	
	public JTable table;
	private Vector columnNames;
	private Vector data;
	private Statement statement;
	private ResultSet resultSet;
	private ResultSetMetaData metaData;
	private JButton btnBack;
	private JScrollPane scrollPane;
	/**
	 * @wbp.parser.entryPoint
	 * 
	 */
	
	public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminRequest frame = new AdminRequest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
				
	public AdminRequest(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         columnNames = new Vector();
         data = new Vector();
         panel = new JPanel();   //
        // frame.setBackground(new Color(59, 89, 151));
         panel.setBackground(SystemColor.textHighlight);
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mybox", "root", "");
            String sql = "select requestID,RequestType,status,UserName "+
						"from adminrequsts a, users s "+
						"where s.UserID = a.UserId";
						

            statement = con.createStatement();
            resultSet = statement.executeQuery(sql);
            metaData = resultSet.getMetaData();
            int columns = metaData.getColumnCount();
            for (int i = 1; i <= columns; i++) {
                columnNames.addElement(metaData.getColumnName(i));
            }
            while (resultSet.next()) {
                Vector row = new Vector(columns);
                for (int i = 1; i <= columns; i++) {
                    row.addElement(resultSet.getObject(i));
                }
                data.addElement(row);
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
      table = new JTable(data, columnNames);
        for (int c = 0; c < table.getColumnCount(); c++){        
            Class<?> col_class = table.getColumnClass(c);
            table.setDefaultEditor(col_class, null);        // remove editor
        }
        TableColumn column;
        for (int i = 0; i < table.getColumnCount(); i++) {
            column = table.getColumnModel().getColumn(i);
            column.setMaxWidth(700);
        }
        
        btnBack = new JButton("Back");
        btnBack.setBounds(197, 422, 77, 23);
       
        panel.setLayout(null);
        panel.add(btnBack);        
      
        scrollPane = new JScrollPane(table);   
        scrollPane.setBounds(25, 5, 749, 402);
        panel.add(scrollPane);               
        //frame = new JFrame();
        getContentPane().setBackground(SystemColor.textHighlight);
        getContentPane().add(panel);         //adding panel to the frame
        setSize(800, 600); //setting frame size      
        
       
    }
	public static JPanel getPanel() {
		return panel;
	}
	public static void setPanel(JPanel panel) {
		AdminRequest.panel = panel;
	}

	public static AdminAddPeopleToGroup getAdmin_add() {
		return admin_add;
	}
	public static void setAdmin_add(AdminAddPeopleToGroup admin_add) {
		AdminRequest.admin_add = admin_add;
	}
	public static AdminDeletePeopleToGroup getAdmin_del() {
		return admin_del;
	}
	public static void setAdmin_del(AdminDeletePeopleToGroup admin_del) {
		AdminRequest.admin_del = admin_del;
	}
	public static AdminChangePermission getAdmin_ch() {
		return admin_ch;
	}
	public static void setAdmin_ch(AdminChangePermission admin_ch) {
		AdminRequest.admin_ch = admin_ch;
	}
	public static AdminCreateGroup getAdmin_cr() {
		return admin_cr;
	}
	public static void setAdmin_cr(AdminCreateGroup admin_cr) {
		AdminRequest.admin_cr = admin_cr;
	}

	public static String getText() {
		return text;
	}

	public static void setText(String text) {
		AdminRequest.text = text;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public Vector getColumnNames() {
		return columnNames;
	}

	public void setColumnNames(Vector columnNames) {
		this.columnNames = columnNames;
	}

	public Vector getData() {
		return data;
	}

	public void setData(Vector data) {
		this.data = data;
	}

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public ResultSet getResultSet() {
		return resultSet;
	}

	public void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}

	public ResultSetMetaData getMetaData() {
		return metaData;
	}

	public void setMetaData(ResultSetMetaData metaData) {
		this.metaData = metaData;
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}
	
		
}
