public class Arry {

    public static void main(String[] args) {

        // 1. Arrays declaration

        Double[] myDoubles;

        // 2. allocating memory

        myDoubles = new Double[18];

        // 3. Initialisation

        Double rand = (Double) (Math.random() * 18);

        for (int i = 0; i < 18; i++) {
            myDoubles[i] = i + rand;
        }

        myDoubles[17] = 1.234;

        // 4. Printing arrays
        // To print elements of an array you need to iterate over the array indexes to print out each
        // elements at each index.
        for (int arrayelementindex = 0; arrayelementindex < myDoubles.length; arrayelementindex++) {
            //here the loop says go at each indexes in the array and printout every elements
            //at that index until the end.
            //here I added some formating to print out the array elements with 2 decimals
            System.out.printf("%.2f", myDoubles[arrayelementindex]);
            //we go to the next line after the print out each elements
            System.out.println(" ");
        }

        // lopp calculation and averaging
        /* we intialize the two variable we need to calculate the average outside the loop
        because we need to access them in the main method*/ 
        Double total = 0.0;
        Double avg;

        /*Here we say go at each indexes in the arrays, that the number that that index and add it
         * to the next number located at the next index.*/
        for (int x = 0; x < myDoubles.length; x++) {
            total += myDoubles[x];
        }

        /*now the average calculation happens. That why we declare the variable outside the  loop
         * orthewise we wouldn't be able to access them outside of it to perform calculations. If a 
         * vaiable is global, declared in main, it accessible by all loops and the value can be pass on the 
         * methods parameters.
         */
        avg = total / myDoubles.length;
        System.out.println("the fucking average is " + avg);

    }

}