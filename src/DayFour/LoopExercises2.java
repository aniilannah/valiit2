package DayFour;

public class LoopExercises2 {
    public static void main(String[] args) {
        printNumber();
        carLoop();
        sumOfNumbers();
        evenNumbers();
        multiplicationTable();
    }
        // Ex 1: Print Numbers 1 to 10
        // TODO - Write a program that uses a for loop to print numbers from 1 to 10
        private static void printNumber() {
            for (int number = 1; number <= 10; number++) {
                System.out.println(number);
            }
        }
        // Ex 2: Print out each car brand
        // TODO - The foreach loop (or enhanced for loop) is designed to iterate over collections or arrays w/o needing and index variable.
        //  Create an array String[] cars, define array with elements "Ford", "Honda", "Audi". Using forEach loop print each car brand to the console

        private static void carLoop() {
            String[] cars = {"Ford", "Honda", "Audi"};
            for (String car : cars) {
                System.out.println(car);
            }
        }
        // Ex 3: Sum of Numbers
        // TODO - Write a program that uses a while loop to calculate the sum of the first 100 positive integers

        private static void sumOfNumbers() {
            int sum = 0; // variable to hold the sum
            int count = 1; // start from the first positive

            while (count <= 100) {
                sum += count; // add the current number to the sum
                count++; // move to the next number
            }
            System.out.println(sum); // kui on loogsulgudes, siis ta prindib kõik arvutused välja
        }
        // Ex 4: Even Numbers Between 1 and 20
        // TODO -Write a program that uses a for loop to print all the even numbers between 1 and 20.
        //For incrementing use:  i += 1 (1 is just an example, assign a correct number instead of 1)

        private static void evenNumbers() {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println(i);
            }
        }
        // Ex 5: Multiplication Table
        // TODO - Write a program that uses a for loop to print the multiplication table of 7.
        //  Provide the table upto 7x10=70, meaning limit loop to repeat 10-times.

        private static void multiplicationTable() {
            int number7 = 7;
            for (int i = 1; i <= 10; i++) {
                System.out.println(number7 * i);
            }
        }
}
