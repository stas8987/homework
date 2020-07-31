package module01.lesson05;

public class ProgramTask52 {
    public static void main(String[] args) {
        int c = 3;
        int d = 2;

        if (c == d++) {
            System.out.println("It is 'if' statement!");
        } else {
            System.out.println("It is 'else' statement!");
        }
    }
}
//косяк однако, скорее опечатка в 8 строке, если оставить как есть то,
//компелятор будет пытатся связатся с Марсом. Если заменить (=) на (==)
//консоль выведет It is 'else' statement! так как условие, не будет равно
// из-за того что, d изменится только после проверки условия.
