/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author ADMIN
 */
public class FormMain extends javax.swing.JFrame {

    /**
     * Creates new form FormMain
     */
    public FormMain() {
        initComponents();
        init();
    }

    void init() {
        setTitle("Phần mềm quản lý bán Laptop");
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        btnTaoHoaDon = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnHeThong = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mimDangXuat = new javax.swing.JMenuItem();
        mimKetThuc = new javax.swing.JMenuItem();
        mmQLNhanVien = new javax.swing.JMenu();
        mimChucVu = new javax.swing.JMenuItem();
        mimCuaHang = new javax.swing.JMenuItem();
        mimNhanVien = new javax.swing.JMenuItem();
        mnQuanLyKhachHang = new javax.swing.JMenu();
        mimKhachHang = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mimHoaDon = new javax.swing.JMenuItem();
        mimHoaDonCT = new javax.swing.JMenuItem();
        mnQLSP = new javax.swing.JMenu();
        mimSanPham = new javax.swing.JMenuItem();
        mimNsx = new javax.swing.JMenuItem();
        mimMauSac = new javax.swing.JMenuItem();
        mimDongSP = new javax.swing.JMenuItem();
        mimChiTietSP = new javax.swing.JMenuItem();
        mnGioHang = new javax.swing.JMenu();
        mnGioHangCT = new javax.swing.JMenuItem();
        mimGioHang = new javax.swing.JMenuItem();
        mnTroGiup = new javax.swing.JMenu();
        mimLienHe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout-icon-16.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnKetThuc.setText("Kết Thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetThuc);

        btnTaoHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btnTaoHoaDon.setText("Tạo hóa đơn");
        btnTaoHoaDon.setFocusable(false);
        btnTaoHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTaoHoaDon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTaoHoaDon);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Laptop3.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("PHẦN MỀM QUẢN LÝ BÁN LAPTOP");

        mnHeThong.setBackground(new java.awt.Color(0, 153, 153));
        mnHeThong.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnHeThong.setText("Hệ thống");
        mnHeThong.add(jSeparator1);

        mimDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout-icon-16.png"))); // NOI18N
        mimDangXuat.setText("Đăng xuất");
        mimDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimDangXuatActionPerformed(evt);
            }
        });
        mnHeThong.add(mimDangXuat);

        mimKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        mimKetThuc.setText("Kết thúc");
        mimKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimKetThucActionPerformed(evt);
            }
        });
        mnHeThong.add(mimKetThuc);

        jMenuBar1.add(mnHeThong);

        mmQLNhanVien.setBackground(new java.awt.Color(0, 153, 153));
        mmQLNhanVien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mmQLNhanVien.setText("Quản lý nhân viên");

        mimChucVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        mimChucVu.setText("Chức vụ");
        mimChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimChucVuActionPerformed(evt);
            }
        });
        mmQLNhanVien.add(mimChucVu);

        mimCuaHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        mimCuaHang.setText("Cửa hàng");
        mimCuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimCuaHangActionPerformed(evt);
            }
        });
        mmQLNhanVien.add(mimCuaHang);

        mimNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        mimNhanVien.setText("Nhân viên");
        mimNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimNhanVienActionPerformed(evt);
            }
        });
        mmQLNhanVien.add(mimNhanVien);

        jMenuBar1.add(mmQLNhanVien);

        mnQuanLyKhachHang.setBackground(new java.awt.Color(0, 153, 153));
        mnQuanLyKhachHang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnQuanLyKhachHang.setText("Quản lý khách hàng");

        mimKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        mimKhachHang.setText("Khách hàng");
        mimKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimKhachHangActionPerformed(evt);
            }
        });
        mnQuanLyKhachHang.add(mimKhachHang);

        jMenuBar1.add(mnQuanLyKhachHang);

        jMenu1.setBackground(new java.awt.Color(0, 153, 153));
        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setText("Quản lý hóa đơn");

        mimHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        mimHoaDon.setText("Hóa đơn");
        mimHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimHoaDonActionPerformed(evt);
            }
        });
        jMenu1.add(mimHoaDon);

        mimHoaDonCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        mimHoaDonCT.setText("Hóa đơn chi tiết");
        mimHoaDonCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimHoaDonCTActionPerformed(evt);
            }
        });
        jMenu1.add(mimHoaDonCT);

        jMenuBar1.add(jMenu1);

        mnQLSP.setBackground(new java.awt.Color(0, 153, 153));
        mnQLSP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnQLSP.setText("Quản lý sản phẩm");

        mimSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        mimSanPham.setText("Sản phẩm");
        mimSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimSanPhamActionPerformed(evt);
            }
        });
        mnQLSP.add(mimSanPham);

        mimNsx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actions-document-edit-icon-16.png"))); // NOI18N
        mimNsx.setText("Ngày sản xuất");
        mimNsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimNsxActionPerformed(evt);
            }
        });
        mnQLSP.add(mimNsx);

        mimMauSac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actions-document-edit-icon-16.png"))); // NOI18N
        mimMauSac.setText("Màu sắc");
        mimMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimMauSacActionPerformed(evt);
            }
        });
        mnQLSP.add(mimMauSac);

        mimDongSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actions-document-edit-icon-16.png"))); // NOI18N
        mimDongSP.setText("Dòng sản phẩm");
        mimDongSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimDongSPActionPerformed(evt);
            }
        });
        mnQLSP.add(mimDongSP);

        mimChiTietSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        mimChiTietSP.setText("Chi tiết sản phẩm");
        mimChiTietSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimChiTietSPActionPerformed(evt);
            }
        });
        mnQLSP.add(mimChiTietSP);

        jMenuBar1.add(mnQLSP);

        mnGioHang.setBackground(new java.awt.Color(0, 153, 153));
        mnGioHang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnGioHang.setText("Quản lý giỏ hàng");

        mnGioHangCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actions-document-edit-icon-16.png"))); // NOI18N
        mnGioHangCT.setText("Giỏ hàng chi tiết");
        mnGioHangCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGioHangCTActionPerformed(evt);
            }
        });
        mnGioHang.add(mnGioHangCT);

        mimGioHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actions-document-edit-icon-16.png"))); // NOI18N
        mimGioHang.setText("Giỏ hàng");
        mimGioHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimGioHangActionPerformed(evt);
            }
        });
        mnGioHang.add(mimGioHang);

        jMenuBar1.add(mnGioHang);

        mnTroGiup.setBackground(new java.awt.Color(0, 153, 153));
        mnTroGiup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnTroGiup.setText("Trợ giúp");

        mimLienHe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home-icon-16.png"))); // NOI18N
        mimLienHe.setText("Liên hệ");
        mimLienHe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimLienHeActionPerformed(evt);
            }
        });
        mnTroGiup.add(mimLienHe);

        jMenuBar1.add(mnTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel2)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mimHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimHoaDonActionPerformed
        HoaDonForm hd = new HoaDonForm();
        hd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mimHoaDonActionPerformed

    private void mimChiTietSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimChiTietSPActionPerformed
        ChiTietSanPhamForm sctsp = new ChiTietSanPhamForm();
        sctsp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mimChiTietSPActionPerformed

    private void mimChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimChucVuActionPerformed
        ChucVuForm cvf = new ChucVuForm();
        cvf.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_mimChucVuActionPerformed

    private void mimDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimDangXuatActionPerformed
        LoginForm lg = new LoginForm();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mimDangXuatActionPerformed

    private void mimKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimKetThucActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mimKetThucActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        LoginForm lg = new LoginForm();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed
        TaoHDForm thd = new TaoHDForm();
        thd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTaoHoaDonActionPerformed

    private void mimNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimNhanVienActionPerformed
        // TODO add your handling code here:
        NhanVienForm nv = new NhanVienForm();
        nv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mimNhanVienActionPerformed

    private void mimCuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimCuaHangActionPerformed
        // TODO add your handling code here:
        CuaHangForm ch = new CuaHangForm();
        ch.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mimCuaHangActionPerformed

    private void mimKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimKhachHangActionPerformed
        // TODO add your handling code here:
        KhachHangForm kh = new KhachHangForm();
        kh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mimKhachHangActionPerformed

    private void mimSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimSanPhamActionPerformed
        // TODO add your handling code here:
        SanPhamForm sp = new SanPhamForm();
        sp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mimSanPhamActionPerformed

    private void mimHoaDonCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimHoaDonCTActionPerformed
        HoaDonChiTietForm hdct = new HoaDonChiTietForm();
        hdct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mimHoaDonCTActionPerformed

    private void mimLienHeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimLienHeActionPerformed
        // TODO add your handling code here:
        LienHeForm lh = new LienHeForm();
        lh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mimLienHeActionPerformed

    private void mimNsxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimNsxActionPerformed
        // TODO add your handling code here:
        NsxForm nsx = new NsxForm();
        nsx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mimNsxActionPerformed

    private void mimMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimMauSacActionPerformed
        // TODO add your handling code here:
        MauSacForm ms = new MauSacForm();
        ms.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mimMauSacActionPerformed

    private void mimDongSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimDongSPActionPerformed
        // TODO add your handling code here:
        DongSPForm dsp = new DongSPForm();
        dsp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mimDongSPActionPerformed

    private void mnGioHangCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGioHangCTActionPerformed
        GioHangChiTietForm ghct = new GioHangChiTietForm();
        ghct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnGioHangCTActionPerformed

    private void mimGioHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimGioHangActionPerformed
        GioHangForm gh = new GioHangForm();
        gh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mimGioHangActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mimChiTietSP;
    private javax.swing.JMenuItem mimChucVu;
    private javax.swing.JMenuItem mimCuaHang;
    private javax.swing.JMenuItem mimDangXuat;
    private javax.swing.JMenuItem mimDongSP;
    private javax.swing.JMenuItem mimGioHang;
    private javax.swing.JMenuItem mimHoaDon;
    private javax.swing.JMenuItem mimHoaDonCT;
    private javax.swing.JMenuItem mimKetThuc;
    private javax.swing.JMenuItem mimKhachHang;
    private javax.swing.JMenuItem mimLienHe;
    private javax.swing.JMenuItem mimMauSac;
    private javax.swing.JMenuItem mimNhanVien;
    private javax.swing.JMenuItem mimNsx;
    private javax.swing.JMenuItem mimSanPham;
    private javax.swing.JMenu mmQLNhanVien;
    private javax.swing.JMenu mnGioHang;
    private javax.swing.JMenuItem mnGioHangCT;
    private javax.swing.JMenu mnHeThong;
    private javax.swing.JMenu mnQLSP;
    private javax.swing.JMenu mnQuanLyKhachHang;
    private javax.swing.JMenu mnTroGiup;
    // End of variables declaration//GEN-END:variables
}
