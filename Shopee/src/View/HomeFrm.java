package View;

public class HomeFrm extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrm
     */
    public HomeFrm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnGoods = new javax.swing.JButton();
        btnCustomers = new javax.swing.JButton();
        btnReceipts = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnThoat = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(655, 380));
        setMinimumSize(new java.awt.Dimension(655, 380));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(655, 380));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("CHƯƠNG TRÌNH QUẢN LÝ HỆ THỐNG BÁN HÀNG");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 655, 10));

        btnGoods.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clipboard.png"))); // NOI18N
        btnGoods.setMaximumSize(new java.awt.Dimension(180, 140));
        btnGoods.setMinimumSize(new java.awt.Dimension(180, 140));
        btnGoods.setPreferredSize(new java.awt.Dimension(180, 140));
        btnGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoodsActionPerformed(evt);
            }
        });
        getContentPane().add(btnGoods, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 130, 130));

        btnCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rating.png"))); // NOI18N
        btnCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersActionPerformed(evt);
            }
        });
        getContentPane().add(btnCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 130, 130));

        btnReceipts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/receipt.png"))); // NOI18N
        btnReceipts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptsActionPerformed(evt);
            }
        });
        getContentPane().add(btnReceipts, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 130, 130));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Quản lý mặt hàng");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Quản lý khách hàng");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Quản lý hóa đơn");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 655, 20));

        btnThoat.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 110, 30));

        btnReturn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 110, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
      
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        
        LoginFrm frm =new LoginFrm();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoodsActionPerformed
        // TODO add your handling code here:
        MatHangFrm frm = new MatHangFrm();
        frm.setVisible(true);
    }//GEN-LAST:event_btnGoodsActionPerformed

    private void btnCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersActionPerformed
        // TODO add your handling code here:
        KhachHangFrm frm = new KhachHangFrm();
        frm.setVisible(true);
    }//GEN-LAST:event_btnCustomersActionPerformed

    private void btnReceiptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptsActionPerformed
        // TODO add your handling code here:
        HoaDonFrm frm = new HoaDonFrm();
        frm.setVisible(true);
    }//GEN-LAST:event_btnReceiptsActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomers;
    private javax.swing.JButton btnGoods;
    private javax.swing.JButton btnReceipts;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
