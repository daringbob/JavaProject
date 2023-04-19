/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DAO.DB;

public class TaiKhoanPanel extends javax.swing.JPanel {

    /**
     * Creates new form TaiKhoanJPanel1
     */
    public TaiKhoanPanel() {
        initComponents();
        getData(1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel = new CUSTOM.DraggableRoundPanel();
        tp = new javax.swing.JTabbedPane();
        pProfile = new javax.swing.JPanel();
        profileContainer = new javax.swing.JPanel();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        lblSDT = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        lblNgaySinh = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblErrorMessage = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        pPassword = new javax.swing.JPanel();
        profileContainer1 = new javax.swing.JPanel();
        lblDoiMatKhau = new javax.swing.JLabel();
        lblMatKhauMoi = new javax.swing.JLabel();
        lblXacNhanMatKhauMoi = new javax.swing.JLabel();
        lblErrorMessageMatKhau = new javax.swing.JLabel();
        btnChangePassword = new javax.swing.JButton();
        lblMatKhauHienTai = new javax.swing.JLabel();
        pwMatKhauHienTai = new javax.swing.JPasswordField();
        pwMatKhauMoi = new javax.swing.JPasswordField();
        pwXacNhanMatKhauMoi = new javax.swing.JPasswordField();

        lblHoTen.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblHoTen.setText("Họ và tên");

        txtHoTen.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        lblSDT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSDT.setText("Số điện thoại");

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        lblNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNgaySinh.setText("Ngày sinh");

        txtNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblEmail.setText("Email");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        lblErrorMessage.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblErrorMessage.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorMessage.setText("Error message here");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnUpdate.setText("Thay đổi");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profileContainerLayout = new javax.swing.GroupLayout(profileContainer);
        profileContainer.setLayout(profileContainerLayout);
        profileContainerLayout.setHorizontalGroup(
            profileContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileContainerLayout.createSequentialGroup()
                .addGroup(profileContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErrorMessage)
                    .addGroup(profileContainerLayout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(profileContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(profileContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileContainerLayout.createSequentialGroup()
                        .addGroup(profileContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblNgaySinh))
                        .addGap(33, 33, 33)
                        .addGroup(profileContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(txtEmail)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileContainerLayout.createSequentialGroup()
                        .addGroup(profileContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileContainerLayout.createSequentialGroup()
                                .addComponent(lblSDT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(profileContainerLayout.createSequentialGroup()
                                .addComponent(lblHoTen)
                                .addGap(37, 37, 37)))
                        .addGroup(profileContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(txtHoTen))))
                .addGap(55, 55, 55))
        );
        profileContainerLayout.setVerticalGroup(
            profileContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileContainerLayout.createSequentialGroup()
                .addGroup(profileContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoTen)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSDT)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgaySinh)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnReset)))
        );

        lblErrorMessage.setVisible(false);

        javax.swing.GroupLayout pProfileLayout = new javax.swing.GroupLayout(pProfile);
        pProfile.setLayout(pProfileLayout);
        pProfileLayout.setHorizontalGroup(
            pProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProfileLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(profileContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(669, Short.MAX_VALUE))
        );
        pProfileLayout.setVerticalGroup(
            pProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProfileLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(profileContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(449, Short.MAX_VALUE))
        );

        tp.addTab("Thông tin cá nhân", pProfile);

        lblDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDoiMatKhau.setText("Đổi mật khẩu");

        lblMatKhauMoi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblMatKhauMoi.setText("Mật khẩu mới");

        lblXacNhanMatKhauMoi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblXacNhanMatKhauMoi.setText("Xác nhận mật khẩu mới");

        lblErrorMessageMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblErrorMessageMatKhau.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorMessageMatKhau.setText("Error message here");

        btnChangePassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnChangePassword.setText("Thay đổi");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        lblMatKhauHienTai.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblMatKhauHienTai.setText("Mật khẩu hiện tại");

        pwMatKhauHienTai.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pwMatKhauHienTai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwMatKhauHienTaiActionPerformed(evt);
            }
        });

        pwMatKhauMoi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pwMatKhauMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwMatKhauMoiActionPerformed(evt);
            }
        });

        pwXacNhanMatKhauMoi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pwXacNhanMatKhauMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwXacNhanMatKhauMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profileContainer1Layout = new javax.swing.GroupLayout(profileContainer1);
        profileContainer1.setLayout(profileContainer1Layout);
        profileContainer1Layout.setHorizontalGroup(
            profileContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileContainer1Layout.createSequentialGroup()
                .addGroup(profileContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoiMatKhau)
                    .addComponent(lblErrorMessageMatKhau)
                    .addComponent(btnChangePassword)
                    .addGroup(profileContainer1Layout.createSequentialGroup()
                        .addGroup(profileContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblXacNhanMatKhauMoi)
                            .addComponent(lblMatKhauMoi)
                            .addComponent(lblMatKhauHienTai))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(profileContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwMatKhauHienTai, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(pwMatKhauMoi)
                            .addComponent(pwXacNhanMatKhauMoi))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        profileContainer1Layout.setVerticalGroup(
            profileContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileContainer1Layout.createSequentialGroup()
                .addComponent(lblDoiMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhauHienTai)
                    .addComponent(pwMatKhauHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhauMoi)
                    .addComponent(pwMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblXacNhanMatKhauMoi)
                    .addComponent(pwXacNhanMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorMessageMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnChangePassword))
        );

        lblErrorMessageMatKhau.setVisible(false);

        javax.swing.GroupLayout pPasswordLayout = new javax.swing.GroupLayout(pPassword);
        pPassword.setLayout(pPasswordLayout);
        pPasswordLayout.setHorizontalGroup(
            pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPasswordLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(profileContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(649, Short.MAX_VALUE))
        );
        pPasswordLayout.setVerticalGroup(
            pPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPasswordLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(profileContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(450, Short.MAX_VALUE))
        );

        tp.addTab("Mật khẩu", pPassword);

        javax.swing.GroupLayout roundPanelLayout = new javax.swing.GroupLayout(roundPanel);
        roundPanel.setLayout(roundPanelLayout);
        roundPanelLayout.setHorizontalGroup(
            roundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp)
                .addContainerGap())
        );
        roundPanelLayout.setVerticalGroup(
            roundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void pwMatKhauHienTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwMatKhauHienTaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwMatKhauHienTaiActionPerformed

    private void pwMatKhauMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwMatKhauMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwMatKhauMoiActionPerformed

    private void pwXacNhanMatKhauMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwXacNhanMatKhauMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwXacNhanMatKhauMoiActionPerformed

    public void getData(int MaNV) {
    	DB db = new DB();
		db.getConnect();
		Connection connection = db.getConn();
		Statement statement = null;
		String query = "SELECT * FROM nhanvien where MaNV = " + MaNV;
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);
			while(result.next()) {
				txtHoTen.setText(result.getString(2));
				txtSDT.setText(result.getString(3));
				txtNgaySinh.setText(result.getString(5));
				txtEmail.setText(result.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.closeConnect();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblDoiMatKhau;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JLabel lblErrorMessageMatKhau;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMatKhauHienTai;
    private javax.swing.JLabel lblMatKhauMoi;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblXacNhanMatKhauMoi;
    private javax.swing.JPanel pPassword;
    private javax.swing.JPanel pProfile;
    private javax.swing.JPanel profileContainer;
    private javax.swing.JPanel profileContainer1;
    private javax.swing.JPasswordField pwMatKhauHienTai;
    private javax.swing.JPasswordField pwMatKhauMoi;
    private javax.swing.JPasswordField pwXacNhanMatKhauMoi;
    private CUSTOM.DraggableRoundPanel roundPanel;
    private javax.swing.JTabbedPane tp;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}