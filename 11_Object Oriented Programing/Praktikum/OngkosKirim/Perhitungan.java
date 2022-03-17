package OngkosKirim;

public class Perhitungan {

    protected static Integer totalHarga(int panjang, int lebar, int tinggi,int berat){
        int volume = panjang * lebar * tinggi ;
        int harga = 0;
        if (volume <= 50){
            harga = berat*5000;
            return harga;
        }
        else {
            harga = (volume/50)*5000;
            return harga;
        }
    }
}
