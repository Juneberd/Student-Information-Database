package studentInfomation;

import java.awt.Color;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.swing.*;

import java.awt.*;

import javax.swing.border.LineBorder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import java.awt.Font;
import java.awt.Image;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.toedter.calendar.JDateChooser;
import net.proteanit.sql.DbUtils;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JPanel_Search extends JPanel
{
	
	private Image img_logoSearchv2 = new ImageIcon(JPanel_Search.class.getResource("/resourceImage/searchIcon_v2.png")).getImage().getScaledInstance(46,28,Image.SCALE_SMOOTH);
	public JTextField txtSearch;
	private JPanel_Register_1 reg1;
	private JPanel_Register_2 reg2;
	public JTable table;
	private JPanel_Register reg;
	
	/**
	 * Create the panel.
	 */
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	private JTextField txtthis_FirstN;
	private JTextField txtthis_MiddleN;
	private JTextField txtthis_LastN;
	private JTextField txtthis_Email;
	private JTextField txtthis_Cont;
	private JTextField txtthis_Home;
	private JTextField txtthis_YS;
	private JTextField txtthis_Dep;
	public JDateChooser dateBirthday_1;
	
	
 
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
	 public void table_load()
	    {
	    	try 
	    	{
		    pst = con.prepareStatement("select * from studentinfo_tbl");
		    rs = pst.executeQuery();
		  
		    
		    table.setModel(DbUtils.resultSetToTableModel(rs));
		} 
	    	catch (SQLException e) 
	    	 {
	    		e.printStackTrace();
		  } 
	    }
	 
	 
	public JPanel_Search()
	{
		Connect();
		
		reg1 = new JPanel_Register_1();
		reg2 = new JPanel_Register_2();
	
		setForeground(new Color(60, 179, 113));
		setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		setBorder(new LineBorder(new Color(60, 179, 113), 2));
		setBounds(0, 0 ,811, 584);
		setLayout(null);
		setVisible(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(42, 325, 611, 235);
		add(scrollPane);
		
		JPanel contentSubRegistration = new JPanel();
		contentSubRegistration.setLayout(null);
		contentSubRegistration.setPreferredSize(new Dimension(592, 598));
		contentSubRegistration.setBackground(Color.WHITE);
		scrollPane.setViewportView(contentSubRegistration);
		
		JPanel panelName = new JPanel();
		panelName.setLayout(null);
		panelName.setBorder(new LineBorder(new Color(0, 102, 0), 2, true));
		panelName.setBackground(Color.WHITE);
		panelName.setBounds(35, 23, 516, 162);
		contentSubRegistration.add(panelName);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 11, 291, 38);
		panelName.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setForeground(new Color(0, 102, 0));
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 78, 20);
		panel_2.add(lblNewLabel);
		
		txtthis_FirstN = new JTextField();
		txtthis_FirstN.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtthis_FirstN.setForeground(new Color(0, 102, 51));
		txtthis_FirstN.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtthis_FirstN.setColumns(10);
		txtthis_FirstN.setBorder(null);
		txtthis_FirstN.setBackground(Color.WHITE);
		txtthis_FirstN.setBounds(98, 11, 183, 20);
		panel_2.add(txtthis_FirstN);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(10, 61, 291, 38);
		panelName.add(panel_2_1);
		
		JLabel lblMiddeName = new JLabel("Middle Name:");
		lblMiddeName.setForeground(new Color(0, 102, 0));
		lblMiddeName.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMiddeName.setBounds(10, 11, 89, 20);
		panel_2_1.add(lblMiddeName);
		
		txtthis_MiddleN = new JTextField();
		txtthis_MiddleN.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtthis_MiddleN.setForeground(new Color(0, 102, 51));
		txtthis_MiddleN.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtthis_MiddleN.setColumns(10);
		txtthis_MiddleN.setBorder(null);
		txtthis_MiddleN.setBackground(Color.WHITE);
		txtthis_MiddleN.setBounds(109, 12, 167, 20);
		panel_2_1.add(txtthis_MiddleN);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBounds(10, 110, 291, 38);
		panelName.add(panel_2_1_1);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setForeground(new Color(0, 102, 0));
		lblLastName.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblLastName.setBounds(10, 11, 69, 20);
		panel_2_1_1.add(lblLastName);
		
		txtthis_LastN = new JTextField();
		txtthis_LastN.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtthis_LastN.setForeground(new Color(0, 102, 51));
		txtthis_LastN.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtthis_LastN.setColumns(10);
		txtthis_LastN.setBorder(null);
		txtthis_LastN.setBackground(Color.WHITE);
		txtthis_LastN.setBounds(87, 12, 189, 20);
		panel_2_1_1.add(txtthis_LastN);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1.setBounds(314, 38, 192, 38);
		panelName.add(panel_2_1_1_1);
		
		JLabel lblBirthday = new JLabel("Birthday: ");
		lblBirthday.setForeground(new Color(0, 102, 0));
		lblBirthday.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblBirthday.setBounds(10, 11, 62, 20);
		panel_2_1_1_1.add(lblBirthday);
		
		dateBirthday_1 = new JDateChooser();
		dateBirthday_1.setBounds(82, 11, 100, 20);
		panel_2_1_1_1.add(dateBirthday_1);
		
		JPanel panelContact = new JPanel();
		panelContact.setLayout(null);
		panelContact.setBorder(new LineBorder(new Color(0, 102, 0), 2, true));
		panelContact.setBackground(Color.WHITE);
		panelContact.setBounds(45, 196, 447, 162);
		contentSubRegistration.add(panelContact);
		
		JPanel panel_2_1_3_2 = new JPanel();
		panel_2_1_3_2.setLayout(null);
		panel_2_1_3_2.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_2.setBackground(Color.WHITE);
		panel_2_1_3_2.setBounds(10, 109, 427, 38);
		panelContact.add(panel_2_1_3_2);
		
		JLabel lblEmailAddress = new JLabel("Email Address: ");
		lblEmailAddress.setForeground(new Color(0, 102, 0));
		lblEmailAddress.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEmailAddress.setBounds(10, 11, 96, 20);
		panel_2_1_3_2.add(lblEmailAddress);
		
		txtthis_Email = new JTextField();
		txtthis_Email.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtthis_Email.setForeground(new Color(0, 102, 51));
		txtthis_Email.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtthis_Email.setColumns(10);
		txtthis_Email.setBorder(null);
		txtthis_Email.setBackground(Color.WHITE);
		txtthis_Email.setBounds(116, 12, 301, 20);
		panel_2_1_3_2.add(txtthis_Email);
		
		JPanel panel_2_1_3_1_2 = new JPanel();
		panel_2_1_3_1_2.setLayout(null);
		panel_2_1_3_1_2.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_2.setBackground(Color.WHITE);
		panel_2_1_3_1_2.setBounds(10, 11, 291, 38);
		panelContact.add(panel_2_1_3_1_2);
		
		JLabel lblContactNumber = new JLabel("Contact Number: ");
		lblContactNumber.setForeground(new Color(0, 102, 0));
		lblContactNumber.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblContactNumber.setBounds(10, 11, 109, 20);
		panel_2_1_3_1_2.add(lblContactNumber);
		
		txtthis_Cont = new JTextField();
		txtthis_Cont.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtthis_Cont.setForeground(new Color(0, 102, 51));
		txtthis_Cont.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtthis_Cont.setColumns(10);
		txtthis_Cont.setBorder(null);
		txtthis_Cont.setBackground(Color.WHITE);
		txtthis_Cont.setBounds(129, 12, 152, 20);
		panel_2_1_3_1_2.add(txtthis_Cont);
		
		JPanel panel_2_1_3_1_1_1 = new JPanel();
		panel_2_1_3_1_1_1.setLayout(null);
		panel_2_1_3_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_1_1.setBackground(Color.WHITE);
		panel_2_1_3_1_1_1.setBounds(10, 60, 427, 38);
		panelContact.add(panel_2_1_3_1_1_1);
		
		JLabel lblHomeAddress = new JLabel("Home Address: ");
		lblHomeAddress.setForeground(new Color(0, 102, 0));
		lblHomeAddress.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblHomeAddress.setBounds(10, 11, 102, 20);
		panel_2_1_3_1_1_1.add(lblHomeAddress);
		
		txtthis_Home = new JTextField();
		txtthis_Home.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtthis_Home.setForeground(new Color(0, 102, 51));
		txtthis_Home.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtthis_Home.setColumns(10);
		txtthis_Home.setBorder(null);
		txtthis_Home.setBackground(Color.WHITE);
		txtthis_Home.setBounds(122, 12, 295, 20);
		panel_2_1_3_1_1_1.add(txtthis_Home);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 2, true));
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setBounds(35, 369, 447, 122);
		contentSubRegistration.add(panel_1_1_1);
		
		JPanel panel_2_1_3_1_2_1 = new JPanel();
		panel_2_1_3_1_2_1.setLayout(null);
		panel_2_1_3_1_2_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_2_1.setBackground(Color.WHITE);
		panel_2_1_3_1_2_1.setBounds(10, 11, 427, 38);
		panel_1_1_1.add(panel_2_1_3_1_2_1);
		
		JLabel lblChoiceOfDepartment = new JLabel("Department:");
		lblChoiceOfDepartment.setBackground(Color.WHITE);
		lblChoiceOfDepartment.setForeground(new Color(0, 102, 0));
		lblChoiceOfDepartment.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblChoiceOfDepartment.setBounds(10, 11, 87, 20);
		panel_2_1_3_1_2_1.add(lblChoiceOfDepartment);
		
		txtthis_Dep = new JTextField();
		txtthis_Dep.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtthis_Dep.setForeground(new Color(0, 102, 51));
		txtthis_Dep.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtthis_Dep.setColumns(10);
		txtthis_Dep.setBorder(null);
		txtthis_Dep.setBackground(Color.WHITE);
		txtthis_Dep.setBounds(107, 10, 301, 20);
		panel_2_1_3_1_2_1.add(txtthis_Dep);
		
		JPanel panel_2_1_3_1_1_1_1 = new JPanel();
		panel_2_1_3_1_1_1_1.setLayout(null);
		panel_2_1_3_1_1_1_1.setBorder(new LineBorder(new Color(0, 102, 0), 1, true));
		panel_2_1_3_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_3_1_1_1_1.setBounds(20, 60, 235, 38);
		panel_1_1_1.add(panel_2_1_3_1_1_1_1);
		
		JLabel lblYearSection = new JLabel("Year & Section: ");
		lblYearSection.setForeground(new Color(0, 102, 0));
		lblYearSection.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblYearSection.setBounds(10, 11, 103, 20);
		panel_2_1_3_1_1_1_1.add(lblYearSection);
		
		txtthis_YS = new JTextField();
		txtthis_YS.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtthis_YS.setForeground(new Color(0, 102, 51));
		txtthis_YS.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtthis_YS.setColumns(10);
		txtthis_YS.setBorder(null);
		txtthis_YS.setBackground(Color.WHITE);
		txtthis_YS.setBounds(110, 12, 115, 20);
		panel_2_1_3_1_1_1_1.add(txtthis_YS);
		
		JPanel pnlSearch = new JPanel();
		pnlSearch.setBorder(new LineBorder(new Color(60, 179, 113), 2, true));
		pnlSearch.setBounds(71, 51, 304, 50);
		add(pnlSearch);
		pnlSearch.setLayout(null);
		
		JLabel lblIconSearchv2 = new JLabel("");
		lblIconSearchv2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIconSearchv2.setBounds(338, 11, 37, 17);
		pnlSearch.add(lblIconSearchv2);
		lblIconSearchv2.setIcon(new ImageIcon(img_logoSearchv2));
		
		txtSearch = new JTextField();
		txtSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			
				
			}
				
		});
		txtSearch.setBackground(new Color(240, 240, 240));
		txtSearch.setText("Search id");
		txtSearch.setForeground(new Color(60, 179, 113));
		txtSearch.setColumns(10);
		txtSearch.setBorder(null);
		txtSearch.setBounds(10, 17, 201, 17);
		pnlSearch.add(txtSearch);
		
		JLabel lblIconSearch = new JLabel("New label");
		lblIconSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
			          
					String s = txtSearch. getText();

					pst = con.prepareStatement("select FirstName, MiddleName, LastName, Birthday, Contact, "
							+ " Home, Email, Department, YearSection from studentinfo_tbl where id=? ");
							
					pst.setString(1, s);
				                
					ResultSet rs = pst.executeQuery();

					if(rs.next()==true)
					{
				              
						String FirstN = rs.getString("FirstName");
						String MiddleN = rs.getString("MiddleName");
						String LastN =  rs.getString("LastName");
						String Birth = rs.getString("Birthday");
						String Cont = rs.getString("Contact");
						String Hom = rs.getString("Home");
						String Em = rs.getString("Email");
						String Dep = rs.getString("Department");
						String Ys = rs.getString("YearSection");
						
						txtthis_FirstN.setText(FirstN);
						txtthis_MiddleN.setText(MiddleN);
						txtthis_LastN.setText(LastN);
						//"MM/dd/yyyy"
						 java.util.Date date2 = new SimpleDateFormat("MM/dd/yyyy").parse(Birth);
						
						dateBirthday_1.setDate(date2);
						txtthis_Cont.setText(Cont);
						txtthis_Email.setText(Em);
						txtthis_Home.setText(Hom);
						txtthis_Dep.setText(Dep);
						txtthis_YS.setText(Ys);
				                
					}   
					else
					{
						txtthis_FirstN.setText("");
						txtthis_MiddleN.setText("");
						txtthis_LastN.setText("");
						dateBirthday_1.setDate(null);
						txtthis_Cont.setText("");
						txtthis_Email.setText("");
						txtthis_Home.setText("");
						txtthis_Dep.setText("");
						txtthis_YS.setText("");
				                 
					}
				            


				} 
					
			 catch (SQLException ex) {
				           
				} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		lblIconSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIconSearch.setBounds(234, 11, 46, 28);
		pnlSearch.add(lblIconSearch);
		lblIconSearch.setIcon(new ImageIcon(img_logoSearchv2));
		
		
		//Delete
		JPanel pnlBtnDelete = new JPanel();
		pnlBtnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlBtnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String s = txtSearch.getText();
				
				 try {
						pst = con.prepareStatement("delete from studentinfo_tbl where id =?");
				
			            pst.setString(1, s);
			            pst.executeUpdate();
			            JOptionPane.showMessageDialog(null, "Record Delete!!!!!");
			            table_load();
			            
			        	txtthis_FirstN.setText("");
						txtthis_MiddleN.setText("");
						txtthis_LastN.setText("");
						dateBirthday_1.setDate(null);
						txtthis_Cont.setText("");
						txtthis_Email.setText("");
						txtthis_Home.setText("");
						txtthis_Dep.setText("");
						txtthis_YS.setText("");
				        txtthis_FirstN.requestFocus();
			           
			           
					}
	 
		            catch (SQLException e1) {
						
						e1.printStackTrace();
					}
				
				
				
			}
				
			
			
		});
		pnlBtnDelete.setLayout(null);
		pnlBtnDelete.setToolTipText("Add to Database");
		pnlBtnDelete.setForeground(new Color(0, 128, 0));
		pnlBtnDelete.setBorder(new LineBorder(new Color(0, 128, 0), 1, true));
		pnlBtnDelete.setBackground(new Color(0, 128, 0));
		pnlBtnDelete.setBounds(527, 51, 100, 43);
		add(pnlBtnDelete);
		
		JLabel lblDelete = new JLabel("Delete");
		lblDelete.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelete.setForeground(Color.WHITE);
		lblDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDelete.setBackground(Color.WHITE);
		lblDelete.setBounds(24, 11, 53, 21);
		pnlBtnDelete.add(lblDelete);
		
		
		//Update or Edit
		JPanel pnlBtnEdit = new JPanel();
		pnlBtnEdit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlBtnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(txtSearch.getText().equals("") || txtSearch.getText().equals("Search id"))
				{
					JOptionPane.showMessageDialog(null, 
							"Input the id before to update the record ", "The id is blank",
							JOptionPane.WARNING_MESSAGE);
				}
				
				else
				{
					String FName, MName, LName, contact,dep, ySection, email, home;
					String birthdate = "" ;
					int resultAge = 0;
					FName = txtthis_FirstN.getText();
					MName = txtthis_MiddleN.getText();
					LName = txtthis_LastN.getText();
					contact = txtthis_Cont.getText();
					email = txtthis_Email.getText();
					home = txtthis_Home.getText();
					dep = txtthis_Dep.getText();
					ySection = txtthis_YS.getText();
					SimpleDateFormat formater = new SimpleDateFormat("MM/dd/yyyy");
					birthdate = formater.format(dateBirthday_1.getDate());
					String dob[] = birthdate.split("/");
					int dd = Integer.parseInt(dob[1]);
					int mm = Integer.parseInt(dob[0]);
					int yy = Integer.parseInt(dob[2]);
					//Using local date
					LocalDate selectedDate = LocalDate.of(yy, mm, dd);
					LocalDate currentDate = LocalDate.now();
					resultAge = Period.between(selectedDate, currentDate).getYears();
					
					String s = txtSearch.getText();
					
					try
					{
						pst = con.prepareStatement("update studentinfo_tbl set FirstName=?,MiddleName=?,LastName=?, Age=?,"
								+ "Birthday=?, Contact=?, Email=?, Home=?, Department=?, YearSection=? where id=?");
						pst.setString(1, FName);
						pst.setString(2, MName);
						pst.setString(3, LName);
						pst.setString(4, ""+resultAge);
						pst.setString(5, birthdate);
						pst.setString(6, contact);
						pst.setString(7, email);
						pst.setString(8, home);
						pst.setString(9, dep);
						pst.setString(10, ySection);
						pst.setString(11, s);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Record Update!");
						
						table_load();
								
						txtthis_FirstN.setText("");
						txtthis_MiddleN.setText("");
						txtthis_LastN.setText("");
						dateBirthday_1.setDate(null);
						txtthis_Cont.setText("");
						txtthis_Email.setText("");
						txtthis_Home.setText("");
						txtthis_Dep.setText("");
						txtthis_YS.setText("");
				        txtthis_FirstN.requestFocus();
					}
										
						
				
				 catch (SQLException ex1) 
					{
			           
			        }
				}
				
					
				
			          
			}	
		});
		pnlBtnEdit.setLayout(null);
		pnlBtnEdit.setToolTipText("Add to Database");
		pnlBtnEdit.setForeground(new Color(0, 128, 0));
		pnlBtnEdit.setBorder(new LineBorder(new Color(0, 128, 0), 1, true));
		pnlBtnEdit.setBackground(new Color(0, 128, 0));
		pnlBtnEdit.setBounds(681, 437, 100, 43);
		add(pnlBtnEdit);
		
		JLabel lblD = new JLabel("Update");
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setForeground(Color.WHITE);
		lblD.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblD.setBackground(Color.WHITE);
		lblD.setBounds(24, 11, 53, 21);
		pnlBtnEdit.add(lblD);
		
		JPanel pnlBtnRefresh = new JPanel();
		pnlBtnRefresh.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlBtnRefresh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				table_load();
			}
		});
		pnlBtnRefresh.setLayout(null);
		pnlBtnRefresh.setToolTipText("Add to Database");
		pnlBtnRefresh.setForeground(new Color(0, 128, 0));
		pnlBtnRefresh.setBorder(new LineBorder(new Color(0, 128, 0), 1, true));
		pnlBtnRefresh.setBackground(new Color(0, 128, 0));
		pnlBtnRefresh.setBounds(385, 51, 100, 43);
		add(pnlBtnRefresh);
		
		JLabel lblRefresh = new JLabel("Refresh");
		lblRefresh.setHorizontalAlignment(SwingConstants.CENTER);
		lblRefresh.setForeground(Color.WHITE);
		lblRefresh.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRefresh.setBackground(Color.WHITE);
		lblRefresh.setBounds(24, 11, 53, 21);
		pnlBtnRefresh.add(lblRefresh);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(33, 112, 725, 182);
		add(scrollPane_1);
		
		table = new JTable();
		table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
		scrollPane_1.setViewportView(table);
		
		
		txtSearch.addFocusListener(new FocusAdapter() 
		{
			@Override
			public void focusGained(FocusEvent e) 
			{
				if(txtSearch.getText().equals("Search name of student") )
				{
					txtSearch.setText("");
				}
				else
				{
					txtSearch.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) 
			{
				if(txtSearch.getText().equals(""))
				{
					txtSearch.setText("Search name of student");
				}
			}
		});
		
		lblIconSearchv2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}
		});
	}
	public void switchClicked(JPanel panel)
	{
		
		
		panel.setVisible(true);
	}
}
