package DayFive.book;

public class Books {

        String title;
        String author;
        int yearPublished;

        public Books() {
            title = "Unknown";
            author = "Unknown";
            yearPublished = 1800;
        }

    public Books (String title, String author, int yearPublished) {

        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }


}
