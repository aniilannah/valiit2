package DayFive.book;

public class Main {
    public static void main(String[] args) {
        Books bookInOtherClass1 = new Books();
        System.out.println(bookInOtherClass1.title);

        Books bookInOtherBook2 = new Books("Homo deus", "Y.N Harari", 2015);
        System.out.println(bookInOtherBook2.title);
    }


}
