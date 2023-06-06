/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

/**
 *
 * @author Aliyah Picante
 */
public class myWork extends javax.swing.JFrame {

    /** Creates new form myWork */
    public myWork() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        forBtns = new javax.swing.JPanel();
        Home = new javax.swing.JButton();
        aboutMe = new javax.swing.JButton();
        contacts = new javax.swing.JButton();
        forworkBtn = new javax.swing.JPanel();
        vetBtn = new javax.swing.JButton();
        forworkBtn1 = new javax.swing.JPanel();
        studentBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forBtns.setOpaque(false);

        Home.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("Home");
        Home.setContentAreaFilled(false);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        aboutMe.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        aboutMe.setForeground(new java.awt.Color(255, 255, 255));
        aboutMe.setText("About Me");
        aboutMe.setContentAreaFilled(false);
        aboutMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMeActionPerformed(evt);
            }
        });

        contacts.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        contacts.setForeground(new java.awt.Color(255, 255, 255));
        contacts.setText("Contacts");
        contacts.setContentAreaFilled(false);
        contacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forBtnsLayout = new javax.swing.GroupLayout(forBtns);
        forBtns.setLayout(forBtnsLayout);
        forBtnsLayout.setHorizontalGroup(
            forBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forBtnsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aboutMe, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contacts)
                .addContainerGap())
        );
        forBtnsLayout.setVerticalGroup(
            forBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forBtnsLayout.createSequentialGroup()
                .addGroup(forBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contacts, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutMe, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(forBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 320, 50));

        forworkBtn.setBackground(new java.awt.Color(255, 255, 153));

        vetBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        vetBtn.setForeground(new java.awt.Color(51, 51, 51));
        vetBtn.setText("Veterinary Clinic Management System");
        vetBtn.setContentAreaFilled(false);
        vetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forworkBtnLayout = new javax.swing.GroupLayout(forworkBtn);
        forworkBtn.setLayout(forworkBtnLayout);
        forworkBtnLayout.setHorizontalGroup(
            forworkBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vetBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        forworkBtnLayout.setVerticalGroup(
            forworkBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(forworkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 500, 40));

        forworkBtn1.setBackground(new java.awt.Color(255, 255, 153));

        studentBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        studentBtn.setForeground(new java.awt.Color(51, 51, 51));
        studentBtn.setText("Student Result Management System");
        studentBtn.setContentAreaFilled(false);
        studentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forworkBtn1Layout = new javax.swing.GroupLayout(forworkBtn1);
        forworkBtn1.setLayout(forworkBtn1Layout);
        forworkBtn1Layout.setHorizontalGroup(
            forworkBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        forworkBtn1Layout.setVerticalGroup(
            forworkBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(forworkBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 500, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/PrevWorks.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Methods for the buttons
    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        dispose();
        Homepage Homepage = new Homepage();
        Homepage.setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void aboutMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMeActionPerformed
        dispose();
        AboutMe AboutMe = new AboutMe();
        AboutMe.setVisible(true);
    }//GEN-LAST:event_aboutMeActionPerformed

    private void contactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactsActionPerformed
        dispose();
        contacts contacts = new contacts();
        contacts.setVisible(true);
    }//GEN-LAST:event_contactsActionPerformed

    private void vetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetBtnActionPerformed
        dispose();
        vetWork vetWork = new vetWork();
        vetWork.setVisible(true);
    }//GEN-LAST:event_vetBtnActionPerformed

    private void studentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentBtnActionPerformed
        dispose();
        studWork studWork = new studWork();
        studWork.setVisible(true);
    }//GEN-LAST:event_studentBtnActionPerformed

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
            java.util.logging.Logger.getLogger(myWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myWork().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JButton aboutMe;
    private javax.swing.JButton contacts;
    private javax.swing.JPanel forBtns;
    private javax.swing.JPanel forworkBtn;
    private javax.swing.JPanel forworkBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton studentBtn;
    private javax.swing.JButton vetBtn;
    // End of variables declaration//GEN-END:variables

}