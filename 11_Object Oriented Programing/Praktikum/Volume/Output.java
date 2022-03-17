package Volume;

public class Output extends Input {

    public static void main(String[]args){
        System.out.println("Volume");
        System.out.println("Kubus : " + volumeKubus(10));
        System.out.println("Balok : " + volumeBalok(3,6,10));
        System.out.println("Tabung : " + volumeTabung(7,10));
    }
}
