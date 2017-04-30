
public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Makes a MyBook sub-class to inherit from Book super class
//Makes a display() method to print respective book title, author and price
class MyBook extends Book{
        int price;
        public MyBook(String title, String author, int price){
        super(title, author);
        this.price= price;
        this.title= title;
        this.author= author;}
    
    void display(){
    System.out.println("Title: "+ title);
    System.out.println("Author: "+ author);
    System.out.println("Price: "+ price);
    
    
}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

