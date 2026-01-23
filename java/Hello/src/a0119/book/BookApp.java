package a0119.book;

import java.util.ArrayList;

public class BookApp {
    public static void main(String[] args) {
          ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("자바의 정석", "남궁성"));
    list.add(new Book("혼자 공부하는 자바", "신용권"));
    list.add(new Book("이것이 자바다", "신용권"));

    printAll(list);

    System.out.println("=== 수정 ===");
    boolean result = updateBook(list, "자바의 정석", "남궁성(개정판)");
     if(result){
            System.out.println("수정 완료");
        }else{
            System.out.println("수정실패");
        }
       
    printAll(list);

    System.out.println("=== 삭제 ===");
    boolean result1 = deleteBook(list, "혼자 공부하는 자바");
     if(result1){
            System.out.println("삭제 완료");
        }else{
            System.out.println("삭제실패");
        }

    printAll(list);

    System.out.println("=== 검색 ===");
    Book b = findBook(list, "이것이 자바다");
    System.out.println(b);

        System.out.println();
    //  printAll(list);
    }

   

    private static Book findBook(ArrayList<Book> list, String title) {
        for(Book b : list){
        if(b.title.equals(title)){
            return b;
        }
       
       }
        return null;
    }



    private static boolean deleteBook(ArrayList<Book> list, String title) {
        for(int i =0; i< list.size(); i++){
            if(list.get(i).title.equals(title)){
                list.remove(i);
                return true;
            }
        }
        return false;
    }



    private static boolean updateBook(ArrayList<Book> list, String title, String newauthor) {
      for(Book b : list){
            if(b.title.equals(title)){
                b.author = newauthor;
                return true;
            }
        }
        return false;
    }
     private static void printAll(ArrayList<Book> list) {
         for(Book b : list){
         System.out.println(b);
       }
    }


}

// # 도서 관리 시스템 - 실습 문제

// ## 📚 문제 설명

// 도서 정보를 관리하는 프로그램을 작성하세요. 
// 도서의 제목과 저자 정보를 저장하고, 검색, 수정, 삭제, 전체 출력 기능을 구현하세요.

// ---

// ## 📋 요구사항

// ### 1. Book 클래스 작성
// - **필드**
//   - `title` (String): 도서 제목
//   - `author` (String): 저자 이름
// - **생성자**
//   - `Book(String title, String author)`: 제목과 저자를 받는 생성자
// - **메서드**
//   - `toString()`: 도서 정보를 문자열로 반환
//     - 형식: `"Book{title='제목', author='저자'}"`

// ### 2. BookApp 클래스 작성
// 다음 기능을 구현하는 static 메서드들을 작성하세요:

// #### 2.1 전체 출력 메서드
// ```java
// static void printAll(ArrayList<Book> list)
// ```
// - 리스트에 저장된 모든 도서 정보를 출력

// #### 2.2 검색 메서드
// ```java
// static Book findBook(ArrayList<Book> list, String title)
// ```
// - 제목으로 도서를 검색하여 반환
// - 찾지 못하면 `null` 반환

// #### 2.3 수정 메서드
// ```java
// static boolean updateBook(ArrayList<Book> list, String title, String newAuthor)
// ```
// - 제목으로 도서를 찾아 저자 정보를 수정
// - 성공하면 `true`, 실패하면 `false` 반환

// #### 2.4 삭제 메서드
// ```java
// static boolean deleteBook(ArrayList<Book> list, String title)
// ```
// - 제목으로 도서를 찾아 삭제
// - 성공하면 `true`, 실패하면 `false` 반환

// ### 3. main 메서드
// 다음과 같이 동작하도록 작성하세요:

// ```java
// public static void main(String[] args) {
//     ArrayList<Book> list = new ArrayList<>();
//     list.add(new Book("자바의 정석", "남궁성"));
//     list.add(new Book("혼자 공부하는 자바", "신용권"));
//     list.add(new Book("이것이 자바다", "신용권"));

//     printAll(list);

//     System.out.println("=== 수정 ===");
//     updateBook(list, "자바의 정석", "남궁성(개정판)");
//     printAll(list);

//     System.out.println("=== 삭제 ===");
//     deleteBook(list, "혼자 공부하는 자바");
//     printAll(list);

//     System.out.println("=== 검색 ===");
//     Book b = findBook(list, "이것이 자바다");
//     System.out.println(b);
// }
// ```

// ---

// ## 🎯 실행 결과 예시

// ```
// Book{title='자바의 정석', author='남궁성'}
// Book{title='혼자 공부하는 자바', author='신용권'}
// Book{title='이것이 자바다', author='신용권'}
// === 수정 ===
// Book{title='자바의 정석', author='남궁성(개정판)'}
// Book{title='혼자 공부하는 자바', author='신용권'}
// Book{title='이것이 자바다', author='신용권'}
// === 삭제 ===
// Book{title='자바의 정석', author='남궁성(개정판)'}
// Book{title='이것이 자바다', author='신용권'}
// === 검색 ===
// Book{title='이것이 자바다', author='신용권'}
// ```

// ---

// ## 💡 힌트

// 1. **문자열 비교**: `==` 대신 `equals()` 메서드 사용
// 2. **삭제 메서드**: 인덱스가 필요하므로 일반 for문 사용
// 3. **수정 메서드**: 객체의 필드를 직접 수정
// 4. **검색 메서드**: 찾지 못하면 `null` 반환

// ---

// ## ✅ 체크리스트

// - [ ] Book 클래스에 필드, 생성자, toString() 메서드 구현
// - [ ] printAll() 메서드 구현
// - [ ] findBook() 메서드 구현 (null 반환 처리)
// - [ ] updateBook() 메서드 구현 (boolean 반환)
// - [ ] deleteBook() 메서드 구현 (boolean 반환)
// - [ ] main 메서드에서 모든 기능 테스트

// ---

// ## 📝 추가 도전 과제 (선택사항)

// 1. 같은 저자의 도서를 모두 찾는 메서드 추가
//    ```java
//    static ArrayList<Book> findBooksByAuthor(ArrayList<Book> list, String author)
//    ```

// 2. 도서 개수를 반환하는 메서드 추가
//    ```java
//    static int getBookCount(ArrayList<Book> list)
//    ```

// 3. 도서 제목으로 정렬하는 메서드 추가
//    ```java
//    static void sortBooksByTitle(ArrayList<Book> list)
//    ```
