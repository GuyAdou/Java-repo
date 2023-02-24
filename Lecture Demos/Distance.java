public class Distance {
    public static void main(String [] args)
    {
        double d = distance(10, 20, 34, 0);
        System.out.println(d);
    }



    public static double distance(int p1x, int p1y, int p2x, int p2y)
    {
       double rv = Math.sqrt(Math.pow((p1x - p1y),2)+ Math.pow((p2x - p2y),2));
       return rv;
    }

}