package BigTask;

import java.util.ArrayList;

public class SukuKata {
        public static void main(String[] args) {

            String kata = "Kapasitas";

            ArrayList<String> output = new ArrayList<>();
            for (int i = 0; i < kata.length(); i++) {

                if (kata.charAt(i) == 'a' || kata.charAt(i) == 'i' || kata.charAt(i) == 'u' || kata.charAt(i) == 'e') {
                    output.add(".");
                }
                else if (kata.charAt(i) == 'o') output.add("_");
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < output.size(); i++) {
                stringBuilder.append(output.get(i));
            }
            String joinedString = stringBuilder.toString();
            System.out.println(joinedString);
        }
    }
