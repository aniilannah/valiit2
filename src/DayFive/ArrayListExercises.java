package DayFive;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercises {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("James");
        listOfNames.add("Jack");
        listOfNames.add("Jill");

        System.out.println(listOfNames);

        for (String name : listOfNames) {
            System.out.println(name);
        }

        listOfNames.remove(1);
        System.out.println("");

        System.out.println("Print out name: " + listOfNames.get(1));

        System.out.println(" ");

        listOfNames.set(1, "John");

        System.out.println("Names after modification: " + listOfNames);
    }
}
