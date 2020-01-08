import java.util.*;

public class Book {
    private String author;
    private String title;
    private int numOfPages;
    private boolean fiction;

    public Book(String author, String title, int numOfPages, boolean fiction) {
        this.author = author;
        this.title = title;
        this.numOfPages = numOfPages;
        this.fiction = fiction;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public boolean isFiction() {
        return fiction;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }

    @Override
    public String toString() {
        return "Book{" + "author=" + author + ", title=" + title + ", numOfPages=" + numOfPages + ", fiction=" + fiction
                + '}';
    }

    public static void main(String[] args) {
        Scanner xnxx = new Scanner(System.in);
        String author, title;
        int pages;
        boolean fiction;
        System.out.println("Set an author's name: ");
        author = xnxx.nextLine();
        System.out.println("Set the title: ");
        title = xnxx.nextLine();
        System.out.println("Number of pages: ");
        pages = xnxx.nextInt();
        System.out.println("Is fiction or not? (true/false)");
        fiction = xnxx.nextBoolean();
        Book book = new Book(author, title, pages, fiction);
        System.out.println(book.toString());
        System.out.println("Do you want to insert another book? (Yes or No)");
        String yesOrNo = xnxx.next();
        if (yesOrNo.equals("Yes")) {
            System.out.println("Set an author's name: ");
            author = xnxx.next();
            System.out.println("Set the title: ");
            title = xnxx.next();
            System.out.println("Number of pages: ");
            pages = xnxx.nextInt();
            System.out.println("Is fiction or not? (true/false)");
            fiction = xnxx.nextBoolean();
            book.setAuthor(author);
            book.setTitle(title);
            book.setNumOfPages(pages);
            book.setFiction(fiction);
            System.out.println("This is your new book!");
            System.out.println(book.toString());
        }

    }
}