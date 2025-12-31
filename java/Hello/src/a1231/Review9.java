package a1231;

public class Review9 {
    public static void main(String[] args) {
        int score =  55;

        boolean result =  score >= 60 || score >= 90;
        System.out.println(result);  //false

        // ||는 1개만 같아도 true로 출력
        boolean isRain = true;
        System.out.println(isRain);
        // 참 -> 거짓, 거짓 -> 참
    }
}
