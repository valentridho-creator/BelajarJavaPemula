# Eps 2: Belajar Java [Dasar] - 02 - Cara Kerja Java
Berikut adalah link nya:
https://youtu.be/OrgFwUl2tzQ?si=Tuo-d8y-TTZooLYi

## 1. Java compiler
di eps sebelumnya,kita sudah belajar yang namanya compiler nya bekerja,ini hanya untuk refreshing aja sekali lagi,nah disini kita koding di source code(main.java) dan akan dikompile ke Byte code(main.class) dan akan di running oleh Virtual java machine,berikut adalah detail nya:

### 1. Source code(Main.java)
ini adalah bahasa yang mudah dipahami oleh kita sebagai manusia,seperti di bawah ini:
<img width="732" height="281" alt="image" src="https://github.com/user-attachments/assets/feca52ea-7cb9-4f5f-b02c-0668e6c78ba1" />

lalu setelah itu kode sintaks di atas akan di compile oleh javac(java compiler) dan akan menghasilkan bahasa yang bisa dipahami oleh mesin nya yang disebut Byte code(Main.class)

### 2. Byte code (Main.class) 
ini adalah bahasa yang dipahami mesin nya(JVM),contoh nya adalah seperti berikut:
<img width="665" height="593" alt="image" src="https://github.com/user-attachments/assets/4ae8567e-97f4-430e-9f2a-42ec89aebe21" />

### 3. kesimpulan
<img width="1817" height="975" alt="image" src="https://github.com/user-attachments/assets/0453872a-bd06-48fc-a270-9f2344deb0c3" />
ya kurang lebih penjelasan mudah nya seperti di atas,Source code adalah tempat untuk menulis sintaks yang bisa kita pahami,lalu sintaks itu akan compile oleh javac menjadi bahasa yang bisa dipahami oleh java virtual machine (JVM) yaitu Byte code

### 4. compiler nya
cara kerja compiler ini sebenar nya cukup mudah,kita tinggal buat aja sintaks nya dengan bahasa pemrograman yang kita pahami (source code),lalu kita simpan,dan kita jalankan dengan komen ``` javac main.java``` dan akan muncul file hasil compile nya yaitu byte code nya (Main.class) yaitu bahasa yang akan diproses oleh mesin nya,kurang lebih cara kerja nya seperti ini:
<img width="557" height="293" alt="image" src="https://github.com/user-attachments/assets/36374640-d9fc-42bb-b56d-b7e070a326e1" />

bisa dilihat ya disitu kalo misalnya saat kita sudah membuat source code nya akan muncul file nya dengan ```ls``` lalu saat kita compile dengan javac,akan muncul 1 file baru yaitu file byte code nya

### 5. javac execute
<img width="468" height="303" alt="image" src="https://github.com/user-attachments/assets/40ecaace-e962-41ed-b47f-eec98b839955" />

karena file byte code nya sudah ada,tinggal kita jalankan aja dengan ```java Main``` dan nanti akan muncul hasil output nya,proses ini sendiri dilakukan oleh Java Virtual Machine (JVM)

## 2. IDE (Integrated Development Environment)
nah,semua proses compiler di atas kayaknya terlalu ribet yah?harus buat byte code nya dulu,lalu di eksekusi nya pake komen lagi,gimana kalo file java nya banyak?nah disinilah IDE hadir
IDE adalah perangkat lunak yang menggabungkan alat pemrograman penting—seperti editor kode, compiler/interpreter, dan debugger—ke dalam satu antarmuka grafis (GUI) terpadu
ada 3 IDE yang populer yang bisa digunakan di mutiple platform (windows,Mac dan Ubuntu)
<img width="1785" height="709" alt="image" src="https://github.com/user-attachments/assets/69f20d47-59db-4fed-8efb-fed0947cecaa" />

Bebas mau pilih yang mana 
