package Nomer5;

import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        String regex = ".*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z]).*";
        String s = "aA3poakxaop";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);
        boolean b = m1.matches();
        if(b) {
            System.out.println("Пароль Подходит");
        }
        else {
            System.out.println("Пароль не подходит");
        }


    }
}

