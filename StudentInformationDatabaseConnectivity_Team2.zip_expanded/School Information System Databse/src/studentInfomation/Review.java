package studentInfomation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;


public class Review extends JFrame
{
	private JPanel_Register_1 register1;
	private JPanel_Register_2 register2;
	
	
	/**
	 * Create the panel.
	 */
	
		

	private JPanel contentPane;
	

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
					Review frame = new Review();
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
	
	private Image img_logoMain = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/student_information.png")).getImage();
	
	public JTextField txtlblFirstName;
	public JTextField txtlblMiddleName;
	public JTextField txtlblLastName;
	public JTextField txtlblAge;
	public JTextField txtlblBirthday;
	public JTextField txtlblContact;
	public JTextField txtlblHome;
	public JTextField txtlblEmail;
	public JTextField txtlblDepartment;
	public JTextField txtlblYearSection;
	public JTextField txtlblAverage;
	public JTextField txtlblFather;
	public JTextField txtlblMother;
	public JTextField txtlblSibling;
	public JTextField txtlblHour_1;
	public JTextField txtlblMin_1;
	public JTextField txtlblMin_2;
	public JTextField txtlblHour_2;
	public JTextField txtlblShift;
	public JTextField txtlblPresent;
	public JTextField txtlblSubject;
	public JLabel lblSubjectStatus;
	public JLabel lblPresentStatus;
	public JTextField lblHourduration;
	public boolean clear = false;
	
	public Review()
	{
		setBackground(new Color(255, 255, 255));
		register1 = new JPanel_Register_1();
		register2 = new JPanel_Register_2();
		
		
		setUndecorated(true);
		setForeground(new Color(0, 128, 0));
		setIconImage(img_logoMain);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setTitle("Review");
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 128, 0));
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(60, 179, 113)));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 11, 864, 628);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 128, 0));
		panel_2.setLayout(null);
		panel_2.setBorder(null);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 11, 270, 38);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 78, 20);
		panel_2.add(lblNewLabel);
		
		txtlblFirstName = new JTextField();
		txtlblFirstName.setForeground(new Color(0, 128, 0));
		txtlblFirstName.setBackground(new Color(255, 255, 255));
		txtlblFirstName.setBorder(null);
		txtlblFirstName.setEditable(false);
		txtlblFirstName.setBounds(98, 10, 162, 20);
		panel_2.add(this.txtlblFirstName);
		txtlblFirstName.setColumns(10);
	
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setForeground(new Color(0, 128, 0));
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(null);
		panel_2_1.setBackground(new Color(255, 255, 255));
		panel_2_1.setBounds(10, 60, 270, 33);
		panel_1.add(panel_2_1);
		
		txtlblMiddleName = new JTextField();
		txtlblMiddleName.setForeground(new Color(0, 128, 0));
		txtlblMiddleName.setEditable(false);
		txtlblMiddleName.setColumns(10);
		txtlblMiddleName.setBorder(null);
		txtlblMiddleName.setBackground(new Color(255, 255, 255));
		txtlblMiddleName.setBounds(115, 8, 145, 20);
		panel_2_1.add(txtlblMiddleName);
		
		JLabel lblMiddleName = new JLabel("Middle Name:");
		lblMiddleName.setBackground(new Color(255, 255, 255));
		lblMiddleName.setForeground(new Color(0, 128, 0));
		lblMiddleName.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblMiddleName.setBounds(10, 11, 95, 20);
		panel_2_1.add(lblMiddleName);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setForeground(new Color(0, 128, 0));
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(null);
		panel_2_1_1.setBackground(new Color(255, 255, 255));
		panel_2_1_1.setBounds(10, 103, 270, 38);
		panel_1.add(panel_2_1_1);
		
		JLabel labelLast = new JLabel("Last Name:");
		labelLast.setBackground(new Color(255, 255, 255));
		labelLast.setForeground(new Color(0, 128, 0));
		labelLast.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		labelLast.setBounds(10, 11, 69, 20);
		panel_2_1_1.add(labelLast);
		
		txtlblLastName = new JTextField();
		txtlblLastName.setForeground(new Color(0, 128, 0));
		txtlblLastName.setEditable(false);
		txtlblLastName.setColumns(10);
		txtlblLastName.setBorder(null);
		txtlblLastName.setBackground(new Color(255, 255, 255));
		txtlblLastName.setBounds(89, 10, 171, 20);
		panel_2_1_1.add(txtlblLastName);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setForeground(new Color(0, 128, 0));
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBorder(null);
		panel_2_1_1_1.setBackground(new Color(255, 255, 255));
		panel_2_1_1_1.setBounds(10, 200, 192, 38);
		panel_1.add(panel_2_1_1_1);
		
		JLabel lblB = new JLabel("Birthday: ");
		lblB.setBackground(new Color(255, 255, 255));
		lblB.setForeground(new Color(0, 128, 0));
		lblB.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblB.setBounds(10, 11, 62, 20);
		panel_2_1_1_1.add(lblB);
		
		txtlblBirthday = new JTextField();
		txtlblBirthday.setForeground(new Color(0, 128, 0));
		txtlblBirthday.setEditable(false);
		txtlblBirthday.setColumns(10);
		txtlblBirthday.setBorder(null);
		txtlblBirthday.setBackground(new Color(255, 255, 255));
		txtlblBirthday.setBounds(82, 10, 100, 20);
		panel_2_1_1_1.add(txtlblBirthday);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setForeground(new Color(0, 128, 0));
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBorder(null);
		panel_2_1_2.setBackground(new Color(255, 255, 255));
		panel_2_1_2.setBounds(10, 152, 156, 38);
		panel_1.add(panel_2_1_2);
		
		JLabel lblA = new JLabel("Age:");
		lblA.setBackground(new Color(255, 255, 255));
		lblA.setForeground(new Color(0, 128, 0));
		lblA.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblA.setBounds(10, 11, 33, 20);
		panel_2_1_2.add(lblA);
		
		txtlblAge = new JTextField();
		txtlblAge.setForeground(new Color(0, 128, 0));
		txtlblAge.setEditable(false);
		txtlblAge.setColumns(10);
		txtlblAge.setBorder(null);
		txtlblAge.setBackground(new Color(255, 255, 255));
		txtlblAge.setBounds(53, 10, 80, 20);
		panel_2_1_2.add(txtlblAge);
		
		JPanel panel_2_1_3_1_2 = new JPanel();
		panel_2_1_3_1_2.setForeground(new Color(0, 128, 0));
		panel_2_1_3_1_2.setLayout(null);
		panel_2_1_3_1_2.setBorder(null);
		panel_2_1_3_1_2.setBackground(new Color(255, 255, 255));
		panel_2_1_3_1_2.setBounds(10, 250, 291, 38);
		panel_1.add(panel_2_1_3_1_2);
		
		JLabel lblC = new JLabel("Contact Number: ");
		lblC.setBackground(new Color(255, 255, 255));
		lblC.setForeground(new Color(0, 128, 0));
		lblC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblC.setBounds(10, 11, 109, 20);
		panel_2_1_3_1_2.add(lblC);
		
		txtlblContact = new JTextField();
		txtlblContact.setForeground(new Color(0, 128, 0));
		txtlblContact.setEditable(false);
		txtlblContact.setColumns(10);
		txtlblContact.setBorder(null);
		txtlblContact.setBackground(new Color(255, 255, 255));
		txtlblContact.setBounds(129, 10, 152, 20);
		panel_2_1_3_1_2.add(txtlblContact);
		
		JPanel panel_2_1_3_1_1_1 = new JPanel();
		panel_2_1_3_1_1_1.setForeground(new Color(0, 128, 0));
		panel_2_1_3_1_1_1.setLayout(null);
		panel_2_1_3_1_1_1.setBorder(null);
		panel_2_1_3_1_1_1.setBackground(new Color(255, 255, 255));
		panel_2_1_3_1_1_1.setBounds(331, 212, 427, 38);
		panel_1.add(panel_2_1_3_1_1_1);
		
		JLabel lblH = new JLabel("Home Address: ");
		lblH.setBackground(new Color(255, 255, 255));
		lblH.setForeground(new Color(0, 128, 0));
		lblH.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblH.setBounds(10, 11, 102, 20);
		panel_2_1_3_1_1_1.add(lblH);
		
		txtlblHome = new JTextField();
		txtlblHome.setForeground(new Color(0, 128, 0));
		txtlblHome.setEditable(false);
		txtlblHome.setColumns(10);
		txtlblHome.setBorder(null);
		txtlblHome.setBackground(new Color(255, 255, 255));
		txtlblHome.setBounds(122, 10, 295, 20);
		panel_2_1_3_1_1_1.add(txtlblHome);
		
		JPanel panel_2_1_3_2 = new JPanel();
		panel_2_1_3_2.setForeground(new Color(0, 128, 0));
		panel_2_1_3_2.setLayout(null);
		panel_2_1_3_2.setBorder(null);
		panel_2_1_3_2.setBackground(new Color(255, 255, 255));
		panel_2_1_3_2.setBounds(331, 263, 427, 38);
		panel_1.add(panel_2_1_3_2);
		
		JLabel lblE = new JLabel("Email Address: ");
		lblE.setBackground(new Color(255, 255, 255));
		lblE.setForeground(new Color(0, 128, 0));
		lblE.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblE.setBounds(10, 11, 96, 20);
		panel_2_1_3_2.add(lblE);
		
		txtlblEmail = new JTextField();
		txtlblEmail.setForeground(new Color(0, 128, 0));
		txtlblEmail.setEditable(false);
		txtlblEmail.setColumns(10);
		txtlblEmail.setBorder(null);
		txtlblEmail.setBackground(new Color(255, 255, 255));
		txtlblEmail.setBounds(116, 10, 301, 20);
		panel_2_1_3_2.add(txtlblEmail);
		
		JPanel panel_2_1_3_1_3 = new JPanel();
		panel_2_1_3_1_3.setForeground(new Color(0, 128, 0));
		panel_2_1_3_1_3.setLayout(null);
		panel_2_1_3_1_3.setBorder(null);
		panel_2_1_3_1_3.setBackground(new Color(255, 255, 255));
		panel_2_1_3_1_3.setBounds(330, 60, 428, 38);
		panel_1.add(panel_2_1_3_1_3);
		
		JLabel lblFathersName_1 = new JLabel("Father's Name: ");
		lblFathersName_1.setBackground(new Color(255, 255, 255));
		lblFathersName_1.setForeground(new Color(0, 128, 0));
		lblFathersName_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblFathersName_1.setBounds(10, 11, 98, 20);
		panel_2_1_3_1_3.add(lblFathersName_1);
		
		txtlblFather = new JTextField();
		txtlblFather.setForeground(new Color(0, 128, 0));
		txtlblFather.setEditable(false);
		txtlblFather.setColumns(10);
		txtlblFather.setBorder(null);
		txtlblFather.setBackground(new Color(255, 255, 255));
		txtlblFather.setBounds(118, 10, 300, 20);
		panel_2_1_3_1_3.add(txtlblFather);
		
		JPanel panel_2_1_3_1_1_2 = new JPanel();
		panel_2_1_3_1_1_2.setForeground(new Color(0, 128, 0));
		panel_2_1_3_1_1_2.setLayout(null);
		panel_2_1_3_1_1_2.setBorder(null);
		panel_2_1_3_1_1_2.setBackground(new Color(255, 255, 255));
		panel_2_1_3_1_1_2.setBounds(328, 114, 430, 38);
		panel_1.add(panel_2_1_3_1_1_2);
		
		JLabel lblMothersName_1 = new JLabel("Mother's Name:");
		lblMothersName_1.setBackground(new Color(255, 255, 255));
		lblMothersName_1.setForeground(new Color(0, 128, 0));
		lblMothersName_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblMothersName_1.setBounds(10, 11, 99, 20);
		panel_2_1_3_1_1_2.add(lblMothersName_1);
		
		txtlblMother = new JTextField();
		txtlblMother.setForeground(new Color(0, 128, 0));
		txtlblMother.setEditable(false);
		txtlblMother.setColumns(10);
		txtlblMother.setBorder(null);
		txtlblMother.setBackground(new Color(255, 255, 255));
		txtlblMother.setBounds(119, 10, 301, 20);
		panel_2_1_3_1_1_2.add(txtlblMother);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setForeground(new Color(0, 128, 0));
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 2, true));
		panel_1_1_1.setBackground(new Color(255, 255, 255));
		panel_1_1_1.setBounds(10, 322, 844, 241);
		panel_1.add(panel_1_1_1);
		
		JPanel panel_2_1_3_1_2_1 = new JPanel();
		panel_2_1_3_1_2_1.setForeground(new Color(0, 128, 0));
		panel_2_1_3_1_2_1.setLayout(null);
		panel_2_1_3_1_2_1.setBorder(null);
		panel_2_1_3_1_2_1.setBackground(new Color(255, 255, 255));
		panel_2_1_3_1_2_1.setBounds(10, 11, 662, 38);
		panel_1_1_1.add(panel_2_1_3_1_2_1);
		
		JLabel lblChoiceOfDepartment = new JLabel("Department: ");
		lblChoiceOfDepartment.setBackground(new Color(255, 255, 255));
		lblChoiceOfDepartment.setForeground(new Color(0, 128, 0));
		lblChoiceOfDepartment.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblChoiceOfDepartment.setBounds(10, 11, 87, 20);
		panel_2_1_3_1_2_1.add(lblChoiceOfDepartment);
		
		txtlblDepartment = new JTextField();
		txtlblDepartment.setForeground(new Color(0, 128, 0));
		txtlblDepartment.setEditable(false);
		txtlblDepartment.setColumns(10);
		txtlblDepartment.setBorder(null);
		txtlblDepartment.setBackground(new Color(255, 255, 255));
		txtlblDepartment.setBounds(107, 10, 545, 20);
		panel_2_1_3_1_2_1.add(txtlblDepartment);
		
		JPanel panel_2_1_3_1_1_1_1 = new JPanel();
		panel_2_1_3_1_1_1_1.setForeground(new Color(0, 128, 0));
		panel_2_1_3_1_1_1_1.setLayout(null);
		panel_2_1_3_1_1_1_1.setBorder(null);
		panel_2_1_3_1_1_1_1.setBackground(new Color(255, 255, 255));
		panel_2_1_3_1_1_1_1.setBounds(10, 60, 235, 38);
		panel_1_1_1.add(panel_2_1_3_1_1_1_1);
		
		JLabel lblYearSection = new JLabel("Year & Section: ");
		lblYearSection.setBackground(new Color(255, 255, 255));
		lblYearSection.setForeground(new Color(0, 128, 0));
		lblYearSection.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblYearSection.setBounds(10, 11, 103, 20);
		panel_2_1_3_1_1_1_1.add(lblYearSection);
		
		txtlblYearSection = new JTextField();
		txtlblYearSection.setForeground(new Color(0, 128, 0));
		txtlblYearSection.setEditable(false);
		txtlblYearSection.setColumns(10);
		txtlblYearSection.setBorder(null);
		txtlblYearSection.setBackground(new Color(255, 255, 255));
		txtlblYearSection.setBounds(123, 10, 102, 20);
		panel_2_1_3_1_1_1_1.add(txtlblYearSection);
		
		JPanel panel_2_1_3_1_1_1_2 = new JPanel();
		panel_2_1_3_1_1_1_2.setForeground(new Color(0, 128, 0));
		panel_2_1_3_1_1_1_2.setLayout(null);
		panel_2_1_3_1_1_1_2.setBorder(null);
		panel_2_1_3_1_1_1_2.setBackground(new Color(255, 255, 255));
		panel_2_1_3_1_1_1_2.setBounds(10, 110, 298, 38);
		panel_1_1_1.add(panel_2_1_3_1_1_1_2);
		
		JLabel lblAverageOf = new JLabel("Average grade of Last Semester: ");
		lblAverageOf.setBackground(new Color(255, 255, 255));
		lblAverageOf.setForeground(new Color(0, 128, 0));
		lblAverageOf.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblAverageOf.setBounds(10, 11, 201, 20);
		panel_2_1_3_1_1_1_2.add(lblAverageOf);
		
		txtlblAverage = new JTextField();
		txtlblAverage.setForeground(new Color(0, 128, 0));
		txtlblAverage.setEditable(false);
		txtlblAverage.setColumns(10);
		txtlblAverage.setBorder(null);
		txtlblAverage.setBackground(new Color(255, 255, 255));
		txtlblAverage.setBounds(221, 10, 67, 20);
		panel_2_1_3_1_1_1_2.add(txtlblAverage);
		
		JLabel lblSection = new JLabel("New label");
		lblSection.setBackground(new Color(255, 255, 255));
		lblSection.setForeground(new Color(0, 128, 0));
		lblSection.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblSection.setBounds(120, 72, 112, 14);
		panel_1_1_1.add(lblSection);
		
		JPanel panel_2_1_3_1_2_1_1 = new JPanel();
		panel_2_1_3_1_2_1_1.setBounds(409, 76, 425, 129);
		panel_1_1_1.add(panel_2_1_3_1_2_1_1);
		panel_2_1_3_1_2_1_1.setLayout(null);
		panel_2_1_3_1_2_1_1.setForeground(new Color(0, 128, 0));
		panel_2_1_3_1_2_1_1.setBorder(new LineBorder(new Color(0, 128, 0), 1, true));
		panel_2_1_3_1_2_1_1.setBackground(new Color(255, 255, 255));
		
		JLabel lblScheduled = new JLabel("Daily Schedule");
		lblScheduled.setBackground(new Color(255, 255, 255));
		lblScheduled.setForeground(new Color(0, 128, 0));
		lblScheduled.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblScheduled.setBounds(10, 11, 98, 20);
		panel_2_1_3_1_2_1_1.add(lblScheduled);
		
		JLabel lblNewLabel_2 = new JLabel(":");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 128, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(181, 19, 20, 18);
		panel_2_1_3_1_2_1_1.add(lblNewLabel_2);
		
		txtlblHour_1 = new JTextField();
		txtlblHour_1.setHorizontalAlignment(SwingConstants.TRAILING);
		txtlblHour_1.setForeground(new Color(0, 128, 0));
		txtlblHour_1.setEditable(false);
		txtlblHour_1.setColumns(10);
		txtlblHour_1.setBorder(null);
		txtlblHour_1.setBackground(new Color(255, 255, 255));
		txtlblHour_1.setBounds(134, 20, 37, 20);
		panel_2_1_3_1_2_1_1.add(txtlblHour_1);
		
		txtlblMin_1 = new JTextField();
		txtlblMin_1.setForeground(new Color(0, 128, 0));
		txtlblMin_1.setEditable(false);
		txtlblMin_1.setColumns(10);
		txtlblMin_1.setBorder(null);
		txtlblMin_1.setBackground(new Color(255, 255, 255));
		txtlblMin_1.setBounds(211, 21, 31, 20);
		panel_2_1_3_1_2_1_1.add(txtlblMin_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("to");
		lblNewLabel_1_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(248, 19, 20, 18);
		panel_2_1_3_1_2_1_1.add(lblNewLabel_1_1);
		
		txtlblMin_2 = new JTextField();
		txtlblMin_2.setForeground(new Color(0, 128, 0));
		txtlblMin_2.setEditable(false);
		txtlblMin_2.setColumns(10);
		txtlblMin_2.setBorder(null);
		txtlblMin_2.setBackground(new Color(255, 255, 255));
		txtlblMin_2.setBounds(356, 20, 37, 20);
		panel_2_1_3_1_2_1_1.add(txtlblMin_2);
		
		txtlblHour_2 = new JTextField();
		txtlblHour_2.setHorizontalAlignment(SwingConstants.TRAILING);
		txtlblHour_2.setForeground(new Color(0, 128, 0));
		txtlblHour_2.setEditable(false);
		txtlblHour_2.setColumns(10);
		txtlblHour_2.setBorder(null);
		txtlblHour_2.setBackground(new Color(255, 255, 255));
		txtlblHour_2.setBounds(278, 20, 38, 20);
		panel_2_1_3_1_2_1_1.add(txtlblHour_2);
		
		txtlblShift = new JTextField();
		txtlblShift.setHorizontalAlignment(SwingConstants.CENTER);
		txtlblShift.setForeground(new Color(0, 128, 0));
		txtlblShift.setEditable(false);
		txtlblShift.setColumns(10);
		txtlblShift.setBorder(null);
		txtlblShift.setBackground(new Color(255, 255, 255));
		txtlblShift.setBounds(10, 44, 154, 20);
		panel_2_1_3_1_2_1_1.add(txtlblShift);
		
		JLabel lblNewLabel_1_2 = new JLabel(":");
		lblNewLabel_1_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(0, 128, 0));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(326, 19, 20, 18);
		panel_2_1_3_1_2_1_1.add(lblNewLabel_1_2);
		
		JPanel panel_2_1_3_1_1_1_2_1 = new JPanel();
		panel_2_1_3_1_1_1_2_1.setLayout(null);
		panel_2_1_3_1_1_1_2_1.setBorder(null);
		panel_2_1_3_1_1_1_2_1.setBackground(new Color(255, 255, 255));
		panel_2_1_3_1_1_1_2_1.setBounds(10, 75, 253, 38);
		panel_2_1_3_1_2_1_1.add(panel_2_1_3_1_1_1_2_1);
		
		JLabel lblpresent = new JLabel("Total number of days present: ");
		lblpresent.setBackground(new Color(255, 255, 255));
		lblpresent.setForeground(new Color(0, 102, 0));
		lblpresent.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblpresent.setBounds(10, 11, 190, 20);
		panel_2_1_3_1_1_1_2_1.add(lblpresent);
		
		txtlblPresent = new JTextField();
		txtlblPresent.setForeground(new Color(0, 102, 51));
		txtlblPresent.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtlblPresent.setColumns(10);
		txtlblPresent.setBorder(null);
		txtlblPresent.setBackground(new Color(255, 255, 255));
		txtlblPresent.setBounds(210, 12, 33, 20);
		panel_2_1_3_1_1_1_2_1.add(txtlblPresent);
		
		lblPresentStatus = new JLabel("");
		lblPresentStatus.setBackground(new Color(255, 255, 255));
		lblPresentStatus.setBounds(273, 90, 142, 14);
		panel_2_1_3_1_2_1_1.add(lblPresentStatus);
		lblPresentStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblHourduration = new JTextField();
		lblHourduration.setHorizontalAlignment(SwingConstants.CENTER);
		lblHourduration.setForeground(new Color(0, 128, 0));
		lblHourduration.setEditable(false);
		lblHourduration.setColumns(10);
		lblHourduration.setBorder(null);
		lblHourduration.setBackground(new Color(255, 255, 255));
		lblHourduration.setBounds(174, 44, 241, 20);
		panel_2_1_3_1_2_1_1.add(lblHourduration);
		
		JPanel panel_2_1_3_1_1_1_2_2 = new JPanel();
		panel_2_1_3_1_1_1_2_2.setLayout(null);
		panel_2_1_3_1_1_1_2_2.setForeground(new Color(0, 128, 0));
		panel_2_1_3_1_1_1_2_2.setBorder(null);
		panel_2_1_3_1_1_1_2_2.setBackground(new Color(255, 255, 255));
		panel_2_1_3_1_1_1_2_2.setBounds(10, 192, 219, 38);
		panel_1_1_1.add(panel_2_1_3_1_1_1_2_2);
		
		JLabel lblNumberOfSubjects = new JLabel("Number of Subjects: ");
		lblNumberOfSubjects.setBackground(new Color(255, 255, 255));
		lblNumberOfSubjects.setForeground(new Color(0, 128, 0));
		lblNumberOfSubjects.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNumberOfSubjects.setBounds(10, 11, 129, 20);
		panel_2_1_3_1_1_1_2_2.add(lblNumberOfSubjects);
		
		txtlblSubject = new JTextField();
		txtlblSubject.setForeground(new Color(0, 128, 0));
		txtlblSubject.setEditable(false);
		txtlblSubject.setColumns(10);
		txtlblSubject.setBorder(null);
		txtlblSubject.setBackground(new Color(255, 255, 255));
		txtlblSubject.setBounds(156, 10, 53, 20);
		panel_2_1_3_1_1_1_2_2.add(txtlblSubject);
		
		lblSubjectStatus = new JLabel("");
		lblSubjectStatus.setBackground(new Color(255, 255, 255));
		lblSubjectStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubjectStatus.setBounds(245, 216, 373, 14);
		panel_1_1_1.add(lblSubjectStatus);
		
		JCheckBox chkPromoted = new JCheckBox("Check if the student is eligible to be promoted for the next semester.");
		chkPromoted.setFont(new Font("Tahoma", Font.ITALIC, 11));
		chkPromoted.setBackground(new Color(255, 255, 255));
		chkPromoted.setForeground(new Color(46, 139, 87));
		chkPromoted.setBounds(45, 155, 358, 23);
		panel_1_1_1.add(chkPromoted);
		
		JPanel pnlBtnBack = new JPanel();
		pnlBtnBack.setLayout(null);
		pnlBtnBack.setForeground(new Color(0, 128, 0));
		pnlBtnBack.setBorder(new LineBorder(new Color(0, 128, 0), 1, true));
		pnlBtnBack.setBackground(new Color(0, 128, 0));
		pnlBtnBack.setBounds(85, 574, 100, 43);
		panel_1.add(pnlBtnBack);
		pnlBtnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnBack.setBackground(new Color(0,118,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnBack.setBackground(new Color(0, 128, 0));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnBack.setBackground(new Color(10,138,10));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnBack.setBackground(new Color(0, 128, 0));
			}
			@Override
			public void mouseClicked(MouseEvent e)
			{
				Review.this.dispose();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("BACK");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(24, 11, 53, 21);
		pnlBtnBack.add(lblNewLabel_1);
		
		JPanel pnlBtnAdd = new JPanel();
		pnlBtnAdd.setLayout(null);
		pnlBtnAdd.setForeground(new Color(0, 128, 0));
		pnlBtnAdd.setBorder(new LineBorder(new Color(0, 128, 0), 1, true));
		pnlBtnAdd.setBackground(new Color(0, 128, 0));
		pnlBtnAdd.setBounds(658, 574, 100, 43);
		panel_1.add(pnlBtnAdd);
		
		JLabel lblAdd = new JLabel("Add");
		lblAdd.setBackground(new Color(255, 255, 255));
		lblAdd.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdd.setForeground(new Color(255, 255, 255));
		lblAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdd.setBounds(24, 11, 53, 21);
		pnlBtnAdd.add(lblAdd);
		
		JPanel panel_2_1_3_1_1_2_1 = new JPanel();
		panel_2_1_3_1_1_2_1.setForeground(new Color(0, 128, 0));
		panel_2_1_3_1_1_2_1.setLayout(null);
		panel_2_1_3_1_1_2_1.setBorder(null);
		panel_2_1_3_1_1_2_1.setBackground(new Color(255, 255, 255));
		panel_2_1_3_1_1_2_1.setBounds(330, 163, 205, 38);
		panel_1.add(panel_2_1_3_1_1_2_1);
		
		JLabel lblSibling = new JLabel("Number of Sibling: ");
		lblSibling.setBackground(new Color(255, 255, 255));
		lblSibling.setForeground(new Color(0, 128, 0));
		lblSibling.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblSibling.setBounds(10, 11, 119, 20);
		panel_2_1_3_1_1_2_1.add(lblSibling);
		
		txtlblSibling = new JTextField();
		txtlblSibling.setForeground(new Color(0, 128, 0));
		txtlblSibling.setEditable(false);
		txtlblSibling.setColumns(10);
		txtlblSibling.setBorder(null);
		txtlblSibling.setBackground(new Color(255, 255, 255));
		txtlblSibling.setBounds(139, 10, 69, 20);
		panel_2_1_3_1_1_2_1.add(txtlblSibling);
		
		pnlBtnAdd.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnAdd.setBackground(new Color(0,118,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnAdd.setBackground(new Color(0, 128, 0));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnAdd.setBackground(new Color(10,138,10));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnAdd.setBackground(new Color(0, 128, 0));
			}
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if(chkPromoted.isSelected())
				{
					JOptionPane.showMessageDialog(null, "The profile complete registered", 
							"Completed",JOptionPane.INFORMATION_MESSAGE);
	
					Review.this.setVisible(false);
					
					clearField();
				}
				else
				{
					int yesNo = JOptionPane.showOptionDialog(null, "Are you sure do want still add list of student even not promoted?", 
							"The student if promoted is uncheck", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
					if(yesNo == JOptionPane.YES_OPTION)
					{
						JOptionPane.showMessageDialog(null, "The profile complete registered", 
								"Completed",JOptionPane.INFORMATION_MESSAGE);

						Review.this.setVisible(false);
						
						clearField();
					}
				}
				
				
			}
			
		});
		
	}
	
	public void clearField()
	{
		register1.txtFirstName.setText(null);
		register1.txtMiddleName.setText(null);
		register1.txtLastName.setText(null);
		register1.txtContact.setText(null);
		register1.txtHome.setText(null);
		register1.txtEmail.setText(null);
		register1.txtMother.setText(null);
		register1.txtFather.setText(null);
		register1.txtSibling.setText(null);
		register2.txtYearSection.setText(null);
		register2.txtAverage.setText(null);
		register2.cmbDepartment.setSelectedItem(null);
		register2.txtPresent.setText(null);
		register2.txtSubject.setText(null);
		register1.dateBirthday.setDate(null);
		register2.cmbDepartment.setSelectedItem(null);
	}
}
