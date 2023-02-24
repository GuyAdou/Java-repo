import java.util.Scanner;

public class SimpleGuessingGame
{
    public static void main(String [] args)
    {

        //create random number between 1-10
        int rnumber = (int)(Math.random()*10)+ 1;
        System.out.println(rnumber);

        // take input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the generated number: ");
        int number = input.nextInt();


        // ask for user guess
        if (number == rnumber){
            System.out.println("True");
        }else if (number < rnumber){
            System.out.println("Guess higher!");
        }else{
            System.out.println("Guess lower!");
        }

        //loop the process back


        if (number != rnumber)
        {
            System.out.println("Guess the generated number: ");
            number = input.nextInt();
            System.out.println (number == rnumber);
            if (number < rnumber){
                System.out.println("Guess higher!");
            }else{
            System.out.println("Guess lower!");
            }
        }
      
        


        // print out the end of the game then the result
        System.out.println ("Go get better and try again!");
        System.out.println (rnumber);
        

    }
}
