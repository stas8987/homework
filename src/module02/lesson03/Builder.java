package module02.lesson03;

public class Builder extends Employee implements Strongman{
    public Builder(String name, int age) {
        super(name, age);
    }

    public static void build () {
        Builder builder = new Builder("NachalnicaBuilder", 30);
        builder.speak();
        builder.workInfo();
    }

    public static void build (int comSpeak) {
        if (comSpeak > 0){
            speak();
        }
    }

    @Override
    public void workInfo() {
        System.out.println("Builds");
    }
}
