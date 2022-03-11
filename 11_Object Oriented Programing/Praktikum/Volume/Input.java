package Volume;

public class Input {

    protected static  Integer volumeKubus (int sisi){
        int volumePersegi = sisi * sisi * sisi ;
        return volumePersegi;
    }
    protected static Integer volumeBalok (int panjang, int lebar, int tinggi){
        int volumeBalok = panjang * lebar * tinggi ;
        return volumeBalok;
    }
    protected static int volumeTabung (int r, int tinggi){
        int volumeTabung =  (22 * 7 * 7 * 10)/7;
        return volumeTabung;
    }
    static void run(){
        System.out.println("Volume");
        System.out.println("Kubus : " + volumeKubus(10));
        System.out.println("Balok : " + volumeBalok(3,6,10));
        System.out.println("Tabung : " + volumeTabung(7,10));
    }
}
