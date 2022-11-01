package studentInfomation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn_AdminGUI extends JFrame
{
	private Image img_logo = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/student_information.png")).getImage().getScaledInstance(110,111,Image.SCALE_SMOOTH);
	private Image img_logo1 = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/usernameIcon.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image img_logo2 = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/greenPassIcon.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image img_logo3 = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/logInIcon.png")).getImage().getScaledInstance(45,40,Image.SCALE_SMOOTH);
	private Image img_logoMain = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/student_information.png")).getImage();
	
	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField txtPassword;
	private JLabel lblLogInMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					LogIn_AdminGUI frame = new LogIn_AdminGUI();
					frame.setVisible(true);
				} catch (Exception e)
				{
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
		        catch (ClassNotFoundException ex) 
		        {
		          ex.printStackTrace();
		        }
		        catch (SQLException ex) 
		        {
		        	   ex.printStackTrace();
		        }
	 
		    }
	
	 
	public LogIn_AdminGUI()
	{
		setIconImage(img_logoMain);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 500);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(102, 204, 102)));
		panel.setBackground(new Color(47, 79, 79));
		panel.setBounds(61, 219, 250, 56);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUserName = new JTextField();
		txtUserName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUserName.getText().equals("Admin's Username") )
				{
					txtUserName.setText("");
				}
				else
				{
					txtUserName.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUserName.getText().equals(""))
				{
					txtUserName.setText("Admin's Username");
				}
			}
		});
		txtUserName.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtUserName.setBorder(null);
		txtUserName.setForeground(new Color(255, 255, 255));
		txtUserName.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtUserName.setBackground(new Color(47, 79, 79));
		txtUserName.setText("Admin's Username");
		txtUserName.setBounds(57, 11, 183, 39);
		panel.add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblUserIcon = new JLabel("");
		lblUserIcon.setBounds(10, 11, 40, 39);
		panel.add(lblUserIcon);
		lblUserIcon.setIcon(new ImageIcon(img_logo1));
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setBounds(10, 0, 40, 39);
		panel.add(lblNewLabel_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(102, 204, 102)));
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setBounds(61, 289, 250, 60);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password"))
				{
					txtPassword.setEchoChar('*');
					txtPassword.setText("");
				}
				else
				{
					txtPassword.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals(""))
				{
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)0);
				}
			}
		});
		txtPassword.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtPassword.setText("Password");
		txtPassword.setBorder(null);
		txtPassword.setForeground(new Color(255, 255, 255));
		txtPassword.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtPassword.setBackground(new Color(47, 79, 79));
		txtPassword.setBounds(56, 11, 184, 38);
		panel_1.add(txtPassword);
		txtPassword.setEchoChar((char)0);
		
		JLabel lblPassIcon = new JLabel("");
		lblPassIcon.setBounds(5, 11, 41, 39);
		panel_1.add(lblPassIcon);
		lblPassIcon.setIcon(new ImageIcon(img_logo2));
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure do want to close?", 
						"Confirmation", JOptionPane.YES_NO_OPTION) == 0)
				{
					LogIn_AdminGUI.this.dispose();
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
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(330, 0, 20, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lbl_IconInformation = new JLabel("");
		lbl_IconInformation.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lbl_IconInformation.setBounds(121, 71, 110, 111);
		contentPane.add(lbl_IconInformation);
		lbl_IconInformation.setIcon(new ImageIcon(img_logo));
		setLocationRelativeTo(null);
		
		JPanel btnLogIn = new JPanel();
		btnLogIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogIn.setBackground(new Color(75, 125, 35));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			
				try 
		    	{
					Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/schoolinfo_db", "root","");
		            Statement stmt = con.createStatement();
		            String sql = "select * from admin_tbl where UserName='"+txtUserName.getText()+"' and Password='"+txtPassword.getText().toString()+"'";
		            ResultSet rs = stmt.executeQuery(sql);
			  
		            if((txtUserName.getText().equals("admin") && txtPassword.getText().equals("admin123"))||(rs.next()))
		            {
		            	lblLogInMessage.setText("");
		            	JOptionPane.showMessageDialog(null, "Log In Successfully!");
					
		            	StudentInformationDashboardGUI dashboard = new StudentInformationDashboardGUI();
		            	dashboard.setVisible(true);
		            	LogIn_AdminGUI.this.dispose();
		            	
		            	String user = txtUserName.getText();
		            	
		            	 dashboard.lblUsername.setText(user);
					
		            }
		            else if (txtUserName.getText().equals("")||txtUserName.getText().equals("Admin's Username")||
						txtPassword.getText().equals("") ||txtPassword.getText().equals("Password"))
		            {
		            	lblLogInMessage.setText("Fill up is incomplete.");
		            }
		            else {
		            	lblLogInMessage.setText("The field is invalid.");
		            }
				con.close();
			    
			} 
		    	catch (SQLException ep) 
		    	 {
		    		ep.printStackTrace();
		    	 } catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnLogIn.setBackground(new Color(102, 153, 51));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnLogIn.setBackground(new Color(110, 165, 60));
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnLogIn.setBackground(new Color(110, 165, 60));
			}
		});
		btnLogIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogIn.setLayout(null);
		btnLogIn.setBorder(null);
		btnLogIn.setBackground(new Color(102, 153, 51));
		btnLogIn.setBounds(103, 424, 165, 41);
		contentPane.add(btnLogIn);
		
		JLabel lblNewLabel_1 = new JLabel("LOG IN");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});

		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(68, 11, 61, 19);
		btnLogIn.add(lblNewLabel_1);
		
		JLabel lblLogInIcon = new JLabel("");
		lblLogInIcon.setBounds(0, 0, 50, 41);
		btnLogIn.add(lblLogInIcon);
		lblLogInIcon.setVerticalTextPosition(SwingConstants.TOP);
		lblLogInIcon.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogInIcon.setVerticalAlignment(SwingConstants.TOP);
		lblLogInIcon.setHorizontalTextPosition(SwingConstants.LEFT);
		lblLogInIcon.setIcon(new ImageIcon(img_logo3));
		
		lblLogInMessage.setForeground(new Color(255, 0, 0));
		lblLogInMessage.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLogInMessage.setBounds(103, 391, 165, 22);
		contentPane.add(lblLogInMessage);
		
		JButton btnNewButton = new JButton("Register to become admin");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setForeground(new Color(0, 230, 134));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setForeground(new Color(0, 250, 154));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setForeground(new Color(0, 280, 184));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnNewButton.setForeground(new Color(0, 250, 154));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminRegistration adminReg = new AdminRegistration();
				adminReg.setVisible(true);
				LogIn_AdminGUI.this.dispose();
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(0, 250, 154));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setOpaque(false);
		btnNewButton.setBounds(71, 360, 222, 23);
		contentPane.add(btnNewButton);
		
		
	}
	
	
}
