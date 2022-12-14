/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DomainModels.ChiTietSanPham;
import DomainModels.DongSanPham;
import DomainModels.MauSac;
import DomainModels.Nsx;
import DomainModels.SanPham;
import Services.CTSPService;
import Services.DongSPService;
import Services.Impl.CTSPServiceImpl;
import Services.Impl.DongSPServiceImpl;
import Services.Impl.MauSacServiceImpl;
import Services.Impl.NsxServiceImpl;
import Services.Impl.SanPhamServiceImpl;
import Services.MauSacService;
import Services.NsxService;
import Services.SanPhamService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ChiTietSanPhamForm extends javax.swing.JFrame {

    private DefaultTableModel tblmodel = new DefaultTableModel();
    private List<ChiTietSanPham> listCTSP = new ArrayList<>();
    private List<SanPham> listSP = new ArrayList<>();
    private List<Nsx> listNSX = new ArrayList<>();
    private List<MauSac> listMauSac = new ArrayList<>();
    private List<DongSanPham> listDongSP = new ArrayList<>();
    private DefaultComboBoxModel cbbSanPhamModel = new DefaultComboBoxModel();
    private DefaultComboBoxModel cbbNSXModel = new DefaultComboBoxModel();
    private DefaultComboBoxModel cbbMauSacModel = new DefaultComboBoxModel();
    private DefaultComboBoxModel cbbDongSPModel = new DefaultComboBoxModel();
    private CTSPService ctspService = new CTSPServiceImpl();
    private SanPhamService spService = new SanPhamServiceImpl();
    private NsxService nsxService = new NsxServiceImpl();
    private MauSacService msService = new MauSacServiceImpl();
    private DongSPService dspService = new DongSPServiceImpl();

    public ChiTietSanPhamForm() {
        initComponents();
        tblSanPhamCT.setModel(tblmodel);
        cbbTenSP.setModel(cbbSanPhamModel);
        cbbNsx.setModel(cbbNSXModel);
        cbbMauSac.setModel(cbbMauSacModel);
        cbbDongSP.setModel(cbbDongSPModel);
        String headers[] = {"STT", "T??n SP", "NSX", "M??u", "D??ng SP", "N??m BH", "SL t???n", "Gi?? nh???p", "Gi?? b??n"};
        tblmodel.setColumnIdentifiers(headers);
        listCTSP = ctspService.getAll();
        listSP = spService.getAll();
        listNSX = nsxService.getAll();
        listMauSac = msService.getAll();
        listDongSP = dspService.getAll();
        showData(listCTSP);
        setTitle("Ph???n m???m qu???n l?? b??n Laptop");
        setLocationRelativeTo(null);
        loadCbb();
        txtID.disable();
    }

    private void showData(List<ChiTietSanPham> lists) {
        int i = 1;
        tblmodel.setRowCount(0);
        for (ChiTietSanPham ctsp : lists) {
            Object[] data = new Object[]{
                i++, ctsp.getTenSP(), ctsp.getTenNSX(), ctsp.getTenMauSac(), ctsp.getTenDongSP(),
                ctsp.getNamBH(), ctsp.getSoLuongTon(), ctsp.getGiaNhap(), ctsp.getGiaBan()
            };
            tblmodel.addRow(data);
        }
    }

    private void fillData(int index) {
        ChiTietSanPham ctsp = listCTSP.get(index);
        txtMoTa.setText(ctsp.getMoTa());
        txtNamBaoHanh.setText(String.valueOf(ctsp.getNamBH()));
        txtSoLuongTon.setText(String.valueOf(ctsp.getSoLuongTon()));
        txtGiaNhap.setText(String.valueOf(ctsp.getGiaNhap()));
        txtGiaBan.setText(String.valueOf(ctsp.getGiaBan()));
        txtID.setText(ctsp.getIdCTSP());
        cbbTenSP.setSelectedItem(ctsp.getTenSP());
        cbbNsx.setSelectedItem(ctsp.getTenNSX());
        cbbMauSac.setSelectedItem(ctsp.getTenMauSac());
        cbbDongSP.setSelectedItem(ctsp.getTenDongSP());

    }

    private void loadCbb() {

        for (SanPham sp : listSP) {
            cbbSanPhamModel.addElement(sp.getTen());
        }
        for (Nsx n : listNSX) {
            cbbNSXModel.addElement(n.getTen());
        }
        for (MauSac ms : listMauSac) {
            cbbMauSacModel.addElement(ms.getTen());
        }
        for (DongSanPham dsp : listDongSP) {
            cbbDongSPModel.addElement(dsp.getTen());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQuayLai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPhamCT = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSapXepGN = new javax.swing.JButton();
        btnSapXepGB = new javax.swing.JButton();
        btnSapXepSLT = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cbbTenSP = new javax.swing.JComboBox<>();
        cbbNsx = new javax.swing.JComboBox<>();
        cbbMauSac = new javax.swing.JComboBox<>();
        txtMoTa = new javax.swing.JTextField();
        txtSoLuongTon = new javax.swing.JTextField();
        txtGiaBan = new javax.swing.JTextField();
        txtGiaNhap = new javax.swing.JTextField();
        txtNamBaoHanh = new javax.swing.JTextField();
        cbbDongSP = new javax.swing.JComboBox<>();
        txtID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnQuayLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuayLai.setText("Quay l???i");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        tblSanPhamCT.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSanPhamCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamCTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPhamCT);

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setText("Th??m");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setText("S???a");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setText("X??a");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Chi ti???t s???n Ph???m");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("M??u s???c:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("D??ng SP:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nsx:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("M?? t???:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("S??? l?????ng t???n");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("N??m b???o h??nh:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Gi?? nh???p");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Gi?? b??n");

        btnSapXepGN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSapXepGN.setText("S???p x???p gi?? nh???p");
        btnSapXepGN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepGNActionPerformed(evt);
            }
        });

        btnSapXepGB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSapXepGB.setText("S???p x???p gi?? b??n");
        btnSapXepGB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepGBActionPerformed(evt);
            }
        });

        btnSapXepSLT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSapXepSLT.setText("S???p x???p s??? l?????ng t???n");
        btnSapXepSLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepSLTActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("T??n s???n ph???m");

        cbbTenSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cbbTenSP.setSelectedIndex(-1);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("ID Chi ti???t s???n ph???m");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuayLai)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnSapXepGN, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnSapXepGB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSapXepSLT))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMoTa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                        .addComponent(txtGiaNhap, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbNsx, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbbMauSac, 0, 230, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbbDongSP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNamBaoHanh, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSapXepGN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSapXepGB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSapXepSLT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbDongSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamBaoHanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        FormMain fm = new FormMain();
        fm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void tblSanPhamCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamCTMouseClicked
        int row = tblSanPhamCT.getSelectedRow();
        fillData(row);
    }//GEN-LAST:event_tblSanPhamCTMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        int index = cbbTenSP.getSelectedIndex();
        SanPham sp = listSP.get(index);

        int index2 = cbbNsx.getSelectedIndex();
        Nsx n = listNSX.get(index2);

        int index3 = cbbMauSac.getSelectedIndex();
        MauSac ms = listMauSac.get(index3);

        int index4 = cbbDongSP.getSelectedIndex();
        DongSanPham dsp = listDongSP.get(index);

        String namBH = String.valueOf(txtNamBaoHanh.getText());
        String moTa = txtMoTa.getText();
        String slTon = String.valueOf(txtSoLuongTon.getText());
        String giaNhap = String.valueOf(txtGiaNhap.getText());
        String giaBan = String.valueOf(txtGiaBan.getText());
        if (moTa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "M?? t??? kh??ng ???????c ????? tr???ng");
        } else if (slTon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "S??? l?????ng t???n kh??ng ???????c ????? tr???ng");
        } else if (giaNhap.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Gi?? nh???p kh??ng ???????c ????? tr???ng");
        } else if (giaBan.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Gi?? b??n kh??ng ???????c ????? tr???ng");
        } else if (namBH.isEmpty()) {
            JOptionPane.showMessageDialog(this, "N??m b???o h??nh kh??ng ???????c ????? tr???ng");
        } else if (slTon.matches("\\d+") == false) {
            JOptionPane.showMessageDialog(this, "S??? l?????ng t???n ph???i l?? s???");
        } else if (giaNhap.matches("\\d+") == false) {
            JOptionPane.showMessageDialog(this, "Gi?? nh???p ph???i l?? s???");
        } else if (giaBan.matches("\\d+") == false) {
            JOptionPane.showMessageDialog(this, "Gi?? b??n ph???i l?? s???");
        } else if (namBH.matches("\\d+") == false) {
            JOptionPane.showMessageDialog(this, "n??m b???o h??nh ph???i l?? s???");
        } else {
            ChiTietSanPham ctsp = new ChiTietSanPham(sp.getIdSP(), n.getIdNsx(), ms.getIdMauSac(), dsp.getIdDongSP(), Integer.valueOf(namBH), moTa, Integer.valueOf(slTon), Double.valueOf(giaNhap), Double.valueOf(giaBan));
            JOptionPane.showMessageDialog(this, ctspService.add(ctsp));
            listCTSP = ctspService.getAll();
            showData(listCTSP);
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String id = txtID.getText();
        int index = cbbTenSP.getSelectedIndex();
        SanPham sp = listSP.get(index);

        int index2 = cbbNsx.getSelectedIndex();
        Nsx n = listNSX.get(index2);

        int index3 = cbbMauSac.getSelectedIndex();
        MauSac ms = listMauSac.get(index3);

        int index4 = cbbDongSP.getSelectedIndex();
        DongSanPham dsp = listDongSP.get(index);

        int namBH = Integer.valueOf(txtNamBaoHanh.getText());
        String moTa = txtMoTa.getText();
        int slTon = Integer.valueOf(txtSoLuongTon.getText());
        double giaNhap = Double.valueOf(txtGiaNhap.getText());
        double giaBan = Double.valueOf(txtGiaBan.getText());
        if (moTa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "M?? t??? kh??ng ???????c ????? tr???ng");
        } else if (String.valueOf(slTon).isEmpty()) {
            JOptionPane.showMessageDialog(this, "S??? l?????ng t???n kh??ng ???????c ????? tr???ng");
        } else if (String.valueOf(giaNhap).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Gi?? nh???p kh??ng ???????c ????? tr???ng");
        } else if (String.valueOf(giaBan).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Gi?? b??n kh??ng ???????c ????? tr???ng");
        } else if (String.valueOf(namBH).isEmpty()) {
            JOptionPane.showMessageDialog(this, "N??m b???o h??nh kh??ng ???????c ????? tr???ng");
        } else if (String.valueOf(slTon).matches("\\d+") == false) {
            JOptionPane.showMessageDialog(this, "S??? l?????ng t???n ph???i l?? s???");
        } else if (String.valueOf(giaNhap).matches("\\d+") == false) {
            JOptionPane.showMessageDialog(this, "Gi?? nh???p ph???i l?? s???");
        } else if (String.valueOf(giaBan).matches("\\d+") == false) {
            JOptionPane.showMessageDialog(this, "Gi?? b??n ph???i l?? s???");
        } else if (String.valueOf(namBH).matches("\\d+") == false) {
            JOptionPane.showMessageDialog(this, "n??m b???o h??nh ph???i l?? s???");
        } else {
            ChiTietSanPham ctsp = new ChiTietSanPham(sp.getIdSP(), n.getIdNsx(), ms.getIdMauSac(), dsp.getIdDongSP(), namBH, moTa, slTon, giaNhap, giaBan);
            JOptionPane.showMessageDialog(this, ctspService.update(id, ctsp));
            listCTSP = ctspService.getAll();
            showData(listCTSP);
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String id = txtID.getText();
        JOptionPane.showMessageDialog(this, ctspService.delete(id));
        listCTSP = ctspService.getAll();
        showData(listCTSP);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSapXepGNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepGNActionPerformed
        List<ChiTietSanPham> listNew = ctspService.sortByGiaNhap();
        showData(listNew);

    }//GEN-LAST:event_btnSapXepGNActionPerformed

    private void btnSapXepGBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepGBActionPerformed
        List<ChiTietSanPham> listNew = ctspService.sortByGiaBan();
        showData(listNew);
    }//GEN-LAST:event_btnSapXepGBActionPerformed

    private void btnSapXepSLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepSLTActionPerformed
        List<ChiTietSanPham> listNew = ctspService.sortBySoLuongTon();
        showData(listNew);
    }//GEN-LAST:event_btnSapXepSLTActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtNamBaoHanh.setText("");
        txtMoTa.setText("");
        txtSoLuongTon.setText("");
        txtGiaNhap.setText("");
        txtGiaBan.setText("");
        txtID.setText("");
        cbbDongSP.setSelectedIndex(0);
        cbbTenSP.setSelectedIndex(0);
        cbbMauSac.setSelectedIndex(0);
        cbbNsx.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietSanPhamForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSapXepGB;
    private javax.swing.JButton btnSapXepGN;
    private javax.swing.JButton btnSapXepSLT;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbDongSP;
    private javax.swing.JComboBox<String> cbbMauSac;
    private javax.swing.JComboBox<String> cbbNsx;
    private javax.swing.JComboBox<String> cbbTenSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSanPhamCT;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtNamBaoHanh;
    private javax.swing.JTextField txtSoLuongTon;
    // End of variables declaration//GEN-END:variables
}
