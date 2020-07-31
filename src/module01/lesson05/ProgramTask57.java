package module01.lesson05;

import java.util.Scanner;

public class ProgramTask57 {
    public static void main(String[] args) {
        System.out.println("Enter the day of the week.");
        boolean flag_out = false;
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next().toLowerCase(); // it can be any day
do {
    switch (day) {
        case "monday":
            System.out.println("This is the first day of the week");
            flag_out = true;
            break;
        case "tuesday":
            System.out.println("This is the second day of the week");
            flag_out = true;
            break;
        case "wednesday":
            System.out.println("This is the third day of the week");
            flag_out = true;
            break;
        case "thursday":
            System.out.println("This is the fourth day of the week");
            flag_out = true;
            break;
        case "friday":
            System.out.println("This is the fifth day of the week");
            flag_out = true;
            break;
        case "saturday":
            System.out.println("This is the sixth day of the week");
            flag_out = true;
            break;
        case "sunday":
            System.out.println("This is the seventh day of the week");
            flag_out = true;
            break;
        case "exit":
            flag_out = true;
            break;
        default:
            System.out.println("Such day of the week doesn't exist.");
            System.out.println("try again, or enter exit and hit enter" );
            day = scanner.next().toLowerCase();
            break;
    }
}
while(flag_out != true);
    }
}
