# Post Processor

test plan elements yang digunakan untuk melakukan tindakan tertentu setelah pemrosesan
permintaan sampler.post processor ini biasanya digunakan untuk mengekstrak nilai-nilai tertentu
dari respon permintaan sampler, kita dapat mengekstrak nilai variabel sesi
dari permintaan HTTP dan meneruskan nilai variabel sesi ke permintaan berikutnya.

## JSON Path

Digunakan untuk ekstrak isi dari JSON response,beberapa ekpresi yang umum digunakan :

- $ = root element
- . = child operator(object)
- [] = child operator(array)
- .. = recursive descent (langsung ke objek)
- (*) = wildcard (all things)
- [start:end] = array slice operator borrowed