                                           AKTIVA
                                 SKP Points and Task Manager

Aktiva adalah aplikasi dekstop sederhana berbahasis **Java Swing** yang membantu mahasiswa UNSIKA dalam manajemen:
- Tugas akademik
- Aktivitas non akademik
- Poin SKP

Aplikasi ini terhubung ke database sehingga mampu memberikan notifikasi kepada pengguna untuk tugas ataupun aktivitas yang melewati deadline. Selain itu, aplikasi mampu menghitung poin SKP secara otomatis berdasarkan aturan UNSIKA yang berlaku, sehingga pengguna dapat melihat progress mereka secara jelas dari total 250 poin.

### Preview Aplikasi
Berikut ini adalah tampilan welcome dan dashboard (halaman pertama yang ditampilkan setelah pengguna berhasil login):

**Tampilan awal aplikasi (wellcome)**

<img width="591" height="431" alt="Screenshot 2025-11-25 201247" src="https://github.com/user-attachments/assets/339eba33-e116-4819-b031-27f51f4de988" />

**Tampilan Dashboard**

<img width="1184" height="874" alt="Screenshot 2025-11-20 221439" src="https://github.com/user-attachments/assets/97f6459a-04e2-4328-8180-3ec326b7db1c" />

### Fitur Aplikasi
- **Registrasi, login, dan autentikasi pengguna**
- **Dashboard yang berisi ringkasan tugas/aktivitas dan progres bar poin skp yang telah terkumpul yang otomatis muncul setelah pengguna berhasil menambah tugas atau SKP**
- **Tambah dan hapus tugas/aktivitas**
- **Halaman khusus untuk melihat list tugas/aktivitas berdasarkan Kategori: Akademik dan Nonakademik**
- **Notifikasi otomatis ketika mendekati deadline** <br>
  Notifikasi berjalan otomatis setiap aplikasi dibuka)
- **Perhitungan poin SKP otomatis berdasarkan aturan UNSIKA** <br>
  Aplikasi juga mendukung penyimpanan file/foto kegiatan. File disimpan ke folder server otomatis, sementara di database hanya disimpan nama filenya.
- **Halaman khusus untuk melihat semua daftar skp yang dicatat**
- **Halaman pengaturan akun pengguna, termasuk fitur logout**
- **Semuanya(termasuk notifikasi) terhubung dengan database MySQL**

### Teknologi yang digunakan
- NetBeans IDE
- Java (Swing)
- MySQL (xampp)

### Struktur Project
src/
nbproject/
build/
dist/
build.xml
manifest.mf

**Note:** Di dalam folder **dist** terdapat folder **lib** yang berisi file-file pendukung seperti layout, JCalendar, dan MySQL Connector (JAR).

### Anggota Kelompok
1. Ananda Fahrizal Assidiq (2410631170007)
2. Dhinara Shaffina Turham (2410631170067)
3. Dwiyandra Raysha Putra Syawal (2410631170069)
4. Nazla Arina Nurfia Sofa (2410631170096)

### 

