# Intruduction JMeter and Tutorial Record with JMeter

JMeter adalah perangkat lunak sumber terbuka,aplikasi desktop java 100% murni,
yang dirancang unutk memuat uji perilaku fungsional dan mengukur kinerja situs web.
awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke
fungsi pepngujian lainya.

## Keuntungan JMeter

- Open source
- Easy to use with GUI/non GUI

## Some compenents of jmeter script

- test plan 

  rencana besar tes yang akan dilakukan(parent)

- thread groups

  kumpulan thread yang menjalankan skenario yang sama

- samplers

  sebutan untuk request yang dikirim ke server

- config elements

  elemen yang digunakan untuk konfigurasi atau modifikasi sampler request yang 
  dikirim ke server

- listeners 

  perekam data yang dihasilkan dari tes

- timers

  fitur ini akan jalan duluan sebelum semua fitur yang lain bekerja

- assertions

  seperti assert pada API/Web/testing,merupakan kriteria tambahan apakah sesuai atau tidak

- pre-post processor

  fitur yang memproses response data sebelum/sesudah tes