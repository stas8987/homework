package module02.lesson01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person02 {
    String name;
    int age;
    public Person02(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person02() {

    }

    public static void meditaion(String name){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("I think - it means I exist. (" + name + ") " + dateFormat.format(date));
    }
}
