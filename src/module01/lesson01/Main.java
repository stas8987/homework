package module01.lesson01;

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
            //поиск простых чисел 
        }
    }
}

//First program