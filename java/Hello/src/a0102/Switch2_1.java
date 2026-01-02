package a0102;

import java.util.Scanner;

public class Switch2_1 {
    public static void main(String[] args) {
        // 숫자 입력 -> 요일 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("요일 번호 입력(1~7):");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("월");
            break;
            case 2:
                System.out.println("화");
            break;
            case 3:
                System.out.println("수");
            break;
            case 4:
                System.out.println("목");
            break;
            case 5:
                System.out.println("금");
            break;
            case 6:
                System.out.println("토");
            break;
            case 7:
                System.out.println("일");
            break;
        
            default:
                System.out.println("잘못된 숫자");
                break;
        }
    
    
    
    }
}
