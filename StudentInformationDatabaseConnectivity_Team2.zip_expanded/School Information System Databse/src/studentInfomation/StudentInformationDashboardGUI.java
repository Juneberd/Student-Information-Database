package studentInfomation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.UIManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Panel;
import java.awt.Cursor;
import javax.swing.Timer;


public class StudentInformationDashboardGUI extends JFrame
{
	private Image img_logo = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/student_information.png")).getImage().getScaledInstance(170,125,Image.SCALE_SMOOTH);
	private Image img_iconHome = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/iconHome.png")).getImage().getScaledInstance(40,25,Image.SCALE_SMOOTH);
	private Image img_iconDB = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/dbLogo.png")).getImage().getScaledInstance(49,25,Image.SCALE_SMOOTH);;
	private Image img_iconRegister = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/iconRegister.png")).getImage().getScaledInstance(40,25,Image.SCALE_SMOOTH);
	private Image img_iconSignOut = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/iconSignOut.png")).getImage().getScaledInstance(40,25,Image.SCALE_SMOOTH);
	private Image img_logoMain = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/student_information.png")).getImage();
	private Image img_admin = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/adminLogo.png")).getImage().getScaledInstance(53,42,Image.SCALE_SMOOTH);
	private Image img_greenCircle = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/greenCircle.png")).getImage().getScaledInstance(29,22,Image.SCALE_SMOOTH);
	
	private JPanel_Home pane_Home;
	private JPanel_Search pane_Search;
	private JPanel_Register  pane_Register;
	private JPanel contentPane;
	private JLabel clock;
	
	public JPanel panelMain;
	public JLabel lblUsername;
	

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
					StudentInformationDashboardGUI frame = new StudentInformationDashboardGUI();
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
	        catch (ClassNotFoundException exp) 
	        {
	          exp.printStackTrace();
	        }
	        catch (SQLException exs) 
	        {
	        	   exs.printStackTrace();
	        }

	    }
	
	
	public StudentInformationDashboardGUI()
	{
		Connect();
		
		setIconImage(img_logoMain);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 102, 204));
		panel_1.setBounds(169, 0, 831, 44);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		pane_Home = new JPanel_Home();
		pane_Home.setBounds(0, 0, 811, 584);
		pane_Search = new JPanel_Search();
		pane_Register = new JPanel_Register();
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure do want to close?", 
						"Confirmation", JOptionPane.YES_NO_OPTION) == 0)
				{
					StudentInformationDashboardGUI.this.dispose();
					
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setForeground(Color.WHITE);
			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel.setBounds(811, 0, 20, 20);
		panel_1.add(lblNewLabel);
		
		JLabel lblIconAdminLogo = new JLabel("New label");
		lblIconAdminLogo.setBounds(714, 0, 53, 42);
		panel_1.add(lblIconAdminLogo);
		lblIconAdminLogo.setIcon(new ImageIcon(img_admin));
		
		lblUsername = new JLabel("Administrator");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(509, 8, 203, 25);
		panel_1.add(lblUsername);
		
		JLabel lblIconGreen = new JLabel("New label");
		lblIconGreen.setBounds(471, 10, 28, 23);
		panel_1.add(lblIconGreen);
		lblIconGreen.setIcon(new ImageIcon(img_greenCircle));
		
       
		
		JPanel pnlMenu = new JPanel();
		pnlMenu.setBorder(null);
		pnlMenu.setBounds(0, 0, 170, 682);
		contentPane.add(pnlMenu);
		pnlMenu.setBackground(new Color(60, 179, 113));
		pnlMenu.setLayout(null);
		
		JPanel panelSignOut = new JPanel();
		panelSignOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSignOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelSignOut.setBackground(new Color(255,0,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelSignOut.setBackground(new Color(60, 179, 113));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panelSignOut.setBackground(new Color(255,0,0));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panelSignOut.setBackground(new Color(60, 179, 113));
			}
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if(JOptionPane.showConfirmDialog(null, "Are you sure want to sign out?") == 0) 
				{
					LogIn_AdminGUI LogInForm = new LogIn_AdminGUI();
					LogInForm.setVisible(true);
					StudentInformationDashboardGUI.this.dispose();
				}
			}
		});
		panelSignOut.setLayout(null);
		panelSignOut.setBorder(null);
		panelSignOut.setBackground(new Color(60, 179, 113));
		panelSignOut.setBounds(0, 635, 170, 47);
		pnlMenu.add(panelSignOut);
		
		JLabel lbl_iconSignOut = new JLabel("");
		lbl_iconSignOut.setBounds(21, 11, 42, 25);
		panelSignOut.add(lbl_iconSignOut);
		lbl_iconSignOut.setIcon(new ImageIcon(img_iconSignOut));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Sign Out");
		lblNewLabel_1_1_1_1.setToolTipText("");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Cooper Black", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(69, 11, 75, 25);
		panelSignOut.add(lblNewLabel_1_1_1_1);
		
		JPanel panelRegister = new JPanel();
		panelRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelRegister.addMouseListener(new PanelButtonMouseAdapter(panelRegister) 
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(pane_Register);
			}
		});
		panelRegister.setToolTipText("Add list of Student");
		panelRegister.setBackground(new Color(60, 179, 113));
		panelRegister.setLayout(null);
		panelRegister.setBorder(null);
		panelRegister.setBounds(0, 222, 170, 47);
		pnlMenu.add(panelRegister);
		
		JLabel lbl_iconRegister = new JLabel("");
		lbl_iconRegister.setBounds(21, 11, 42, 25);
		panelRegister.add(lbl_iconRegister);
		lbl_iconRegister.setIcon(new ImageIcon(img_iconRegister));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Register");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Cooper Black", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(63, 11, 75, 25);
		panelRegister.add(lblNewLabel_1_1_1);
		
		JLabel lblIconStudentInfo = new JLabel("");
		lblIconStudentInfo.setBounds(0, 0, 170, 125);
		pnlMenu.add(lblIconStudentInfo);
		lblIconStudentInfo.setIcon(new ImageIcon(img_logo));
		
		JPanel panelSearch = new JPanel();
		panelSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelSearch.addMouseListener(new PanelButtonMouseAdapter(panelSearch) 
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(pane_Search);
			}
		});
		panelSearch.setBackground(new Color(60, 179, 113));
		panelSearch.setLayout(null);
		panelSearch.setBorder(null);
		panelSearch.setBounds(0, 173, 170, 47);
		pnlMenu.add(panelSearch);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Student's Data");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Cooper Black", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(62, 11, 98, 25);
		panelSearch.add(lblNewLabel_1_1);
		
		JLabel lblIcon_DB = new JLabel("");
		lblIcon_DB.setBounds(14, 11, 40, 25);
		panelSearch.add(lblIcon_DB);
		lblIcon_DB.setIcon(new ImageIcon(img_iconDB));
		
		JPanel panelHome = new JPanel();
		panelHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelHome.addMouseListener(new PanelButtonMouseAdapter(panelHome) 
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(pane_Home);
			}
		});
		panelHome.setBounds(0, 127, 170, 47);
		pnlMenu.add(panelHome);
		panelHome.setBackground(new Color(60, 179, 113));
		panelHome.setBorder(null);
		panelHome.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Home");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Cooper Black", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(73, 11, 63, 25);
		panelHome.add(lblNewLabel_1);
		
		JLabel lblIconHome = new JLabel("");
		lblIconHome.setBounds(27, 11, 44, 25);
		panelHome.add(lblIconHome);
		lblIconHome.setIcon(new ImageIcon(img_iconHome));
		
		panelMain = new JPanel();
		panelMain.setBackground(new Color(128, 128, 128));
		panelMain.setBounds(179, 55, 811, 584);
		contentPane.add(panelMain);
		panelMain.setLayout(null);
		
		panelMain.add(pane_Home);
		panelMain.add(pane_Search);
		panelMain.add(pane_Register);
		
		menuClicked(pane_Home);
		
		JPanel panelTimeDate = new JPanel();
		panelTimeDate.setBounds(180, 639, 820, 43);
		contentPane.add(panelTimeDate);
		
		//clock and time
				getContentPane().setLayout(new BorderLayout());
		         clock = new JLabel();
		         clock.setForeground(new Color(60, 179, 113));
		         clock.setBounds(546, 11, 264, 22);
		         clock.setHorizontalAlignment(JLabel.CENTER);
		         clock.setFont(clock.getFont().deriveFont(18f));
		         tickTock();
		         panelTimeDate.setLayout(null);
		         panelTimeDate.add(clock);

		         Timer timer = new Timer(500, new ActionListener() {
		             @Override
		             public void actionPerformed(ActionEvent e) {
		                 tickTock();
		             }
		         });
		         timer.setRepeats(true);
		         timer.setCoalesce(true);
		         timer.setInitialDelay(0);
		         timer.start();
		
		         
				      
	}
	public void tickTock() {
        clock.setText(DateFormat.getDateTimeInstance().format(new Date()));
    }
	
	
	public void menuClicked(JPanel panel)
	{
		pane_Home.setVisible(false);
		pane_Search.setVisible(false);
		pane_Register.setVisible(false);
		
		panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter
	{
		JPanel panel;
		public PanelButtonMouseAdapter (JPanel panel)
		{
			this.panel = panel;
		}
		
		@Override
		public void mouseEntered(MouseEvent e)
		{
			panel.setBackground(new Color(50, 169, 103));
		}
		@Override
		public void mouseExited(MouseEvent e)
		{
			panel.setBackground(new Color(60, 179, 113));
		}
		@Override
		public void mousePressed(MouseEvent e)
		{
			panel.setBackground(new Color(70, 180, 123));
		}
		@Override
		public void mouseReleased(MouseEvent e)
		{
			panel.setBackground(new Color(60, 179, 113));
		}
	}
}
