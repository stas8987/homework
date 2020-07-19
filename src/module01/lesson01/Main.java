package module01.lesson01;

public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            if (i==2||i==3){
                System.out.print((i) + " ");
            }
            for (int b = 2; b < i - 1; b++) {
                if ((i % b) != 0) {
                    if (b==i-2)
                        System.out.print((i) + " ");

                }else {b=i-1;}
            }
           // System.out.println("Hello world");
           // System.out.print("Hello world \n");
            //поиск простых чисел 
        }
    }
}

//First program