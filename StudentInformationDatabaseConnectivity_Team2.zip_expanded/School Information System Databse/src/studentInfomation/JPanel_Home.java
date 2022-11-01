package studentInfomation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.UIManager;


public class JPanel_Home extends JPanel
{

	/**
	 * Create the panel.
	 */
	
	private Image img_Cover = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/cover.jpg")).getImage().getScaledInstance(811,584,Image.SCALE_SMOOTH);
	private Image img_logo = new ImageIcon(LogIn_AdminGUI.class.getResource("/resourceImage/student_information.png")).getImage().getScaledInstance(281, 145,Image.SCALE_SMOOTH);
	
	
	public JPanel_Home()
	{
		setBorder(new LineBorder(new Color(60, 179, 113), 2));
		setBounds(0, 0 ,811, 584);
		setLayout(null);
		setVisible(true);
		setLayout(null);
        tickTock();
        
        JPanel panel = new JPanel();
        panel.setBounds(262, 341, 281, 145);
        add(panel);
        panel.setLayout(null);
        
        JLabel lblMainIcon = new JLabel("New label");
        lblMainIcon.setBounds(0, 0, 281, 145);
        panel.add(lblMainIcon);
        lblMainIcon.setIcon(new ImageIcon(img_logo));
        
        
        JLabel lblHomePic = new JLabel("");
        lblHomePic.setHorizontalAlignment(SwingConstants.CENTER);
        lblHomePic.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblHomePic.setForeground(new Color(0, 191, 255));
        lblHomePic.setBounds(0, 0, 811, 584);
        lblHomePic.setIcon(new ImageIcon(img_Cover));
        
        add(lblHomePic);

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
    }
}
