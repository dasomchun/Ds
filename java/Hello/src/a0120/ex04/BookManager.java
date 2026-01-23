package a0120.ex04;

import java.util.ArrayList;

public class BookManager {

    public static void addBook(ArrayList<Book> list, String title, String author, int price) {
       list.add(new Book(title, author, price));
    }

    public static ArrayList<Book> findBooksByAuthor(ArrayList<Book> list, String author) {
        ArrayList<Book> result = new ArrayList<>(); //여러책을 반환해야 함으로 새리스트를 만들다. 원본리스트를 건드리지 않도록
        // list : 전체 도서 목록
        // author 찾고싶은 저자 이름
        // 추가 점수
        if (list == null || author == null){
            return result; //빈 리스트 반환
        }

        for(Book b :list){
            if(b.author.equals(author)){
                result.add(b);
            }
        }
        return result;
    }

    public static int getTotalPrice(ArrayList<Book> list) {
       int total = 0;
       if(list == null){
        return total;
       }
       for(Book b : list){
         total += b.price;
       }
       return total;
    }

    public static boolean removeBook(ArrayList<Book> list, String title) {
       if(list == null || title == null){
        return false;
       }
       for(int i=0; i<list.size(); i++){
        if(list.get(i).title.equals(title)){
            list.remove(i);
            return true;
            
        }
       }
       return false;
    }

}
