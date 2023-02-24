import java.util.Scanner;
public class MadLibs
{
    public static void main (String[] args)
    {
       Scanner input = new Scanner (System.in);
            System.out.println("Mad Libs");
            // takes input from the user and stores it in input then
            // assigns the variable value to name
            System.out.println("Enter name:");
            String name = input.next();
            System.out.println("Enter an activity:");
            String activity = input.next();
            System.out.println("Enter a location:");
            String location1 = input.next();
            System.out.println("Enter a number:");
            int number = input.nextInt();

            System.out.println("You entered the name: " + name);
            System.out.println("You entered the activity: " + activity);
            System.out.println("You entered the location: " +location1);
            System.out.println("You entered the number: " +number);
            
    }


}