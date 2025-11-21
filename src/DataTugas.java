//import java.sql.*;
//import java.util.ArrayList;
//import javax.swing.table.DefaultTableModel;
//import database.dbconnection;
//
//public class DataTugas {
//    private static ArrayList<TugasAkademik> listTugasAkademik = new ArrayList<>();
//    private static ArrayList<TugasNonAkademik> listTugasNonAkademik = new ArrayList<>();
//
//    // 🔹 Load data dari database ke ArrayList
//    public static void loadFromDatabase() {
//        listTugasAkademik.clear();
//        listTugasNonAkademik.clear();
//
//        try (Connection conn = new dbconnection().getConnection()) {
//            // === TUGAS AKADEMIK ===
//            String sqlAka = "SELECT * FROM tugas_akademik";
//            PreparedStatement pstAka = conn.prepareStatement(sqlAka);
//            ResultSet rsAka = pstAka.executeQuery();
//
//            while (rsAka.next()) {
//                TugasAkademik tugas = new TugasAkademik(
//                        rsAka.getString("nama_tugas"),
//                        rsAka.getString("deadline")  // format “yyyy-MM-dd HH:mm”
//                );
//                listTugasAkademik.add(tugas);
//            }
//
//            // === TUGAS NON AKADEMIK ===
//            String sqlNon = "SELECT * FROM tugas_nonakademik";
//            PreparedStatement pstNon = conn.prepareStatement(sqlNon);
//            ResultSet rsNon = pstNon.executeQuery();
//
//            while (rsNon.next()) {
//                TugasNonAkademik tugas = new TugasNonAkademik(
//                        rsNon.getString("nama_kegiatan"),
//                        rsNon.getString("deadline")  // format “yyyy-MM-dd HH:mm”
//                );
//                listTugasNonAkademik.add(tugas);
//            }
//
//            rsAka.close();
//            rsNon.close();
//            pstAka.close();
//            pstNon.close();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // 🔹 Getter buat list
//    public static ArrayList<TugasAkademik> getListTugasAkademik() {
//        return listTugasAkademik;
//    }
//
//    public static ArrayList<TugasNonAkademik> getListTugasNonAkademik() {
//        return listTugasNonAkademik;
//    }
//
//    // 🔹 Refresh JTable
//    public static void refreshTableTugasAkademik(DefaultTableModel model) {
//        model.setRowCount(0);
//        for (TugasAkademik tugas : listTugasAkademik) {
//            model.addRow(new Object[]{tugas.getNamaTugas(), tugas.getDeadline()});
//        }
//    }
//
//    public static void refreshTableTugasNonAkademik(DefaultTableModel model) {
//        model.setRowCount(0);
//        for (TugasNonAkademik tugas : listTugasNonAkademik) {
//            model.addRow(new Object[]{tugas.getNamaKegiatan(), tugas.getDeadline()});
//        }
//    }
//
//    public static void refreshTableDashboard(DefaultTableModel model) {
//        model.setRowCount(0);
//        for (TugasAkademik tugas : listTugasAkademik) {
//            model.addRow(new Object[]{tugas.getNamaTugas(), tugas.getDeadline(), "Akademik"});
//        }
//        for (TugasNonAkademik tugas : listTugasNonAkademik) {
//            model.addRow(new Object[]{tugas.getNamaKegiatan(), tugas.getDeadline(), "Non Akademik"});
//        }
//    }
//}
