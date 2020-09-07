package module02.lesson02;

import module02.lesson01.Person02;

public class Cat {
  String name;
  int age;
  Breed breed;
    public Cat (String name, int age, Breed breed){
        super();
         this.name = name;
        this.age = age;
        this.breed = breed;

    }
    public String toString(){

        return "Cat{" +
                "name='" + name +
                "' age='" + age +
                "' breed='" + breed +
                "'}";

    }
}
enum Breed {
    SIAMESE,
    NEBELUNG,
    BIRMAN;
}