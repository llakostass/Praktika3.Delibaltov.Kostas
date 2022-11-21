package Nomer4;

import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*" ;
        String s = "ananas@mail.ru shtaket@com MrCredo@yandex.ru united@grib@.ru";
        Pattern p1 = Pattern. compile  (regex);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println("email: " + m1.group());
        }
    }
}