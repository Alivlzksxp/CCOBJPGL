
package advancelibrarysystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogin extends javax.swing.JFrame {
    
    public AdminLogin() {
    
        JFrame jf = new JFrame("Admin Login Page");
        
        JLabel wc = new JLabel("Login as");
        wc.setBounds(140, 50, 550, 340);
        wc.setFont(new Font("Courier", Font.BOLD,58));
        jf.add(wc);
        
        JLabel wc1 = new JLabel("an Admin");
        wc1.setBounds(125, 50, 700, 480);
        wc1.setFont(new Font("Courier", Font.BOLD,58));
        jf.add(wc1);
    
        JButton back = new JButton("BACK");
        back.setBackground(Color.WHITE);
        back.setBounds(20, 20, 100, 40);
        jf.add(back);
        
        JTextField backg = new JTextField("");
        backg.setBounds(0, 0, 500, 580);
        backg.setBackground(Color.CYAN);
        backg.setEditable(false);
        jf.add(backg);
        
        JLabel lbl_st = new JLabel("Login");
        lbl_st.setBounds(705, 50, 550, 140);
        lbl_st.setFont(new Font("Courier", Font.BOLD,30));
        jf.add(lbl_st);
        
        JLabel lb1 = new JLabel("Username");
        lb1.setBounds(595, 50, 150, 200);
        jf.add(lb1);
        
        JTextField txtUser = new JTextField("");
        txtUser.setBounds(595, 170, 300, 40);
        txtUser.setBackground(Color.WHITE);
        jf.add(txtUser);

        JLabel lb2 = new JLabel("Password");
        lb2.setBounds(595, 50, 150, 370);
        jf.add(lb2);
       
        JPasswordField txtPass = new JPasswordField("");
        txtPass.setBounds(595, 255, 300, 40);
        jf.add(txtPass);

        JButton btn = new JButton("LOGIN");
        btn.setBackground(Color.CYAN);
        btn.setBounds(595, 340, 300, 40);
        jf.add(btn);
        
        
        
        btn.addActionListener(new ActionListener() {
            @Override
            
        public void actionPerformed(ActionEvent e) {
            
            String UserName = txtUser.getText();
            String Password = txtPass.getText();
            
            if (UserName.equals("Admin_01") & Password.equals("AdminOne")) {
                JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGIN");
                jf.dispose();
                new AdminWelcome();
            }
            else if (UserName.equals("Admin_02") & Password.equals("AdminTwo")) {
                JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGIN");
                jf.dispose();
                new AdminWelcome();
            }
            else if (UserName.equals("Admin_03") & Password.equals("AdminThree")) {
                JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGIN");
                jf.dispose();
                new AdminWelcome();
            }
            else if(!(UserName.equals("Admin_01")) && Password.equals("AdminOne") ||
				    !(UserName.equals("Admin_02")) && Password.equals("AdminTwo") ||
				    !(UserName.equals("Admin_03")) && Password.equals("AdminThree")) 
			{
				    
            	JOptionPane.showMessageDialog(null,"Incorrect Username","Error",JOptionPane.ERROR_MESSAGE);
			}
			else if(UserName.equals("Admin_01") && !(Password.equals("AdminOne")) ||
					UserName.equals("Admin_02") && !(Password.equals("AdminTwo")) ||
					UserName.equals("Admin_03") && !(Password.equals("AdminThree"))) 
			{	
				JOptionPane.showMessageDialog(null,"Incorrect Password","Error",JOptionPane.ERROR_MESSAGE);
				
			}
            else{
                JOptionPane.showMessageDialog(null,"Incorrect Username or password","Error",JOptionPane.ERROR_MESSAGE);
        }
            
}
           
        });
        
        back.addActionListener(new ActionListener() {
            @Override
            
        public void actionPerformed(ActionEvent e) {
            
            jf.dispose();
                new LoginPage();
                
        }
        });
     
        jf.setSize(1000, 580);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
}
            
        public static void main(String[] args) {
            new AdminLogin();
        }
    }