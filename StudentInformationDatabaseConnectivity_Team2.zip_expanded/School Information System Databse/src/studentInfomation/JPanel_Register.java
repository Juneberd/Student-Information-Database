package studentInfomation;

import java.awt.CardLayout;
import java.sql.*;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import net.proteanit.sql.DbUtils;

import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

import javax.swing.JButton;
import java.awt.Panel;

public class JPanel_Register extends JPanel
{
	
	private JPanel_Register_1 paneRegister1;
	private JPanel_Register_2 paneRegister2;
	private Review review;
	private JPanel_Search search;
	public int resultAge;
	
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;


	 public void Connect_1()
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
	 public void table_load1()
	    {
		 JPanel_Search search = new JPanel_Search();
	    	try 
	    	{
		    pst = con.prepareStatement("select * from studentinfo_tbl");
		    rs = pst.executeQuery();
		    search.table.setModel(DbUtils.resultSetToTableModel(rs));
		} 
	    	catch (SQLException e) 
	    	 {
	    		e.printStackTrace();
		  } 
	    }
	
	/**
	 * Create the panel.
	 */
	public JPanel_Register()
	{
		Connect_1();
		
		paneRegister1 = new JPanel_Register_1();
		paneRegister2 = new JPanel_Register_2();
		//review = new Review();
		
		
		setForeground(new Color(0, 102, 0));
		setBackground(new Color(204, 255, 204));
		setBorder(new LineBorder(new Color(60, 179, 113), 2));
		setBounds(0, 0 ,811, 584);
		setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(51, 102, 51), 1, true));
		panel_3.setBackground(new Color(51, 102, 51));
		panel_3.setBounds(10, 11, 672, 61);
		add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Student Registration");
		lblNewLabel_1.setBounds(227, 11, 242, 32);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel_3.add(lblNewLabel_1);
		
		JPanel contentSubMain = new JPanel();
		contentSubMain.setBackground(new Color(144, 238, 144));
		contentSubMain.setBounds(10, 83, 791, 411);
		add(contentSubMain);
		contentSubMain.setLayout(null);
		
		JPanel current_panel = new JPanel();
		current_panel.setLayout(null);
		current_panel.setBackground(new Color(152, 251, 152));
		current_panel.setBounds(10, 505, 791, 68);
		add(current_panel);
		
		JPanel pnlBtnClear = new JPanel();
		pnlBtnClear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlBtnClear.setLayout(null);
		pnlBtnClear.setForeground(new Color(245, 245, 220));
		pnlBtnClear.setBorder(new LineBorder(new Color(0, 128, 0), 1, true));
		pnlBtnClear.setBackground(new Color(0, 128, 0));
		pnlBtnClear.setBounds(416, 11, 100, 43);
		current_panel.add(pnlBtnClear);
		
		JLabel lblClear = new JLabel("CLEAR");
		lblClear.setHorizontalAlignment(SwingConstants.CENTER);
		lblClear.setForeground(new Color(240, 248, 255));
		lblClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClear.setBounds(24, 11, 53, 21);
		pnlBtnClear.add(lblClear);
		
		JPanel pnlBtnBack = new JPanel();
		pnlBtnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlBtnBack.setLayout(null);
		pnlBtnBack.setForeground(new Color(245, 245, 220));
		pnlBtnBack.setBorder(new LineBorder(new Color(0, 128, 0), 1, true));
		pnlBtnBack.setBackground(new Color(0, 128, 0));
		pnlBtnBack.setBounds(56, 11, 100, 43);
		pnlBtnBack.setVisible(false);
		current_panel.add(pnlBtnBack);
		
		JLabel lblNewLabel_1_1 = new JLabel("BACK");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(240, 248, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(24, 11, 53, 21);
		pnlBtnBack.add(lblNewLabel_1_1);
		contentSubMain.add(paneRegister1);
		contentSubMain.add(paneRegister2);
		
		JPanel pnlBtnProceed = new JPanel();
		pnlBtnProceed.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlBtnProceed.setLayout(null);
		pnlBtnProceed.setForeground(new Color(245, 245, 220));
		pnlBtnProceed.setBorder(new LineBorder(new Color(0, 128, 0), 1, true));
		pnlBtnProceed.setBackground(new Color(0, 128, 0));
		pnlBtnProceed.setBounds(649, 11, 100, 43);
		current_panel.add(pnlBtnProceed);
		pnlBtnProceed.setVisible(false);
		
		JLabel lblAdd = new JLabel("PROCEED");
		lblAdd.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdd.setForeground(new Color(240, 248, 255));
		lblAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdd.setBounds(10, 11, 80, 21);
		pnlBtnProceed.add(lblAdd);
		
		JPanel pnlBtnNext = new JPanel();
		pnlBtnNext.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlBtnNext.setBounds(541, 11, 100, 43);
		current_panel.add(pnlBtnNext);
		pnlBtnNext.setLayout(null);
		pnlBtnNext.setForeground(new Color(245, 245, 220));
		pnlBtnNext.setBorder(new LineBorder(new Color(0, 128, 0), 1, true));
		pnlBtnNext.setBackground(new Color(0, 128, 0));
		pnlBtnNext.setVisible(true);
		
		JLabel lblAdd_1 = new JLabel("NEXT");
		lblAdd_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdd_1.setForeground(new Color(240, 248, 255));
		lblAdd_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdd_1.setBounds(24, 11, 53, 21);
		pnlBtnNext.add(lblAdd_1);
		pnlBtnNext.addMouseListener(new PanelButtonMouseAdapter(pnlBtnProceed) 
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(paneRegister2);
				pnlBtnBack.setVisible(true);
				paneRegister2.setVisible(true);
				pnlBtnProceed.setVisible(true);
				pnlBtnNext.setVisible(false);
				
			}
		});
		
		pnlBtnProceed.addMouseListener(new PanelButtonMouseAdapter(pnlBtnProceed) 
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				
				String fNAME = paneRegister1.txtFirstName.getText();
				String mNAME = paneRegister1.txtMiddleName.getText();
				String lNAME = paneRegister1.txtLastName.getText();
				String S_contact =  paneRegister1.txtContact.getText();
				String home =  paneRegister1.txtHome.getText();
				String email =  paneRegister1.txtEmail.getText();
				String mother =  paneRegister1.txtMother.getText();
				String father =  paneRegister1.txtFather.getText();
				String S_sibling =  paneRegister1.txtSibling.getText().formatted();
				String yearSection = paneRegister2.txtYearSection.getText();
				String S_average = paneRegister2.txtAverage.getText();
				String department = (String)paneRegister2.cmbDepartment.getSelectedItem();
				String Shour_1 = (String)paneRegister2.cmbHour_1.getSelectedItem();
				String Shour_2 = (String)paneRegister2.cmbHour_2.getSelectedItem();
				String Smin_1 = (String)paneRegister2.cmbMin_1.getSelectedItem();
				String Smin_2 = (String)paneRegister2.cmbMin_2.getSelectedItem();
				String shift = "";
				String S_present = paneRegister2.txtPresent.getText();
				String S_subject = paneRegister2.txtSubject.getText();
				//default value String in birthdate and int in resultAge
				String birthdate="";
				resultAge = 0;
				
				//default value declaration that use for converting from String to Int
				int I_sibling = 0;
				//int I_age = 0;
				long I_contact = 0;
				int I_average = 0, I_present = 0, I_subject = 0;
				double I_hour1=0.0, I_hour2=0.0, I_min1=0.0, I_min2=0.0;
				double decimaltime_1=0.0, decimaltime_2=0.0, resultdura = 0.0;
				//int sAge = 0;
				
				
				String s_sibling = "";
				String s_contact = "";
				String s_average = "";
				String s_present = "";
				String s_subject = "";
				//Review review = new Review();
				
				String sched = Shour_1 + ":" + Smin_1 + " - " + Shour_2 + ":" + Smin_2;
				
				try
				{
					I_sibling = Integer.parseInt(S_sibling);
					if (S_sibling.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Input the number of sibling", "The number of sibling is empty!", 
								JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						s_sibling = Integer.toString(I_sibling);
					}
				}
				catch(NumberFormatException e2)
				{
					JOptionPane.showMessageDialog(null, 
							"The number must accepting only in sibling", "The input in sibling is error", JOptionPane.ERROR_MESSAGE);
						
				}
				
				//try..catch for contact
				try
				{
					I_contact = Long.parseLong(S_contact);
					if (S_contact.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Input the contact ","The contact is empty!", JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						s_contact = Long.toString(I_contact);
						
				
					}
							
				}
				catch(NumberFormatException e2)
				{
					JOptionPane.showMessageDialog(null, 
							"Only number accepting in contact without any character", "The input in contact is error!",
							JOptionPane.ERROR_MESSAGE);
						
				}
				try
				{
					I_average = Integer.parseInt(S_average);
					if (S_average.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Input the average ","The contact is empty!", JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						s_average = Integer.toString(I_average);
						
					}
							
				}
				catch(NumberFormatException e2)
				{
					JOptionPane.showMessageDialog(null, 
							"Only number accepting in average", "The input in average is error!",
							JOptionPane.ERROR_MESSAGE);
						
				}

				//try..catch for present
				try
				{
					I_present = Integer.parseInt(S_present);
					if (S_present.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Input the number of present ","The present is empty!", JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						
						s_present = Integer.toString(I_present);
					
					}
							
				}
				catch(NumberFormatException e2)
				{
					JOptionPane.showMessageDialog(null, 
							"Only number accepting in number of present", "The input in present is error!",
							JOptionPane.ERROR_MESSAGE);
						
				}
				//try...catch for subject 
				try
				{
					I_subject = Integer.parseInt(S_subject);
					if (S_subject.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Input the number of subject", "The number of subject is empty!", 
								JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						
						s_subject = Integer.toString(I_subject);
						
						
					}		
				}
				catch(NumberFormatException e2)
				{
					JOptionPane.showMessageDialog(null, 
							"The number must accepting only in subject", "The input in subject is error", JOptionPane.ERROR_MESSAGE);
						
				}
				//try...catch birthdate
				try
				{
					SimpleDateFormat formater = new SimpleDateFormat("MM/dd/yyyy");
					birthdate = formater.format(paneRegister1.dateBirthday.getDate());
					String dob[] = birthdate.split("/");
					int dd = Integer.parseInt(dob[1]);
					int mm = Integer.parseInt(dob[0]);
					int yy = Integer.parseInt(dob[2]);
					//Using local date
					LocalDate selectedDate = LocalDate.of(yy, mm, dd);
					LocalDate currentDate = LocalDate.now();
					resultAge = Period.between(selectedDate, currentDate).getYears();
					
				}
				catch(Exception e4)
				{
					JOptionPane.showMessageDialog(null, 
							"The birthdate is not fill up yet", "The input in birhtdate is empty", JOptionPane.ERROR_MESSAGE);
				}
				try
				{
					shift = paneRegister2.group.getSelection().getActionCommand();
					
					
				}
				catch(Exception e4)
				{
					JOptionPane.showMessageDialog(null, 
							"The input not yet choose morning or afternoon class", "The input in shifting is empty!",
							JOptionPane.ERROR_MESSAGE);
				}
				
				
				//add to database
				try {
					pst = con.prepareStatement("insert into studentinfo_tbl(FirstName, MiddleName, LastName, Age, Birthday, Contact, "
							+ "Father, Mother, NumberSibling, Home, Email, Department, YearSection, Average, NumberSubject, Schedule, "
							+ "Shift, NumberPresent)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					pst.setString(1, fNAME);
					pst.setString(2, mNAME);
					pst.setString(3, lNAME);
					pst.setString(4, ""+resultAge);
					pst.setString(5, birthdate);
					pst.setString(6, s_contact);
					pst.setString(7, father);
					pst.setString(8, mother);
					pst.setString(9, s_sibling);
					pst.setString(10, home);
					pst.setString(11, email);
					pst.setString(12, department);
					pst.setString(13, yearSection);
					pst.setString(14, s_average);
					pst.setString(15, s_subject);
					pst.setString(16, sched);
					pst.setString(17, shift);
					pst.setString(18, s_present);
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Addedddd!!!!!");
					table_load1();
						           
					clearField();
					paneRegister1.txtFirstName.requestFocus();
				   }
			 
				catch (SQLException e2) 
			        {
									
				e2.printStackTrace();
				}
				
					
				//try..catch for sibling
				/*try
				{
					I_sibling = Integer.parseInt(S_sibling);
					if (S_sibling.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Input the number of sibling", "The number of sibling is empty!", 
								JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						String s_sibling = Integer.toString(I_sibling);
						
						//review.txtlblSibling.setText(s_sibling);
						
						//add to database
						try 
						{
							pst = con.prepareStatement("insert into studentinfo_tbl(Number_Sibling)values(?)");
							pst.setString(1, s_sibling);
							
							pst.executeUpdate();
							
							search.table_load();
								           
							clearField();
							paneRegister1.txtFirstName.requestFocus();
						  }
					 
						catch (SQLException e7) 
						{
											
							e7.printStackTrace();
						}
						
						
						show_1 = true;
					}		
				}
				catch(NumberFormatException e2)
				{
					JOptionPane.showMessageDialog(null, 
							"The number must accepting only in sibling", "The input in sibling is error", JOptionPane.ERROR_MESSAGE);
						
				}*/
				
				//try..catch for contact
				/*try
				{
					I_contact = Long.parseLong(S_contact);
					if (S_contact.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Input the contact ","The contact is empty!", JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						String s_contact = Long.toString(I_contact);
						
						//review.txtlblContact.setText(s_contact);
						
						//add to database
						try 
						{
							pst = con.prepareStatement("insert into studentinfo_tbl(Contact)values(?)");
							pst.setString(1, s_contact);
							
							pst.executeUpdate();
							
							search.table_load();
								           
							clearField();
							paneRegister1.txtFirstName.requestFocus();
						  }
					 
						catch (SQLException e6) 
						{
											
							e6.printStackTrace();
						}
						
						
						show_3 = true;
					}
							
				}
				catch(NumberFormatException e2)
				{
					JOptionPane.showMessageDialog(null, 
							"Only number accepting in contact without any character", "The input in contact is error!",
							JOptionPane.ERROR_MESSAGE);
						
				}*/
				//try..catch for average
				/*try
				{
					I_average = Integer.parseInt(S_average);
					if (S_average.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Input the average ","The contact is empty!", JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						String s_average = Integer.toString(I_average);
						
						//review.txtlblAverage.setText(s_average);
						
						//add to database
						try 
						{
							pst = con.prepareStatement("insert into studentinfo_tbl(Average)values(?)");
							pst.setString(1, s_average);
							
							pst.executeUpdate();
							
							search.table_load();
								           
							clearField();
							paneRegister1.txtFirstName.requestFocus();
						  }
					 
						catch (SQLException e5) 
						{
											
							e5.printStackTrace();
						}
						
						show_4 = true;
					}
							
				}
				catch(NumberFormatException e2)
				{
					JOptionPane.showMessageDialog(null, 
							"Only number accepting in average", "The input in average is error!",
							JOptionPane.ERROR_MESSAGE);
						
				}*/
				//try..catch for present
			//	try
				{
				//	I_present = Integer.parseInt(S_present);
					/*if (S_present.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Input the number of present ","The present is empty!", JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						/*if (I_present<50)
						{
							review.lblPresentStatus.setText("DROP");
							review.lblPresentStatus.setForeground(Color.RED);
						}
						else if(I_present>200)
						{
							review.lblPresentStatus.setText("The Subject not greater 200");
							review.lblPresentStatus.setForeground(Color.ORANGE);
						}*/
						//String s_present = Integer.toString(I_present);
						
						//review.txtlblPresent.setText(s_present);
						
						//add to database
						//try 
						//{
							//pst = con.prepareStatement("insert into studentinfo_tbl(NumberPresent)values(?)");
							//pst.setString(1, s_present);
							
							//pst.executeUpdate();
							
							//search.table_load();
								           
							//clearField();
							//paneRegister1.txtFirstName.requestFocus();
						//  }
					 
						//catch (SQLException e3) 
						//{
											
							//e3.printStackTrace();
						//}
						
						
						//show_5= true;
					//}
							
				/*}
			//	catch(NumberFormatException e2)
				{
				//	JOptionPane.showMessageDialog(null, 
							"Only number accepting in number of present", "The input in present is error!",
				//			JOptionPane.ERROR_MESSAGE);
						
				//}
				
				//try...catch for shifting
				try
				{
					shift = paneRegister2.group.getSelection().getActionCommand();
					show_6 = true;
					
				}
				catch(Exception e4)
				{
					JOptionPane.showMessageDialog(null, 
							"The input not yet choose morning or afternoon class", "The input in shifting is empty!",
							JOptionPane.ERROR_MESSAGE);
				}
				//try...catch for subject 
				try
				{
					I_subject = Integer.parseInt(S_subject);
					if (S_subject.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Input the number of subject", "The number of subject is empty!", 
								JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						/*if (I_subject<4)
						{
							review.lblSubjectStatus.setText("The subject that take has not atleast 4");
							review.lblSubjectStatus.setForeground(Color.ORANGE);
						}
						else if(I_subject>10)
						{
							review.lblSubjectStatus.setText("The subject is OVERLOAD");
							review.lblSubjectStatus.setForeground(Color.RED);
						}*/
						/*String s_subject = Integer.toString(I_subject);
						
						//review.txtlblSubject.setText(s_subject);
						
						//add to database
						try 
						{
							pst = con.prepareStatement("insert into studentinfo_tbl(NumberSubject)values(?)");
							pst.setString(1, s_subject);
							
							pst.executeUpdate();
							
							search.table_load();
								           
							clearField();
							paneRegister1.txtFirstName.requestFocus();
						  }
					 
						catch (SQLException e3) 
						{
											
							e3.printStackTrace();
						}
						
						show_7 = true;
					}		
				}
				catch(NumberFormatException e2)
				{
					JOptionPane.showMessageDialog(null, 
							"The number must accepting only in subject", "The input in subject is error", JOptionPane.ERROR_MESSAGE);
						
				}
				//try...catch birthdate
				try
				{
					SimpleDateFormat formater = new SimpleDateFormat("MM/dd/yyyy");
					birthdate = formater.format(paneRegister1.dateBirthday.getDate());
					String dob[] = birthdate.split("/");
					int dd = Integer.parseInt(dob[1]);
					int mm = Integer.parseInt(dob[0]);
					int yy = Integer.parseInt(dob[2]);
					//Using local date
					LocalDate selectedDate = LocalDate.of(yy, mm, dd);
					LocalDate currentDate = LocalDate.now();
					resultAge = Period.between(selectedDate, currentDate).getYears();
					show_2= true;
				}
				catch(Exception e4)
				{
					JOptionPane.showMessageDialog(null, 
							"The birthdate is not fill up yet", "The input in birhtdate is empty", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
				if (fNAME.isEmpty() || mNAME.isEmpty() || lNAME.isEmpty()||home.isEmpty()||
						email.isEmpty()||mother.isEmpty()||father.isEmpty()||
						yearSection.isEmpty()||paneRegister2.cmbDepartment.getSelectedItem()==null)
				{
					JOptionPane.showMessageDialog(null, "Some field is empty!", "Error", JOptionPane.ERROR_MESSAGE);	
				}
			
				else if(show_1 == true&&show_2==true&&show_3 == true&&
						show_4 == true&&show_5 == true&&show_6==true&&show_7==true)
				{
					
	
					/*review.txtlblFirstName.setText(fNAME);
					review.txtlblMiddleName.setText(mNAME);
					review.txtlblLastName.setText(lNAME);
					review.txtlblHome.setText(home);
					review.txtlblEmail.setText(email);
					review.txtlblMother.setText(mother);
					review.txtlblFather.setText(father);
					
					review.txtlblBirthday.setText(birthdate);
					
	
					review.txtlblAge.setText(""+resultAge);
					review.txtlblYearSection.setText(yearSection);
					review.txtlblDepartment.setText(department);
					review.txtlblHour_1.setText(Shour_1);
					review.txtlblHour_2.setText(Shour_2);
					review.txtlblMin_1.setText(Smin_1);
					review.txtlblMin_2.setText(Smin_2);
					review.txtlblShift.setText(shift);*/
					
					
					//time to decimal
					I_hour1=Double.parseDouble(Shour_1);
					I_hour2=Double.parseDouble(Shour_2);
					I_min1=Double.parseDouble(Smin_1);
					I_min2=Double.parseDouble(Smin_2);
					decimaltime_1 = I_hour1+(I_min1/60);
					decimaltime_2 = I_hour2+(I_min2/60);
					resultdura = decimaltime_2 - decimaltime_1;
					
					//if true the label must appear in review frame about warning not exceed 4 hour
					/*if(resultdura > 4)
					{
						review.lblHourduration.setText("The class hour must not exceed 4 hour");
						review.lblHourduration.setForeground(Color.ORANGE);
					}*/
					//review.setVisible(true);
					clearField();
				}
				
				
			}
		});
		pnlBtnBack.addMouseListener(new PanelButtonMouseAdapter(pnlBtnBack) 
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{

				menuClicked(paneRegister1);
				pnlBtnBack.setVisible(false);
				pnlBtnProceed.setVisible(false);
				pnlBtnNext.setVisible(true);
				
			}
		});
		
		pnlBtnClear.addMouseListener(new PanelButtonMouseAdapter(pnlBtnClear) 
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				clearField();
			}
		});
		
		
		
		menuClicked(paneRegister1);
	}
	
	
	
	public void menuClicked(JPanel panel)
	{
		paneRegister1.setVisible(false);
		paneRegister2.setVisible(false);
		
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
			panel.setBackground(new Color(0,118,0));
		}
		@Override
		public void mouseExited(MouseEvent e)
		{
			panel.setBackground(new Color(0,128,0));
		}
		@Override
		public void mousePressed(MouseEvent e)
		{
			panel.setBackground(new Color(10,138,10));
		}
		@Override
		public void mouseReleased(MouseEvent e)
		{
			panel.setBackground(new Color(0,128,0));
		}
	}
	public void clearField()
	{
		paneRegister1.txtFirstName.setText(null);
		paneRegister1.txtMiddleName.setText(null);
		paneRegister1.txtLastName.setText(null);
		paneRegister1.txtContact.setText(null);
		paneRegister1.txtHome.setText(null);
		paneRegister1.txtEmail.setText(null);
		paneRegister1.txtMother.setText(null);
		paneRegister1.txtFather.setText(null);
		paneRegister1.txtSibling.setText(null);
		paneRegister2.txtYearSection.setText(null);
		paneRegister2.txtAverage.setText(null);
		paneRegister2.cmbDepartment.setSelectedItem(null);
		paneRegister2.txtPresent.setText(null);
		paneRegister2.txtSubject.setText(null);
		paneRegister1.dateBirthday.setDate(null);
		paneRegister2.cmbDepartment.setSelectedItem(null);
	}
	
	
}
