package studentInfomation
import java.awt.BorderLayout
import java.awt.EventQueue
import java.awt.Image
import java.awt.Toolkit
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.border.EmptyBorder
import javax.swing.border.LineBorder
import java.awt.Color
import java.awt.Dimension
import javax.swing.JLabel
import javax.swing.JOptionPane
import java.awt.Font
import javax.swing.SwingConstants
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.awt.Panel
class StudentInformationDashboardGUI extends JFrame {
	Image img_logo=new ImageIcon(LogIn_AdminGUI.getResource("/resourceImage/student_information.png")).getImage().getScaledInstance(170, 125, Image.SCALE_SMOOTH)
	Image img_iconHome=new ImageIcon(LogIn_AdminGUI.getResource("/resourceImage/iconHome.png")).getImage().getScaledInstance(40, 25, Image.SCALE_SMOOTH)
	Image img_iconSearch=new ImageIcon(LogIn_AdminGUI.getResource("/resourceImage/searchIcon.png")).getImage().getScaledInstance(40, 20, Image.SCALE_SMOOTH)
	Image img_iconRegister=new ImageIcon(LogIn_AdminGUI.getResource("/resourceImage/iconRegister.png")).getImage().getScaledInstance(40, 25, Image.SCALE_SMOOTH)
	Image img_iconSignOut=new ImageIcon(LogIn_AdminGUI.getResource("/resourceImage/iconSignOut.png")).getImage().getScaledInstance(40, 25, Image.SCALE_SMOOTH)
	JPanel_Home pane_Home
	JPanel_Search pane_Search
	JPanel_Register pane_Register
	JPanel contentPane
	/** 
	 * Launch the application.
	 */
	def static void main(String[] args) {
		EventQueue.invokeLater([try {
			var StudentInformationDashboardGUI frame=new StudentInformationDashboardGUI() 
			frame.setVisible(true) 
		} catch (Exception e) {
			e.printStackTrace() 
		}
		]) 
	}
	/** 
	 * Create the frame.
	 */
	 new() {
		setUndecorated(true) 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) 
		setBounds(100, 100, 1000, 650) 
		contentPane=new JPanel() 
		contentPane.setBorder(new EmptyBorder(5,5,5,5)) 
		setContentPane(contentPane) 
		contentPane.setLayout(null) 
		var Dimension dim=Toolkit.getDefaultToolkit().getScreenSize() 
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2) 
		var JPanel panel_1=new JPanel() 
		panel_1.setBackground(new Color(102,102,204)) 
		panel_1.setBounds(169, 0, 831, 44) 
		contentPane.add(panel_1) 
		panel_1.setLayout(null) 
		pane_Home=new JPanel_Home() 
		pane_Home.setBounds(0, 0, 811, 584) 
		pane_Search=new JPanel_Search() 
		pane_Register=new JPanel_Register() 
		var JLabel lblNewLabel=new JLabel("X") 
		lblNewLabel.addMouseListener(new MouseAdapter(){
			override void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure do want to close?", "Confirmation", JOptionPane.YES_NO_OPTION) === 0) {
					StudentInformationDashboardGUI.this.dispose() 
				}
			}override void mouseEntered(MouseEvent e) {
				lblNewLabel.setForeground(Color.RED) 
			}override void mouseExited(MouseEvent e) {
				lblNewLabel.setForeground(Color.WHITE) 
			}}) 
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER) 
		lblNewLabel.setForeground(Color.WHITE) 
		lblNewLabel.setFont(new Font("Comic Sans MS",Font.BOLD,14)) 
		lblNewLabel.setBounds(811, 0, 20, 20) 
		panel_1.add(lblNewLabel) 
		var JPanel pnlMenu=new JPanel() 
		pnlMenu.setBorder(null) 
		pnlMenu.setBounds(0, 0, 170, 650) 
		contentPane.add(pnlMenu) 
		pnlMenu.setBackground(new Color(60,179,113)) 
		pnlMenu.setLayout(null) 
		var JPanel panelSignOut=new JPanel() 
		panelSignOut.addMouseListener(new MouseAdapter(){
			override void mouseEntered(MouseEvent e) {
				panelSignOut.setBackground(new Color(255,0,0)) 
			}override void mouseExited(MouseEvent e) {
				panelSignOut.setBackground(new Color(60,179,113)) 
			}override void mousePressed(MouseEvent e) {
				panelSignOut.setBackground(new Color(255,0,0)) 
			}override void mouseReleased(MouseEvent e) {
				panelSignOut.setBackground(new Color(60,179,113)) 
			}}) 
		panelSignOut.setLayout(null) 
		panelSignOut.setBorder(null) 
		panelSignOut.setBackground(new Color(60,179,113)) 
		panelSignOut.setBounds(0, 603, 170, 47) 
		pnlMenu.add(panelSignOut) 
		var JLabel lbl_iconSignOut=new JLabel("") 
		lbl_iconSignOut.setBounds(21, 11, 42, 25) 
		panelSignOut.add(lbl_iconSignOut) 
		lbl_iconSignOut.setIcon(new ImageIcon(img_iconSignOut)) 
		var JLabel lblNewLabel_1_1_1_1=new JLabel("Sign Out") 
		lblNewLabel_1_1_1_1.setToolTipText("") 
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER) 
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE) 
		lblNewLabel_1_1_1_1.setFont(new Font("Cooper Black",Font.PLAIN,14)) 
		lblNewLabel_1_1_1_1.setBounds(69, 11, 75, 25) 
		panelSignOut.add(lblNewLabel_1_1_1_1) 
		var JPanel panelRegister=new JPanel() 
		panelRegister.addMouseListener(new PanelButtonMouseAdapter(panelRegister){
			override void mouseClicked(MouseEvent e) {
				menuClicked(pane_Register) 
			}}) 
		panelRegister.setToolTipText("Add list of Student") 
		panelRegister.setBackground(new Color(60,179,113)) 
		panelRegister.setLayout(null) 
		panelRegister.setBorder(null) 
		panelRegister.setBounds(0, 222, 170, 47) 
		pnlMenu.add(panelRegister) 
		var JLabel lbl_iconRegister=new JLabel("") 
		lbl_iconRegister.setBounds(21, 11, 42, 25) 
		panelRegister.add(lbl_iconRegister) 
		lbl_iconRegister.setIcon(new ImageIcon(img_iconRegister)) 
		var JLabel lblNewLabel_1_1_1=new JLabel("Register") 
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER) 
		lblNewLabel_1_1_1.setForeground(Color.WHITE) 
		lblNewLabel_1_1_1.setFont(new Font("Cooper Black",Font.PLAIN,14)) 
		lblNewLabel_1_1_1.setBounds(63, 11, 75, 25) 
		panelRegister.add(lblNewLabel_1_1_1) 
		var JLabel lblIconStudentInfo=new JLabel("") 
		lblIconStudentInfo.setBounds(0, 0, 170, 125) 
		pnlMenu.add(lblIconStudentInfo) 
		lblIconStudentInfo.setIcon(new ImageIcon(img_logo)) 
		var JPanel panelSearch=new JPanel() 
		panelSearch.addMouseListener(new PanelButtonMouseAdapter(panelSearch){
			override void mouseClicked(MouseEvent e) {
				menuClicked(pane_Search) 
			}}) 
		panelSearch.setBackground(new Color(60,179,113)) 
		panelSearch.setLayout(null) 
		panelSearch.setBorder(null) 
		panelSearch.setBounds(0, 173, 170, 47) 
		pnlMenu.add(panelSearch) 
		var JLabel lbl_iconSearch=new JLabel("") 
		lbl_iconSearch.setBounds(20, 11, 43, 25) 
		panelSearch.add(lbl_iconSearch) 
		lbl_iconSearch.setIcon(new ImageIcon(img_iconSearch)) 
		var JLabel lblNewLabel_1_1=new JLabel("Search") 
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER) 
		lblNewLabel_1_1.setForeground(Color.WHITE) 
		lblNewLabel_1_1.setFont(new Font("Cooper Black",Font.PLAIN,14)) 
		lblNewLabel_1_1.setBounds(62, 11, 75, 25) 
		panelSearch.add(lblNewLabel_1_1) 
		var JPanel panelHome=new JPanel() 
		panelHome.addMouseListener(new PanelButtonMouseAdapter(panelHome){
			override void mouseClicked(MouseEvent e) {
				menuClicked(pane_Home) 
			}}) 
		panelHome.setBounds(0, 127, 170, 47) 
		pnlMenu.add(panelHome) 
		panelHome.setBackground(new Color(60,179,113)) 
		panelHome.setBorder(null) 
		panelHome.setLayout(null) 
		var JLabel lblNewLabel_1=new JLabel("Home") 
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER) 
		lblNewLabel_1.setFont(new Font("Cooper Black",Font.PLAIN,14)) 
		lblNewLabel_1.setForeground(new Color(255,255,255)) 
		lblNewLabel_1.setBounds(73, 11, 63, 25) 
		panelHome.add(lblNewLabel_1) 
		var JLabel lblIconHome=new JLabel("") 
		lblIconHome.setBounds(27, 11, 44, 25) 
		panelHome.add(lblIconHome) 
		lblIconHome.setIcon(new ImageIcon(img_iconHome)) 
		var JPanel panelMain=new JPanel() 
		panelMain.setBackground(new Color(128,128,128)) 
		panelMain.setBounds(179, 55, 811, 584) 
		contentPane.add(panelMain) 
		panelMain.setLayout(null) 
		panelMain.add(pane_Home) 
		panelMain.add(pane_Search) 
		panelMain.add(pane_Register) 
		menuClicked(pane_Home) 
	}
	def void menuClicked(JPanel panel) {
		pane_Home.setVisible(false) 
		pane_Search.setVisible(false) 
		pane_Register.setVisible(false) 
		panel.setVisible(true) 
	}
	/* FIXME Non-static inner classes are not supported.*/private class PanelButtonMouseAdapter extends MouseAdapter {
		package JPanel panel
		 new(JPanel panel) {
			this.panel=panel 
		}
		override void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(50,169,103)) 
		}
		override void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(60,179,113)) 
		}
		override void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(70,180,123)) 
		}
		override void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(60,179,113)) 
		}
	}
}