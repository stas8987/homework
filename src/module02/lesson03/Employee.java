package module02.lesson03;

public abstract class Employee {
    static String name; //поля класса или переменные экземпляра.
    static int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
//метод получения имени
    public void settingName(String name) {
        this.name = name;
    }
//Метод получения возраста
    public void settingAge(int age) {
        this.age = age;
    }

    public static void speak() {
        System.out.println("Hi, my name is \"" + name + "\"." + "I'm \"" + age + "\" years old.");
    }
    public abstract void workInfo();
}
