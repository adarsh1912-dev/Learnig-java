package ClassesAndObjects;

public class Library {
    public static void main(String[] args) {
        Book Book1 = new Book("Bhagvad gita", "Vyasa Dev", "1234");
        Book Book2 = new Book("Ramayan","Valmiki", "4567");
        Book1.borrowBook();
        Book2.borrowBook();
        Book1.returnBook();
        System.out.println(Book.getTotalBooks());


    }
}
