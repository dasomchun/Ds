package JavaExam.ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("-------------------");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 검색");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 전체 출력");
            System.out.println("6. 종료");
            System.out.print("선택 > ");

            int menu;
            try {
                menu = Integer.parseInt(sc.nextLine()); 
            } catch (Exception e) { 
                System.out.println("숫자로 입력해주세요");
                continue; 
            }
           switch (menu) {
                case 1: 
                    System.out.print("이름 입력 : ");
                    String name = sc.nextLine();
                    System.out.print("나이 입력 : ");
                    int age;
                       try {
                        age = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("나이는 숫자만 입력하세요");
                        break;
                    }
                     list.add(new Student(name, age));
                    System.out.println("학생 등록완료");
                    break;
                case 2:
                     System.out.print("검색할 이름 : ");
                    String sname = sc.nextLine();
                    Student s = findStudent(list, sname);
                    if(s != null){
                        System.out.println(s);
                    }else{
                        System.out.println("학생이 없습니다.");
                    }
                    break;
                case 3 : 
                       System.out.print("수정할 학생 이름 : ");
                       name = sc.nextLine();
                       System.out.print("수정할 나이 : ");
                       
                       try {
                         age = Integer.parseInt(sc.nextLine());
                        } catch (Exception e) {
                        System.out.println("나이는 숫자만 입력하세요");
                        break;
                        }
                    if (updateStu(list,name,age)){
                        System.out.println("수정완료");
                        System.out.println(list);
                    }else{
                        System.out.println("해당 학생이 없습니다.");
                    }
                    break;
                    case 4:
                         System.out.print("삭제할 이름 : ");
                    name = sc.nextLine();
                      if(deleteStu(list,name)){
                        System.out.println("삭제 완료");
                       
                    }else{
                        System.out.println("삭제 할 학생이 없습니다.");
                    }
                    break;
                    case 5:
                    if(list.isEmpty()){ 
                        System.out.println("등록된 학생이 없습니다.");
                    }else{
                        for(Student st : list){
                            System.out.println(st);
                        }
                    }
                    break;
                    case 6:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;      
                     default:
                    System.out.println("번호를 다시 입력하세요");   

           }
    
    }
}


  

    // 학생 검색
    private static Student findStudent(ArrayList<Student> list, String name) {
         for(Student s : list){
            if(s.name.equals(name)){
               return s;
            }
        }return null;
    }
    // 학생 수정
    private static boolean updateStu(ArrayList<Student> list, String name, int newAge) {
       for(Student s : list){
        if(s.name.equals(name)){
            s.age = newAge;
            return true;
        }
       }
       return false;
        }
    // 학생 삭제
      private static boolean deleteStu(ArrayList<Student> list, String name) {
          for(int i=0; i < list.size(); i++){
         if(list.get(i).name.equals(name)){
            list.remove(i);
            return true;
         }
       }
       return false;
    }



   

  
}