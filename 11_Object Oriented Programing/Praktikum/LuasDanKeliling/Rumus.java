package LuasDanKeliling;

public class Rumus {

    protected static Integer kelilingPersegi (int sisi) {

        return sisi + sisi + sisi + sisi;
    }
    protected static Integer kelilingPersegiPanjang (int panjang, int lebar) {

        return 2*(panjang + lebar);
    }
   protected static Integer kelilingSegitiga (int alas, int tinggi) {

        return alas * tinggi;
    }
}
