package module01.lesson07;

import java.util.Scanner;

public class ProgramTask72 {
    public static void main(String[] args) {
        int i = 1;
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        String month = scanner.nextLine();
        if (testString_number(month)) {
            x = Integer.parseInt(month); //преобразуем строку в int
        }
        else {
            System.out.println("(" + month + ") be careful, you entered not number,");
            System.out.println("or this number is out of bounds (Integer)");
        }
        while ((i*i) < x) {
            System.out.print((i*i) + " ");
            i++;
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