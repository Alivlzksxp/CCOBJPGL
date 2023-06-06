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
public class vetWork extends javax.swing.JFrame {

    /**
     * Creates new form vetWork
     */
    public vetWork() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        forbackBtn = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        forBtns = new javax.swing.JPanel();
        Home = new javax.swing.JButton();
        aboutMe = new javax.swing.JButton();
        contacts = new javax.swing.JButton();
        forVet = new javax.swing.JScrollPane();
        vetBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forbackBtn.setBackground(new java.awt.Color(153, 102, 0));

        backBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.setContentAreaFilled(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forbackBtnLayout = new javax.swing.GroupLayout(forbackBtn);
        forbackBtn.setLayout(forbackBtnLayout);
        forbackBtnLayout.setHorizontalGroup(
            forbackBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        forbackBtnLayout.setVerticalGroup(
            forbackBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(forbackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 50));

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

        forVet.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        forVet.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        forVet.setPreferredSize(new java.awt.Dimension(1187, 700));

        vetBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/Work1.png"))); // NOI18N
        forVet.setViewportView(vetBG);

        jPanel1.add(forVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
        myWork work = new myWork();
        work.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(vetWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vetWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vetWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vetWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vetWork().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JButton aboutMe;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton contacts;
    private javax.swing.JPanel forBtns;
    private javax.swing.JScrollPane forVet;
    private javax.swing.JPanel forbackBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel vetBG;
    // End of variables declaration//GEN-END:variables
}
