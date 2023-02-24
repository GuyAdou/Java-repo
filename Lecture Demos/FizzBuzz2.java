import java.util.Scanner;

public class FizzBuzz2 {

     public static void main (String[] args){
       

        //System.out.printf("%.2f",C);
        //System.out.println();

        //heading
        System.out.printf("%-12s","Fahrenheit");
        System.out.printf("%12s","Celsus");
         // come to the next line
        System.out.println();

        // loop to convert every f from 32 to celcius
        for (Double i = 32.0; i <= 212; i++){
         Double C = ((i-32) * (5.0/9));
         //For each row, output the integer for F, left justified, with a width of 12, and the double C, 
         //right justified, with a width of 12 and a precision of 2.” 
         System.out.printf("%-12.2f",i);
         System.out.printf("%12.2f",C);
         System.out.println();

        }
     }
   }
