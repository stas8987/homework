package module02.lesson03;

public  class Doctor extends Employee implements Intellectual {
    public Doctor(String name, int age) {
        super(name, age);
    }

    public static void heal (){
        Doctor doctor = new Doctor("NachalnicaDoctor", 37);
        doctor.speak();
        doctor.workInfo();
    }
    public static void heal (int comSpeak){
       if (comSpeak > 0) {
           speak();
       }

    }

    @Override
    public void workInfo() {
        System.out.println("Heals");
    }
}
