PENAMBAHAN SPRING FRAMEWORK PADA APLIKASI CATATAN

Perubahan utama:
1. pom.xml: menambahkan dependency spring-context 6.2.2.
2. SpringConfig.java: @Configuration dan @ComponentScan mengaktifkan pemindaian bean Spring.
3. AplikasiDao.java: @Repository mendaftarkan DAO sebagai bean Spring.
4. Aplikasicatatan.java: @Component mendaftarkan tampilan sebagai bean dan constructor injection
   menerima AplikasiDao dari Spring.
5. main(): membuat AnnotationConfigApplicationContext lalu mengambil bean Aplikasicatatan.

Peran teknologi:
- Spring Framework: mengelola object/bean dan dependency injection.
- Hibernate: tetap menangani ORM dan operasi database melalui Session.
- Java Swing: tetap menjadi antarmuka desktop.

Cara menjalankan:
1. Pastikan JDK 17 dan Maven terpasang.
2. Siapkan MySQL dan buat database aplikasi_catatan_hibernate.
3. Import/execute file catatan.sql jika database/tabel belum tersedia.
4. Periksa username dan password MySQL di HibernateUtil.java.
5. Buka terminal di folder project (folder yang berisi pom.xml).
6. Jalankan: mvn clean compile
7. Jalankan: mvn exec:java

Catatan:
Integrasi ini menambahkan Spring Core/Context (IoC dan Dependency Injection) ke aplikasi
desktop Swing yang sudah ada. Ini BUKAN migrasi ke Spring Boot atau aplikasi web Spring MVC.
Konfigurasi koneksi dan transaksi Hibernate masih dikelola oleh kode Hibernate yang sudah ada.
