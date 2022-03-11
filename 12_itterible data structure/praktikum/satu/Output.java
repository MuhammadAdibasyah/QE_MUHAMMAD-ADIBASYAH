package satu;

import java.util.LinkedHashSet;
import java.util.Set;

public class Output {
    public static void main(String[]args){
        Set<String> nama = new LinkedHashSet<>();
        nama.add("lee");
        nama.add("jin");
        nama.add("kazuya");
        nama.add("panda");

        System.out.println(nama);
    }
}
