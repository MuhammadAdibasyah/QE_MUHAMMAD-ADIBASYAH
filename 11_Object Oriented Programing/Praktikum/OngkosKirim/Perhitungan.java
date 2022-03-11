package OngkosKirim;

public class Perhitungan {

    protected static Integer dimensiBarang(int panjang, int lebar, int tinggi){
        int barang = panjang * lebar * tinggi ;
        return barang ;
    }
    protected static Integer total(int berat){
        if (berat <= 1) {
            int harga = 5000;
            return harga;
        }
        return null;
    }
    static void run(){
        System.out.println(dimensiBarang(5,2,4));
        System.out.println("Harga : Rp " + total(1) );
    }
}
