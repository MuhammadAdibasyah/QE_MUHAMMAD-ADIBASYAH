# Pengenalan RESTful API

## API & REST API

API : merupakan singkatan untuk "Application Programing Interface",API memungkinkan
komunikasi dan pertukaran data antara dua atau lebih sistem yang terpisah.

REST : merupakan singkatan dari "Representasi State Transfer"

 HTTP Method :
 - Resource : URL
 - Get : Membaca data
 - Put : Membuat/mengganti data
 - Post : Membuat data daru
 - Delete : Menghapus data yang ada

 REST API component :
 - Method
 - URL (Base URL + Path)
 - Header
 - Body
 
HTTP Response Code
- 200 : Ok
- 201 : Created
- 400 : Bad request
- 404 : Not found
- 401 : Unauthorized
- 405 : Method not Allowed
- 500 : Internal server error

## API testing

### Approach of API Testing
- megerti fungsi dari API
- dapat mengaplikasikan teknik testing
- input parameter untuk API perlu direncanakan dan ditentukan sebelumnya.
- jalankan test case dan dibandingkan antara hasil yang diharapkan dengan
  hasil yang didapatkan

### What's API testing
- API test sangat berbeda dengan GUI
- Mengirim dan mendapatkan responsenya
- Memverifikasi response yang benar dan error handling

### Kind of API testing
- Functionality
- Load Test
- Security

### Difference between API test dan Unit Test
UNIT TEST :
 - Dilakukan oleh developer
 - fungsi-fungsi terpisah
 - developer bisa mengakses source code
 - hanya dasar functionality yang di test
 - Scopenya terbatas
 - Biasanya dilakukan sebelum build

API TEST : 
- dilakukan oleh tester
- end to end
- tidak bisa mengakses source code
- hanya fungsi API saja
- Semua functional issue
- Scopenya lebih luas
- dilakukan setelah build

### API testing process
- Specification review
- Specification development
- Framework development
- Test case development
- Execution dan report

### Test case for API testing
- mendapatkan response yang sesuai dengan inputan
- apakah memberikan response atau tdak
- apakah menggangu fitur yang lain atau tidak
- update struktur data
- memodifikasi data yang sudah ada

### Best practies of API testing
- kelompokan test case kedalam beberapa kateogri
- beri judul yang sesuai pada setiap test
- harus berhati-hati ketika melakukan test yang berhubungan dengan
  menghapus sesuatu

### Types of Output of an API
- Bisa berbentuk apa saja,tapi pada umumnya JSON atau XML
- Status response apakah passed atau fail
- Memanggil fungsi API lain

### Common Types of test in API testing
- memverifikasi apakah kita mendapat respon dari API
- memverikasi apakah hasil input/request sudah sesuai atau belum
- memverikasi apakah data yang kita input/update sudah benar-benar
  berubah atau bertambah
- memverifikasi waktu response yang diberikan

### Types of bug that API testing detects
- gagal melakukan error handling pada keadaan tertentu
- kesulitan untuk tersambung dan mendapat respon API
- isu keamanan
- performance issues
- error atau warning yang tidak tepat
- struktur dari data respon tidak benar

## Advantage & Challange of testing API

### Keuntungan dari testing API
- efesiensi waktu
- bahasa yang independen
- mengurangi biaya testing
- mengurangi resiko

### Tantangan dari API testing
- kombinasi parameter,pemilihan parameter
- tidak ada GUI
- kita harus mengetahui terlebih dahulu parameter
- perlu juga mengetest error handling dari setiap API



# TASK SECTION 14

[task](./Praktikum/task.md)

test case API 

https://docs.google.com/spreadsheets/d/1sAPWUd6bFK1Op474H_6_C6pKiR8bAGLExdrMt7gRcOo/edit?usp=sharing