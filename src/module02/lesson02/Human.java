package module02.lesson02;

public class Human {
   String name;
   public Human(String name){
       this.name = name;
   }
   @Override
    public int hashCode (){
        return 100 * name.hashCode() +12345;
   }
}
