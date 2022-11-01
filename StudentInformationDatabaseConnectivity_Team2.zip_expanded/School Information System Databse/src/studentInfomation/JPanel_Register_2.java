package studentInfomation;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class JPanel_Register_2 extends JPanel  
{
	
	public JPanel pnlBtnBack;
	public JTextField txtYearSection;
	public JTextField txtAverage;
	public JComboBox cmbDepartment;
	public JTextField txtPresent;
	public JRadioButton rdbtnMorning;
	public JRadioButton rdbtnAfternoon;
	public String shift ;
	public JComboBox cmbHour_1;
	public JComboBox cmbHour_2;
	public JComboBox cmbMin_2;
	public JComboBox cmbMin_1;
	public ButtonGroup group;
	public JTextField txtSubject;
	
	

	/**
	 * Create the panel.
	 */
	public JPanel_Register_2()
	{
		
		setBounds(0,0, 791, 411);
		setLayout(null);
		setVisible(true);
		
		JPanel content = new JPanel();
		content.setFont(new Font("Tahoma", Font.BOLD, 14));
		content.setBackground(new Color(152, 251, 152));
		content.setBounds(0, 0, 791, 490);
		add(content);
		content.setLayout(null);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 2, true));
		panel_1_1_1.setBackground(new Color(204, 255, 204));
		panel_1_1_1.setBounds(78, 11, 447, 133);
		content.add(panel_1_1_1);
		
		JPanel panel_2_1_3_1_2 = new JPanel();
		panel_2_1_3_1_2.setLayout(null);
		panel_2_1_3_1_2.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_2.setBackground(new Color(204, 255, 204));
		panel_2_1_3_1_2.setBounds(10, 11, 427, 38);
		panel_1_1_1.add(panel_2_1_3_1_2);
		
		JLabel lblChoiceOfDepartment = new JLabel("Choice of Department");
		lblChoiceOfDepartment.setForeground(new Color(0, 102, 0));
		lblChoiceOfDepartment.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblChoiceOfDepartment.setBounds(10, 11, 141, 20);
		panel_2_1_3_1_2.add(lblChoiceOfDepartment);
		
		cmbDepartment = new JComboBox();
		cmbDepartment.setForeground(new Color(0, 128, 0));
		cmbDepartment.setBackground(new Color(204, 255, 204));
		cmbDepartment.addItem("College of Engineering");
		cmbDepartment.addItem("College of Informatics and Computing Sciences");
		cmbDepartment.addItem("College of Arts and Sciences");
		cmbDepartment.addItem("College of Accountancy, Business, Economics and International Hospitality Management");
		cmbDepartment.addItem("College Of Teacher Education");
		cmbDepartment.addItem("College Of  Industrial Technology");
		cmbDepartment.setSelectedItem(null);
		cmbDepartment.setBounds(161, 9, 256, 22);
		panel_2_1_3_1_2.add(cmbDepartment);
		
		JPanel panel_2_1_3_1_1_1_1 = new JPanel();
		panel_2_1_3_1_1_1_1.setLayout(null);
		panel_2_1_3_1_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_1_1_1.setBackground(new Color(204, 255, 204));
		panel_2_1_3_1_1_1_1.setBounds(10, 60, 235, 38);
		panel_1_1_1.add(panel_2_1_3_1_1_1_1);
		
		JLabel lblYearSection = new JLabel("Year & Section: ");
		lblYearSection.setForeground(new Color(0, 102, 0));
		lblYearSection.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblYearSection.setBounds(10, 11, 103, 20);
		panel_2_1_3_1_1_1_1.add(lblYearSection);
		
		txtYearSection = new JTextField();
		txtYearSection.setForeground(new Color(0, 102, 51));
		txtYearSection.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtYearSection.setColumns(10);
		txtYearSection.setBorder(null);
		txtYearSection.setBackground(new Color(204, 255, 204));
		txtYearSection.setBounds(110, 12, 115, 20);
		panel_2_1_3_1_1_1_1.add(txtYearSection);
		
		JLabel lblWarningDepartment = new JLabel("");
		lblWarningDepartment.setForeground(Color.RED);
		lblWarningDepartment.setBounds(34, 109, 316, 14);
		panel_1_1_1.add(lblWarningDepartment);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 2, true));
		panel_1_1_1_1.setBackground(new Color(204, 255, 204));
		panel_1_1_1_1.setBounds(78, 155, 565, 235);
		content.add(panel_1_1_1_1);
		
		JPanel panel_2_1_3_1_1_1 = new JPanel();
		panel_2_1_3_1_1_1.setLayout(null);
		panel_2_1_3_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_1_1.setBackground(new Color(204, 255, 204));
		panel_2_1_3_1_1_1.setBounds(10, 21, 284, 38);
		panel_1_1_1_1.add(panel_2_1_3_1_1_1);
		
		JLabel lblAverageOf = new JLabel("Average grade of Last Semester: ");
		lblAverageOf.setForeground(new Color(0, 102, 0));
		lblAverageOf.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblAverageOf.setBounds(10, 11, 201, 20);
		panel_2_1_3_1_1_1.add(lblAverageOf);
		
		txtAverage = new JTextField();
		txtAverage.setForeground(new Color(0, 102, 51));
		txtAverage.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtAverage.setColumns(10);
		txtAverage.setBorder(null);
		txtAverage.setBackground(new Color(204, 255, 204));
		txtAverage.setBounds(221, 12, 53, 20);
		panel_2_1_3_1_1_1.add(txtAverage);
		
		JPanel panel_2_1_3_1_1_1_3 = new JPanel();
		panel_2_1_3_1_1_1_3.setLayout(null);
		panel_2_1_3_1_1_1_3.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_1_1_3.setBackground(new Color(204, 255, 204));
		panel_2_1_3_1_1_1_3.setBounds(10, 70, 545, 154);
		panel_1_1_1_1.add(panel_2_1_3_1_1_1_3);
		
		cmbHour_1 = new JComboBox();
		for (int hour_1 =0; hour_1<=24;hour_1++)
		{
			cmbHour_1.addItem(String.format("%02d",  hour_1));
		}
		cmbHour_1.setForeground(new Color(0, 128, 0));
		cmbHour_1.setBackground(new Color(204, 255, 204));
		cmbHour_1.setMaximumRowCount(24);
		cmbHour_1.setBounds(10, 59, 57, 22);
		panel_2_1_3_1_1_1_3.add(cmbHour_1);
		
		cmbHour_2 = new JComboBox();
		for (int hour_2 =0; hour_2<=24;hour_2++)
		{
			cmbHour_2.addItem(String.format("%02d",  hour_2));
		}
		cmbHour_2.setForeground(new Color(0, 128, 0));
		cmbHour_2.setBackground(new Color(204, 255, 204));
		cmbHour_2.setMaximumRowCount(24);
		cmbHour_2.setBounds(10, 121, 57, 22);
		panel_2_1_3_1_1_1_3.add(cmbHour_2);
		
		JLabel lblNewLabel = new JLabel(":");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(77, 59, 20, 18);
		panel_2_1_3_1_1_1_3.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("to");
		lblNewLabel_1_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(77, 92, 20, 18);
		panel_2_1_3_1_1_1_3.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(77, 121, 20, 18);
		panel_2_1_3_1_1_1_3.add(lblNewLabel_1);
		
		cmbMin_2 = new JComboBox();
		for (int min_2 =0; min_2<=59;min_2++)
		{
			cmbMin_2.addItem(String.format("%02d", min_2));
		}
		cmbMin_2.setForeground(new Color(0, 128, 0));
		cmbMin_2.setBackground(new Color(204, 255, 204));
		cmbMin_2.setMaximumRowCount(60);
		cmbMin_2.setBounds(107, 121, 53, 22);
		panel_2_1_3_1_1_1_3.add(cmbMin_2);
		
		cmbMin_1 = new JComboBox();
		for (int min_1 =0; min_1<=59;min_1++)
		{
			cmbMin_1.addItem(String.format("%02d", min_1));
		}
		cmbMin_1.setForeground(new Color(0, 128, 0));
		cmbMin_1.setBackground(new Color(204, 255, 204));
		cmbMin_1.setMaximumRowCount(60);
		cmbMin_1.setBounds(107, 59, 53, 22);
		panel_2_1_3_1_1_1_3.add(cmbMin_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 204));
		panel.setLayout(null);
		panel.setBounds(205, 59, 134, 73);
		panel_2_1_3_1_1_1_3.add(panel);
		
		rdbtnMorning = new JRadioButton("Morning class");
		rdbtnMorning.setActionCommand("Morning Class");
		rdbtnMorning.setForeground(new Color(0, 100, 0));
		rdbtnMorning.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		rdbtnMorning.setBounds(6, 7, 122, 23);
		rdbtnMorning.setBackground(new Color(204, 255, 204));
		panel.add(rdbtnMorning);
		
		rdbtnAfternoon = new JRadioButton("Afternoon class");
		rdbtnAfternoon.setActionCommand("Afternoon Class");
		rdbtnAfternoon.setForeground(new Color(0, 128, 0));
		rdbtnAfternoon.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		rdbtnAfternoon.setBounds(6, 43, 122, 23);
		rdbtnAfternoon.setBackground(new Color(204, 255, 204));
		panel.add(rdbtnAfternoon);
		
		JPanel panel_2_1_3_1_1_1_2 = new JPanel();
		panel_2_1_3_1_1_1_2.setBounds(282, 12, 253, 38);
		panel_2_1_3_1_1_1_3.add(panel_2_1_3_1_1_1_2);
		panel_2_1_3_1_1_1_2.setLayout(null);
		panel_2_1_3_1_1_1_2.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_1_1_2.setBackground(new Color(204, 255, 204));
		
		JLabel lblpresent = new JLabel("Total number of days present: ");
		lblpresent.setForeground(new Color(0, 102, 0));
		lblpresent.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblpresent.setBounds(10, 11, 190, 20);
		panel_2_1_3_1_1_1_2.add(lblpresent);
		
		txtPresent = new JTextField();
		txtPresent.setForeground(new Color(0, 102, 51));
		txtPresent.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtPresent.setColumns(10);
		txtPresent.setBorder(null);
		txtPresent.setBackground(new Color(204, 255, 204));
		txtPresent.setBounds(210, 12, 33, 20);
		panel_2_1_3_1_1_1_2.add(txtPresent);
		
		JLabel lblScheduled = new JLabel("Daily Schedule");
		lblScheduled.setForeground(new Color(0, 102, 0));
		lblScheduled.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblScheduled.setBounds(10, 12, 98, 20);
		panel_2_1_3_1_1_1_3.add(lblScheduled);
		
		group = new ButtonGroup();
		 group.add(rdbtnMorning);
		 group.add(rdbtnAfternoon);
		 
		 JPanel panel_2_1_3_1_1_1_2_1 = new JPanel();
		 panel_2_1_3_1_1_1_2_1.setBounds(304, 21, 228, 38);
		 panel_1_1_1_1.add(panel_2_1_3_1_1_1_2_1);
		 panel_2_1_3_1_1_1_2_1.setLayout(null);
		 panel_2_1_3_1_1_1_2_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		 panel_2_1_3_1_1_1_2_1.setBackground(new Color(204, 255, 204));
		 
		 JLabel lblNumberOfSubjects = new JLabel("Number of Subjects:");
		 lblNumberOfSubjects.setForeground(new Color(0, 102, 0));
		 lblNumberOfSubjects.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		 lblNumberOfSubjects.setBounds(10, 11, 134, 20);
		 panel_2_1_3_1_1_1_2_1.add(lblNumberOfSubjects);
		 
		 txtSubject = new JTextField();
		 txtSubject.setForeground(new Color(0, 102, 51));
		 txtSubject.setFont(new Font("Calibri", Font.PLAIN, 15));
		 txtSubject.setColumns(10);
		 txtSubject.setBorder(null);
		 txtSubject.setBackground(new Color(204, 255, 204));
		 txtSubject.setBounds(154, 12, 57, 20);
		 panel_2_1_3_1_1_1_2_1.add(txtSubject);
		 
		 
	}
}
