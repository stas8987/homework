package module02.lesson01;

public class Test03 {
    public static void main(String[] args) {
        Person02 person = new Person02("Stepan", 30);
        Cat cat = new Cat("Murzik", 5, Breed.NEBELUNG ,person);
        System.out.println(cat.toString());
    }
}
