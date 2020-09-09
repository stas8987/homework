package module02.lesson03;

public class Test01 extends Employee {

    public Test01(String name, int age) {
        super(name, age);
    }

    @Override
    public void workInfo() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01("NachalnicaPrivet", 34);
        test01.workInfo();
        test01.speak();
        test01.settingName("PrivetIdler");
        test01.settingAge(27);
        test01.speak();
    }
}

