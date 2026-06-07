# EP4:Memahami Struktur program

## di dalam isi file Main.java
### 1. public class
isi file java wajib ada:
```
public class Main  {

}
```
``` public class ``` itu adalah keyword di java,```public``` untuk visibility,sedangkan class tuh nunjukin kalau file mian.java tuh ada isinya atau keyword untuk pembuatan class,kalau ```Main ``` adalah identifier class nya atau nama file nya,sedangkan kurung awal ``` { ``` digunakan untuk body file itu

### 2. Method/fungsi
lalu di dalam body itu kita wajib menambah method/fungsi yang berguna untuk pintu,seperti pembelajaran sebelumnya kalau sesudah file java dicompile ke class llau di run oleh JVM,si JVM ini akan mencari "pintu" method ini untuk berfungsi,berikut adalah method nya:
```
public static void main(String[] args) {

}
```
method itu harus ditulis di dalam body java nya,untuk penjelasan lebih lanjut tentang method ini kita bahas di eps selanjutnya

### 3. system print
nah bayangkan java itu adalah program yang tidak pintar,jadi kita gak tau cara akses console output nya,nah java sudah membuat yang namanya API untuk mengakses output nya dengan library:
```
System.out.println("Halo dunia");
```

* arti system adalah kita ingin mengakses dimanapun saya akan dijalankan,misal kita pakai windows,ya berarti sistem nya bakalan akses ke windows
* lalu titik adalah untuk akses komponen2 yang ada di sistem nya
* out itu untuk kita ingin mengeluarkan sesuatu dari sistem dengan mengakses console output nya
* println adalah untuk menuliskan sesuatu ke console output nya

### KESIMPULAN
* public class untuk menjelaskan kalau didalam file ada program yang bisa dijalankan oleh java yang namanya adalah nama dari class nya
* metode utama (main method) yang berfungsi sebagai titik awal eksekusi dari setiap program Java mand
* untuk menampilkan sesuatu ke console output adlaah dengan print
