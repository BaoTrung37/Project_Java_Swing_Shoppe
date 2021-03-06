/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.HoaDon;
import Model.KhachHang;
import controller.Controller;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kuted
 */
public class HoaDonFrm extends javax.swing.JFrame {

    /**
     * Creates new form HoaDonFrm
     */
    private DefaultTableModel tblModel;
    private List<HoaDon> bills;

    public HoaDonFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
        bills = Controller.bills;
        tblModel = (DefaultTableModel) tbHoaDon.getModel();
        addItemKhachHang();
    }

    private void addItemKhachHang() {
        for (KhachHang kh : Controller.customers) {
            cbMaKhachHang.addItem(kh.toString());
        }
    }
//    public HoaDon getHoaDon(){
//        return 
//    }
    private void showData() {
        tblModel.setRowCount(0);
        for (HoaDon hoadon : bills) {
            tblModel.addRow(new Object[]{
                hoadon.getMaDh(),
                hoadon.getKhachHang().getHoTenKH(),
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(hoadon.getNgayTao()),
                hoadon.getSoluong(),
                hoadon.getTongtien()
            });
        }
    }

    private void showData(List<HoaDon> billss) {
        tblModel.setRowCount(0);
        for (HoaDon hoadon : billss) {
            tblModel.addRow(new Object[]{
                hoadon.getMaDh(),
                hoadon.getKhachHang().getHoTenKH(),
                hoadon.getNgayTao().toString(),
                hoadon.getSoluong(),
                hoadon.getTongtien()
            });
        }
    }

    public void addHoaDon(HoaDon hoaDon) {
        bills.add(hoaDon);
        showData();
    }

    public List<HoaDon> getListHoaDon() {
        return bills;
    }

    public KhachHang getKhachHang() {
        return Controller.customers.get(cbMaKhachHang.getSelectedIndex());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cbMaKhachHang = new javax.swing.JComboBox<>();
        btnTaoHoaDon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSapXep = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        btnXemchitiet = new javax.swing.JButton();
        cbTimKiem = new javax.swing.JComboBox<>();
        cbSapXep = new javax.swing.JComboBox<>();
        btnTimKiem1 = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("M?? kh??ch h??ng");

        cbMaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaKhachHangActionPerformed(evt);
            }
        });

        btnTaoHoaDon.setText("T???o h??a ????n");
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });

        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? ????n h??ng", "T??n kh??ch h??ng", "Ng??y mua", "S??? l?????ng", "T???ng h??a ????n"
            }
        ));
        jScrollPane1.setViewportView(tbHoaDon);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Danh s??ch h??a ????n");

        btnSapXep.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSapXep.setText("S???p x???p");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        txtTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimkiemActionPerformed(evt);
            }
        });

        btnXemchitiet.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnXemchitiet.setText("Xem chi ti???t");
        btnXemchitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemchitietActionPerformed(evt);
            }
        });

        cbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T???t c???", "T??n kh??ch h??ng", "T??n m???t h??ng" }));

        cbSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ban ?????u", "Theo t??n (A-Z)", "Theo s??? l?????ng h??ng (gi???m)", "Theo t???ng ti???n (gi???m)" }));
        cbSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSapXepActionPerformed(evt);
            }
        });

        btnTimKiem1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnTimKiem1.setText("T??m ki???m");
        btnTimKiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiem1ActionPerformed(evt);
            }
        });

        btnThoat.setText("Tho??t");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnTaoHoaDon))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(btnXemchitiet, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbTimKiem)
                            .addComponent(btnTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimkiem)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXemchitiet, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMaKhachHangActionPerformed

    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed
        // TODO add your handling code here:
        if(Controller.customers.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Ch??a th??m kh??ch h??ng");
            return;
        }
        TaoHoaDonFrm frm = new TaoHoaDonFrm(this, rootPaneCheckingEnabled);
        frm.setVisible(rootPaneCheckingEnabled);

    }//GEN-LAST:event_btnTaoHoaDonActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:
        int index = cbSapXep.getSelectedIndex();
        switch (index) {
            case 0:
                Controller.sapXepTheoma(bills);
                showData();
                break;
            case 1:
                Controller.sapXepTheoTenKhachHangTrongHoaDon(bills);
                showData();
                break;
            case 2:
                Controller.sapXepSoluongmua(bills);
                showData();
                break;
            case 3:
                Controller.sapXepTongTien(bills);
                showData();
                break;
            default:
                Controller.sapXepTheoma(bills);
                showData();
                break;
        }
    }//GEN-LAST:event_btnSapXepActionPerformed

    private void txtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemActionPerformed

    private void btnXemchitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemchitietActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tbHoaDon.getModel();
        if(tbHoaDon.getSelectedRowCount()==1){
            HoaDon hoaDon = bills.get(tbHoaDon.getSelectedRow());
            ChiTietHoaDonFrm frm = new ChiTietHoaDonFrm(this, rootPaneCheckingEnabled);
            frm.setDataHoaDon(hoaDon);
            frm.setVisible(rootPaneCheckingEnabled);
        }else{
            if(tbHoaDon.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"B???n tr???ng!");
            }else{
                JOptionPane.showMessageDialog(this,"Vui l??ng ch???n d??ng c???n xem ho???c ch??? ch???n 1 d??ng!");
                }
        }
    }//GEN-LAST:event_btnXemchitietActionPerformed

    private void btnTimKiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiem1ActionPerformed
        // TODO add your handling code here:
        int index = cbTimKiem.getSelectedIndex();
        System.out.println(index);
        switch (index) {
            case 0:
                showData();
                break;
            case 1:
                String name = txtTimkiem.getText().trim();
                showData(Controller.getHoaDonTheoTenKhachHang(name));
                break;
            default:
                showData();
                break;
        }
    }//GEN-LAST:event_btnTimKiem1ActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cbSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSapXepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSapXepActionPerformed

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
            java.util.logging.Logger.getLogger(HoaDonFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem1;
    private javax.swing.JButton btnXemchitiet;
    private javax.swing.JComboBox<String> cbMaKhachHang;
    private javax.swing.JComboBox<String> cbSapXep;
    private javax.swing.JComboBox<String> cbTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}
