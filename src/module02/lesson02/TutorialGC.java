package module02.lesson02;

public class TutorialGC {
    public static void main(String[] args) {
        Object a = new Integer(100);  // Line1
        Object b = new Long(100);     // Line2
        Object c = new String("100"); // Line3
        a = null;                     // Line4
        a = c;                        // Line5
        c = b;                        // Line6
        b = a;                        // Line7
        // Rest of the code here
        //обьекту (а) будут уничтожен ссылка на обьект (с) сохранится в (a)
        //ссылка на обьект (b) сохранится в (c)
    }
}

