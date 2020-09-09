package module02.lesson04;

public class WithPrivate {
    private String name;
    private int age;
    public WithPrivate(String name, int age){
        this.name = name;
        this.age = age;
    }
    public WithPrivate(){
    }
    public void writeNameAge (String name, int age){
        this.name = name;
        this.age = age;

    }
    public   void consoleOutNameAge (){
        System.out.println(name + ", " + age);
    }
}
