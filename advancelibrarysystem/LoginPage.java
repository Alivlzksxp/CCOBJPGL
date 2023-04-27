
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

public class LoginPage extends javax.swing.JFrame {
    
    public LoginPage() {
    
        JFrame jf = new JFrame("Login Page");
        
        JLabel wc = new JLabel("LIBRARY");
        wc.setBounds(40, 50, 550, 340);
        wc.setFont(new Font("Courier", Font.BOLD,58));
        jf.add(wc);
        
        //Left, Bottom, Scope, Top 
        JLabel wc1 = new JLabel("MANAGEMENT");  
        wc1.setBounds(40, 50, 700, 480);
        wc1.setFont(new Font("Courier", Font.BOLD,58));
        jf.add(wc1);
    
        JTextField backg = new JTextField("");
        backg.setBounds(0, 0, 500, 580);
        backg.setBackground(Color.CYAN);
        backg.setEditable(false);
        jf.add(backg);
        
        //Left, Bottom, Length, Size
        JButton adminbtn = new JButton("ADMIN");
        adminbtn.setBackground(Color.CYAN);
        adminbtn.setBounds(595, 170, 300, 70);
        jf.add(adminbtn);

        JButton libbtn = new JButton("LIBRARIAN");
        libbtn.setBackground(Color.CYAN);
        libbtn.setBounds(595, 255, 300, 70);
        jf.add(libbtn);

        adminbtn.addActionListener(new ActionListener() {
            @Override
            
        public void actionPerformed(ActionEvent e) {
            
            jf.dispose();
            new AdminLogin();
            
        }
    });
        
        libbtn.addActionListener(new ActionListener() {
            @Override
                
        public void actionPerformed(ActionEvent e)  {
            
            jf.dispose();
            new LibrarianLogin();
            
        }
    });

        jf.setSize(1000, 580);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
}
            
        public static void main(String[] args) {
            new LoginPage();
        }
    }