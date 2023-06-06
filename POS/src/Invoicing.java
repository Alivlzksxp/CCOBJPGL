
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aliyah Picante
 */
public class Invoicing extends javax.swing.JFrame {

    /**
     * Creates new form Invoicing
     */
    public Invoicing() {
        initComponents();
    }
    
    public void itemCost(){
        
        double sum = 0;
        
        for(int i = 0; i < tableview.getRowCount(); i++)
        {
            sum = sum + Double.parseDouble(tableview.getValueAt(i, 2).toString());
        }
        total.setText(Double.toString(sum));
        double ctotal = Double.parseDouble(total.getText());
       
        String itotal = String.format("P %.2f", ctotal);
        total.setText(itotal);
        
    }
    
    public void Change(){
        
        double sum = 0;
        double cash = Double.parseDouble(cdisplay.getText());
        
        for(int i = 0; i < tableview.getRowCount(); i++)
        {
            sum = sum + Double.parseDouble(tableview.getValueAt(i, 2).toString());
        }
        
        double cchange = (cash - sum);
        
        String changeGiven = String.format("P %.2f", cchange);
        changes.setText(changeGiven);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu2 = new javax.swing.JButton();
        menu1 = new javax.swing.JButton();
        menu16 = new javax.swing.JButton();
        menu4 = new javax.swing.JButton();
        menu3 = new javax.swing.JButton();
        menu5 = new javax.swing.JButton();
        menu9 = new javax.swing.JButton();
        menu13 = new javax.swing.JButton();
        menu6 = new javax.swing.JButton();
        menu7 = new javax.swing.JButton();
        menu8 = new javax.swing.JButton();
        menu12 = new javax.swing.JButton();
        menu11 = new javax.swing.JButton();
        menu10 = new javax.swing.JButton();
        menu14 = new javax.swing.JButton();
        menu15 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableview = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        paymentMethod = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cdisplay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        changes = new javax.swing.JTextField();
        btnPay = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnreceipt = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rp = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1355, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });
        jPanel1.add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 130, 110));

        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });
        jPanel1.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 110));

        menu16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu16ActionPerformed(evt);
            }
        });
        jPanel1.add(menu16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 130, 110));

        menu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu4ActionPerformed(evt);
            }
        });
        jPanel1.add(menu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 130, 110));

        menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu3ActionPerformed(evt);
            }
        });
        jPanel1.add(menu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 130, 110));

        menu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu5ActionPerformed(evt);
            }
        });
        jPanel1.add(menu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 130, 110));

        menu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu9ActionPerformed(evt);
            }
        });
        jPanel1.add(menu9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 130, 110));

        menu13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu13ActionPerformed(evt);
            }
        });
        jPanel1.add(menu13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 130, 110));

        menu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu6ActionPerformed(evt);
            }
        });
        jPanel1.add(menu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 110));

        menu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu7ActionPerformed(evt);
            }
        });
        jPanel1.add(menu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 130, 110));

        menu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu8ActionPerformed(evt);
            }
        });
        jPanel1.add(menu8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 130, 110));

        menu12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu12ActionPerformed(evt);
            }
        });
        jPanel1.add(menu12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 130, 110));

        menu11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu11ActionPerformed(evt);
            }
        });
        jPanel1.add(menu11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 130, 110));

        menu10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu10ActionPerformed(evt);
            }
        });
        jPanel1.add(menu10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 130, 110));

        menu14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu14ActionPerformed(evt);
            }
        });
        jPanel1.add(menu14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 130, 110));

        menu15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu15ActionPerformed(evt);
            }
        });
        jPanel1.add(menu15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 130, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 730, 690));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 100, 110));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, 110));

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 100, 110));

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 100, 110));

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, 110));

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 100, 110));

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 100, 110));

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 110));

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 100, 110));

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 100, 110));

        btndot.setText(".");
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });
        jPanel2.add(btndot, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 100, 110));

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel2.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 100, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 510));

        tableview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Qty", "Amount"
            }
        ));
        jScrollPane1.setViewportView(tableview);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 230, 250));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Total");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        total.setEditable(false);
        jPanel5.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("<html>Payment  Method</html>");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 30));

        paymentMethod.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        paymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Gcash" }));
        jPanel5.add(paymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 170, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Cash");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, 40));

        cdisplay.setEditable(false);
        jPanel5.add(cdisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 150, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Change");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 30));

        changes.setEditable(false);
        jPanel5.add(changes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 150, 30));

        btnPay.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnPay.setText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        jPanel5.add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 140, 30));

        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel5.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 140, 30));

        btnRemove.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel5.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 140, 30));

        btnreceipt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnreceipt.setText("Receipt");
        btnreceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreceiptActionPerformed(evt);
            }
        });
        jPanel5.add(btnreceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 140, 30));

        btnExit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel5.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 140, 30));

        btnPrint.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel5.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 140, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 580, 170));

        rp.setColumns(20);
        rp.setRows(5);
        jScrollPane2.setViewportView(rp);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 230, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        
        cdisplay.setText("");
        changes.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        
        String enterNumber = cdisplay.getText();
        
        if (enterNumber == "")
        {
            cdisplay.setText(btn0.getText());
        }
        else
        {
            enterNumber = cdisplay.getText() + btn0.getText();
            cdisplay.setText(enterNumber);
        }
        
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       
        String enterNumber = cdisplay.getText();
        
        if (enterNumber == "")
        {
            cdisplay.setText(btn1.getText());
        }
        else
        {
            enterNumber = cdisplay.getText() + btn1.getText();
            cdisplay.setText(enterNumber);
        }
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        
        String enterNumber = cdisplay.getText();
        
        if (enterNumber == "")
        {
            cdisplay.setText(btn4.getText());
        }
        else
        {
            enterNumber = cdisplay.getText() + btn4.getText();
            cdisplay.setText(enterNumber);
        }
        
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        
        String enterNumber = cdisplay.getText();
        
        if (enterNumber == "")
        {
            cdisplay.setText(btn7.getText());
        }
        else
        {
            enterNumber = cdisplay.getText() + btn7.getText();
            cdisplay.setText(enterNumber);
        }
        
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        
        String enterNumber = cdisplay.getText();
        
        if (enterNumber == "")
        {
            cdisplay.setText(btn8.getText());
        }
        else
        {
            enterNumber = cdisplay.getText() + btn8.getText();
            cdisplay.setText(enterNumber);
        }
        
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        
        String enterNumber = cdisplay.getText();
        
        if (enterNumber == "")
        {
            cdisplay.setText(btn5.getText());
        }
        else
        {
            enterNumber = cdisplay.getText() + btn5.getText();
            cdisplay.setText(enterNumber);
        }
        
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       
        String enterNumber = cdisplay.getText();
        
        if (enterNumber == "")
        {
            cdisplay.setText(btn6.getText());
        }
        else
        {
            enterNumber = cdisplay.getText() + btn6.getText();
            cdisplay.setText(enterNumber);
        }
        
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        
        String enterNumber = cdisplay.getText();
        
        if (enterNumber == "")
        {
            cdisplay.setText(btn3.getText());
        }
        else
        {
            enterNumber = cdisplay.getText() + btn3.getText();
            cdisplay.setText(enterNumber);
        }
        
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        
        String enterNumber = cdisplay.getText();
        
        if (enterNumber == "")
        {
            cdisplay.setText(btn2.getText());
        }
        else
        {
            enterNumber = cdisplay.getText() + btn2.getText();
            cdisplay.setText(enterNumber);
        }
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        
        if(! cdisplay.getText().contains("."))
        {
            cdisplay.setText(cdisplay.getText() + btndot.getText());
        }
        
    }//GEN-LAST:event_btndotActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        
        String enterNumber = cdisplay.getText();
        
        if (enterNumber == "")
        {
            cdisplay.setText(btn9.getText());
        }
        else
        {
            enterNumber = cdisplay.getText() + btn9.getText();
            cdisplay.setText(enterNumber);
        }
        
    }//GEN-LAST:event_btn9ActionPerformed

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        
        double priceofItem = 250;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu2", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu2ActionPerformed

    private void menu16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu16ActionPerformed
        
        double priceofItem = 150;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu6", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu16ActionPerformed

    private void menu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu4ActionPerformed
       
        double priceofItem = 50;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu4", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu4ActionPerformed

    private void menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu3ActionPerformed
        
        double priceofItem = 250;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu3", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu3ActionPerformed

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
       
        double priceofItem = 150;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu1", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu1ActionPerformed

    private void menu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu5ActionPerformed
        
        double priceofItem = 300;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu5", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu5ActionPerformed

    private void menu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu9ActionPerformed
        
        double priceofItem = 99.9;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu9", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu9ActionPerformed

    private void menu13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu13ActionPerformed
        
        double priceofItem = 150;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu13", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu13ActionPerformed

    private void menu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu6ActionPerformed
        
        double priceofItem = 390;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu6", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu6ActionPerformed

    private void menu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu7ActionPerformed
        
        double priceofItem = 99;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu7", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu7ActionPerformed

    private void menu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu8ActionPerformed
        
        double priceofItem = 85;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu8", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu8ActionPerformed

    private void menu12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu12ActionPerformed
        
        double priceofItem = 150;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu12", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu12ActionPerformed

    private void menu11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu11ActionPerformed
           
        double priceofItem = 75;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu11", "i", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu11ActionPerformed

    private void menu10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu10ActionPerformed
        
        double priceofItem = 350;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu10", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu10ActionPerformed

    private void menu14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu14ActionPerformed
        
        double priceofItem = 399;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu4", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu14ActionPerformed

    private void menu15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu15ActionPerformed
        
        double priceofItem = 150;
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.addRow(new Object[]{"Menu5", "1", priceofItem});
        itemCost();
        
    }//GEN-LAST:event_menu15ActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        
        if(paymentMethod.getSelectedItem().equals("Cash"))
        {
            Change();
        }
        else
        {
            changes.setText("");
            cdisplay.setText("");
        }
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        model.setRowCount(0);
        changes.setText("");
        total.setText("");
        cdisplay.setText("");
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnreceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreceiptActionPerformed
  
        try {
            
            rp.setText("                         Jess & Pats \n");
            rp.setText(rp.getText() + "  f, 2, 63 Maginhawa, Quezon City, 1101, \n");
            rp.setText(rp.getText() + "                         Metro Manila, \n");
            rp.setText(rp.getText() + "                   (+63) 916 625 5771, \n");
            rp.setText(rp.getText() + "-------------------------------------------------------------------------\n");
            rp.setText(rp.getText() + "  Item \t\tQty \tPrice" +"\n");
            rp.setText(rp.getText() + "-------------------------------------------------------------------------\n");
            
            DefaultTableModel model = (DefaultTableModel) tableview.getModel();
            
            // get table Product details
            
            for (int i = 0; i < tableview.getRowCount(); i++) {
                
                String Name = model.getValueAt(i, 0).toString();
                String Qty = model.getValueAt(i, 1).toString();
                String Price = model.getValueAt(i, 2).toString();
                
                rp.setText(rp.getText() +"  "+ Name+"\t\t"+Qty +"\t"+Price + "\n");
            }
            
            rp.setText(rp.getText() + "-------------------------------------------------------------------------\n");
            rp.setText(rp.getText() + "Total : " + total.getText() +"\n");
            rp.setText(rp.getText() + "Cash      : " + cdisplay.getText() +"\n");
            rp.setText(rp.getText() + "Change   : " + changes.getText() +"\n");
            rp.setText(rp.getText() + "-------------------------------------------------------------------------\n");
            rp.setText(rp.getText() + "                     Thanks For Your Business...!"+"\n");
            rp.setText(rp.getText() + "-------------------------------------------------------------------------\n");
            
           
        } catch (Exception e) {
            
            System.out.println(e);
            
            
        }
    }//GEN-LAST:event_btnreceiptActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) tableview.getModel();
        
        int removeItem = tableview.getSelectedRow();
        
        if(removeItem >= 0)
        {
            model.removeRow(removeItem);
        }
        
        itemCost();
        
        if(paymentMethod.getSelectedItem().equals("Cash"))
        {
            Change();
        }
        else
        {
            changes.setText("");
            cdisplay.setText("");
        }
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private JFrame frame;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Point of Sale", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
       
          
        try
        {
            rp.print();
        }
        
        catch(Exception e)
        {
            System.err.format("No Printer Found", e.getMessage());
        }
                         
    }//GEN-LAST:event_btnPrintActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Invoicing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoicing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoicing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoicing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoicing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btnreceipt;
    private javax.swing.JTextField cdisplay;
    private javax.swing.JTextField changes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton menu1;
    private javax.swing.JButton menu10;
    private javax.swing.JButton menu11;
    private javax.swing.JButton menu12;
    private javax.swing.JButton menu13;
    private javax.swing.JButton menu14;
    private javax.swing.JButton menu15;
    private javax.swing.JButton menu16;
    private javax.swing.JButton menu2;
    private javax.swing.JButton menu3;
    private javax.swing.JButton menu4;
    private javax.swing.JButton menu5;
    private javax.swing.JButton menu6;
    private javax.swing.JButton menu7;
    private javax.swing.JButton menu8;
    private javax.swing.JButton menu9;
    private javax.swing.JComboBox<String> paymentMethod;
    private javax.swing.JTextArea rp;
    private javax.swing.JTable tableview;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}