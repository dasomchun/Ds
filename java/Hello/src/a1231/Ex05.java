package a1231;

public class Ex05 {
    public static void main(String[] args) {
        //윤년 2월 29일
        // 1. 4로 나누어 떨어지고
        // 2.  100으로 나눠서 떨어지는 년도 x
        // 3. 400으로 나눠서 떨어지는 년도 o
        // (4의배수 && 100의 배수 아님 || 400의 배수)

        int year = 2024;
        boolean leapYear = ((year%4 == 0 && year % 100 != 0) || year % 400 == 0);
        System.out.println(leapYear);

        if ((year%4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year +"년은 윤년입니다.");
        }else{
             System.out.println(year +"년은 윤년이 아닙니다.");
        }



    }
}
