package a0119.book;

public class Book { String title;
    String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookApp [제목= " + title + ", 저자= " + author + "]";
    }

}
