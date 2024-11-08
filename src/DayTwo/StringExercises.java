package DayTwo;

public class StringExercises {
    public static void main(String[] args) {
        // ex 1: Convert to Uppercase
        // TODO String original = "hello world"

        String original = "hello world";
        System.out.println("Uppercase: " + original.toUpperCase());

        // ex 2: convert to Lowercase
        // TODO Convert a given string to lowercase

        String original1 = "HELLO WORLD";
        System.out.println(original1.toLowerCase());

        // ex 3: Check if String Contains a Substring
        // TODO Check if a given "Hello, world!" string contains a specific substring "world".

        String original3 = "Hello, world!";
        System.out.println(original3.contains("world"));

        // ex 4: Get the First Character of a String
        // TODO Get the first character of a string "Hello"

        String original4 = "Hello";
        System.out.println(original4.charAt(0));

        // ex 5: Replace a Character in a String
        // TODO.  Replace all occurences of "o" with "a" in a string with another character "Hello, world"

        String original5 = "Hello, world!";
        System.out.println(original5.replace('o', 'a'));

        // ex 6: Check if a String Starts and Ends with Specific Characters
        // TODO write a program that checks if a string starts with one substring and ends with another substring

        String original6 = "Hello, world!";
        System.out.println("Starts with 'Hello' : " + original6.startsWith("Hello"));
        System.out.println( "Ends with 'world!' : " + original6.endsWith("world!"));

        // ex 7: Extract a Substring Between Two Indices
        // TODO write a program that extracts a substring from a given string between two specified indices

        String original7 = "Hello, world!";
        int starIndex = 6;
        int endIndex = 12;
        System.out.println(original7.substring(starIndex, endIndex));


        // ex 8: Find the First and Last Occurrence of a Character
        // TODO write a program that finds the first and last position of a specific character in a string

        String original8 = "Saaremaa";
        char letter = 'a';

        //char first = original8.charAt(0);
        //char last = original8.charAt(original8.length()-1);

        int firstPosition = original8.indexOf(letter);
        int lastPosition = original8.lastIndexOf(letter);

        System.out.println(firstPosition);
        System.out.println(lastPosition);

        // System.out.println(original8.indexOf(letter)); - teine versioon, kuidas koodi välja printida
        // System.out.println(original8.lastIndexOf(letter)); - teine versioon, kuidas koodi välja printida

        //System.out.println(original8.indexOf('a')); - hardcore väärtus
       // System.out.println(original8.lastIndexOf('a')); - hardcore väärtus

        // ex 9: Replace a Word in a Sentence
        // TODO Write a program that replaces a specific word in a sentence with another word.

        String original9 = "Java is fun";
        System.out.println(original9.replace("fun", "awesome")); // pigem hardcore väärtus

        // teine versioon, kuidas sama koodi kirjutada

        String original91 = "Java is fun";
        String target = "fun";
        String replacement = "awesome";

        String updatedSentence = original91.replace(target, replacement);
        System.out.println(updatedSentence);




    }
}
