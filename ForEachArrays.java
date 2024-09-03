// Drake Parker 9/3/24
// ForEachArrays.java

// ForEachArrays.java

public class ForEachArrays {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my for each practice. \n");

        // Create an array of cars. Do this two different says and be able to
        // your lab partner.

        // Create a cars[] array using initializtion
        String[] cars = {"bmw", "Tesla", "Honda"};

        // Output the cars array using a for each loop.
        for (int i = 0; i <= 2; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("\n My for loop is done. ");

        // Use a for : each lop to do the same thing.
        for (String anything : cars) {
            System.out.println(anything);
        }

        // Create a String array using the new operator.
        // Create a 4 element String named myCars.
        String[] myCars = new String[4];


        // myCars[0], myCars[1], myCars[2], myCars[3]

        // Fill the newly created String[] array with data.
        myCars[0] = "Tesla";
        myCars[1] = "Gmc";
        myCars[2] = "Jeep";
        myCars[3] = "Honda";

        // Use a for : each loop to output the myCars[]
        for (String myCar : myCars) {
            System.out.println(" \n A car in myCars[] array is " + myCar);
        }

        String[] myString = new String[6000];

        // Use a for loop to fill the array with same strings
        for (int i = 0; i < 600; i++)
            // fill my array with strings
            myString[i] = "this is String number: " + (i + 1);

        /*
        // Use a for loop to fill the array woth some strings
        for (int i = 0: i < 600; i++) {
        myStrings [i] = "This is string number: " + (i + 1)
         */

        int aNum = 0;
        for (String aStr : myString) {
            // Fill my array with strings
            myString[aNum] = "This is string number: " + (aNum + 1);
        }


        // Now.... use a for : each loop to output
        for (String aStr : myString) {
            System.out.println(" An element in myString[] is " + aStr);
        }

        // Lets reverse a string.
        String myStrToReverse = "abcdefg";

        // Output the chars of myStrToReverse
        for (int i = 0; i < 7; i++) {
            System.out.println("myStrToReverse[" + i + "] is: " + myStrToReverse.charAt(i));
        }
        System.out.println("End of initial output.");

        // Create the reverse string.
        String reversedStr = "";
        // Output reversedStr.
        for (int i = 6; i >= 0; i--) {
            char charToAdd = myStrToReverse.charAt(i);
            reversedStr = reversedStr.concat(Character.toString(charToAdd));

            //  Outputt reversedStr
            System.out.println("reversedStr after reversion loop is: " + reversedStr);


        }

    }
}