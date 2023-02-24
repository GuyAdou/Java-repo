import java.util.Scanner;

public class CentripetalForce{
    
    public static void main(String[] args) {
        final double PI = 3.14159;

        // asking the user for inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mass: ");
        double mass = input.nextDouble();

        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();

        System.out.println("Enter the orbital period: ");
        int T = input.nextInt();

        // calculating the centripetal force
        double centrif = (mass * radius)*(Math.pow(2*PI / T,2));

        System.out.println("The centripetal force is: " + centrif);
    }
}
