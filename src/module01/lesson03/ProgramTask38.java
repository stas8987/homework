package module01.lesson03;

public class ProgramTask38 {
     public static void main(String[] args) {
        int a = 123;
        int b = 0;
        char[] str = new char[16]; //Массив для обработки
        int count = 0;


            System.out.println(a+" Input");

        //Convert binary
                b = a;
         do
            {
                if((b%2) != 0){str[count] = '1';}
                else {str[count] = '0'; }
                count++;
            }
         while ((b /= 2) != 0);

            for (; count >= 0; count --){System.out.print(str[count]);}
            System.out.print(" Binary \n");


         //Convert octal
         b = a;
         count = 0;
         do
         {
             str[count] = (char)(48+(b%8)); //48 это символ "0"
             count++;
         }
         while ((b /= 8) != 0);
         count--;
          for (; count >=0 ; count --){System.out.print(str[count]);}
          System.out.print(" Octal \n");

        //Convert hex value

         b = a;
         count = 0;
         do
         {
             a = b;
             a = a & 0x0f;

             if (a > 9 ){
                switch (a){
                    case 10:
                        str[count] = ('A');
                        break;
                    case 11:
                        str[count] = ('B');
                        break;
                    case 12:
                        str[count] = ('C');
                        break;
                    case 13:
                        str[count] = ('D');
                        break;
                    case 14:
                        str[count] = ('E');
                        break;
                    case 15:
                        str[count] = ('F');
                        break;
                    default:
                        break;
                }

             }else {str[count] = (char)(48+a);}

             count++;
         }
         while ((b /= 16) != 0);

         count--;

         System.out.print("0x");

            for (; count >=0 ; count --){System.out.print(str[count]);}
            System.out.print(" Hex \n");
    }
}
