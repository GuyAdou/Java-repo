
public class red {
    public static void main(String [] args)
    {
        String enteredstring = "gravy and couscous";

        if (enteredstring.contains("Gravy")){
            int indx = enteredstring.indexOf("gravy");
            String substring = enteredstring.substring(indx,enteredstring.length()-1);
            System.out.println("The substring is: " + enteredstring);
        } else {
            System.out.println("There's no gravy");
        }
    }
}