package module02.lesson01;

public class Cat{
    String name;
    int age;
    Breed breed;
    Person02 owner;
    public Cat (String name, int age, Breed breed, Person02 owner){
        super();
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.owner = owner;
    }
    @Override
    public String toString(){

        return "Cat{" +
                "name='" + name +
                "' age='" + age +
                "' breed='" + breed +
                "' owner='" + owner.name +
                "' age='" + owner.age +
                "'}";

    }
}

enum Breed {
    SIAMESE,
    NEBELUNG,
    BIRMAN;
}

