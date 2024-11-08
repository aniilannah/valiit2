package DayFive;

import java.util.ArrayList;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {

        // Ex 1: Find and Fix the Index Out of Bounds Error  - tehtud
        // TODO - correct te code

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }


        // Ex 2: Removing Elements from a List in a Loop  tehtud
        // TODO -

        List<Integer> number = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            number.add(i);
        }

        for (int i = number.size(); i >= 10; i--) {
            if (number.get(i) % 2 == 0) {
                number.remove(i);
            }
        }
        System.out.println("List after removing even numbers: " + number);
    }

    }

    // = oli üle


