package a1230;

public class Ex01 {
    public static void main(String[] args) {
          System.out.println("\n--- 복합 연산 예제 ---");
        int score1 = 85;
        int score2 = 90;
        int score3 = 78;
        // 1. 각 장수를 화면 인쇄
        // 2. 총점과 평균을 구해서 인쇄하시오
        // 3.  60점 이상이면 합격(true)
        // 4. 평균 90점 이상이면 우수(true)

        // 1번
        System.out.println("1번점수: " + score1);
        System.out.println("2번점수: " + score2);
        System.out.println("3번점수: " + score3);
        
        // 2번
        int total = score1 + score2 + score3;
        double avg = total / 3;
        System.out.println("총점 : " + total + "점");
        System.out.println("평균 : " + avg + "점");

        // 3번: 60점 이상이면 합격(true)
        boolean pass = avg >= 60;
        System.out.println("합격: " + pass);

        // 4번: 평균 90점 이상이면 우수(true)
        boolean good = avg >= 90;
        System.out.println("우수: " + good);
        

    }
}
