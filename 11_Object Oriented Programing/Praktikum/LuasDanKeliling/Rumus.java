package LuasDanKeliling;

public class Rumus {

    protected static Integer luasPersegi (int sisi){
        int luasPersegi = sisi * sisi ;
        return luasPersegi;
    }
    protected static Integer luasPersegiPanjang (int panjang, int lebar){
        int luasPersegiPanjang = panjang * lebar ;
        return luasPersegiPanjang;
    }
    protected static Integer luasSegitiga (int alas, int tinggi){
        int LuasSegitiga = (alas * tinggi)/2 ;
        return LuasSegitiga;
    }
    protected static Integer kelilingPersegi (int sisi) {
        int kelilingPersegi = sisi + sisi + sisi + sisi ;
        return kelilingPersegi;
    }
    protected static Integer kelilingPersegiPanjang (int panjang, int lebar) {
        int kelilingPersegPanjang = 2*(panjang + lebar) ;
        return kelilingPersegPanjang;
    }
   protected static Integer kelilingSegitiga (int alas, int tinggi) {
        int kelilingSegitiga = alas * tinggi  ;
        return kelilingSegitiga;
    }
    static void run(){
        System.out.println("Luas");
        System.out.println("Persegi : " + luasPersegi(4));
        System.out.println("Segitiga : " + luasSegitiga(3,4));
        System.out.println("Persegi Panjang : " + luasPersegiPanjang(7,8));

        System.out.println("Keliling");
        System.out.println("Persegi : " + kelilingPersegi(4));
        System.out.println("Segitiga " + kelilingSegitiga(3,4));
        System.out.println("Persegi Panjang : " + kelilingPersegiPanjang(7,8));
    }
}
