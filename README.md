/*
 *Jesse Rangel
 *ITSE 1301
 *Exercise 12
 */

//Create a Book Class that has author and book information with getters and setters

import java.util.Scanner;

public class Book {

    Scanner objScanner = new Scanner(System.in);
    private String strAuthor = "";
    private String strTitle = "";

    public Book() {
        this.author("Dr. Seuss");
        this.title("Green Eggs and Ham");
    }

    public Book(String pstrAuthor) {
        this.author(pstrAuthor);
        this.title("Green Eggs and Ham");
   }

   public Book(String pstrAuthor, String pstrTitle) {
       this.author(pstrAuthor);
       this.title(pstrTitle);
   }

   public void input() {
       System.out.println("Please enter book info");
       this.inputAuthor();
       this.inputTitle();
   }

   public String author() {
       return this.strAuthor;
   }

   public void author(String pstrAuthor) {
       this.strAuthor = pstrAuthor;
   }

   public void inputAuthor() {
       System.out.print("Enter an author: ");
       this.author(objScanner.nextLine());
   }

   public String title() {
       return this.strTitle;
   }

   public void title(String pstrTitle){
       this.strTitle = pstrTitle;
   }

   public void inputTitle() {
       System.out.print("Enter a title: ");
       this.title(objScanner.nextLine());
   }

   public String toString() {
       return this.author() + " - " + this.title();
   }
}
