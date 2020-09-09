package module02.lesson03;

public class Programmer extends Employee implements Intellectual{
    public Programmer(String name, int age) {
        super(name, age);
    }

    public static void programming (){
        Programmer programmer = new Programmer("NachalnicaProgrammer", 31);
        programmer.speak();
        programmer.workInfo();
    }
    public static void programming (int comSpeak){
        if (comSpeak > 0){
            speak();
        }
    }

    @Override
    public void workInfo() {
        System.out.println("Programming");
    }
}
