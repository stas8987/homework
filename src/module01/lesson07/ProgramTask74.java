package module01.lesson07;
import java.util.Arrays;
import java.util.Scanner;

public class ProgramTask74 {
    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        String month = scanner.nextLine();
        if (testString_number(month)) {
            a = Integer.parseInt(month); //преобразуем строку в int
            char[] array = new char[a*a];
            array[a] = '*';
            for (int i = 0; i<a; i++){
                array[a-i] = '*';
                array[a+i] = '*';
                for (int b = 0; b<a*a; b++){
                    if (array[b]!=0){
                        System.out.print(array[b]);
                    }
                    else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
        else {
            System.out.println("(" + month + ") be careful, you entered not number,");
            System.out.println("or this number is out of bounds (Integer)");
             }

    }
    private static boolean testString_number(String a) throws NumberFormatException {
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
