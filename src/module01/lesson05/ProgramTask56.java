package module01.lesson05;

import java.util.Scanner;

public class ProgramTask56 {
    public static void main(String[] args) {
        String[] season = new String [] {"winter", "spring", "summer", "autumn"};
        Scanner scanner = new Scanner(System.in);
        boolean flag_out = false;
        System.out.println("Enter any number.");
        String month = scanner.nextLine();

  do {
    switch (month) {
        case "12":
        case "1":
        case "2":
            System.out.println(month + " month " + season[0]);
            flag_out=true;
            break;
        case "3":
        case "4":
        case "5":
            System.out.println(month + " month " + season[1]);
            flag_out=true;
            break;
        case "6":
        case "7":
        case "8":
            System.out.println(month + " month " + season[2]);
            flag_out=true;
            break;
        case "9":
        case "10":
        case "11":
            System.out.println(month + " month " + season[3]);
            flag_out=true;
            break;
        case "exit":
            flag_out=true;
            break;
        default:
            System.out.println(month + " error month ");
            System.out.println("re-enter month number or (exit) console and press enter");
            month = scanner.nextLine();
             break;
    }

}
        while (flag_out != true);
    }
}
