
 package advancelibrarysystem;

    import java.awt.Color;
    import java.awt.Font;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    
    public class AdminWelcome extends javax.swing.JFrame {
            
       public AdminWelcome () {
           
        JFrame jf = new JFrame("");
        
        JLabel lbl_st = new JLabel("Welcome to");
        lbl_st.setBounds(365, 50, 1000, 340);
        lbl_st.setFont(new Font("Courier", Font.BOLD,50));
        jf.add(lbl_st);
        
        JLabel lbl_st1 = new JLabel("NU Library System");
        lbl_st1.setBounds(275, 50, 1000, 440);
        lbl_st1.setFont(new Font("Courier", Font.BOLD,50));
        jf.add(lbl_st1);
      
        JButton btn = new JButton("LOGOUT");
        btn.setBackground(Color.CYAN);
        btn.setBounds(352, 330, 300, 40);
        jf.add(btn);
        
        btn.addActionListener(new ActionListener() {
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
            new AdminWelcome();
        }
    }
                

