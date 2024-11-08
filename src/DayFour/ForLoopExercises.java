package DayFour;

public class ForLoopExercises {
    public static void main(String[] args) {

           /* Ex 1: Find the First Even Number in a List
    // TODO - Given an array of numbers, use a for loop to find the first even number in the array.
              Once you find it, print it and exit the loop.
     */

        int[] myArray = {1, 3, 7, 4, 9, 10};

        for (int number = 0; number < myArray.length; number++) {
            if (myArray[number] % 2 == 0) { // == is equal to
                System.out.println("First even number is: " + myArray[number]);
                break; // - exit the loop once the first even number is found
            }

        }

         /* Ex 2: Print Odd Numbers from 1 to 20, Skip Multiples of 5
    // TODO - Use a for loop to print all odd numbers between 1 and 20.
              If a number is a multiple of 5, skip it using a continue.
     */
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0 && i % 5 != 0) {  // != is not equal
                System.out.println(i);
            }
        }

        for (int j = 1; j <= 20; j++) {
            if (j % 2 == 0) {
                continue;
            }

            if (j % 5 == 0) {
                    continue;
            }
            System.out.println(j);

        }





    /* Ex 3: Print Multiples of 3 up to 30, Skip Multiples of 6
    // TODO - Use a for loop to print multiples of 3 up to 30. Skip any multiples of 6 using continue.
     */

            for (int k = 3; k <= 30; k++) {
                if (k % 3 == 0) { // - checking if k is multiple of 3
                    if (k % 6 == 0) { // - checking if k is also a multiple of 6
                        continue; // if k is also a multiple of 6, skip this iteration
                    }
                    System.out.println(k);
                }

            }

            // Ex 3 teine versioon, kuidas saab
            for(int h = 3; h < 30; h+=3) {
                if (h % 6 == 0) { // - checking if k is also a multiple of 6
                    continue; // if k is also a multiple of 6, skip this iteration
                }
                System.out.println(h);
            }

    }
    }


