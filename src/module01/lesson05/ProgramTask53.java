package module01.lesson05;

public class ProgramTask53 {
    public static void main(String[] args) {
        int a = 34;
        int b = 2;
        int c = 78;

         if (a > b && b > c){
             System.out.println("max " + a + " min " + c);
         }
         else{
             if (a > c && c > b){
                 System.out.println("max " + a + " min " + b);
             }
             else{
                 if (b > c && c > a){
                     System.out.println("max " + b + " min " + a);
                 }
                 else {
                     if (b > a && a > c){
                         System.out.println("max " + b + " min " + c);
                     }
                     else {
                         if (c > a && a > b){
                             System.out.println("max " + c + " min " + b);
                         }
                         else{
                             if(c > b && b > a){
                                 System.out.println("max " + c + " min " + a);
                             }
                             else{
                                 System.out.println("error input data, data is repeated!");
                             }
                         }

                     }
                 }
             }
         }
    }
}