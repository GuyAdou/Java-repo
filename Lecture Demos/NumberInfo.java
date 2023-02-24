import java.util.Scanner;

public class NumberInfo
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0)
        {
            System.out.println( "This is an even number");
        }else{
            System.out.println( "This is an odd   number");
        }

        if (number > 0){
            if (number > 99)
            {
            System.out.println( "Number is 3 digits");
            }else if ( number > 9){
                System.out.println ("Number is 2 digits");
            }else {
                System.out.println("Number is 1 digits");
                }

            System.out.println (number >= 1);
            System.out.println (number <= 10);
            if (number >= 1 && number <= 10){
                System.out.println("Number is between 1 and 10");
            }

        }

    System.out.println("Done.");


    }
 


}