package a0105;

import java.util.Scanner;

public class Ifelse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요");
        int avg = sc.nextInt(); //숫자로 점수를 입력
        // nextDouble() - 실수
        // next( ) - 한단어
        // nextLine() 1줄
        // next().charAt(0) 한글자
        char hak;
        if(avg >= 90){
            hak = 'A';
        }else if(avg >=80){
            hak = 'B';
        }else if(avg >=70){
            hak = 'C';
        }else if(avg >=60){
            hak = 'D';
        }else{
            hak =  'F';
        }System.out.println("당신의 학점은 : " + hak + " 입니다.");

    }
}
