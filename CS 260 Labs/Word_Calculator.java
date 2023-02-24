import java.util.Scanner;

public class Word_Calculator {

    // step 1
    public static void main(String[] args) {
        String numberone;
        String numbertwo;
        String operator;
        double results;
        String mini;

        // step 2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a commamd: ");
        String command = input.nextLine().toLowerCase();

        // step 3
        int spaceone = command.indexOf(" ");
        int spacetwo = command.indexOf(" ", spaceone+1);
        System.out.println(spacetwo);

        numberone = command.substring(0,spaceone);
        numbertwo = command.substring(spacetwo+1);
        operator = command.substring(spaceone+1,spacetwo);
        int numbone = Integer.parseInt(numberone);
        int numbtwo = Integer.parseInt(numbertwo);

        if (spaceone == -1){
            System.out.println("Error: command does not have a first space!");
            System.exit(1);
        }else if(spacetwo == -1){
            System.out.println("Error: command does not have a second space!");
            System.exit(1);}
        else if (operator.equals("plus")){
            results = (double) numbone + numbtwo;
            System.out.printf("%.3f",results);
        }else if (operator.equals("minus")){
            results = (double) numbone - numbtwo;
            System.out.printf("%.3f",results);
        }else if (operator.equals("divide")){
            results = (double) numbone / (double) numbtwo;
            System.out.printf("%.3f",results);}
        else if (operator.equals("power")){
            results = Math.pow(numbone,numbtwo);
            System.out.printf("%.3f",results);
        }else{
            System.out.println("Error: invalid command!");
            System.exit(1);
        }

    }
}
