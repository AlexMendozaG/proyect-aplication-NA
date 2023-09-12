/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nacionaudiovisual.gui;

import java.awt.Color;

/**
 *
 * @author alexa
 */
public class main_login extends javax.swing.JFrame {

    /**
     * Creates new form main_login
     */
    int xMouse, yMouse;
    public main_login() {
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

        backgroundPanel = new javax.swing.JPanel();
        btnLoginTeacher = new javax.swing.JPanel();
        lbLoTeacher = new javax.swing.JLabel();
        btnLoginUstudent = new javax.swing.JPanel();
        lbLoStudent = new javax.swing.JLabel();
        btnRegister = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        coperyng = new javax.swing.JLabel();
        academy = new javax.swing.JLabel();
        backgrpund = new javax.swing.JLabel();
        Scrollbar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLoginTeacher.setBackground(new java.awt.Color(255, 129, 95));
        btnLoginTeacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginTeacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginTeacherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginTeacherMouseExited(evt);
            }
        });

        lbLoTeacher.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbLoTeacher.setForeground(new java.awt.Color(255, 255, 255));
        lbLoTeacher.setText(" Login Teacher");

        javax.swing.GroupLayout btnLoginTeacherLayout = new javax.swing.GroupLayout(btnLoginTeacher);
        btnLoginTeacher.setLayout(btnLoginTeacherLayout);
        btnLoginTeacherLayout.setHorizontalGroup(
            btnLoginTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLoTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnLoginTeacherLayout.setVerticalGroup(
            btnLoginTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLoTeacher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        backgroundPanel.add(btnLoginTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 130, 40));

        btnLoginUstudent.setBackground(new java.awt.Color(4, 80, 102));
        btnLoginUstudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginUstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginUstudentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginUstudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginUstudentMouseExited(evt);
            }
        });

        lbLoStudent.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbLoStudent.setForeground(new java.awt.Color(255, 255, 255));
        lbLoStudent.setText("  Login Student");

        javax.swing.GroupLayout btnLoginUstudentLayout = new javax.swing.GroupLayout(btnLoginUstudent);
        btnLoginUstudent.setLayout(btnLoginUstudentLayout);
        btnLoginUstudentLayout.setHorizontalGroup(
            btnLoginUstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLoStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnLoginUstudentLayout.setVerticalGroup(
            btnLoginUstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLoStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        backgroundPanel.add(btnLoginUstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 130, 40));

        btnRegister.setBackground(new java.awt.Color(4, 80, 102));
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegisterMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("       Register whith us");

        javax.swing.GroupLayout btnRegisterLayout = new javax.swing.GroupLayout(btnRegister);
        btnRegister.setLayout(btnRegisterLayout);
        btnRegisterLayout.setHorizontalGroup(
            btnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
            .addGroup(btnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegisterLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        btnRegisterLayout.setVerticalGroup(
            btnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(btnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegisterLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        backgroundPanel.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 170, 40));

        btnExit.setBackground(new java.awt.Color(36, 34, 86));

        exit.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        backgroundPanel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        coperyng.setForeground(new java.awt.Color(255, 255, 255));
        coperyng.setText("@Coperyng 2023");
        backgroundPanel.add(coperyng, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, -1, -1));

        academy.setForeground(new java.awt.Color(255, 255, 255));
        academy.setText("Academy Nacion Audiovisual");
        backgroundPanel.add(academy, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        backgrpund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nacionaudiovisual/imagesBackground/login_main_1.png"))); // NOI18N
        backgroundPanel.add(backgrpund, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        Scrollbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ScrollbarMouseDragged(evt);
            }
        });
        Scrollbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ScrollbarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ScrollbarLayout = new javax.swing.GroupLayout(Scrollbar);
        Scrollbar.setLayout(ScrollbarLayout);
        ScrollbarLayout.setHorizontalGroup(
            ScrollbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        ScrollbarLayout.setVerticalGroup(
            ScrollbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        backgroundPanel.add(Scrollbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginUstudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginUstudentMouseEntered
        
        btnLoginUstudent.setBackground(new Color(130,187,215));
    }//GEN-LAST:event_btnLoginUstudentMouseEntered

    private void btnLoginUstudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginUstudentMouseExited
        
        btnLoginUstudent.setBackground(new Color(4,80,102));
    }//GEN-LAST:event_btnLoginUstudentMouseExited

    private void btnLoginTeacherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginTeacherMouseEntered
        btnLoginTeacher.setBackground(new Color(130,187,215));
    }//GEN-LAST:event_btnLoginTeacherMouseEntered

    private void btnLoginTeacherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginTeacherMouseExited
        btnLoginTeacher.setBackground(new Color(255,129,95));
    }//GEN-LAST:event_btnLoginTeacherMouseExited

    private void ScrollbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollbarMousePressed
        //in order to selected scrollbar with to click
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_ScrollbarMousePressed

    private void ScrollbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollbarMouseDragged
        //in order to move the bar
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_ScrollbarMouseDragged

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered

        exit.setForeground(Color.red);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
        btnRegister.setBackground(new Color(130,187,215));
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        btnRegister.setBackground(new Color(4,80,102));
    }//GEN-LAST:event_btnRegisterMouseExited

    private void btnLoginUstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginUstudentMouseClicked
        
        students_login newLogin = new students_login();
        newLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginUstudentMouseClicked

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        registration_form newregistration = new registration_form();
        newregistration.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegisterMouseClicked

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
            java.util.logging.Logger.getLogger(main_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Scrollbar;
    private javax.swing.JLabel academy;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel backgrpund;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnLoginTeacher;
    private javax.swing.JPanel btnLoginUstudent;
    private javax.swing.JPanel btnRegister;
    private javax.swing.JLabel coperyng;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbLoStudent;
    private javax.swing.JLabel lbLoTeacher;
    // End of variables declaration//GEN-END:variables
}
