package Volume;

public class Input {

    protected static  Integer volumeKubus (int sisi){
        int balok = sisi * sisi * sisi ;
        return balok;
    }
    protected static Integer volumeBalok (int panjang, int lebar, int tinggi){
        int volumeBalok = panjang * lebar * tinggi ;
        return volumeBalok;
    }
    protected static int volumeTabung (int r, int tinggi){
        int volumeTabung =  (22 * 7 * 7 * 10)/7;
        return volumeTabung;
    }

}
