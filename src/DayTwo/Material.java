package DayTwo;

public class Material {
    public static void main(String[] args) {

        // int number;
        // static String name = "Hanna";
        // private static int totalAccounts = 1;

       // public static void main(String[] args) {
           //   System.out.println(name);
       // }
       // public double add () {
            // double balance = 2;
           // return balance;

       // }
       // public double withdraw () {
            // double a = 2;
            // double b = 4;
            // return a * b;
       //}

       // String incomingText = "Aadress Tartu, kesklinn";
       // StringBuilder sb = new StringBuilder(incomingText);
       //sb.append(", tänav");

       //String string = sb.toString();
       // System.out.println(string);

        // Creating Strings
        char [] data = {'a', 'b', 'c'};
        String str = new String(data);

        System.out.println(str);

        // String Operations

        String incomingText = "Test";
        String myAddedText = "Code";

        System.out.println(incomingText + " " + myAddedText + " " + "working");

        String university = "University of ";
        String tallinn = "Tallinn";
        String fullName = university.concat(tallinn);

        System.out.println(fullName);

        //

        // ignoreCase

        // escape

        System.out.println("Hello\tWorld");

    }
}
