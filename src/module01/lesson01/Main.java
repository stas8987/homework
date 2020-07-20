package module01.lesson01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         boolean a = false;
        for (int i = 2; i <= 100; i++) {
            for (int b = 2; b <= i - 1; b++) {
                if ((i % b) != 0) {
                    a = true;
                }else {a = false; break; }
            }
                if (i==2||a==true){
                    System.out.print((i) + " ");
                }
           // System.out.println("Hello world");
           // System.out.print("Hello world \n");
            //поиск простых чисел  перебором
        }
        System.out.println("\n вторая версия");
        int flag [] = new int[100+1];
        for (int i = 2; i < flag.length; i++) {
            if (flag[i]==0) {
                System.out.print((i) + " ");
                for (int h=i*i;h<flag.length;h+=i) {
                    flag[h] = 1;
                }
            }
        }



    }

}

//First program