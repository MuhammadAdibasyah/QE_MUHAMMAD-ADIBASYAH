package LuasDanKeliling;

import static LuasDanKeliling.Rumus.*;
import static LuasDanKeliling.RumusLuas.*;

public class Operasi {

    public static void main (String[]args){
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
