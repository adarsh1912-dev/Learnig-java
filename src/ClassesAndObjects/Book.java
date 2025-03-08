package ClassesAndObjects;

public class Book {
    private String title;
    private String author;
    private String isbn;

    private static int totalBooks = 0;

    public static int getTotalBooks(){
        return totalBooks;
    }

    public Book(String title, String author, String isbn){
        this.author = author;
        this.isbn = isbn;
        this.title = title;
        totalBooks++;

    }

    public static void borrowBook(){
        if(totalBooks == 0){
            System.out.println("Book not available");
        }
        else {
            System.out.println("Book allocated");
            totalBooks--;
        }
    }

    public static void returnBook(){
        System.out.println("Book returned");
        totalBooks++;

    }
}
