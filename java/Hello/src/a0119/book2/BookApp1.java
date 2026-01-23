package a0119.book2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp1 {
    public static void main(String[] args) {
      ArrayList<Book1> list = new ArrayList<>();
           list.add(new Book1("자바의 정석", "남궁성"));
        list.add(new Book1("혼자 공부하는 자바", "신용권"));


        Scanner sc = new Scanner(System.in);
        boolean run =true;

        while(run){
            System.out.println("-------------");
            System.out.println("1.도서 등록");
            System.out.println("2.도서 검색");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 전체 출력");
            System.out.println("6. 종료");
            System.out.print("선택 > ");

            int menu;
             try {
                    menu = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("숫자만 입력하세요");
                    continue;
                    
                }

            switch (menu) {
                case 1:
                    //도서 등록
                    System.out.print("제목 입력 : ");
                    String title = sc.nextLine();
                    System.out.print("저자 입력 : ");
                    String author = sc.nextLine();
                      list.add(new Book1(title, author));
                    System.out.println("도서 등록 완료");
                    break;
                case 2:
                    //도서 검색
                    System.out.print("검색할 제목 : ");
                    String stitle = sc.nextLine();
                    Book1 s = findBook(list, stitle);
                    if(s != null){
                        System.out.println(s);
                    }else{
                        System.out.println("찾는 도서가 없어요");
                    }
                    break;
                case 3:
                    // 도서 수정
                    System.out.print("수정할 제목: ");
                    title = sc.nextLine();
                    System.out.print("새 저자 입력: ");
                    author = sc.nextLine();
                    if(updateBook(list,title,author)){
                        System.out.println("수정완료");
            
                    }else{
                        System.out.println("해당 도서가 없습니다.");
                    }
                    

                    break;  
                case 4:
                    // 도서 삭제
                    System.out.print("삭제할 제목 : ");
                    title = sc.nextLine();
                      if(deleteStudent(list,title)){
                        System.out.println("삭제완료");
                       
                    }else{
                        System.out.println("삭제 할 도서가 없습니다.");
                    }

                   
                    break;
                case 5:
                    // 전체 출력
                  
                    if(list.isEmpty()){ 
                        System.out.println("등록된 도서가 없습니다.");
                    }else{
                        for(Book1 bk : list){
                            System.out.println(bk);
                        }
                    }
                    break;
                case 6:
                    run = false;
                    break;      
                default:
                    System.out.println("번호를 다시 입력하세요");
            }

        }


    }

    private static boolean deleteStudent(ArrayList<Book1> list, String title) {
      for(int i=0; i < list.size(); i++){
         if(list.get(i).title.equals(title)){
            list.remove(i);
            return true;
         }
       }
       return false;
    }

    private static boolean updateBook(ArrayList<Book1> list, String title, String newAuthor) {
        for(Book1 s : list){
        if(s.title.equals(title)){
            s.author = newAuthor;
            return true;
        }
       }
       return false;
    }

    private static Book1 findBook(ArrayList<Book1> list, String stitle) {
         for(Book1 s : list){
            if(s.title.equals(stitle)){
                return s;
            }
        }
        return null;
    }

  
}

