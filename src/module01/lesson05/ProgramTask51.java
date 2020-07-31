package module01.lesson05;

public class ProgramTask51 {
    public static void main(String[] args) {
        int a = 7;
        int b = --a;

        if (b == 7) {
            System.out.println("b = 7");
        }
    }
}
//в консоль не выведется ни одного сообщения, так как  условие не равно семи (b не равен 7).