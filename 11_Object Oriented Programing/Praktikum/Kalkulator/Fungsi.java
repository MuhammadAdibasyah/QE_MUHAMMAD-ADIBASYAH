package Kalkulator;

public class Fungsi {
    public static Integer penjumlahan(int a, int b){
        int jumlah = a + b ;
        return jumlah ;
    }
    public static Integer pengurangan(int a, int b){
        int kurang = a - b ;
        return kurang ;
    }
    public static Integer perkalian(int a, int b){
        int kali = a * b ;
        return kali ;
    }
    public static Integer pembagian(int a, int b){
        int bagi = a / b ;
        return bagi ;
    }
    static void run(){
        System.out.println("Penjumlahan : " + penjumlahan(3,4) );
        System.out.println("Pengurangan : " + pengurangan(15,4));
        System.out.println("Perkalian : " + perkalian(10,10));
        System.out.println("Pembagian : " + pembagian(12,3));
    }
}

