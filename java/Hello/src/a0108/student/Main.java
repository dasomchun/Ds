package a0108.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // 회원 3개 저장할 배열
        Student[] students = new Student[3];
        for(int i = 0; i < students.length; i++){
            System.out.println("=== 학생 ===" + (i+1) + " 정보입력");

            System.out.print(" 이름 : ");
            String name = sc.nextLine() ; 
            
            System.out.print(" 국어 : ");
            int kor = sc.nextInt();

            System.out.print(" 영어 : ");
            int eng = sc.nextInt() ;

            System.out.print(" 수학 : ");
            int math= sc.nextInt() ; 

            sc.nextLine(); //숫자입력이 끝나고 엔터제거
            students[i] = new Student(name, kor, eng, math);

            //또는
            // int eng1 = Integer.parseInt("nextLine");
            // 입력은 sc.nextLine() 통일 후 Inter.parseInt로 숫자로 변경
        }

             System.out.println("\n=== 학생 점수 ===");
         for(int i = 0; i < students.length; i++){
            students[i].showInfo();
            System.out.println("----------------");
         }
          sc.close();
    }
}
