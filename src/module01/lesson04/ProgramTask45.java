package module01.lesson04;

public class ProgramTask45 {
    public static void main(String[] args) {
        boolean bOne = true;
        boolean bTwo = false;
            System.out.println("bOne = " + (bOne) + " bTwo = " + (bTwo));
            System.out.println("bOne && bTwo = " + (bOne && bTwo));
            System.out.println("bOne || bTwo = " + (bOne || bTwo));
            System.out.println("! bOne = " + (! bOne));
            System.out.println("! bTwo = " + (! bTwo));
            System.out.println("bOne ^ bTwo = " + (bOne ^ bTwo));
            System.out.println("bOne & bTwo = " + (bOne & bTwo));
            System.out.println("bOne | bTwo = " + (bOne | bTwo) + "\n");
        bTwo = true;
            System.out.println("bOne = " + (bOne) + " bTwo = " + (bTwo));
            System.out.println("bOne && bTwo = " + (bOne && bTwo));
            System.out.println("bOne || bTwo = " + (bOne || bTwo));
            System.out.println("! bOne = " + (! bOne));
            System.out.println("! bTwo = " + (! bTwo));
            System.out.println("bOne ^ bTwo = " + (bOne ^ bTwo));
            System.out.println("bOne & bTwo = " + (bOne & bTwo));
            System.out.println("bOne | bTwo = " + (bOne | bTwo));

    }
}
//логический оператор возвращает тип данных boolean (true или false).
//оператор ! отличается от других тем, что он на вход принимает только один операнд (унарный оператор).
//сокращенные отличаются от обычных тем, что они проверяют первый операнд и если он не удовлетворяет условию,
// они не проверяют второй операнд.
/*
        a. true || false         = true
        b. false && true         = false
        c. !true || 1 >= 0       = true
        d. false && 5            = неверная запись, нельзя boolean сравнивать с int.
        e. true &&! false        = true
        f. true ^! true          = true
        i. 1> = 1 || false       = true
        g. true && 5 - 5         = неверная запись, нельзя boolean сравнивать с int.

 */