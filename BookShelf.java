import java.util.Scanner;

public class BookShelf {

    public static void main(String [] strArgs) {
        Book objBook = new Book();
        System.out.println(objBook);
        System.out.println(objBook.author());
        objBook.author("Dr. Seuss");
        System.out.println(objBook);

        Scanner objScanner = new Scanner(System.in);
        Book objBookTwo = new Book();
        System.out.println("Enter an author: ");
        objBookTwo.author(objScanner.next());
        System.out.println(objBookTwo);

        Book objBookThree = new Book();
        objBookThree.input();
        System.out.println(objBookThree);
    }
}
