package module02.lesson03;

public class Test04 extends Employee{
    public Test04(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Test04 test04 = new Test04("Stas8987", 30);
        test04.speak();
        test04.workInfo();
    }

    @Override
    public void workInfo() {
        System.out.println("Can an abstract class be instantiated?\n Нельзя" +
                "\n" +
                "Is it possible to define a constructor for an abstract class?\n Можно" +
                "\n" +
                "Can there be a non-abstract method in an abstract class?\n Может" +
                "\n" +
                "Can there be abstract and non-abstract methods in an abstract class?\n Могут" +
                "\n" +
                "Can there be an abstract method in a non-abstract class?\n Не может" +
                "\n" +
                "Can a non-abstract method be overridden?\n Можно" +
                "\n" +
                "Are all methods of an interface abstract?\n Все методы интерфейса по-умолчанию являются публичными \n" +
                "(public) и абстрактными (abstract), а поля - public static final" +
                "\n" +
                "Is it possible to create an interface without a method?\n могут встречаться и интерфейсы без методов \n " +
                "и полей, такие как маркеры, типа Cloneable, Remote" +
                "\n" +
                "What is the difference between an abstract class and an interface?\n " +
                "1) Интерфейс описывает только поведение. У него нет состояния. А у \n" +
                "абстрактного класса состояние есть: он описывает и поведение, и состояние.\n" +
                "2) Абстрактный класс объединяет между собой классы, имеющие очень\n " +
                "близкую связь. А интерфейсы могут реализовать классы, у которых вообще нет ничего общего.\n" +
                "3) Классы могут реализовывать сколько угодно интерфейсов, но наследоваться можно только от одного класса.\n" +
                "Множественного наследования в Java нет, а множественная реализация есть.\n");

    }
}
