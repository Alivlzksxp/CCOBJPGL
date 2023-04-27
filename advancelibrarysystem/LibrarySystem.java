
 package advancelibrarysystem;

    import java.awt.Color;
    import java.awt.Container;
    import java.awt.EventQueue;
    import java.awt.Font;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.awt.event.MouseAdapter;
    import java.awt.event.MouseEvent;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel; 
    import javax.swing.JOptionPane;
    import javax.swing.JTextField;
    import javax.swing.SwingConstants;


    public class LibrarySystem extends javax.swing.JFrame {

    	private JTextField bookTitle;

    	private JTextField nc1;
    	private JTextField nc2;
    	private JTextField nc3;

    	int b1Copies = 2;
    	int b2Copies = 3;
    	int b3Copies = 4;

    	static JButton book1 = new JButton();
    	static JButton book2 = new JButton();
    	static JButton book3 = new JButton();

    	static boolean b1 = false;
    	static boolean b2 = false;
    	static boolean b3 = false;
    	
    	private JButton btnRent;
    	private JButton btnLogout;

    	static boolean disposeFrame = false;

    	public static void main(String[] args) {

    		EventQueue.invokeLater(new Runnable() {
    			public void run() {
    				try {
    					LibrarySystem frame = new LibrarySystem();
    					frame.setVisible(true);
    				} catch (Exception e) {
    					e.printStackTrace();
    				}
    			}
    		});
    	}
    	
       public LibrarySystem () {

    	JFrame jf = new JFrame("");
    	jf.setSize(1000, 580);
    	jf.setLayout(null);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        
        Container contentPane = jf.getContentPane();
    	contentPane.setLayout(null);
   		jf.setContentPane(contentPane);
     	
		JLabel lbl_nm = new JLabel("List of Books");
		lbl_nm.setBounds(400, 30, 570, 100);
		lbl_nm.setFont(new Font("Times New Roman", Font.BOLD,35));
		jf.add(lbl_nm);
		         
   		JLabel ba = new JLabel("Book Author");
        	ba.setBounds(575, 100, 570, 100);
        	ba.setFont(new Font("Times New Roman", Font.BOLD,25));
        	jf.add(ba);
   		contentPane.add(ba);
   		
   		JLabel a1 = new JLabel("Gary B. Shelly");
   		a1.setBounds(585, 155, 570, 100);
   		a1.setFont(new Font("Times New Roman", Font.BOLD,20));
        	jf.add(a1);
   		contentPane.add(a1);
   		
   		JTextField tfa1 = new JTextField();
   		tfa1.setBounds(525, 180, 250, 50);
   		tfa1.setEditable(false);
   		tfa1.setBackground(Color.WHITE);
   		jf.add(tfa1);
   		
   		JLabel a2 = new JLabel("Corinne Hoisington");
   		a2.setBounds(565, 205, 570, 100);
   		a2.setFont(new Font("Times New Roman", Font.BOLD,20));
		jf.add(a2);
   		contentPane.add(a2);
   		
   		JTextField tfa2 = new JTextField();
   		tfa2.setBounds(525, 230, 250, 50);
   		tfa2.setEditable(false);
   		tfa2.setBackground(Color.WHITE);
   		jf.add(tfa2);

   		JLabel a3 = new JLabel("Rosauro E. Manuel");
   		a3.setBounds(565, 255, 570, 100);
   		a3.setFont(new Font("Times New Roman", Font.BOLD,20));
        	jf.add(a3);
   		contentPane.add(a3);
   		
   		JTextField tfa3 = new JTextField();
   		tfa3.setBounds(525, 280, 250, 50);
   		tfa3.setEditable(false);
   		tfa3.setBackground(Color.WHITE);
   		jf.add(tfa3);
   		
   		JLabel bn = new JLabel("Book Title");
        	bn.setBounds(250, 100, 570, 100);
        	bn.setFont(new Font("Times New Roman", Font.BOLD,25));
        	jf.add(bn);
   		contentPane.add(bn);

   		bookTitle = new JTextField();
   		bookTitle.addMouseListener(new MouseAdapter() {
   			@Override
   			public void mouseClicked(MouseEvent e) {
   			}
   		});

   		book1.setText("System Analysis and Design");
   		book1.setFont(new Font("Times New Roman", Font.BOLD,15));
   		book1.setHorizontalAlignment(SwingConstants.CENTER);
   		book1.setBounds(75, 180, 450, 50);
   		book1.setBackground(Color.WHITE);
   		contentPane.add(book1);
   		
   		book2.setText("Android Application");
   		book2.setFont(new Font("Times New Roman", Font.BOLD,15));
   		book2.setHorizontalAlignment(SwingConstants.CENTER);
   		book2.setBounds(75, 230, 450, 50);
   		book2.setBackground(Color.WHITE);
   		contentPane.add(book2);

   		book3.setText("Programming Concepts and Logic Formulation");
   		book3.setFont(new Font("Times New Roman", Font.BOLD,15));
   		book3.setHorizontalAlignment(SwingConstants.CENTER);
   		book3.setBounds(75, 280, 450, 50);
   		book3.setBackground(Color.WHITE);
   		contentPane.add(book3);

   		book1.addActionListener(e -> {
   			book1.setForeground(Color.RED);
   			book2.setForeground(Color.BLACK);
   			book3.setForeground(Color.BLACK);

   			b1 = true;
   			b2 = false;
   			b3 = false;
   		});

   		book2.addActionListener(e -> {
   			book2.setForeground(Color.RED);
   			book1.setForeground(Color.BLACK);
   			book3.setForeground(Color.BLACK);

   			b1 = false;
   			b2 = true;
   			b3 = false;
   		});

   		book3.addActionListener(e -> {
   			book3.setForeground(Color.RED);
   			book1.setForeground(Color.BLACK);
   			book2.setForeground(Color.BLACK);

   			b1 = false;
   			b2 = false;
   			b3 = true;
   		});

   		JLabel bc = new JLabel("Copies");
        	bc.setBounds(805, 100, 570, 100);
        	bc.setFont(new Font("Times New Roman", Font.BOLD,25));
        	jf.add(bc);
   		contentPane.add(bc);
   		
   		nc1 = new JTextField();
   		nc1.addMouseListener(new MouseAdapter() {
   			@Override
   			public void mouseClicked(MouseEvent e) {
   			}
   		});
   		nc1.setFont(new Font("Times New Roman", Font.BOLD, 20));
   		nc1.setHorizontalAlignment(SwingConstants.CENTER);
   		nc1.setText(Integer.toString(b1Copies));
   		nc1.setBounds(775, 180, 130, 50);
   		nc1.setEditable(false);
   		nc1.setBackground(Color.WHITE);
   		contentPane.add(nc1);
   		nc1.setColumns(10);

   		nc2 = new JTextField();
   		nc2.addMouseListener(new MouseAdapter() {
   			@Override
   			public void mouseClicked(MouseEvent e) {
   			}
   		});
   		nc2.setFont(new Font("Times New Roman", Font.BOLD, 20));
   		nc2.setHorizontalAlignment(SwingConstants.CENTER);
   		nc2.setText(Integer.toString(b2Copies));
   		nc2.setBounds(775, 230, 130, 50);
   		nc2.setEditable(false);
   		nc2.setBackground(Color.WHITE);
   		contentPane.add(nc2);
   		nc2.setColumns(10);

   		nc3 = new JTextField();
   		nc3.addMouseListener(new MouseAdapter() {
   			@Override
   			public void mouseClicked(MouseEvent e) {
   			}
   		});
   		nc3.setFont(new Font("Times New Roman", Font.BOLD, 20));
   		nc3.setText(Integer.toString(b3Copies));
   		nc3.setHorizontalAlignment(SwingConstants.CENTER);
   		nc3.setBounds(775, 280, 130, 50);
   		nc3.setEditable(false);
   		nc3.setBackground(Color.WHITE);
   		contentPane.add(nc3);
   		nc3.setColumns(10);

   		btnRent = new JButton("Rent");
   		btnRent.setFont(new Font("Times New Roman", Font.BOLD, 15));

   		btnRent.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {

   				if (b1Copies < 1) {
   					JOptionPane.showMessageDialog(null, "This Book Is Currently Out Of Stock, Please Try Again Another Time. Thank You!", "", JOptionPane.INFORMATION_MESSAGE);
   				} else if (b2Copies < 1) {
   					JOptionPane.showMessageDialog(null, "This Book Is Currently Out Of Stock, Please Try Again Another Time. Thank You!", "", JOptionPane.INFORMATION_MESSAGE);
   				} else if (b3Copies < 1) {
   					JOptionPane.showMessageDialog(null, "This Book Is Currently Out Of Stock, Please Try Again Another Time. Thank You!", "", JOptionPane.INFORMATION_MESSAGE);
   				}

   				if (b1 == false && b2 == false && b3 == false) {
   					JOptionPane.showMessageDialog(null, "Please Select a Book to Rent", "Select",
   							JOptionPane.INFORMATION_MESSAGE);
   				}

   				if (b1 && b1Copies >= 1) {
   					b1Copies -= 1;
   					nc1.setText(Integer.toString(b1Copies));
   					JOptionPane.showMessageDialog(null, "Book Rented Succesfully, Happy Reading!", "Success",
   							JOptionPane.INFORMATION_MESSAGE);
   					rentAgain();
   				} else if (b2 && b2Copies >= 1) {
   					b2Copies -= 1;
   					nc2.setText(Integer.toString(b2Copies));
   					JOptionPane.showMessageDialog(null, "Book Rented Succesfully, Happy Reading!", "Success",
   							JOptionPane.INFORMATION_MESSAGE);
   					rentAgain();
   				} else if (b3 && b3Copies >= 1) {
   					b3Copies -= 1;
   					nc3.setText(Integer.toString(b3Copies));
   					JOptionPane.showMessageDialog(null, "Book Rented Succesfully, Happy Reading!", "Success",
   							JOptionPane.INFORMATION_MESSAGE);
   					rentAgain();
   				}
   				if (disposeFrame) {
   					dispose();
   				}
   			}
   		});
   		btnRent.setBounds(390, 350, 230, 40);
   		btnRent.setBackground(Color.CYAN);
   		contentPane.add(btnRent);

   		btnLogout = new JButton("Logout");
   		btnLogout.setBounds(20, 20, 100, 40);
   		btnLogout.setBackground(Color.CYAN);
   		contentPane.add(btnLogout);
   		
   		btnLogout.addActionListener(new ActionListener() {
            @Override
        
        public void actionPerformed(ActionEvent e) {
            
            jf.dispose();
            new LibrarianLogin();

            }
        });
   	}

   	public static void rentAgain() {
   		int choice = JOptionPane.showConfirmDialog(null, "Do you want to rent a book again?", "Confirmation",
   				JOptionPane.YES_NO_OPTION);
   		if (choice == JOptionPane.YES_OPTION) {
   			book1.setForeground(Color.BLACK);
   			book2.setForeground(Color.BLACK);
   			book3.setForeground(Color.BLACK);

   			b1 = false;
   			b2 = false;
   			b3 = false;
   		}
   		}
   	}

   
  
          
        
    
                

