Catatan:

1. Download chromedriver / jika menggunakan web browser yang lain dapat disesuaikan
2. Masukkan chromedriver.exe kedalam folder src/main/resources, agar mudah ditemukan
3. Buat folder com.web.ytm yang didalamnya berisi 3 folder yaitu base (sebagai pemanggilan terpusat), config sebagai
penyimpanan variabel berubah url, login email dsb agar terpusat, dan pages yang digunakan sebagai kumpulan java class
untuk menyimpan element dan fungsi variabel lain, sehingga terpusat.
4. Kemudian buat folder pada folder test > java, terdapat stepDefs yang digunakan untuk setup pemanggilan fungsi setiap
skenarionya. Dan folder testRunner yang digunakan untuk template report menggunakan cucumber.
5. Kemudian pada test > resources, terdapat folder FHomdeDetail yang berisikan file test case berupa gherkin syntax.
6. Dan ada extent.properties untuk pembuatan judul reportnya.
7. Kemudian jalankan pada folder test > resources > FHomeDetail > file yang berekstensi .feature untuk menjalankan
gherkin syntaxnya. Disini dapat dijalankan 1 keseluruhan test case atau bisa sesuai dengan testcase yang akan
di automasi
8. Setelah berhasil menjalankan maka akan muncul folder test-output yang dimana akan otomatis mengeluarkan report
dalam bentuk .pdf dan .html

Catatan untuk depedency yang dipakai:
1. selenium java
2. selenium server
3. selenium chrome driver
4. junit
5. testng
6. cucumber java
7. cucumber testng
8. cucumber adapter