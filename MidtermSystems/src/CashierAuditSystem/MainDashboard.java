package CashierAuditSystem;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainDashboard extends javax.swing.JFrame{
	
	public MainDashboard() {
		
		JFrame mdframe = new JFrame("Dashboard");
		
		JLabel tf = new JLabel ("I dont know the content of the dashboard other than this");
		tf.setBounds(100, 100, 550, 140);
		mdframe.add(tf);
		
		JButton invoiceBtn = new JButton("INVOICE");
		invoiceBtn.setBounds(400, 200, 600, 60);
		invoiceBtn.setBackground(Color.CYAN);
		invoiceBtn.setFont(new Font("Times New Roman", Font.BOLD, 50));
		mdframe.add(invoiceBtn);
		
		JButton auditBtn = new JButton("AUDIT");
		auditBtn.setBounds(400, 300, 600, 60);
		auditBtn.setBackground(Color.CYAN);
		auditBtn.setFont(new Font("Times New Roman", Font.BOLD, 50));
		mdframe.add(auditBtn);
		
		JButton inventoryBtn = new JButton("INVENTORY");
		inventoryBtn.setBounds(400, 400, 600, 60);
		inventoryBtn.setBackground(Color.CYAN);
		inventoryBtn.setFont(new Font("Times New Roman", Font.BOLD, 50));
		mdframe.add(inventoryBtn);
		

	
	 mdframe.setSize(1360, 750);
	 mdframe.setLayout(null);
	 mdframe.setVisible(true);
	 mdframe.setResizable(false);
	 mdframe.setLocationRelativeTo(null);
}
         
     public static void main(String[] args) {
         new MainDashboard();
     }
 }
	
	

