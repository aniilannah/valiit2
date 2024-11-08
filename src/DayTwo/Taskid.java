package DayTwo;

import java.util.Scanner;

public class Taskid {
    public static void main(String[] args) {
        // 1. ülesanne
        // TODO Task: Write a program that prints "Hello, World!" to the console.
        System.out.println("Hello, World!");

        // 2. ülesanne
        // TODO Task: Write a program that takes two numbers from the user and performs basic arithmetic operations (addition, subtraction, multiplication, and division).

        Scanner sc = new Scanner(System.in);

        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Enter a number x: ");
        int x = userInput1.nextInt();

        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Enter a number y: ");
        int y = userInput2.nextInt();

        int addition = x+y;
        int subtract = x-y;
        int divide = x/y;
        int multiplication = x*y;

        System.out.println(addition);
        System.out.println(subtract);
        System.out.println(divide);
        System.out.println(multiplication);

        // 3. ülesanne
        // TODO Task: Ask the user for a number, and display whether the number is odd or even
        Scanner userInput3 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = userInput3.nextInt();

        if(number % 2 == 0) {
            System.out.println("This number is even");
        }
        else {
            System.out.println("This number is odd");

        }

        // 4 Ülesanne
        // TODO Write a Java program that takes three numbers from the user and prints the greatest number.

        Scanner userInput4 = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int n1 = userInput4.nextInt();
        System.out.println("Enter a second number: ");
        int n2 = userInput4.nextInt();
        System.out.println("Enter a third number: ");
        int n3 = userInput4.nextInt();

        if (n1>n2 && n1>n3) {
            System.out.println("The greatest: " + n1 );
        }
        else if (n2>n1 && n2>n3) {
            System.out.println("The greatest: " + n2);
        }
        else if (n3>n1 && n3>n2) {
            System.out.println("The greatest: " + n3 );
        }

    }
}
