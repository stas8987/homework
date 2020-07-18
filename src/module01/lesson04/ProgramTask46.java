package module01.lesson04;

public class ProgramTask46 {
    public static void main(String[] args) {
        int a = 4;
        int b = 0b00000011;
            System.out.println( "a = " + (a) + " b = " + (b));
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("~ a = " + (~ a));
        System.out.println("~ b = " + (~ b));
        System.out.println("a ^ b = " + (a ^ b));
    }
}
// Побитовые операции похожи, на наложение логической маски, на число.
// после применения оператора (~) переменная поменяет свой знак, на противоположный. Побитовая инверсия.