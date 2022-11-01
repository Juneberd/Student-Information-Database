package studentInfomation;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;

public class ScratchJPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Create the panel.
	 */
	public ScratchJPanel() {
		setBounds(0,0, 811, 584);
		setLayout(null);
		
		JPanel pnlSearch = new JPanel();
		pnlSearch.setLayout(null);
		pnlSearch.setBorder(new LineBorder(new Color(60, 179, 113), 2, true));
		pnlSearch.setBounds(10, 313, 387, 39);
		add(pnlSearch);
		
		JLabel lblIconSearchv2 = new JLabel("");
		lblIconSearchv2.setBounds(338, 11, 37, 17);
		pnlSearch.add(lblIconSearchv2);
		
		textField = new JTextField();
		textField.setText("Search name of student");
		textField.setForeground(new Color(60, 179, 113));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(SystemColor.menu);
		textField.setBounds(10, 11, 293, 17);
		pnlSearch.add(textField);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(20, 11, 607, 289);
		add(scrollPane);
		
		JPanel contentSubRegistration = new JPanel();
		contentSubRegistration.setLayout(null);
		contentSubRegistration.setPreferredSize(new Dimension(592, 598));
		contentSubRegistration.setBackground(new Color(144, 238, 144));
		scrollPane.setViewportView(contentSubRegistration);
		
		JPanel panelName = new JPanel();
		panelName.setLayout(null);
		panelName.setBorder(new LineBorder(new Color(0, 102, 0), 2, true));
		panelName.setBackground(new Color(204, 255, 204));
		panelName.setBounds(20, 70, 516, 162);
		contentSubRegistration.add(panelName);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2.setBackground(new Color(204, 255, 204));
		panel_2.setBounds(10, 11, 291, 38);
		panelName.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setForeground(new Color(0, 102, 0));
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 78, 20);
		panel_2.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 102, 51));
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(204, 255, 204));
		textField_1.setBounds(98, 11, 183, 20);
		panel_2.add(textField_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1.setBackground(new Color(204, 255, 204));
		panel_2_1.setBounds(10, 61, 291, 38);
		panelName.add(panel_2_1);
		
		JLabel lblMiddeName = new JLabel("Middle Name:");
		lblMiddeName.setForeground(new Color(0, 102, 0));
		lblMiddeName.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMiddeName.setBounds(10, 11, 89, 20);
		panel_2_1.add(lblMiddeName);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 102, 51));
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(204, 255, 204));
		textField_2.setBounds(109, 12, 167, 20);
		panel_2_1.add(textField_2);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_1.setBackground(new Color(204, 255, 204));
		panel_2_1_1.setBounds(10, 110, 291, 38);
		panelName.add(panel_2_1_1);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setForeground(new Color(0, 102, 0));
		lblLastName.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblLastName.setBounds(10, 11, 69, 20);
		panel_2_1_1.add(lblLastName);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(0, 102, 51));
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(204, 255, 204));
		textField_3.setBounds(87, 12, 189, 20);
		panel_2_1_1.add(textField_3);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_1_1.setBackground(new Color(204, 255, 204));
		panel_2_1_1_1.setBounds(311, 11, 192, 38);
		panelName.add(panel_2_1_1_1);
		
		JLabel lblBirthday = new JLabel("Birthday: ");
		lblBirthday.setForeground(new Color(0, 102, 0));
		lblBirthday.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblBirthday.setBounds(10, 11, 62, 20);
		panel_2_1_1_1.add(lblBirthday);
		
		JDateChooser dateBirthday = new JDateChooser();
		dateBirthday.setBounds(82, 11, 100, 20);
		panel_2_1_1_1.add(dateBirthday);
		
		JPanel panelContact = new JPanel();
		panelContact.setLayout(null);
		panelContact.setBorder(new LineBorder(new Color(0, 102, 0), 2, true));
		panelContact.setBackground(new Color(204, 255, 204));
		panelContact.setBounds(17, 243, 447, 162);
		contentSubRegistration.add(panelContact);
		
		JPanel panel_2_1_3_2 = new JPanel();
		panel_2_1_3_2.setLayout(null);
		panel_2_1_3_2.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_2.setBackground(new Color(204, 255, 204));
		panel_2_1_3_2.setBounds(10, 109, 427, 38);
		panelContact.add(panel_2_1_3_2);
		
		JLabel lblEmailAddress = new JLabel("Email Address: ");
		lblEmailAddress.setForeground(new Color(0, 102, 0));
		lblEmailAddress.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEmailAddress.setBounds(10, 11, 96, 20);
		panel_2_1_3_2.add(lblEmailAddress);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(0, 102, 51));
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground(new Color(204, 255, 204));
		textField_4.setBounds(116, 12, 301, 20);
		panel_2_1_3_2.add(textField_4);
		
		JPanel panel_2_1_3_1_2 = new JPanel();
		panel_2_1_3_1_2.setLayout(null);
		panel_2_1_3_1_2.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_2.setBackground(new Color(204, 255, 204));
		panel_2_1_3_1_2.setBounds(10, 11, 291, 38);
		panelContact.add(panel_2_1_3_1_2);
		
		JLabel lblContactNumber = new JLabel("Contact Number: ");
		lblContactNumber.setForeground(new Color(0, 102, 0));
		lblContactNumber.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblContactNumber.setBounds(10, 11, 109, 20);
		panel_2_1_3_1_2.add(lblContactNumber);
		
		textField_5 = new JTextField();
		textField_5.setForeground(new Color(0, 102, 51));
		textField_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBackground(new Color(204, 255, 204));
		textField_5.setBounds(129, 12, 152, 20);
		panel_2_1_3_1_2.add(textField_5);
		
		JPanel panel_2_1_3_1_1_1 = new JPanel();
		panel_2_1_3_1_1_1.setLayout(null);
		panel_2_1_3_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_1_1.setBackground(new Color(204, 255, 204));
		panel_2_1_3_1_1_1.setBounds(10, 60, 427, 38);
		panelContact.add(panel_2_1_3_1_1_1);
		
		JLabel lblHomeAddress = new JLabel("Home Address: ");
		lblHomeAddress.setForeground(new Color(0, 102, 0));
		lblHomeAddress.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblHomeAddress.setBounds(10, 11, 102, 20);
		panel_2_1_3_1_1_1.add(lblHomeAddress);
		
		textField_6 = new JTextField();
		textField_6.setForeground(new Color(0, 102, 51));
		textField_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBackground(new Color(204, 255, 204));
		textField_6.setBounds(122, 12, 295, 20);
		panel_2_1_3_1_1_1.add(textField_6);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 2, true));
		panel_1_1_1.setBackground(new Color(204, 255, 204));
		panel_1_1_1.setBounds(17, 416, 447, 162);
		contentSubRegistration.add(panel_1_1_1);
		
		JPanel panel_2_1_3_1_2_1 = new JPanel();
		panel_2_1_3_1_2_1.setLayout(null);
		panel_2_1_3_1_2_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_2_1.setBackground(new Color(204, 255, 204));
		panel_2_1_3_1_2_1.setBounds(10, 11, 427, 38);
		panel_1_1_1.add(panel_2_1_3_1_2_1);
		
		JLabel lblChoiceOfDepartment = new JLabel("Department:");
		lblChoiceOfDepartment.setForeground(new Color(0, 102, 0));
		lblChoiceOfDepartment.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblChoiceOfDepartment.setBounds(10, 11, 87, 20);
		panel_2_1_3_1_2_1.add(lblChoiceOfDepartment);
		
		JComboBox cmbDepartment = new JComboBox();
		cmbDepartment.setForeground(new Color(0, 128, 0));
		cmbDepartment.setBackground(new Color(204, 255, 204));
		cmbDepartment.setBounds(108, 9, 309, 22);
		panel_2_1_3_1_2_1.add(cmbDepartment);
		
		JPanel panel_2_1_3_1_1_1_1 = new JPanel();
		panel_2_1_3_1_1_1_1.setLayout(null);
		panel_2_1_3_1_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_1_1_1.setBackground(new Color(204, 255, 204));
		panel_2_1_3_1_1_1_1.setBounds(10, 113, 235, 38);
		panel_1_1_1.add(panel_2_1_3_1_1_1_1);
		
		JLabel lblYearSection = new JLabel("Year & Section: ");
		lblYearSection.setForeground(new Color(0, 102, 0));
		lblYearSection.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblYearSection.setBounds(10, 11, 103, 20);
		panel_2_1_3_1_1_1_1.add(lblYearSection);
		
		textField_7 = new JTextField();
		textField_7.setForeground(new Color(0, 102, 51));
		textField_7.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBorder(null);
		textField_7.setBackground(new Color(204, 255, 204));
		textField_7.setBounds(110, 12, 115, 20);
		panel_2_1_3_1_1_1_1.add(textField_7);
		
		JPanel panel_2_1_3_1_1_1_1_1 = new JPanel();
		panel_2_1_3_1_1_1_1_1.setLayout(null);
		panel_2_1_3_1_1_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_1_1_1_1.setBackground(new Color(204, 255, 204));
		panel_2_1_3_1_1_1_1_1.setBounds(10, 64, 427, 38);
		panel_1_1_1.add(panel_2_1_3_1_1_1_1_1);
		
		JLabel lblCourse = new JLabel("Course:");
		lblCourse.setForeground(new Color(0, 102, 0));
		lblCourse.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCourse.setBounds(10, 11, 66, 20);
		panel_2_1_3_1_1_1_1_1.add(lblCourse);
		
		textField_8 = new JTextField();
		textField_8.setForeground(new Color(0, 102, 51));
		textField_8.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBorder(null);
		textField_8.setBackground(new Color(204, 255, 204));
		textField_8.setBounds(86, 12, 331, 20);
		panel_2_1_3_1_1_1_1_1.add(textField_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(51, 102, 51), 1, true));
		panel_3.setBackground(new Color(51, 102, 51));
		panel_3.setBounds(10, 17, 572, 42);
		contentSubRegistration.add(panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Student Registration");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_1.setBounds(179, 11, 242, 20);
		panel_3.add(lblNewLabel_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(20, 372, 517, 174);
		add(scrollPane_1);
		
		JPanel pnlBtnDelete = new JPanel();
		pnlBtnDelete.setLayout(null);
		pnlBtnDelete.setToolTipText("Add to Database");
		pnlBtnDelete.setForeground(new Color(0, 128, 0));
		pnlBtnDelete.setBorder(new LineBorder(new Color(0, 128, 0), 1, true));
		pnlBtnDelete.setBackground(new Color(0, 128, 0));
		pnlBtnDelete.setBounds(600, 394, 100, 43);
		add(pnlBtnDelete);
		
		JLabel lblDelete = new JLabel("Delete");
		lblDelete.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelete.setForeground(Color.WHITE);
		lblDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDelete.setBackground(Color.WHITE);
		lblDelete.setBounds(24, 11, 53, 21);
		pnlBtnDelete.add(lblDelete);
		
		JPanel pnlBtnEdit = new JPanel();
		pnlBtnEdit.setLayout(null);
		pnlBtnEdit.setToolTipText("Add to Database");
		pnlBtnEdit.setForeground(new Color(0, 128, 0));
		pnlBtnEdit.setBorder(new LineBorder(new Color(0, 128, 0), 1, true));
		pnlBtnEdit.setBackground(new Color(0, 128, 0));
		pnlBtnEdit.setBounds(600, 448, 100, 43);
		add(pnlBtnEdit);
		
		JLabel lblD = new JLabel("Edit");
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setForeground(Color.WHITE);
		lblD.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblD.setBackground(Color.WHITE);
		lblD.setBounds(24, 11, 53, 21);
		pnlBtnEdit.add(lblD);
		
		JLabel lblMessage = new JLabel("New label");
		lblMessage.setBounds(637, 207, 164, 24);
		add(lblMessage);
		
		JPanel pnlBtnAdd = new JPanel();
		pnlBtnAdd.setLayout(null);
		pnlBtnAdd.setToolTipText("Add to Database");
		pnlBtnAdd.setForeground(new Color(0, 128, 0));
		pnlBtnAdd.setBorder(new LineBorder(new Color(0, 128, 0), 1, true));
		pnlBtnAdd.setBackground(new Color(0, 128, 0));
		pnlBtnAdd.setBounds(672, 130, 100, 43);
		add(pnlBtnAdd);
		
		JLabel lblAdd = new JLabel("Add");
		lblAdd.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdd.setForeground(Color.WHITE);
		lblAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdd.setBackground(Color.WHITE);
		lblAdd.setBounds(24, 11, 53, 21);
		pnlBtnAdd.add(lblAdd);

	}
}
