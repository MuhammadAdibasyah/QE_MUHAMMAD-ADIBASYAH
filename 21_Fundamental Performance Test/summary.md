# Fundamental Performance Test

Performance test merupakan teknik non-functional untuk menentukan parameter sistem dalam hal responsif dan 
stabilitas dibawah berbagai beban kerja.perfomance testing mengukur kualitas atribut dari sistem seperti 
stabilitas,ketahanan(reliability) dan penggunaan sumber daya.

## Apa yang diukur dari performance testing

- performa suatu aplikasi sampai suatu batas tertentu
- bukan merupakan funtional test
- bisa dalam berbagai macam bentuk untuk memahami reliability,stability dan availability pada environtmentnya

adapun yang perlu diperhatiikan dari performance test adalah troughtput dan response data nya.

## Metode Performance Test
a) Membuat test plan

b) Menentukan metode test

   - pilih berdasarkan kondisi sistem untuk mengetahui kondisi awal sistem selalu awali dengan load test
   - pilih berdasarkan situasi yang akan dihadapi

some types of performance tests

- load test
- endurance test
- stress test
- peak test

c) smoke testing

  dilakukan untuk verify script yang sudah dibuat,apakah sistem tersebut dapat handle minimal load tanpa masalah
  sama sekali biasanya hanya 1-2 VUs.

d) Load testing

  Load testing adalah pengujian yang paling sederhan yang dilakukan untuk memahami prilaku sistem dalam keadaan
  beban tertentu,sederhananya load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak idealnya
  kita mengetahui jumlah trafic yang ada di prod sebagai nilai di load test. 

e) Stress testing

  metode ini untuk dilakukan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem,dilakukan
  bertahap menuju load normal,puncak dan melebihanya lalu turun untuk melihat process recovery.

f) Spike Testing

  sama dengan stress test namun kenaikan langsung ke puncak dalam waktu singkat tanpa memberikan scale-out,
  contohnya pada e-commerce ketika ada event flash sale ataupun event yang diatur pada waktu tertentu maka 
  user akan melakukan kunjungan secara bersamaan dalam jumlah yang sangat banyak.

g) Soak testing

  untuk mengetahui reliabilty ketika dalam tekanan dibawah puncak dalam jangka panjang (>= 1 jam).dapat mengetahui
  apakah terdapat bug pada race condition,memory leaks dll


# TASK

[task](./praktikum/task.md)