package module02.lesson02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mad",2,Breed.BIRMAN);
        Cat cat2 = new Cat("Nervous",1,Breed.NEBELUNG);
        Cat cat3 = new Cat("Calm",3,Breed.SIAMESE);
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat3.toString());
        Human human = new Human("homework");
        System.out.println(human.toString());
        Dog dog1 = new Dog("doggy");
        Dog dog2 = new Dog("doggydoggy");
        Dog dog3 = new Dog("doggy");
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.equals(dog3));
    }
}
