package module02.lesson02;

public class Dog {
    String name;
    public Dog (String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Dog))
            return  false;
        Dog dog = (Dog)obj;
            return this.name.equals(dog.name);
    }
}
