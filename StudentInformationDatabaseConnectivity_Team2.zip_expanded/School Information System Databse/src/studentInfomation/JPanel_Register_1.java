package studentInfomation;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;


import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import com.toedter.calendar.JCalendar;

public class JPanel_Register_1 extends JPanel
{
	
	public JPanel pnlBtnNext ;
	
	
	
	public String firstname;
	public JTextField txtFirstName;
	public JTextField txtMiddleName;
	public JTextField txtLastName;
	public JTextField txtEmail;
	public JTextField txtContact;
	public JTextField txtHome;
	public JTextField txtSibling;
	public JTextField txtFather;
	public JTextField txtMother;
	public JDateChooser dateBirthday;
	//public JTextField txtAge;
	

	/**
	 * Create the panel.
	 */
	public JPanel_Register_1()
	{
		setBounds(0,0,791, 411);
		setLayout(null);
		setVisible(true);
		
		
		JPanel contentSubRegistration = new JPanel();
		contentSubRegistration.setLayout(null);
		contentSubRegistration.setBackground(new Color(144, 238, 144));
		contentSubRegistration.setBounds(0, 0, 791, 490);
		add(contentSubRegistration);
		
		JPanel panelName = new JPanel();
		panelName.setLayout(null);
		panelName.setBorder(new LineBorder(new Color(0, 102, 0), 2, true));
		panelName.setBackground(new Color(204, 255, 204));
		panelName.setBounds(20, 14, 549, 162);
		contentSubRegistration.add(panelName);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2.setBackground(new Color(204, 255, 204));
		panel_2.setBounds(10, 11, 291, 38);
		panelName.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setForeground(new Color(0, 102, 0));
		lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 78, 20);
		panel_2.add(lblNewLabel);
		
		txtFirstName = new JTextField();
		txtFirstName.setForeground(new Color(0, 102, 51));
		txtFirstName.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtFirstName.setColumns(10);
		txtFirstName.setBorder(null);
		txtFirstName.setBackground(new Color(204, 255, 204));
		txtFirstName.setBounds(98, 11, 183, 20);
		panel_2.add(this.txtFirstName);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1.setBackground(new Color(204, 255, 204));
		panel_2_1.setBounds(10, 61, 291, 38);
		panelName.add(panel_2_1);
		
		JLabel lblMiddeName = new JLabel("Middle Name:");
		lblMiddeName.setForeground(new Color(0, 102, 0));
		lblMiddeName.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblMiddeName.setBounds(10, 11, 89, 20);
		panel_2_1.add(lblMiddeName);
		
		txtMiddleName = new JTextField();
		txtMiddleName.setForeground(new Color(0, 102, 51));
		txtMiddleName.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtMiddleName.setColumns(10);
		txtMiddleName.setBorder(null);
		txtMiddleName.setBackground(new Color(204, 255, 204));
		txtMiddleName.setBounds(109, 12, 167, 20);
		panel_2_1.add(txtMiddleName);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_1.setBackground(new Color(204, 255, 204));
		panel_2_1_1.setBounds(10, 110, 291, 38);
		panelName.add(panel_2_1_1);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setForeground(new Color(0, 102, 0));
		lblLastName.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblLastName.setBounds(10, 11, 69, 20);
		panel_2_1_1.add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.setForeground(new Color(0, 102, 51));
		txtLastName.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtLastName.setColumns(10);
		txtLastName.setBorder(null);
		txtLastName.setBackground(new Color(204, 255, 204));
		txtLastName.setBounds(87, 12, 189, 20);
		panel_2_1_1.add(txtLastName);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_1_1.setBackground(new Color(204, 255, 204));
		panel_2_1_1_1.setBounds(327, 11, 192, 38);
		panelName.add(panel_2_1_1_1);
		
		JLabel lblBirthday = new JLabel("Birthday: ");
		lblBirthday.setForeground(new Color(0, 102, 0));
		lblBirthday.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblBirthday.setBounds(10, 11, 62, 20);
		panel_2_1_1_1.add(lblBirthday);
		
		dateBirthday = new JDateChooser();
		dateBirthday.setBounds(82, 11, 100, 20);
		panel_2_1_1_1.add(dateBirthday);
		
		
		
		JLabel lblWarningPersonnalName = new JLabel("");
		lblWarningPersonnalName.setForeground(Color.RED);
		lblWarningPersonnalName.setBounds(84, 164, 316, 14);
		panelName.add(lblWarningPersonnalName);
		
		/*JPanel panel_2_1_1_2 = new JPanel();
		panel_2_1_1_2.setLayout(null);
		panel_2_1_1_2.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_1_2.setBackground(new Color(204, 255, 204));
		panel_2_1_1_2.setBounds(327, 72, 192, 38);
		panelName.add(panel_2_1_1_2);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(new Color(0, 102, 0));
		lblAge.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblAge.setBounds(10, 11, 37, 20);
		panel_2_1_1_2.add(lblAge);
		
		txtAge = new JTextField();
		txtAge.setForeground(new Color(0, 102, 51));
		txtAge.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtAge.setColumns(10);
		txtAge.setBorder(null);
		txtAge.setBackground(new Color(204, 255, 204));
		txtAge.setBounds(57, 12, 125, 20);
		panel_2_1_1_2.add(txtAge);*/
		
		JPanel panelContact = new JPanel();
		panelContact.setLayout(null);
		panelContact.setBorder(new LineBorder(new Color(0, 102, 0), 2, true));
		panelContact.setBackground(new Color(204, 255, 204));
		panelContact.setBounds(20, 187, 447, 186);
		contentSubRegistration.add(panelContact);
		
		JPanel panel_2_1_3_2 = new JPanel();
		panel_2_1_3_2.setLayout(null);
		panel_2_1_3_2.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_2.setBackground(new Color(204, 255, 204));
		panel_2_1_3_2.setBounds(10, 109, 427, 38);
		panelContact.add(panel_2_1_3_2);
		
		JLabel lblEmailAddress = new JLabel("Email Address: ");
		lblEmailAddress.setForeground(new Color(0, 102, 0));
		lblEmailAddress.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblEmailAddress.setBounds(10, 11, 96, 20);
		panel_2_1_3_2.add(lblEmailAddress);
		
		txtEmail = new JTextField();
		txtEmail.setForeground(new Color(0, 102, 51));
		txtEmail.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBackground(new Color(204, 255, 204));
		txtEmail.setBounds(116, 12, 301, 20);
		panel_2_1_3_2.add(txtEmail);
		
		JPanel panel_2_1_3_1_2 = new JPanel();
		panel_2_1_3_1_2.setLayout(null);
		panel_2_1_3_1_2.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_2.setBackground(new Color(204, 255, 204));
		panel_2_1_3_1_2.setBounds(10, 11, 291, 38);
		panelContact.add(panel_2_1_3_1_2);
		
		JLabel lblContactNumber = new JLabel("Contact Number: ");
		lblContactNumber.setForeground(new Color(0, 102, 0));
		lblContactNumber.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblContactNumber.setBounds(10, 11, 109, 20);
		panel_2_1_3_1_2.add(lblContactNumber);
		
		txtContact = new JTextField();
		txtContact.setForeground(new Color(0, 102, 51));
		txtContact.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtContact.setColumns(10);
		txtContact.setBorder(null);
		txtContact.setBackground(new Color(204, 255, 204));
		txtContact.setBounds(129, 12, 152, 20);
		panel_2_1_3_1_2.add(txtContact);
		
		JPanel panel_2_1_3_1_1_1 = new JPanel();
		panel_2_1_3_1_1_1.setLayout(null);
		panel_2_1_3_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_1_1.setBackground(new Color(204, 255, 204));
		panel_2_1_3_1_1_1.setBounds(10, 60, 427, 38);
		panelContact.add(panel_2_1_3_1_1_1);
		
		JLabel lblHomeAddress = new JLabel("Home Address: ");
		lblHomeAddress.setForeground(new Color(0, 102, 0));
		lblHomeAddress.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblHomeAddress.setBounds(10, 11, 102, 20);
		panel_2_1_3_1_1_1.add(lblHomeAddress);
		
		txtHome = new JTextField();
		txtHome.setForeground(new Color(0, 102, 51));
		txtHome.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtHome.setColumns(10);
		txtHome.setBorder(null);
		txtHome.setBackground(new Color(204, 255, 204));
		txtHome.setBounds(122, 12, 295, 20);
		panel_2_1_3_1_1_1.add(txtHome);
		
		JLabel lblWarningContact = new JLabel("");
		lblWarningContact.setForeground(Color.RED);
		lblWarningContact.setBounds(20, 158, 316, 14);
		panelContact.add(lblWarningContact);
		
		JPanel panelParent = new JPanel();
		panelParent.setLayout(null);
		panelParent.setBorder(new LineBorder(new Color(0, 102, 0), 2, true));
		panelParent.setBackground(new Color(204, 255, 204));
		panelParent.setBounds(477, 214, 304, 186);
		contentSubRegistration.add(panelParent);
		
		JPanel panel_2_1_3 = new JPanel();
		panel_2_1_3.setLayout(null);
		panel_2_1_3.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3.setBackground(new Color(204, 255, 204));
		panel_2_1_3.setBounds(10, 109, 212, 38);
		panelParent.add(panel_2_1_3);
		
		JLabel lblNumberOfSibling = new JLabel("Number of Sibling:");
		lblNumberOfSibling.setForeground(new Color(0, 102, 0));
		lblNumberOfSibling.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNumberOfSibling.setBounds(10, 11, 116, 20);
		panel_2_1_3.add(lblNumberOfSibling);
		
		txtSibling = new JTextField();
		txtSibling.setForeground(new Color(0, 102, 51));
		txtSibling.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtSibling.setColumns(10);
		txtSibling.setBorder(null);
		txtSibling.setBackground(new Color(204, 255, 204));
		txtSibling.setBounds(136, 12, 66, 20);
		panel_2_1_3.add(txtSibling);
		
		JPanel panel_2_1_3_1 = new JPanel();
		panel_2_1_3_1.setLayout(null);
		panel_2_1_3_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1.setBackground(new Color(204, 255, 204));
		panel_2_1_3_1.setBounds(10, 11, 284, 38);
		panelParent.add(panel_2_1_3_1);
		
		JLabel lblFathersName = new JLabel("Father's Name: ");
		lblFathersName.setForeground(new Color(0, 102, 0));
		lblFathersName.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblFathersName.setBounds(10, 11, 98, 20);
		panel_2_1_3_1.add(lblFathersName);
		
		txtFather = new JTextField();
		txtFather.setForeground(new Color(0, 102, 51));
		txtFather.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtFather.setColumns(10);
		txtFather.setBorder(null);
		txtFather.setBackground(new Color(204, 255, 204));
		txtFather.setBounds(118, 12, 156, 20);
		panel_2_1_3_1.add(txtFather);
		
		JPanel panel_2_1_3_1_1 = new JPanel();
		panel_2_1_3_1_1.setLayout(null);
		panel_2_1_3_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_1.setBackground(new Color(204, 255, 204));
		panel_2_1_3_1_1.setBounds(10, 60, 284, 38);
		panelParent.add(panel_2_1_3_1_1);
		
		JLabel lblMothersName = new JLabel("Mother's Name:");
		lblMothersName.setForeground(new Color(0, 102, 0));
		lblMothersName.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblMothersName.setBounds(10, 11, 99, 20);
		panel_2_1_3_1_1.add(lblMothersName);
		
		txtMother = new JTextField();
		txtMother.setForeground(new Color(0, 102, 51));
		txtMother.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtMother.setColumns(10);
		txtMother.setBorder(null);
		txtMother.setBackground(new Color(204, 255, 204));
		txtMother.setBounds(119, 12, 155, 20);
		panel_2_1_3_1_1.add(txtMother);
		
		JLabel lblWarningFamily = new JLabel("");
		lblWarningFamily.setForeground(Color.RED);
		lblWarningFamily.setBounds(10, 161, 308, 14);
		panelParent.add(lblWarningFamily);
		}
	}
	
	

