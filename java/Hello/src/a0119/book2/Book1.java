package a0119.book2;

public class Book1 {
    String title;
    String author;

    public Book1(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book1 [title = " +"'"+ title + "'"+", author= " +"'"+ author +"'"+ "]";
    }
    
}
