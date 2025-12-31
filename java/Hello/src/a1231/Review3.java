package a1231;

public class Review3 {
    public static void main(String[] args) {
        int kor = 84;
        int eng = 90;
        int math = 70;

        int total =kor+eng+math;
        // double avg = (double)total / 3;
        double avg = total / 3.0;
        // 상수인 3을 실수형태일 3.0으로 계산하면 실수 계산이 된다.

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);

    }
}
