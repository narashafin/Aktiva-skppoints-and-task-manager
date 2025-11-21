
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import com.toedter.calendar.JDateChooser;
import java.sql.*;
import javax.swing.*;
import java.util.Date;
import database.dbconnection;



/**
 *
 * @author wixx
 */
public class PENGATURAN extends javax.swing.JFrame {
    
    Connection conn;
    Statement stmt;
    ResultSet rs;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PENGATURAN.class.getName());


    /**
     * Creates new form PENGATURAN
     */
    public PENGATURAN() {
        initComponents();
        setLocationRelativeTo(null);
        loadUserData();
        loadUserData2();
        
    }
    
    
    
    private void loadUserData() {
        
    try {
        Connection conn = new dbconnection().getConnection();
        
          int idUser = sessionLogin.id_user;
        
        String sql = "SELECT namaUser, registeredUser FROM users WHERE id_user = ?";
 

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idUser); 

        ResultSet rs = pst.executeQuery();
        
        while (rs.next()) {
           
            Tusername.setText(rs.getString("registeredUser"));
            tnama.setText(rs.getString("namaUser"));  
        }

        rs.close();
        pst.close();
        conn.close();
    } catch (Exception e) {
        System.out.println("gagal load data user");
    }
}
    
    public void loadUserData2() {
    try {
        Connection conn = dbconnection.getConnection();

        String sql = "SELECT * FROM users WHERE id_user=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, sessionLogin.id_user);

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Tusername.setText(rs.getString("registeredUser"));
            tnama.setText(rs.getString("namaUser"));
            tnpm.setText(rs.getString("npmUser"));
            tfakultas.setText(rs.getString("fakultasUser"));
            tprodi.setText(rs.getString("prodiUser"));
            tsemester.setText(String.valueOf(rs.getInt("semesterUser")));
            tkelas.setText(rs.getString("kelasUser"));
            talamat.setText(rs.getString("alamatUser"));
            jDateChooser1.setDate(rs.getDate("lahirUser"));
        }

        rs.close();
        pst.close();
        conn.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Gagal load data user: " + e.getMessage());
    }
}



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LAYAR_UTAMA = new javax.swing.JPanel();
        BAR_ATAS = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        bdashboard = new javax.swing.JButton();
        bpengaturan = new javax.swing.JButton();
        bkegiatan = new javax.swing.JButton();
        bskp = new javax.swing.JButton();
        wellcome_HOME = new javax.swing.JLabel();
        CAPTION1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tnpm = new javax.swing.JTextField();
        tnama = new javax.swing.JTextField();
        tfakultas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tprodi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tsemester = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tkelas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        talamat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CAPTION2 = new javax.swing.JLabel();
        bconfirm = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Tusername = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        blogout = new javax.swing.JButton();

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

        bkegiatan.setBackground(new java.awt.Color(51, 0, 153));
        bkegiatan.setFont(new java.awt.Font("Tw Cen MT", 3, 13)); // NOI18N
        bkegiatan.setForeground(new java.awt.Color(204, 255, 255));
        bkegiatan.setText("TUGAS");
        bkegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkegiatanActionPerformed(evt);
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
                .addGap(29, 29, 29)
                .addComponent(bdashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(bkegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(bskp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
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
                    .addComponent(bkegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bskp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        wellcome_HOME.setBackground(new java.awt.Color(51, 0, 153));
        wellcome_HOME.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        wellcome_HOME.setForeground(new java.awt.Color(51, 0, 153));
        wellcome_HOME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wellcome_HOME.setText("PENGATURAN");
        wellcome_HOME.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        CAPTION1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        CAPTION1.setForeground(new java.awt.Color(51, 0, 153));
        CAPTION1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CAPTION1.setText("Ayo lengkapi data dirimu!!");
        CAPTION1.setToolTipText("");
        CAPTION1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        panel.setBackground(new java.awt.Color(51, 0, 153));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NAMA");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FAKULTAS");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NPM");

        tnpm.setBackground(new java.awt.Color(102, 255, 255));
        tnpm.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        tnpm.setForeground(new java.awt.Color(51, 0, 153));
        tnpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnpmActionPerformed(evt);
            }
        });

        tnama.setBackground(new java.awt.Color(102, 255, 255));
        tnama.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        tnama.setForeground(new java.awt.Color(51, 0, 153));
        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });

        tfakultas.setBackground(new java.awt.Color(102, 255, 255));
        tfakultas.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        tfakultas.setForeground(new java.awt.Color(51, 0, 153));
        tfakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfakultasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRODI");

        tprodi.setBackground(new java.awt.Color(102, 255, 255));
        tprodi.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        tprodi.setForeground(new java.awt.Color(51, 0, 153));
        tprodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprodiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USERNAME");

        tsemester.setBackground(new java.awt.Color(102, 255, 255));
        tsemester.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        tsemester.setForeground(new java.awt.Color(51, 0, 153));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("KELAS");

        tkelas.setBackground(new java.awt.Color(102, 255, 255));
        tkelas.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        tkelas.setForeground(new java.awt.Color(51, 0, 153));
        tkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkelasActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ALAMAT");

        talamat.setBackground(new java.awt.Color(102, 255, 255));
        talamat.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        talamat.setForeground(new java.awt.Color(51, 0, 153));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TANGGAL LAHIR");

        CAPTION2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        CAPTION2.setForeground(new java.awt.Color(255, 255, 255));
        CAPTION2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CAPTION2.setText("Datamu sudah yakin benar??");
        CAPTION2.setToolTipText("");
        CAPTION2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        bconfirm.setBackground(new java.awt.Color(204, 204, 255));
        bconfirm.setFont(new java.awt.Font("Tw Cen MT", 1, 13)); // NOI18N
        bconfirm.setForeground(new java.awt.Color(51, 51, 51));
        bconfirm.setText("CONFIRM CHANGE");
        bconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bconfirmActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SEMESTER");

        Tusername.setBackground(new java.awt.Color(102, 255, 255));
        Tusername.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        Tusername.setForeground(new java.awt.Color(51, 0, 153));
        Tusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TusernameFocusLost(evt);
            }
        });
        Tusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TusernameActionPerformed(evt);
            }
        });

        jDateChooser1.setBackground(new java.awt.Color(102, 255, 255));
        jDateChooser1.setForeground(new java.awt.Color(51, 0, 153));
        jDateChooser1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jDateChooser1.setMaximumSize(new java.awt.Dimension(170, 35));
        jDateChooser1.setMinimumSize(new java.awt.Dimension(140, 30));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tprodi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                        .addComponent(tfakultas, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tnpm, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tnama, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Tusername, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bconfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tsemester, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tkelas, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(talamat, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(CAPTION2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tsemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(talamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tnpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CAPTION2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(tfakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );

        blogout.setBackground(new java.awt.Color(255, 51, 51));
        blogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        blogout.setForeground(new java.awt.Color(255, 255, 255));
        blogout.setText("LOG OUT");
        blogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LAYAR_UTAMALayout = new javax.swing.GroupLayout(LAYAR_UTAMA);
        LAYAR_UTAMA.setLayout(LAYAR_UTAMALayout);
        LAYAR_UTAMALayout.setHorizontalGroup(
            LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BAR_ATAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CAPTION1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(wellcome_HOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blogout, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LAYAR_UTAMALayout.setVerticalGroup(
            LAYAR_UTAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LAYAR_UTAMALayout.createSequentialGroup()
                .addComponent(BAR_ATAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(wellcome_HOME)
                .addGap(4, 4, 4)
                .addComponent(CAPTION1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(blogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LAYAR_UTAMA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LAYAR_UTAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
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

    private void bkegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkegiatanActionPerformed
        TUGASpage kegiatan = new TUGASpage();
        kegiatan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bkegiatanActionPerformed

    private void bskpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bskpActionPerformed
        POINskp poin = new POINskp();
        poin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bskpActionPerformed

    private void blogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogoutActionPerformed
        int pilihan = JOptionPane.showConfirmDialog(
            this,
            "Apakah Anda yakin ingin logout?",
            "Konfirmasi Logout",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

        if (pilihan == JOptionPane.YES_OPTION) {
            sessionLogin.id_user = 0;
            
            Notifikasi.stopGlobalTimer();
            
            new WELLCOMEpage().setVisible(true);
            this.dispose();
            
        }
        

    }//GEN-LAST:event_blogoutActionPerformed

    private void bconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bconfirmActionPerformed

        try{
        String namaBaru = tnama.getText();
        String usernameBaru = Tusername.getText();
        String npmUser = tnpm.getText();
        String fakultasUser = tfakultas.getText();
        String prodiUser = tprodi.getText();
        int semesterUser = Integer.parseInt(tsemester.getText());
        String kelasUser = tkelas.getText();
        String alamatUser = talamat.getText();
        java.util.Date lahirUser = jDateChooser1.getDate();
        
        java.sql.Date sqltglLahir = new java.sql.Date(lahirUser.getTime());
        
         Connection conn = new dbconnection().getConnection();
         
         int idUser = sessionLogin.id_user;
         
        String ceksql = "SELECT * FROM users WHERE registeredUser=? AND id_user<>?";

        PreparedStatement cek = conn.prepareStatement(ceksql);
        cek.setString(1, usernameBaru);
        cek.setInt(2, idUser); 
        ResultSet rs = cek.executeQuery();
        
        if (rs.next()) {
            JOptionPane.showMessageDialog(this, "Username sudah dipakai, pilih yang lain!");
            return;
        }
        rs.close();
        cek.close();
         
         String sql = "UPDATE users SET namaUser=?, registeredUser=?, npmUser=?,fakultasUser=?,prodiUser=?,semesterUser=?,kelasUser=?,alamatUser=?,lahirUser=? WHERE id_user=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, namaBaru);
            pst.setString(2, usernameBaru);
            pst.setString(3, npmUser);
            pst.setString(4, fakultasUser);
            pst.setString(5, prodiUser);
            pst.setInt(6, semesterUser);
            pst.setString(7, kelasUser);
            pst.setString(8, alamatUser);
            pst.setDate(9, sqltglLahir);
            pst.setInt(10, idUser);
            
            pst.executeUpdate();
            pst.close();
            
            JOptionPane.showMessageDialog(this, "Data diri berhasil diperbarui!");
            
            sessionLogin.namaUser = namaBaru;
            sessionLogin.registeredUser = usernameBaru;
            
        conn.close();
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());  
        }
        
    }//GEN-LAST:event_bconfirmActionPerformed

    
    private void tnpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnpmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnpmActionPerformed

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed

    }//GEN-LAST:event_tnamaActionPerformed

    private void TusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TusernameActionPerformed

    }//GEN-LAST:event_TusernameActionPerformed

    private void TusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TusernameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TusernameFocusLost

    private void tkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tkelasActionPerformed

    private void tfakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfakultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfakultasActionPerformed

    private void tprodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprodiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprodiActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new PENGATURAN().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BAR_ATAS;
    private javax.swing.JLabel CAPTION1;
    private javax.swing.JLabel CAPTION2;
    private javax.swing.JPanel LAYAR_UTAMA;
    private javax.swing.JTextField Tusername;
    private javax.swing.JButton bconfirm;
    private javax.swing.JButton bdashboard;
    private javax.swing.JButton bkegiatan;
    private javax.swing.JButton blogout;
    private javax.swing.JButton bpengaturan;
    private javax.swing.JButton bskp;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField talamat;
    private javax.swing.JTextField tfakultas;
    private javax.swing.JTextField tkelas;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnpm;
    private javax.swing.JTextField tprodi;
    private javax.swing.JTextField tsemester;
    private javax.swing.JLabel wellcome_HOME;
    // End of variables declaration//GEN-END:variables
}
