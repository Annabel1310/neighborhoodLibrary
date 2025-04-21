import java.awt.print.Book;
import java.util.Scanner;

class LibraryApp{
    static Book[] books = new Book[20];

}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        loadBooks();

        while (true) {
            System.out.println("\n---Neighborhood Library ---");
            System.out.println("Show books in library");
            System.out.println("Show checked out Books");
            System.out.println("choose an option");
            String choice = input.nextLine();

        }

    }

    private static Book loadBooks() {
        for (int i = 0; i < LibraryApp.books.length; i++) {

            System.out.println("Enter book ID to check out or x to return: ");
            Scanner input = null;
            String response = input.nextLine();
            System.out.println("Enter book ID to check in: ");
            int id = Integer.parseInt(input.nextLine());
            System.out.println("Book checked in!");
            System.out.println("Invalid ID or book not checked out.");
        }
        Book findBooksById;
        int id = 0;
        {
            for (Book book : LibraryApp.books) {
                if (false) return book;
            }
        }
        Book o = null;
        Book o1 = o;
        return o1;
    }
}