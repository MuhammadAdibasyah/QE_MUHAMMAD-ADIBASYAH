package OngkosKirim;

public class Harga extends Perhitungan {

    public static void main(String[]args){
        Harga obj = new Harga();
        int harga = obj.totalHarga(5,4,3,1);
        System.out.println("Harga : Rp " + harga);
    }
}
