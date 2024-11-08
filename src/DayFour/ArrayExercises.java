package DayFour;

import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {

        // Ex 1: Declare and Initialise an Array
        // TODO- Declare and integer array of size 5 and initialize with values: {1,2,3,4,5}.

        int [] myArray = new int [5];
        myArray [0] = 1;
        myArray [1] = 2;
        myArray [2] = 3;
        myArray [3] = 4;
        myArray [4] = 5;

        // Ex 2: Access Specific Elements
        // TODO - Access and print the third element in the array {10,20,30,40,50}

        int [] myArray2 = {10,20,30,40,50};
        System.out.println(myArray2[2]);

        // Ex 3: Modify an Element
        // TODO - Given an array {5,10,15,20}, change the second element to 12 and print the entire array tp see the change.

        int [] myArray3 = {5,10,15,20};
        myArray3 [1] = 12;
        System.out.println(Arrays.toString(myArray3));

        // Ex 4: Array Length Property
        // TODO - Create an array {8,6,7,5,3,0,9} and print its length

        int [] myArray4 = {8,6,7,5,3,0,9};
        int length = myArray4.length;
        System.out.println(length);

        // Ex 5: Sum of Elements (without loop)
        // TODO - Calculate the sum of element in an array {4,2,8,1,6} and store it in a variable

        int [] myArray5 = {4,2,8,1,6};
        int sum = myArray5[0] + myArray5[1] + myArray5[2] + myArray5[3]+myArray5[4];
        System.out.println(sum);

    }
}
