import database.dbconnection;
import javax.swing.*;
import java.time.*;
import java.sql.*;



public class Notifikasi {
    
    private static Timer timer;
    
  public static void startGlobalTimer() {
        if (timer == null) {
            timer = new Timer(60_000, e -> Notifikasi.checkAll());
            timer.start();
            
            Notifikasi.checkAll();
        }
    }

    public static void stopGlobalTimer() {
        if (timer != null) {
            timer.stop();
            timer = null;
        }
    }
    
    
 private static boolean hasSentNotif(Connection conn, int idUser, int idJenis, String kategori, String jeniswaktu) throws Exception {
    String sql = "SELECT COUNT(*) FROM notif_sent WHERE id_user = ? AND id_jenis = ? AND kategori = ? AND jeniswaktu = ?";
    PreparedStatement pst = conn.prepareStatement(sql);
    pst.setInt(1, idUser);
    pst.setInt(2, idJenis);
    pst.setString(3, kategori);
    pst.setString(4, jeniswaktu);

    ResultSet rs = pst.executeQuery();
    rs.next();
    return rs.getInt(1) > 0;
}

 private static void saveNotif(Connection conn, int idUser, int idJenis, String kategori, String jeniswaktu) throws Exception {
    String sql = "INSERT INTO notif_sent (id_user, id_jenis, kategori, jeniswaktu, waktu_kirim) VALUES (?, ?, ?, ?, NOW())";
    PreparedStatement pst = conn.prepareStatement(sql);
    pst.setInt(1, idUser);
    pst.setInt(2, idJenis);
    pst.setString(3, kategori);
    pst.setString(4, jeniswaktu);
    pst.executeUpdate();
}

   
  
  
  public static void checkAll(){
     System.out.println("CHECK ALL RUNNING — USER ID: " + sessionLogin.id_user);
     
      checkDLTugasAkademik();
      checkDLKegiatanNonAkademik();
      checkDLSKP();
     
      
  }
  
  private static void checkDLTugasAkademik(){

      try{
           Connection conn = dbconnection.getConnection();
           
           
           String sql = "SELECT id_kegA, nama_tugas, deadline FROM kegiatan_akademik WHERE id_user = ?";
            PreparedStatement pst= conn.prepareStatement(sql);
            pst.setInt(1, sessionLogin.id_user);
            
            ResultSet rs = pst.executeQuery();
            
            LocalDateTime now = LocalDateTime.now();
            
            while (rs.next()) {
                int idKegA = rs.getInt("id_kegA");
                String nama = rs.getString("nama_tugas");
                LocalDateTime dl = rs.getTimestamp("deadline").toLocalDateTime();
                
                
                 if (dl.isBefore(now)) continue;
                
                long minutes = Duration.between(now, dl).toMinutes();
                 
                
                if(minutes >= 0 && minutes <= 1){
                     if (!hasSentNotif(conn, sessionLogin.id_user, idKegA, "akademik", "1min")) {
                    JOptionPane.showMessageDialog(null, "SEKARANG DEADLINE: " + nama +
                            "\nAYO SUBMIT SEBELUM TELAT!😁");
                    
                     saveNotif(conn, sessionLogin.id_user, idKegA, "akademik", "1min");
                     }
                    
                    continue;
                    
                } 
                
                if (minutes >= 5 && minutes <= 10){
                    if (!hasSentNotif(conn, sessionLogin.id_user, idKegA, "akademik", "5to10min")) {
                    JOptionPane.showMessageDialog(null, "Deadline " + nama + " " + minutes + " menit lagi" + 
                            "\nAyo submit sekarang sebelum telat😁");
                    
                     saveNotif(conn, sessionLogin.id_user, idKegA, "akademik", "5to10min");
                    }
                     continue;
                    
                } 
                
                if (dl.toLocalDate().equals(now.toLocalDate().plusDays(1))) {
                    if (!hasSentNotif(conn, sessionLogin.id_user, idKegA, "akademik", "besok")) {
                        JOptionPane.showMessageDialog(null, "Besok deadline: " + nama +
                            "\n Jangan sampai lupa ya!" +
                            "\nKe page tugas untuk melihat info tugas selengkapnya, semangat!😁");
                        saveNotif(conn, sessionLogin.id_user, idKegA, "akademik", "besok");
                        
                    }
                    continue;                 
                }
            }
            
      } catch (Exception e){
          e.printStackTrace();
      }
  
 }
  
  
  private static void checkDLKegiatanNonAkademik(){
    try{
        Connection conn = dbconnection.getConnection();
        String sql = "SELECT id_kegNA, namaKegiatan, CAST(CONCAT(tgl_kegiatan, ' ', waktu_kegiatan) AS DATETIME) AS deadline FROM kegiatan_nonakademik WHERE id_user = ?";
        PreparedStatement pst= conn.prepareStatement(sql);
        pst.setInt(1, sessionLogin.id_user);
        
        ResultSet rs = pst.executeQuery();
        
        LocalDateTime now = LocalDateTime.now();
        
        while (rs.next()){
            int idKegNA = rs.getInt("id_kegNA");
            String nama = rs.getString("namaKegiatan");
             LocalDateTime dl = rs.getTimestamp("deadline").toLocalDateTime();
           
              if (dl.isBefore(now)) continue;
                
                long minutes = Duration.between(now, dl).toMinutes();
                 
                
                if(minutes >= 0 && minutes <= 1){
                   if (!hasSentNotif(conn, sessionLogin.id_user, idKegNA, "nonkademik", "1min")) {
                    JOptionPane.showMessageDialog(null, "SEKARANG DEADLINE: " + nama +
                            "\nAYO SUBMIT SEBELUM TELAT!😁");
                    
                     saveNotif(conn, sessionLogin.id_user, idKegNA, "nonakademik", "1min");
                    }

                    continue;
                    
                } 
                
                if (minutes >= 5 && minutes <= 10){
                    if (!hasSentNotif(conn, sessionLogin.id_user, idKegNA, "nonakademik", "5to10min")) {
                    JOptionPane.showMessageDialog(null, "Deadline " + nama + " " + minutes + " menit lagi" + 
                            "\nAyo submit sekarang sebelum telat😁");
                    
                    saveNotif(conn, sessionLogin.id_user, idKegNA, "nonakademik", "5to10min");
                    }

                    continue;
                    
                } 
                
                if (dl.toLocalDate().equals(now.toLocalDate().plusDays(1))) {
                    if (!hasSentNotif(conn, sessionLogin.id_user, idKegNA, "nonakademik", "besok")) {
                      JOptionPane.showMessageDialog(null, "Besok deadline: " + nama +
                            "Tanggal & Waktu: " + dl +
                            "\n Jangan sampai lupa ya!" +
                            "\nKe page tugas untuk melihat informasi selengkapnya, semangat!😁");
                    
                      saveNotif(conn, sessionLogin.id_user, idKegNA, "nonakademik", "besok");
                    }
                    continue;
                }
            }
        
    } catch (Exception e){
          e.printStackTrace();
      }
}
  
  private static void checkDLSKP(){
      try{
          Connection conn = dbconnection.getConnection();
          
          String sql = "SELECT id_skp, nama, masa_tanggal FROM riwayat_skp WHERE id_user = ?";
          PreparedStatement pst = conn.prepareStatement(sql);
          pst.setInt(1, sessionLogin.id_user);
          
          ResultSet rs = pst.executeQuery();
          
          LocalDate today = LocalDate.now();
          
          while(rs.next()){
              int idSKP = rs.getInt("id_skp");
              String nama = rs.getString("nama");
              LocalDate tglExp = rs.getDate("masa_tanggal").toLocalDate();
              
          
             if (tglExp.equals(today.plusDays(1))){
                  if (!hasSentNotif(conn, sessionLogin.id_user, idSKP, "skp", "hariini")) {
                    JOptionPane.showMessageDialog(null, "Yahh, Masa kardaluarsa sertifikat prestasi: " + nama + "HARI INI😢💔"+
                         "\nJika ada prestasi lainnya, jangan lupa menambahkannya ya!?");
                 
                    saveNotif(conn, sessionLogin.id_user, idSKP, "skp", "hariini");
                }
                 
                continue;
             }
             
             if(tglExp.equals(today.plusWeeks(1))){
                  if (!hasSentNotif(conn, sessionLogin.id_user, idSKP, "skp", "1minggu")) {
                        JOptionPane.showMessageDialog(null, "Masa kardaluarsa sertifikat prestasi: " + nama + "SEMINGGU LAGI!" +
                         "\nTanggal : " + tglExp + 
                         "\nJika ada prestasi lainnya,  ya!😄");
                 
                        saveNotif(conn, sessionLogin.id_user, idSKP, "skp", "1minggu");
                  } 
                continue;
             }
             
             if(tglExp.equals(today.plusMonths(1))){
                 if (!hasSentNotif(conn, sessionLogin.id_user, idSKP, "skp", "1bulan")) {
                         JOptionPane.showMessageDialog(null, "Masa kardaluarsa sertifikat prestasi: " + nama + "SEBULAN LAGI!" +
                         "\nTanggal : " + tglExp + 
                         "\nJika ada prestasi lain, jangan lupa untuk mencatat di page poin skp!😄");
                        saveNotif(conn, sessionLogin.id_user, idSKP, "skp", "1bulan");
                }
                continue;
            }
        }
          
    }catch (Exception e){
          e.printStackTrace();
      }
  
}
}
  



