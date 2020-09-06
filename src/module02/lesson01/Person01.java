package module02.lesson01;

public class Person01  {
    public String name;
    public int age;
    public Person01(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString (){
     return "Person01{" +
                "name='" + name +
                "' age='" + age +
                "'}";

    }

}
