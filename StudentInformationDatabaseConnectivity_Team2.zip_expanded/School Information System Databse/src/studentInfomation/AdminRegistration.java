package studentInfomation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class AdminRegistration extends JFrame {

	private JPanel contentPane;
	private Image img_logoMain = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/student_information.png")).getImage();
	private Image img_logoEmploy = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/employeeLogo.png")).getImage().getScaledInstance(116, 92,Image.SCALE_SMOOTH);
	private JTextField txtEmployeeCode;
	private JTextField txtUsername;
	private JTextField txtFullName;
	private JPasswordField pf_Password;
	private JPasswordField pf_ConfirmPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminRegistration frame = new AdminRegistration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	 public void Connect()
	    {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost/schoolinfo_db", "root","");
	        }
	        catch (ClassNotFoundException exp) 
	        {
	          exp.printStackTrace();
	        }
	        catch (SQLException exs) 
	        {
	        	   exs.printStackTrace();
	        }

	    }
	public AdminRegistration() {
		Connect();
		setIconImage(img_logoMain);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		
		setLocationRelativeTo(null);
		
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
		
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure do want to close?", 
						"Confirmation", JOptionPane.YES_NO_OPTION) == 0)
				{
					AdminRegistration.this.dispose();
					LogIn_AdminGUI logIn = new LogIn_AdminGUI();
					logIn.setVisible(true);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setForeground(Color.WHITE);
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel.setBounds(330, 0, 20, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblIconEmploy = new JLabel("New label");
		lblIconEmploy.setBounds(115, 55, 116, 92);
		contentPane.add(lblIconEmploy);
		lblIconEmploy.setIcon(new ImageIcon(img_logoEmploy));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(102, 204, 102)));
		panel.setBackground(new Color(47, 79, 79));
		panel.setBounds(36, 170, 282, 41);
		contentPane.add(panel);
		
		txtEmployeeCode = new JTextField();
		txtEmployeeCode.setText("Employee Code ");
		txtEmployeeCode.setForeground(Color.WHITE);
		txtEmployeeCode.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtEmployeeCode.setColumns(10);
		txtEmployeeCode.setBorder(null);
		txtEmployeeCode.setBackground(new Color(47, 79, 79));
		txtEmployeeCode.setBounds(10, 11, 262, 19);
		panel.add(txtEmployeeCode);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setBounds(10, 0, 40, 39);
		panel.add(lblNewLabel_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(102, 204, 102)));
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setBounds(36, 274, 282, 41);
		contentPane.add(panel_1);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtUsername.setColumns(10);
		txtUsername.setBorder(null);
		txtUsername.setBackground(new Color(47, 79, 79));
		txtUsername.setBounds(10, 11, 262, 19);
		panel_1.add(txtUsername);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setBounds(10, 0, 40, 39);
		panel_1.add(lblNewLabel_1_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(102, 204, 102)));
		panel_2.setBackground(new Color(47, 79, 79));
		panel_2.setBounds(36, 222, 282, 41);
		contentPane.add(panel_2);
		
		txtFullName = new JTextField();
		txtFullName.setText("Full Name");
		txtFullName.setForeground(Color.WHITE);
		txtFullName.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtFullName.setColumns(10);
		txtFullName.setBorder(null);
		txtFullName.setBackground(new Color(47, 79, 79));
		txtFullName.setBounds(10, 11, 262, 19);
		panel_2.add(txtFullName);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("");
		lblNewLabel_1_2_2.setBounds(10, 0, 40, 39);
		panel_2.add(lblNewLabel_1_2_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(new Color(102, 204, 102)));
		panel_2_1.setBackground(new Color(47, 79, 79));
		panel_2_1.setBounds(36, 326, 282, 41);
		contentPane.add(panel_2_1);
		
		pf_Password = new JPasswordField();
		pf_Password.setText("Password");
		pf_Password.setForeground(Color.WHITE);
		pf_Password.setFont(new Font("Calibri", Font.PLAIN, 12));
		pf_Password.setEchoChar(' ');
		pf_Password.setBorder(null);
		pf_Password.setBackground(new Color(47, 79, 79));
		pf_Password.setBounds(10, 11, 262, 19);
		panel_2_1.add(pf_Password);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new LineBorder(new Color(102, 204, 102)));
		panel_2_2.setBackground(new Color(47, 79, 79));
		panel_2_2.setBounds(36, 378, 282, 41);
		contentPane.add(panel_2_2);
		
		pf_ConfirmPass = new JPasswordField();
		pf_ConfirmPass.setText("Confirm Password");
		pf_ConfirmPass.setForeground(Color.WHITE);
		pf_ConfirmPass.setFont(new Font("Calibri", Font.PLAIN, 12));
		pf_ConfirmPass.setEchoChar(' ');
		pf_ConfirmPass.setBorder(null);
		pf_ConfirmPass.setBackground(new Color(47, 79, 79));
		pf_ConfirmPass.setBounds(10, 11, 262, 19);
		panel_2_2.add(pf_ConfirmPass);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setForeground(new Color(50, 205, 50));
		lblMessage.setBounds(36, 430, 269, 14);
		contentPane.add(lblMessage);
		
		JPanel btnSign = new JPanel();
		btnSign.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSign.setBackground(new Color(75, 125, 35));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if ( txtEmployeeCode.getText().equals("")||txtFullName.getText().equals("")||
						txtUsername.getText().equals("")||pf_Password.getText().equals("")||
						pf_ConfirmPass.getText().equals(""))
				{
					lblMessage.setText("Fill up is incomplete.");
				}
				else if(pf_Password.getText().equals(pf_ConfirmPass.getText()))
				{
					
					String eCode = txtEmployeeCode.getText();
					String FullN = txtFullName.getText();
					String user = txtUsername.getText();
					String pass = pf_ConfirmPass.getText();
						try {
							pst = con.prepareStatement("insert into admin_tbl(Employee_ID, FullName, UserName, Password)values(?,?,?,?)");
							pst.setString(1, eCode);
							pst.setString(2, FullN);
							pst.setString(3, user);
							pst.setString(4, pass);
							
							pst.executeUpdate();
							lblMessage.setText("");
							JOptionPane.showMessageDialog(null, "Record Addedddd!!!!!");
							AdminRegistration.this.setVisible(false);
							LogIn_AdminGUI logIn = new LogIn_AdminGUI();
							logIn.setVisible(true);
						}
						 
						catch (SQLException e2) 
					        {
											
						e2.printStackTrace();
						}
					}
				
					
				else
				{
					lblMessage.setText("Type both same password");
				}
				
			}
				
			@Override
			public void mouseExited(MouseEvent e) {
				btnSign.setBackground(new Color(102, 153, 51));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnSign.setBackground(new Color(110, 165, 60));
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnSign.setBackground(new Color(110, 165, 60));
			}
		});
		btnSign.setLayout(null);
		btnSign.setBorder(null);
		btnSign.setBackground(new Color(102, 153, 51));
		btnSign.setBounds(134, 448, 82, 41);
		contentPane.add(btnSign);
		
		JLabel lblNewLabel_1 = new JLabel("Sign Up");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 11, 61, 19);
		btnSign.add(lblNewLabel_1);
		
		txtEmployeeCode.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEmployeeCode.getText().equals("Employee Code") )
				{
					txtEmployeeCode.setText("");
				}
				else
				{
					txtEmployeeCode.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEmployeeCode.getText().equals(""))
				{
					txtEmployeeCode.setText("Employee Code");
				}
			}
		});
		
		txtFullName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtFullName.getText().equals("Full Name") )
				{
					txtFullName.setText("");
				}
				else
				{
					txtFullName.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtFullName.getText().equals(""))
				{
					txtFullName.setText("Full Name");
				}
			}
		});
		
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Username") )
				{
					txtUsername.setText("");
				}
				else
				{
					txtUsername.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
				{
					txtUsername.setText("Username");
				}
			}
		});
		pf_Password.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pf_Password.getText().equals("Password"))
				{
					pf_Password.setEchoChar('*');
					pf_Password.setText("");
				}
				else
				{
					pf_Password.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pf_Password.getText().equals(""))
				{
					pf_Password.setText("Password");
					pf_Password.setEchoChar((char)0);
				}
			}
		});
		pf_ConfirmPass.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pf_ConfirmPass.getText().equals("Confirm Password"))
				{
					pf_ConfirmPass.setEchoChar('*');
					pf_ConfirmPass.setText("");
				}
				else
				{
					pf_ConfirmPass.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pf_ConfirmPass.getText().equals(""))
				{
					pf_ConfirmPass.setText("Confirm Password");
					pf_ConfirmPass.setEchoChar((char)0);
				}
			}
		});
		
	}
}
