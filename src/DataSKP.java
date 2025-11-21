
import java.util.Date;
import java.util.ArrayList;
class DataSKP {
    String nama;
    String jenis;
    String kategori;
    int poin;
    Date masaBerlaku;
    String sertifikatPath;
    int idSkp; 
  

        public DataSKP(String nama, String jenis, String kategori, int poin, Date masaBerlaku, String sertifikatPath, int idSkp) {
        
             this.nama = nama;
             this.jenis = jenis;
             this.kategori = kategori;
             this.poin = poin;
             this.masaBerlaku = masaBerlaku;
             this.sertifikatPath = sertifikatPath;
             this.idSkp = idSkp;
        }

}
