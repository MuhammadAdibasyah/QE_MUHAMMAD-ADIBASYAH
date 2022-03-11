package satu;

import java.util.LinkedHashSet;
import java.util.Set;

public class NomorSatu {

    public static void main(String[]args){
        Set<String> nama = new LinkedHashSet<>();
        nama.add("kazuya");
        nama.add("jin");
        nama.add("lee");
        nama.add("kazuya");
        nama.add("feng");

        System.out.println(nama);
    }
}
