package a1231;

public class Ex10 {
    public static void main(String[] args) {
        int age = 13;
        int price = 10000;
        boolean student = true;

        boolean free = (age>= 65 || age<7);
        boolean discount = (age>=8 && (student ==true && age<=28));

        if(free){
            System.out.println("입장료 : 무료");
        }else if(discount){
            System.out.println("입장료 : " + (price /2) + "원 (50% 할인)");
        }else{
            System.out.println("입장료 : " + price + "원") ;
        }
    }
}
// ## 문제 10: 복합 조건 - 입장료 계산
// 나이와 학생 여부에 따라 입장료를 계산하는 프로그램을 작성하세요.

// **입장료 기준:**
// - 65세 이상: 무료
// - 학생(초등학생~대학생): 50% 할인 (기본 요금 10,000원)
// - 일반 성인: 10,000원
// - 7세 미만: 무료

// **요구사항:**
// - if-else if-else 문 사용
// - 나이와 학생 여부를 변수로 저장
// - 최종 입장료를 출력