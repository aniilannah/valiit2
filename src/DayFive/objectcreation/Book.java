package DayFive.objectcreation;

public class Book {
    String title;
    String author;
    int yearPublished;

    // default constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
        yearPublished = 1900;
    }
   // parameterized constructor
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Tõde ja õigus", "A.H. Tammsaare", 1933);
        Book book2 = new Book();

        // Calling the method to display details of each book
        book1.displayDetails();
        book2.displayDetails();
    }

    //Method to display book details
    private void displayDetails() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(yearPublished);
    }
}