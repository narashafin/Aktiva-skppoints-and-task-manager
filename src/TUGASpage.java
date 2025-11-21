
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JTable;
import java.sql.*;
import database.dbconnection;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author wixx
 */
public class TUGASpage extends javax.swing.JFrame {
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TUGASpage.class.getName());
    
    /**
     * Creates new form KEGIATANpage
     */
    public TUGASpage() {
        initComponents();
        setLocationRelativeTo(null);
        
//        setupTableAkademik();
//        setupTableNonakademik();
        
        viewDataTabelAkademik();
        viewDataTabelNonAkademik();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        LAYAR_UTAMA = new javax.swing.JPanel();
        BAR_ATAS = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        bdashboard = new javax.swing.JButton();
        bpengaturan = new javax.swing.JButton();
        btugas = new javax.swing.JButton();
        bskp = new javax.swing.JButton();
        wellcome_HOME = new javax.swing.JLabel();
        CAPTION1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        wellcome_HOME2 = new javax.swing.JLabel();
        wellcome_HOME5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAkademik = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableNonakademik = new javax.swing.JTable();
        btambah2 = new javax.swing.JButton();
        btambah1 = new javax.swing.JButton();
        bhapus1 = new javax.swing.JButton();
        bhapus2 = new javax.swing.JButton();

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Edit");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LAYAR_UTAMA.setBackground(new java.awt.Color(255, 255, 255));

        BAR_ATAS.setBackground(new java.awt.Color(51, 0, 153));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        bdashboard.setBackground(new java.awt.Color(51, 0, 153));
        bdashboard.setFont(new java.awt.Font("Tw Cen MT", 3, 13)); // NOI18N
        bdashboard.setForeground(new java.awt.Color(204, 255, 255));
        bdashboard.setText("DASHBOARD");
        bdashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdashboardActionPerformed(evt);
            }
        });

        bpengaturan.setBackground(new java.awt.Color(51, 0, 153));
        bpengaturan.setFont(new java.awt.Font("Tw Cen MT", 3, 13)); // NOI18N
        bpengaturan.setForeground(new java.awt.Color(204, 255, 255));
        bpengaturan.setText("PENGATURAN");
        bpengaturan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpengaturanActionPerformed(evt);
            }
        });

        btugas.setBackground(new java.awt.Color(51, 0, 153));
        btugas.setFont(new java.awt.Font("Tw Cen MT", 3, 13)); // NOI18N
        btugas.setForeground(new java.awt.Color(204, 255, 255));
        btugas.setText("TUGAS");
        btugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btugasActionPerformed(evt);
            }
        });

        bskp.setBackground(new java.awt.Color(51, 0, 153));
        bskp.setFont(new java.awt.Font("Tw Cen MT", 3, 13)); // NOI18N
        bskp.setForeground(new java.awt.Color(204, 255, 255));
        bskp.setText("POIN SKP");
        bskp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bskpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BAR_ATASLayout = new javax.swing.GroupLayout(BAR_ATAS);
        BAR_ATAS.setLayout(BAR_ATASLayout);
        BAR_ATASLayout.setHorizontalGroup(
            BAR_ATASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BAR_ATASLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(bdashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btugas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bskp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(bpengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        BAR_ATASLayout.setVerticalGroup(
            BAR_ATASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BAR_ATASLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BAR_ATASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bpengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btugas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bskp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        wellcome_HOME.setBackground(new java.awt.Color(51, 0, 153));
        wellcome_HOME.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        wellcome_HOME.setForeground(new java.awt.Color(51, 0, 153));
        wellcome_HOME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wellcome_HOME.setText("TUGAS");
        wellcome_HOME.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        CAPTION1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        CAPTION1.setForeground(new java.awt.Color(51, 0, 153));
        CAPTION1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CAPTION1.setText("Ada kesibukan apa nih?");
        CAPTION1.setToolTipText("");
        CAPTION1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        wellcome_HOME2.setBackground(new java.awt.Color(51, 0, 153));
        wellcome_HOME2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        wellcome_HOME2.setForeground(new java.awt.Color(51, 0, 153));
        wellcome_HOME2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        wellcome_HOME2.setText("Tugas Akademik");
        wellcome_HOME2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        wellcome_HOME5.setBackground(new java.awt.Color(51, 0, 153));
        wellcome_HOME5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        wellcome_HOME5.setForeground(new java.awt.Color(51, 0, 153));
        wellcome_HOME5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        wellcome_HOME5.setText("Tugas NonAkademik");
        wellcome_HOME5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTableAkademik.setAutoCreateRowSorter(true);
        jTableAkademik.setBackground(new java.awt.Color(204, 204, 204));
        jTableAkademik.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableAkademik.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTableAkademik.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Nama Tugas", "Mata Kuliah", "Deadline", "Deskripsi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableAkademik);

        jTableNonakademik.setAutoCreateRowSorter(true);
        jTableNonakademik.setBackground(new java.awt.Color(204, 204, 204));
        jTableNonakademik.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableNonakademik.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTableNonakademik.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nama Kegiatan", "Tanggal Kegiatan", "Waktu Kegiatan", "Tempat Kegiatan", "Deskripsi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableNonakademik);

        btambah2.setBackground(new java.awt.Color(0, 0, 153));
        btambah2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btambah2.setForeground(new java.awt.Color(255, 255, 255));
        btambah2.setText("Tambah");
        btambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btambah2ActionPerformed(evt);
            }
        });

        btambah1.setBackground(new java.awt.Color(0, 0, 153));
        btambah1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btambah1.setForeground(new java.awt.Color(255, 255, 255));
        btambah1.setText("Tambah");
        btambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btambah1ActionPerformed(evt);
            }
        });

        bhapus1.setBackground(new java.awt.Color(255, 0, 0));
        bhapus1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        bhapus1.setForeground(new java.awt.Color(255, 255, 255));
        bhapus1.setText("Hapus");
        bhapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapus1ActionPerformed(evt);
            }
        });

        bhapus2.setBackground(new java.awt.Color(255, 0, 0));
        bhapus2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        bhapus2.setForeground(new java.awt.Color(255, 255, 255));
        bhapus2.setText("Hapus");
        bhapus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapus2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LAYAR_UTAMALayout = new javax.swing.GroupLayout(LAYAR_UTAMA);
        LAYAR_UTAMA.setLayout(LAYAR_UTAMALayout);
        LAYAR_UTAMALayout.setHorizontalGroup(
            LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BAR_ATAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
            .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wellcome_HOME, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CAPTION1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                        .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                                        .addComponent(wellcome_HOME2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bhapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3)
                                    .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                                        .addComponent(wellcome_HOME5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bhapus2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btambah2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        LAYAR_UTAMALayout.setVerticalGroup(
            LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                .addComponent(BAR_ATAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wellcome_HOME)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CAPTION1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wellcome_HOME2)
                    .addComponent(btambah1)
                    .addComponent(bhapus1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btambah2)
                            .addComponent(bhapus2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LAYAR_UTAMALayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wellcome_HOME5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LAYAR_UTAMA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LAYAR_UTAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bdashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdashboardActionPerformed
        DASHBOARD dashboard = new DASHBOARD();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bdashboardActionPerformed

    private void bpengaturanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpengaturanActionPerformed
        PENGATURAN pengaturan = new PENGATURAN();
        pengaturan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bpengaturanActionPerformed

    private void btugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btugasActionPerformed
        TUGASpage kegiatan = new TUGASpage();
        kegiatan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btugasActionPerformed

    private void bskpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bskpActionPerformed
        POINskp poin = new POINskp();
        poin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bskpActionPerformed

    private void btambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btambah1ActionPerformed
        TUGAS_Akademik akademik = new TUGAS_Akademik();
        akademik.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btambah1ActionPerformed

    private void btambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btambah2ActionPerformed
        TUGAS_NonAkademik akademik2 = new TUGAS_NonAkademik();
        akademik2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btambah2ActionPerformed

    private void bhapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapus1ActionPerformed
         int[] selectedRow = jTableAkademik.getSelectedRows();

        if(selectedRow.length == 0){
            JOptionPane.showMessageDialog(this, "Pilih minimal 1 baris yang ingin dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
      
        int konfirmasi = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus?", "Konfirmasi hapus", JOptionPane.YES_NO_OPTION);
        
        if (konfirmasi == JOptionPane.YES_NO_OPTION){
            try{
                Connection conn = dbconnection.getConnection();
                String sql = "DELETE FROM kegiatan_Akademik WHERE id_kegA = ?";
                PreparedStatement pst = conn.prepareStatement(sql);
                
                for(int row : selectedRow){
                    int id = Integer.parseInt(jTableAkademik.getValueAt(row, 0).toString());
                    pst.setInt(1, id);
                    pst.executeUpdate();
                    notifyDashboardUpdate();
                }
                pst.close();
                conn.close();

                JOptionPane.showMessageDialog(this, "Berhasil menghapus " + selectedRow.length + " data!");
                viewDataTabelAkademik();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Error" + e.getMessage());
            }
        }
    }//GEN-LAST:event_bhapus1ActionPerformed

    private void bhapus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapus2ActionPerformed
        int[] selectedRow = jTableNonakademik.getSelectedRows();

        if(selectedRow.length == 0){
            JOptionPane.showMessageDialog(this, "Pilih minimal 1 baris yang ingin dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
      
        int konfirmasi = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus?", "Konfirmasi hapus", JOptionPane.YES_NO_OPTION);
        
        if (konfirmasi == JOptionPane.YES_NO_OPTION){
            try{
                Connection conn = dbconnection.getConnection();
                String sql = "DELETE FROM kegiatan_Nonakademik WHERE id_kegNA = ?";
                PreparedStatement pst = conn.prepareStatement(sql);
                
                for(int row : selectedRow){
                    int id = Integer.parseInt(jTableNonakademik.getValueAt(row, 0).toString());
                    pst.setInt(1, id);
                    pst.executeUpdate();
                    notifyDashboardUpdate();
                }
                pst.close();
                conn.close();

                JOptionPane.showMessageDialog(this, "Berhasil menghapus " + selectedRow.length + " data!");
                viewDataTabelNonAkademik();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Error" + e.getMessage());
            }
        }
    }//GEN-LAST:event_bhapus2ActionPerformed

    private void setupTableAkademik () {
//        
//                 
        TableColumn idColumn = jTableAkademik.getColumnModel().getColumn(0);
        idColumn.setMinWidth(0);
        idColumn.setMaxWidth(0);
        idColumn.setPreferredWidth(0);
        idColumn.setResizable(false);
        
    }
    
    private void setupTableNonakademik(){

        TableColumn idColumn = jTableNonakademik.getColumnModel().getColumn(0);
        idColumn.setMinWidth(0);
        idColumn.setMaxWidth(0);
        idColumn.setPreferredWidth(0);
        idColumn.setResizable(false);
        
    }
    
    public final void viewDataTabelAkademik() {
    DefaultTableModel model = new DefaultTableModel(null, 
            new String[] {
        "id","Nama Kegiatan", "Mata Kuliah","Deadline", "Deskripsi"
    });

    try {
        Connection conn = dbconnection.getConnection();
        String sql = "SELECT id_kegA, nama_tugas, mata_kuliah, deadline, deskripsi FROM kegiatan_akademik WHERE id_user = ?"; 
        PreparedStatement pst= conn.prepareStatement(sql);
        pst.setInt(1, sessionLogin.id_user);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Object[] row = new Object[] {
                rs.getInt("id_kegA"),
                rs.getString("nama_tugas"),
                rs.getString("mata_kuliah"),
                rs.getString("deadline"),
                rs.getString("deskripsi")
            };
            model.addRow(row);
        }

        jTableAkademik.setModel(model);
        setupTableAkademik();


        pst.close();
        rs.close();
        conn.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal menampilkan data: " + e.getMessage());
    }
}
    
    
    public final void viewDataTabelNonAkademik() {
    DefaultTableModel model = new DefaultTableModel(null, 
            new String[] {
        "id","Nama Kegiatan", "Tanggal Kegiatan","Waktu Kegiatan", "Tempat Kegiatan", "Deskripsi"
    }
            );

    try {
        Connection conn = dbconnection.getConnection();
        String sql = "SELECT id_kegNA, namaKegiatan, tgl_kegiatan, waktu_kegiatan, tempat_kegiatan, deskripsi FROM kegiatan_nonakademik WHERE id_user = ?"; 
        PreparedStatement pst= conn.prepareStatement(sql);
        pst.setInt(1, sessionLogin.id_user);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Object[] row = new Object[] {
                rs.getInt("id_kegNA"),
                rs.getString("namaKegiatan"),
                rs.getString("tgl_kegiatan"),
                rs.getString("waktu_kegiatan"),
                rs.getString("tempat_Kegiatan"),
                rs.getString("deskripsi")
            };
            model.addRow(row);
        }

        jTableNonakademik.setModel(model);

        setupTableNonakademik();

        pst.close();
        rs.close();
        conn.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, 
            "Gagal menampilkan data: " + e.getMessage());
    }
}
    
     public void notifyDashboardUpdate() {
    java.awt.Window[] windows = java.awt.Window.getWindows();

    for (java.awt.Window window : windows) { 
        if (window instanceof DASHBOARD) { 
            DASHBOARD dash = (DASHBOARD) window;
            
            dash.viewDataTableDashboard();
            
            return;
        }
    }
} 

    
 

    
//    public void refreshTableData() {
//        DefaultTableModel modelAkademik = (DefaultTableModel) tbltugas.getModel();
//        DataTugas.refreshTableTugasAkademik(modelAkademik);
//
//        DefaultTableModel modelNonAkademik = (DefaultTableModel) tblnontugas.getModel();
//        DataTugas.refreshTableTugasNonAkademik(modelNonAkademik);
//    }
    
    
    

  
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TUGASpage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BAR_ATAS;
    private javax.swing.JLabel CAPTION1;
    private javax.swing.JPanel LAYAR_UTAMA;
    private javax.swing.JButton bdashboard;
    private javax.swing.JButton bhapus1;
    private javax.swing.JButton bhapus2;
    private javax.swing.JButton bpengaturan;
    private javax.swing.JButton bskp;
    private javax.swing.JButton btambah1;
    private javax.swing.JButton btambah2;
    private javax.swing.JButton btugas;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAkademik;
    private javax.swing.JTable jTableNonakademik;
    private javax.swing.JLabel wellcome_HOME;
    private javax.swing.JLabel wellcome_HOME2;
    private javax.swing.JLabel wellcome_HOME5;
    // End of variables declaration//GEN-END:variables
}
