
public class randomletter{
    public static void main(String [] args)
    {

        int random = (int)(Math.random() * 100);
        
        if (random >= 0 && random <= 5) {
            System.out.println("C, the random number is between 0 and 59, inclusive");
        } else if (random >= 0 && random <= 29) {
            System.out.println("B, the random number is between 0 and 29, inclusive");
        } else if (random >= 0 && random <= 59) {
            System.out.println("A, the random number is between 0 and 5, inclusive");
        } else {
            System.out.println("D, the random number is between 0 and 5, inclusive");
}
}
}