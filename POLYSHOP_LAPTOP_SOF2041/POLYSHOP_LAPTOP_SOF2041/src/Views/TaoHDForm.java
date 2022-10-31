/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DomainModels.ChiTietSanPham;
import DomainModels.GioHang;
import DomainModels.HoaDon;
import DomainModels.HoaDonChiTiet;
import Services.CTSPService;
import Services.HDCTService;
import Services.HoaDonService;
import Services.Impl.CTSPServiceImpl;
import Services.Impl.HDCTServiceImpl;
import Services.Impl.HoaDonServiceImpl;
import ViewModels.ChiTietHoaDonViewModel;
import ViewModels.ChiTietSanPhamViewModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class TaoHDForm extends javax.swing.JFrame {

    private HoaDonService hds = new HoaDonServiceImpl();
    private HDCTService hdcts = new HDCTServiceImpl();
    private List<HoaDon> listHD = new ArrayList<>();
    private CTSPService ctsps = new CTSPServiceImpl();
    private List<ChiTietHoaDonViewModel> listCTHDVM = new ArrayList<>();
    private List<HoaDonChiTiet> listHDCT = new ArrayList<>();
    private List<ChiTietSanPhamViewModel> listCTSPVM = new ArrayList<>();
    private DefaultTableModel tableHoaDon = new DefaultTableModel();
    private DefaultTableModel tableSanPham = new DefaultTableModel();
    private DefaultTableModel tableGioHang = new DefaultTableModel();

    public TaoHDForm() {
        initComponents();
        setTitle("Phần mềm quản lý bán Laptop");
        setLocationRelativeTo(null);
        String headers[] = {"STT", "ID SP", "Mã SP", "Tên SP", "Số luọng", "Đon giá", "Thành tiền"};
        tableGioHang.setColumnIdentifiers(headers);
        String headerss[] = {"STT", "ID SP", "Mã SP", "Tên SP", "Năm BH", "Mô tả", "Số luọng SP", "Giá nhập", "Giá bán"};
        tableSanPham.setColumnIdentifiers(headerss);
        String headersss[] = {"STT", "ID HD", "Mã HĐ", "Ngày tạo", "Tên NV", "Tình trạng"};
        tableHoaDon.setColumnIdentifiers(headersss);
        tblHoaDon.setModel(tableHoaDon);
        tblSanPham.setModel(tableSanPham);
        tblGioHang.setModel(tableGioHang);
        addTableHoaDon(hds.getListHoaDon());
        listCTSPVM = ctsps.getListCTSanPhamVM();
        addTableSanPham(listCTSPVM);
        txtMaHD.disable();
        txtNgayTao.disable();
        txtTenNV.disable();
        txtTienThua.disable();
        txtTienKhachDua.disable();
    }

    private void addTableHoaDon(List<HoaDon> list) {

        tableHoaDon.setRowCount(0);
        int i = 1;
        for (HoaDon hoaDon : list) {
            tableHoaDon.addRow(new Object[]{
                i++, hoaDon.getIdHD(), hoaDon.getMa(), hoaDon.getNgayTao(), "Hào", hoaDon.getTinhTrang() == 0 ? "Đã Thanh toán" : "Chưa thanh toán"
            });
        }
    }

    private void addTableSanPham(List<ChiTietSanPhamViewModel> lists) {

        tableSanPham.setRowCount(0);
        int i = 1;
        for (ChiTietSanPhamViewModel x : lists) {
            Object[] data = new Object[]{
                i++, x.getIdCTSP(), x.getMaSP(), x.getTenSP(), x.getNamBH(), x.getMoTa(), x.getSoLuongTon(),
                x.getGiaNhap(), x.getGiaBan()
            };
            tableSanPham.addRow(data);
        }
    }

    private void addTableGioHang(List<ChiTietHoaDonViewModel> list) {
        tableGioHang.setRowCount(0);
        int i = 1;
        for (ChiTietHoaDonViewModel x : list) {
            Object[] data = new Object[]{
                i++, x.getIdCTSP(), x.getMaSP(), x.getTenSP(), x.getSoLuong(), x.getDonGia(),
                x.getDonGia() * x.getSoLuong()
            };
            tableGioHang.addRow(data);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtNgayTao = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtTienThua = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        txtTienKhachDua = new javax.swing.JTextField();
        btnThanhToan = new javax.swing.JButton();
        btnTaoHoaDon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGioHang = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        rdbChoThanhToan = new javax.swing.JRadioButton();
        rdbTatCa = new javax.swing.JRadioButton();
        rdbDaHuy = new javax.swing.JRadioButton();
        rdbDaThanhToan = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Hóa đơn");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Mã HD");

        jLabel3.setText("Ngày tạo");

        jLabel4.setText("Tên NV");

        jLabel5.setText("Tổng tiền");

        jLabel6.setText("Tiền khách đưa");

        jLabel7.setText("Tiền thừa");

        txtTienThua.setText("0.00000");

        txtTienKhachDua.setText("0.00000");

        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaHD)
                    .addComponent(txtTienThua)
                    .addComponent(txtTongTien)
                    .addComponent(txtTienKhachDua))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnThanhToan)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnTaoHoaDon.setText("Tạo hóa đơn");
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Giỏ hàng");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Thành tiền", "null"
            }
        ));
        tblGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGioHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblGioHang);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Sản phẩm");

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSanPham);

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        btnQuayLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbChoThanhToan);
        rdbChoThanhToan.setText("Chờ thanh toán");
        rdbChoThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbChoThanhToanMouseClicked(evt);
            }
        });

        buttonGroup1.add(rdbTatCa);
        rdbTatCa.setText("Tất cả");
        rdbTatCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbTatCaMouseClicked(evt);
            }
        });

        buttonGroup1.add(rdbDaHuy);
        rdbDaHuy.setText("Đã hủy");

        buttonGroup1.add(rdbDaThanhToan);
        rdbDaThanhToan.setText("Đã thanh toán");
        rdbDaThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbDaThanhToanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTaoHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnQuayLai)
                        .addGap(99, 99, 99)
                        .addComponent(rdbChoThanhToan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbTatCa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbDaHuy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbDaThanhToan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbChoThanhToan)
                            .addComponent(rdbTatCa)
                            .addComponent(rdbDaHuy)
                            .addComponent(rdbDaThanhToan))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTaoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(jLabel8))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        FormMain fm = new FormMain();
        fm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed
        Random random = new Random();
        int x = random.nextInt(100);
        long millis = System.currentTimeMillis();
        String name;

        HoaDon hd = new HoaDon();
        hd.setMa("HD" + x);
        hd.setNgayTao(new Date(millis));
        hd.setTinhTrang(1);
        hds.saveHoaDon(hd);
        addTableHoaDon(hds.getListHoaDon());
    }//GEN-LAST:event_btnTaoHoaDonActionPerformed

    private void tblGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGioHangMouseClicked
        int index = tblGioHang.getSelectedRow();
        Double tongTien = (Double) tblGioHang.getValueAt(index, 6);
        txtTongTien.setText(String.valueOf(tongTien));

    }//GEN-LAST:event_tblGioHangMouseClicked

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        int row = tblHoaDon.getSelectedRow();
        List<HoaDon> listHD = hds.getListHoaDon();
        HoaDon hd = listHD.get(row);
        txtMaHD.setText(hd.getMa());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
        txtNgayTao.setText(sdf.format(hd.getNgayTao()));
        txtTenNV.setText("Hào");

        String idHD = hd.getIdHD();
        listCTHDVM = hdcts.viewHDCT(idHD);
        addTableGioHang(listCTHDVM);
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        ChiTietHoaDonViewModel ctspVM = new ChiTietHoaDonViewModel();
        int index = tblSanPham.getSelectedRow();
        int index2 = tblHoaDon.getSelectedRow();
        ctspVM.setIdCTSP((String) tblSanPham.getValueAt(index, 1));
        ctspVM.setMaSP((String) tblSanPham.getValueAt(index, 2));
        ctspVM.setTenSP((String) tblSanPham.getValueAt(index, 3));
        try {
            int slt = Integer.parseInt(JOptionPane.showInputDialog("Mời bạn nhập số lượng:"));
            if (slt <= 0) {
                JOptionPane.showMessageDialog(this, "Bạn phải nhập đúng định dạng");
                return;
            }
            ctspVM.setSoLuong(slt);

            int sl = Integer.parseInt(tblSanPham.getValueAt(index, 6).toString()) - slt;

            String id = (String) tblSanPham.getValueAt(index, 1);
            ChiTietSanPham ctsp = new ChiTietSanPham(sl);
            ctsps.updateSoLuong(sl, id, ctsp);

            String idHD = (String) tblHoaDon.getValueAt(index2, 1);
            ChiTietHoaDonViewModel cthdVM = new ChiTietHoaDonViewModel(slt);
            hdcts.updateSoLuongGioHang(slt, id, idHD, cthdVM);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bạn phải chọn Hóa đơn muốn thêm sản phẩm");
            return;
        }
        addTableSanPham(ctsps.getListCTSanPhamVM());
        ctspVM.setDonGia((Double) tblSanPham.getValueAt(index, 8));
        hdcts.getAll();
        hdcts.getAllHDCT();
        listCTHDVM.add(ctspVM);
        addTableGioHang(listCTHDVM);

    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed

        int index = tblGioHang.getSelectedRow();
        int index2 = tblHoaDon.getSelectedRow();

        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm muốn thanh toán");
        } else if (index2 < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hóa đơn muốn thanh toán");
        } else {
            String idHD = (String) tblHoaDon.getValueAt(index2, 1);
            String ma = (String) tblHoaDon.getValueAt(index2, 2);
            String idCTSP = (String) tblGioHang.getValueAt(index, 1);
            int soLuong = (int) tblGioHang.getValueAt(index, 4);
            Double donGia = (Double) tblGioHang.getValueAt(index, 6);
            boolean trung = false;
            for (HoaDonChiTiet hdct : listHDCT) {
                if (hdct.getIdCTSanPham().contains(idCTSP)) {
                    trung = true;
                }
            }
            if (trung) {
                JOptionPane.showMessageDialog(this, "Sản phẩm đã có trong hóa đơn, vui lòng chọn sản phẩm khác");
            } else {
                HoaDonChiTiet hdct = new HoaDonChiTiet(idHD, idCTSP, soLuong, donGia);
                JOptionPane.showMessageDialog(this, hdcts.thanhToan(hdct));
                hds.updateTinhTrang(ma);
                addTableHoaDon(hds.getListHoaDon());
            }
        }
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void rdbChoThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbChoThanhToanMouseClicked
        listHD = hds.getListChuaThanhToan();
        addTableHoaDon(listHD);
    }//GEN-LAST:event_rdbChoThanhToanMouseClicked

    private void rdbDaThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbDaThanhToanMouseClicked
        listHD = hds.getListDaThanhToan();
        addTableHoaDon(listHD);
    }//GEN-LAST:event_rdbDaThanhToanMouseClicked

    private void rdbTatCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbTatCaMouseClicked
        listHD = hds.getListHoaDon();
        addTableHoaDon(listHD);
    }//GEN-LAST:event_rdbTatCaMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed

        String txtSP = txtTimKiem.getText();
        if (txtSP.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô tìm kiếm không được để trống");
        } else {
            listCTSPVM = ctsps.searchSP(txtSP);
            addTableSanPham(listCTSPVM);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaoHDForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdbChoThanhToan;
    private javax.swing.JRadioButton rdbDaHuy;
    private javax.swing.JRadioButton rdbDaThanhToan;
    private javax.swing.JRadioButton rdbTatCa;
    private javax.swing.JTable tblGioHang;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTienKhachDua;
    private javax.swing.JTextField txtTienThua;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
