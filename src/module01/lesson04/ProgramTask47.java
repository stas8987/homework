package module01.lesson04;

public class ProgramTask47 {
    public static void main(String[] args) {
        int a = 10;
            System.out.println(a<<1);
            System.out.println(a>>1);
        a = -5;
            System.out.println(a>>>1);
    }
}
//причина по которой оператор сдвига (>>>), превротил отрицательное число в положительное, в том
//что он затразивает старший бит отвечающий за знак переменной. Оператор сдвига (>>), не затрагивает старший
//бит переменной, поэтому и не изменяет знак переменной.
