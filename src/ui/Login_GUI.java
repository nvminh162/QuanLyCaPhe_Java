/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import connectDB.ConnectDB;
import dao.NhanVien_DAO;
import dao.SanPham_DAO;
import entity.NhanVien;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nvmin
 */
public class Login_GUI extends javax.swing.JFrame {

    private NhanVien_DAO nhanVien_DAO;

    /**
     * Creates new form Login_GUI
     */
    public Login_GUI() {
        initComponents();
        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        nhanVien_DAO = new NhanVien_DAO();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jLabel_hide_pwd.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_username = new javax.swing.JLabel();
        jTextField_userName_value = new javax.swing.JTextField();
        jLabel_password = new javax.swing.JLabel();
        jPasswordField_password_value = new javax.swing.JPasswordField();
        jCheckBox_remember_value = new javax.swing.JCheckBox();
        jLabel_forgetPwd = new javax.swing.JLabel();
        jButton_login = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel_user = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel_show_pwd = new javax.swing.JLabel();
        jLabel_hide_pwd = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 544));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg-1.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-logo.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_username.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel_username.setText("Username");

        jTextField_userName_value.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_userName_valueKeyPressed(evt);
            }
        });

        jLabel_password.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel_password.setText("Password");

        jPasswordField_password_value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_password_valueActionPerformed(evt);
            }
        });
        jPasswordField_password_value.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_password_valueKeyPressed(evt);
            }
        });

        jCheckBox_remember_value.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_remember_value.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox_remember_value.setForeground(new java.awt.Color(0, 102, 51));
        jCheckBox_remember_value.setText("Remember me");

        jLabel_forgetPwd.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jLabel_forgetPwd.setForeground(new java.awt.Color(0, 102, 51));
        jLabel_forgetPwd.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_forgetPwd.setText("Forget password?");

        jButton_login.setBackground(new java.awt.Color(0, 102, 51));
        jButton_login.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Đăng Nhập");
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        jLabel_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-round.png"))); // NOI18N
        jLabel_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_userMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_user, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_user, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_show_pwd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_show_pwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/show-pwd.png"))); // NOI18N
        jLabel_show_pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_show_pwdMousePressed(evt);
            }
        });
        jPanel6.add(jLabel_show_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 73, 60));

        jLabel_hide_pwd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_hide_pwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hide-pwd.png"))); // NOI18N
        jLabel_hide_pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_hide_pwdMousePressed(evt);
            }
        });
        jPanel6.add(jLabel_hide_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jCheckBox_remember_value, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(jLabel_forgetPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPasswordField_password_value)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_userName_value))
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField_userName_value, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField_password_value)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_remember_value, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_forgetPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Thoát");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(0, 68, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField_password_valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_password_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_password_valueActionPerformed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        this.dispose();
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel_userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_userMousePressed
        jTextField_userName_value.requestFocus();

    }//GEN-LAST:event_jLabel_userMousePressed

    private void jLabel_show_pwdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_show_pwdMousePressed
        jPasswordField_password_value.requestFocus();
        jLabel_show_pwd.setVisible(false);
        jLabel_hide_pwd.setVisible(true);
        jPasswordField_password_value.setEchoChar((char) 0);
    }//GEN-LAST:event_jLabel_show_pwdMousePressed

    private void jLabel_hide_pwdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_hide_pwdMousePressed
        jPasswordField_password_value.requestFocus();
        jLabel_show_pwd.setVisible(true);
        jLabel_hide_pwd.setVisible(false);
        jPasswordField_password_value.setEchoChar(('*'));
    }//GEN-LAST:event_jLabel_hide_pwdMousePressed

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        try {
            performLogin();
        } catch (SQLException ex) {
            Logger.getLogger(Login_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jTextField_userName_valueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_userName_valueKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                performLogin();
            } catch (SQLException ex) {
                Logger.getLogger(Login_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTextField_userName_valueKeyPressed

    private void jPasswordField_password_valueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_password_valueKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                performLogin();
            } catch (SQLException ex) {
                Logger.getLogger(Login_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jPasswordField_password_valueKeyPressed

    public void performLogin() throws SQLException {
        String usernameInput = jTextField_userName_value.getText().trim();
        String passwordInput = jPasswordField_password_value.getText().trim();
        ArrayList<NhanVien> danhSachNhanVien = nhanVien_DAO.getAllTableNhanVien();
        Dashboard_GUI dashboard_GUI = new Dashboard_GUI();
        dashboard_GUI.currentUser = usernameInput;
        boolean isAuthenticated = false;

        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMaNV().equals(usernameInput) && nv.getMatKhauNV().equals(passwordInput)) {
                isAuthenticated = true;
                break;
            }
        }

        if (isAuthenticated) {
            dashboard_GUI.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Thông tin tài khoản và mật khẩu không chính xác", "Try Again", JOptionPane.WARNING_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JCheckBox jCheckBox_remember_value;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_forgetPwd;
    private javax.swing.JLabel jLabel_hide_pwd;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_show_pwd;
    private javax.swing.JLabel jLabel_user;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField_password_value;
    private javax.swing.JTextField jTextField_userName_value;
    // End of variables declaration//GEN-END:variables
}
