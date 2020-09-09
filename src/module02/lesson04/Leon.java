package module02.lesson04;

public class Leon {
    private String name;

    public Leon() {

    }

    public void reName( Leon name, String nameIn) {
        name.name = nameIn;
    }
    public  void consoleOut (){
        System.out.println(this.name);
    }
}
