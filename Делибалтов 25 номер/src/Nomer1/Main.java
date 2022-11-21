package Nomer1;

import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        String regex = "(\\d+)([.]\\d+)?\\s(?:USD|EU|RUB)";
        String s = "12.32 134.42 EU 1234 94 USD 75.3 RUB";
        Pattern p1 = Pattern. compile  (regex);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println("Денежная валюта: " + m1.group());
        }
    }
}

