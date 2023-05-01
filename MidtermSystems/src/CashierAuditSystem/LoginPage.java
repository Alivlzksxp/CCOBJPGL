
package CashierAuditSystem;

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

public class LoginPage extends javax.swing.JFrame {
    
    public LoginPage() {
    
        JFrame jf = new JFrame("Login Page");
        
        //Left, Bottom, Scope, Top 
        JLabel lbl_st = new JLabel("Login");
        lbl_st.setBounds(390, 100, 550, 140);
        lbl_st.setFont(new Font("Times New Roman", Font.BOLD,50));
        jf.add(lbl_st); 
        
        JLabel lb1 = new JLabel("Username");
        lb1.setBounds(300, 120, 150, 200);
        jf.add(lb1);
        
        //Left, Top, Width
        JTextField txtUser = new JTextField("");
        txtUser.setBounds(300, 240, 300, 40);
        txtUser.setBackground(Color.WHITE);
        jf.add(txtUser);

        JLabel lb2 = new JLabel("Password");
        lb2.setBounds(300, 120, 150, 370);
        jf.add(lb2);
       
        JPasswordField txtPass = new JPasswordField("");
        txtPass.setBounds(300, 325, 300, 40);
        jf.add(txtPass);
        
        //Left, Bottom, Length, Size
        JButton loginbtn = new JButton("LOGIN");
        loginbtn.setBackground(Color.CYAN);
        loginbtn.setBounds(300, 390, 300, 40);
        jf.add(loginbtn);
        
        //always on top of JTextField
        JLabel st = new JLabel("Title of the System");
        st.setBounds(950, 100, 500, 480);
        st.setFont(new Font("Times New Roman", Font.BOLD,30));
        jf.add(st);
        
        JLabel st1 = new JLabel("Icon/Logo Here");
        st1.setBounds(950, 130, 500, 480);
        st1.setFont(new Font("Times New Roman", Font.BOLD,30));
        jf.add(st1);
        
        //Left, Top, Width, Length
        JTextField backg = new JTextField("");
        backg.setBounds(900, 0, 750, 750);
        backg.setBackground(Color.CYAN);
        backg.setEditable(false);
        jf.add(backg);
        
        

        loginbtn.addActionListener(new ActionListener() {
            @Override
            
        public void actionPerformed(ActionEvent e) {
            
            	String UserName = txtUser.getText();
                String Password = txtPass.getText();
                
                if (UserName.equals("admin01") & Password.equals("admin01")) {
                    JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGIN");
                    jf.dispose();
                    new MainDashboard();
                }
                else if(!(UserName.equals("admin01")) && Password.equals("admin01"))
    			{
    				    
                	JOptionPane.showMessageDialog(null,"Incorrect Username","Error",JOptionPane.ERROR_MESSAGE);
    			}
    			else if(UserName.equals("admin01") && !(Password.equals("admin01"))) 
    			{	
    				JOptionPane.showMessageDialog(null,"Incorrect Password","Error",JOptionPane.ERROR_MESSAGE);
    				
    			}
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Username or password","Error",JOptionPane.ERROR_MESSAGE);
            }
                
    }
               
            });
            
        
        jf.setSize(1360, 750);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
}
            
        public static void main(String[] args) {
            new LoginPage();
        }
    }