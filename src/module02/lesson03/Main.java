package module02.lesson03;

import module02.lesson01.Person01;

public class Main {
    public static void main(String[] args) {
        Programmer programmer01 = new Programmer("Programmer1", 24);
        programmer01.programming(1);
        programmer01.workInfo();
        programmer01.think();
        Programmer programmer02 = new Programmer("Programmer2", 25);
        programmer02.programming(2);
        programmer02.workInfo();
        programmer02.think();
        Programmer programmer03 = new Programmer("Programmer3", 26);
        programmer03.programming(3);
        programmer03.workInfo();
        programmer03.think();

        Doctor doctor01 = new Doctor("Doctor1", 21);
        doctor01.heal(1);
        doctor01.workInfo();
        doctor01.think();
        Doctor doctor02 = new Doctor("Doctor2", 22);
        doctor02.heal(1);
        doctor02.workInfo();
        doctor02.think();
        Doctor doctor03 = new Doctor("Doctor3", 23);
        doctor03.heal(1);
        doctor03.workInfo();
        doctor03.think();

        Builder builder01 = new Builder("Builder1", 18);
        builder01.build(1);
        builder01.workInfo();
        builder01.drag();
        Builder builder02 = new Builder("Builder2", 19);
        builder02.build(2);
        builder02.workInfo();
        builder02.drag();
        Builder builder03 = new Builder("Builder3", 20);
        builder03.build(3);
        builder03.workInfo();
        builder03.drag();

    }
}
