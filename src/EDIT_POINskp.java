

import database.dbconnection;  
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.FlowLayout;
import java.util.Date;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;


    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author wixx
 */
public class EDIT_POINskp extends javax.swing.JFrame {
    
    // file asli user
   Connection conn;
   
   File selectedFile = null;    
    
private JTextField tDurasi;
private JDateChooser tExpired;
private JTextField tLifetime;



    
    private static final java.util.logging.Logger logger =
        java.util.logging.Logger.getLogger(EDIT_POINskp.class.getName());

    
    /**
     * Creates new form EDIT_POINskp
     */
    
    
    
public EDIT_POINskp(){
    initComponents();
    conn = dbconnection.getConnection();
    panelMasa.setLayout(new FlowLayout());
    tDurasi = new JTextField(15);
    tExpired = new JDateChooser();
    tExpired.setPreferredSize(new Dimension(140, 20));
    tLifetime = new JTextField("Seumur Hidup/Tidak Ada");
    tLifetime.setEditable(false);

}



   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        LAYAR_UTAMA = new javax.swing.JPanel();
        BAR_ATAS = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        wellcome_HOME = new javax.swing.JLabel();
        CAPTION1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bbatal = new javax.swing.JButton();
        bsimpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tjenis = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tkategori = new javax.swing.JComboBox<>();
        bpilihfile = new javax.swing.JButton();
        tsertif = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tpoin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panelMasa = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbModeMasa = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LAYAR_UTAMA.setBackground(new java.awt.Color(255, 255, 255));

        BAR_ATAS.setBackground(new java.awt.Color(51, 0, 153));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BAR_ATASLayout = new javax.swing.GroupLayout(BAR_ATAS);
        BAR_ATAS.setLayout(BAR_ATASLayout);
        BAR_ATASLayout.setHorizontalGroup(
            BAR_ATASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BAR_ATASLayout.setVerticalGroup(
            BAR_ATASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BAR_ATASLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        wellcome_HOME.setBackground(new java.awt.Color(51, 0, 153));
        wellcome_HOME.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        wellcome_HOME.setForeground(new java.awt.Color(51, 0, 153));
        wellcome_HOME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wellcome_HOME.setText("POIN SKP");
        wellcome_HOME.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        CAPTION1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        CAPTION1.setForeground(new java.awt.Color(51, 0, 153));
        CAPTION1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CAPTION1.setText("Semangat kejar poin skp nya ya!!");
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

        bbatal.setBackground(new java.awt.Color(255, 51, 51));
        bbatal.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        bbatal.setForeground(new java.awt.Color(255, 255, 255));
        bbatal.setText("BATAL");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        bsimpan.setBackground(new java.awt.Color(0, 0, 153));
        bsimpan.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        bsimpan.setForeground(new java.awt.Color(255, 255, 255));
        bsimpan.setText("SIMPAN");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("NAMA KEGIATAN");

        tnama.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 153));
        jLabel2.setText("JENIS KEGIATAN");

        tjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kegiatan", "ORMAWA", "JUARA LOMBA", "WEBINAR/SEMINAR", "KEMAMPUAN BAHASA INGGRIS (SEP-T)", "KEMAMPUAN BAHASA ASING LAINNYA", "KEPANITIAAN KEGIATAN MAHASISWA", "SERTIFIKAT BNSP", " " }));
        tjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tjenisActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 153));
        jLabel4.setText("MASA BERLAKU");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 153));
        jLabel5.setText("SERTIFIKAT");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 153));
        jLabel6.setText("KATEGORI");

        tkategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kategori Kegiatan", "KETUA ORMAWA", "WAKIL/SEKRETARIS/BENDAHARA ORMAWA", "ANGGOTA ORMAWA TINGKAT 1,2,3 INTERNASIONAL", "TINGKAT 1,2,3 NASIONAL", "TINGKAT 1,2,3 REGIONAL", "TINGKAT 1,2,3 KABUPATEN", "10 BESAR", "PESERTA WEBINAR", "Skor SEP-T > 550", "Skor SEP-T > 500", "Skor SEP-T > 450", "Skor SEP-T > 425", "SERTIFIKAT BAHASA ASING APAPUN", "KETUA/WAKIL/BENDAHARA", "ANGGOTA DENGAN 200 PESERTA", "SERTIFIKAT BNSP APAPUN" }));
        tkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkategoriActionPerformed(evt);
            }
        });

        bpilihfile.setBackground(new java.awt.Color(0, 0, 153));
        bpilihfile.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        bpilihfile.setForeground(new java.awt.Color(255, 255, 255));
        bpilihfile.setText("Pilih File");
        bpilihfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpilihfileActionPerformed(evt);
            }
        });

        tsertif.setEditable(false);
        tsertif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsertifActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 153));
        jLabel7.setText("POIN SKP");

        tpoin.setEditable(false);
        tpoin.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 153));
        jLabel9.setText("TANGGAL PEROLEHAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMasaLayout = new javax.swing.GroupLayout(panelMasa);
        panelMasa.setLayout(panelMasaLayout);
        panelMasaLayout.setHorizontalGroup(
            panelMasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        panelMasaLayout.setVerticalGroup(
            panelMasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 153));
        jLabel8.setText("MODE MASA BERLAKU");

        cbModeMasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Mode Masa Berlaku", "Tanggal", "Durasi", "Lifetime", " " }));
        cbModeMasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModeMasaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("*Contoh penulisan durasi \"2 tahun\" / \"2 bulan\"");

        javax.swing.GroupLayout LAYAR_UTAMALayout = new javax.swing.GroupLayout(LAYAR_UTAMA);
        LAYAR_UTAMA.setLayout(LAYAR_UTAMALayout);
        LAYAR_UTAMALayout.setHorizontalGroup(
            LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BAR_ATAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
            .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wellcome_HOME, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CAPTION1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                        .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(33, 33, 33)
                                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tpoin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LAYAR_UTAMALayout.createSequentialGroup()
                                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LAYAR_UTAMALayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(panelMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(37, 37, 37)
                                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbModeMasa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(31, 31, 31)
                        .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(bbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
                    .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                        .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(bpilihfile, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tsertif, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))))
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
                .addGap(32, 32, 32)
                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                        .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                        .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(tpoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbModeMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4)
                                .addGap(45, 45, 45)
                                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(bpilihfile)
                                    .addComponent(tsertif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(51, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed

        POINskp poinPage = new POINskp();
        poinPage.setVisible(true);;
        this.dispose();
    }//GEN-LAST:event_bbatalActionPerformed

    private void bpilihfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpilihfileActionPerformed
          JFileChooser chooser = new JFileChooser();
        int res = chooser.showOpenDialog(this);

        if (res == JFileChooser.APPROVE_OPTION) {
            selectedFile = chooser.getSelectedFile();
            tsertif.setText(selectedFile.getName());
        }
        
    }//GEN-LAST:event_bpilihfileActionPerformed

    private void tsertifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsertifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsertifActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
    try {
      
        String nama = tnama.getText().trim();
        String jenis = tjenis.getSelectedItem().toString();
        String kategori = tkategori.getSelectedItem().toString();
        String mode = cbModeMasa.getSelectedItem().toString(); 
        int poin = Integer.parseInt(tpoin.getText().trim());

        if (nama.isEmpty()) { JOptionPane.showMessageDialog(this, "Nama harus diisi!"); return; }
        if (jenis.isEmpty()) { JOptionPane.showMessageDialog(this, "Jenis harus diisi!"); return; }
        if (kategori.isEmpty()) { JOptionPane.showMessageDialog(this, "Kategori harus diisi!"); return; }

      
        java.util.Date tglPeroleh = jDateChooser.getDate();
        if (tglPeroleh == null) {
            JOptionPane.showMessageDialog(this, "Tanggal perolehan harus diisi!");
            return;
        }

        java.sql.Date sqlPeroleh = new java.sql.Date(tglPeroleh.getTime());

        String modeMasa = "";
        java.sql.Date masaTanggal = null;
        String masaDurasi = null;
        boolean masaLife = false;

        if (mode.equals("Tanggal")) {
            modeMasa = "Tanggal";

            java.util.Date d = tExpired.getDate();
            if (d == null) { 
                JOptionPane.showMessageDialog(this, "Tanggal expired harus diisi!");
                return;
            }

            masaTanggal = new java.sql.Date(d.getTime());
        }

        else if (mode.equals("Durasi")) {
            modeMasa = "Durasi";

            masaDurasi = tDurasi.getText().trim();
            if (masaDurasi.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Durasi harus diisi!");
                return;
            }
        }

        else if (mode.equals("Lifetime")) {
            modeMasa = "Lifetime";
            masaLife = true;
        }
        
         String filenameToSave;


            if (selectedFile == null) {
                JOptionPane.showMessageDialog(this, "Pilih sertifikat!");
                return;
            }
            filenameToSave = copyFileToAppFolder(selectedFile);
        
        
            Connection conn = dbconnection.getConnection();
            String sql = "INSERT INTO riwayat_skp (id_user, nama, jenis, kategori, poin, tgl_perolehan, mode_masa, masa_tanggal, masa_durasi, masa_lifetime, sertifikat) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, sessionLogin.id_user);
            pst.setString(2, nama);
            pst.setString(3, jenis);
            pst.setString(4, kategori);
            pst.setInt(5, poin);
            pst.setDate(6, sqlPeroleh);
            pst.setString(7, modeMasa);
            pst.setDate(8,masaTanggal);
            pst.setString(9, masaDurasi);
            pst.setBoolean(10, masaLife);
            pst.setString(11, filenameToSave);

            pst.executeUpdate();
            notifyDashboardUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            
            tnama.setText("");
            tjenis.setSelectedIndex(0);
            tkategori.setSelectedIndex(0);
            cbModeMasa.setSelectedIndex(0);
            poin = 0;
            tpoin.setText("0");          
            jDateChooser.setDate(null);
            
            pst.close();
            conn.close();
            
            POINskp tambahpoin = new POINskp();
            tambahpoin.setVisible(true);
            this.dispose();


    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    
                   
    }//GEN-LAST:event_bsimpanActionPerformed

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaActionPerformed

    private void tjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tjenisActionPerformed
        int poin = hitungPoin();
        tpoin.setText(String.valueOf(poin));
    }//GEN-LAST:event_tjenisActionPerformed

    private void tkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkategoriActionPerformed
       int poin = hitungPoin();
       tpoin.setText(String.valueOf(poin));
    }//GEN-LAST:event_tkategoriActionPerformed

    private void cbModeMasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbModeMasaActionPerformed
        String mode = cbModeMasa.getSelectedItem().toString();
    
    panelMasa.removeAll();

    if (mode.equals("Tanggal")) {
        panelMasa.add(tExpired);
    } 
    else if (mode.equals("Durasi")) {
        panelMasa.add(tDurasi);
    } 
    else if (mode.equals("Lifetime")) {
        panelMasa.add(tLifetime);
    }

    panelMasa.revalidate();
    panelMasa.repaint();

    }//GEN-LAST:event_cbModeMasaActionPerformed

    private int hitungPoin() {
    String jenis = tjenis.getSelectedItem().toString();
    String kategori = tkategori.getSelectedItem().toString();
    int poin = 0;

    if (jenis.equals("ORMAWA")) {
        if (kategori.equals("KETUA ORMAWA")) poin = 50;
        else if (kategori.equals("WAKIL/SEKRETARIS/BENDAHARA ORMAWA")) poin = 30;
        else if (kategori.equals("ANGGOTA ORMAWA")) poin = 10;
    }
    else if (jenis.equals("JUARA LOMBA")) {
        if (kategori.equals("TINGKAT 1,2,3 INTERNASIONAL")) poin = 100;
        else if (kategori.equals("TINGKAT 1,2,3 NASIONAL")) poin = 75;
        else if (kategori.equals("TINGKAT 1,2,3 REGIONAL")) poin = 60;
        else if (kategori.equals("TINGKAT 1,2,3 KABUPATEN")) poin = 50;
        else if (kategori.equals("10 BESAR")) poin = 30;
    }
    else if (jenis.equals("WEBINAR/SEMINAR")) {
        if (kategori.equals("PESERTA WEBINAR")) poin = 20;
    }
    else if (jenis.equals("KEMAMPUAN BAHASA INGGRIS (SEP-T)")) {
        if (kategori.equals("Skor SEP-T > 550")) poin = 100;
                else if (kategori.equals("Skor SEP-T > 500")) poin = 75;
        else if (kategori.equals("Skor SEP-T > 450")) poin = 50;
        else if (kategori.equals("Skor SEP-T > 425")) poin = 20;
    }
    else if(jenis.equals("KEMAMPUAN BAHASA ASING LAINNYA")) {
        if (kategori.equals("SERTIFIKAT BAHASA ASING APAPUN")) poin = 100;
    }
    else if(jenis.equals("KEPANITIAN KEGIATAN MAHASISWA")) {
        if (kategori.equals("KETUA/WAKIL/BENDAHARA")) poin = 50;
        else if (kategori.equals("ANGGOTA DENGAN 200 PESERTA")) poin = 30;
    }
    else if (jenis.equals("SERTIFIKAT BNSP")) {
        if (kategori.equals("SERTIFIKAT BNSP APAPUN")) poin = 100;
    }
    
    return poin;
    
}
    

    private String copyFileToAppFolder (File file){
         try {
            File folder = new File("uploadsApp");  
            if (!folder.exists()) {
                folder.mkdirs();
            }
            
            String savedName = System.currentTimeMillis() + "_" + file.getName();

            File dest = new File(folder, savedName);

            Files.copy(
                file.toPath(),
                dest.toPath(),
                StandardCopyOption.REPLACE_EXISTING
            );

            return savedName;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal salin file: " + e.getMessage());
            return null;
        }
    }
    
   public void notifyDashboardUpdate() {
    java.awt.Window[] windows = java.awt.Window.getWindows();

    for (java.awt.Window window : windows) { 
        if (window instanceof DASHBOARD) { 
            DASHBOARD dash = (DASHBOARD) window;
            
            dash.updateProgressBar(); 
            return;
        }
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new EDIT_POINskp().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BAR_ATAS;
    private javax.swing.JLabel CAPTION1;
    private javax.swing.JPanel LAYAR_UTAMA;
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bpilihfile;
    private javax.swing.JButton bsimpan;
    private javax.swing.JComboBox<String> cbModeMasa;
    private com.toedter.calendar.JDateChooser jDateChooser;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel panelMasa;
    private javax.swing.JComboBox<String> tjenis;
    private javax.swing.JComboBox<String> tkategori;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tpoin;
    private javax.swing.JTextField tsertif;
    private javax.swing.JLabel wellcome_HOME;
    // End of variables declaration//GEN-END:variables
}
