package module01.lesson05;

public class ProgramTask54 {
    public static void main(String[] args) {
        int a = 10;
        int c = a;
        int b = ++a;
        if (b >= a){
            if (c == 10){
                if ((c <= b) && (a != b)){
                    System.out.println("All statements are true.");
                } else {
                    System.out.println("One of the statements isn't true.");
                }
            } else {
                System.out.println("One of statements is true.");
            }
        } else {
            System.out.println("All statements are false");
        }
    }
}
//При дефолтном состоянии задания, выведется (One of the statements isn't true.)
//так как, переменная (b) будет иметь значение (11) после (++a), а это значит что условие (b>=a) true.
//Затем проверится следующее условие (с == 10), но (с = 10), из-за (с=a) условие true, соответственно
// программа перейдет на следующую строку. Первое выражение равно true, а вот второе false, но у нас
//оператор && он требует двух true для true на выходе поэтому следующее условие false
//  и программа переходит на строку 13. Затем программа завещается.
//Для выполнения программой 11 строки, нужно поменять условие в 10 строке с
//(if ((c <= b) && (a != b)){) на (if ((c <= b) || (a != b)){)
//Для выполнения программой 16 строки нужно поменять условие в 9 строке условие с (if (c == 10){)
//на (if (c != 10){)
//Для выполнения программой 19 строки нужно поменять условие в 8 строке условие с (if (b >= a){)
//на (if (b > a){)

