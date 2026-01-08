package a0107;

public class RandomNum {
    public static void main(String[] args) {
        int n =  rollDie();
        System.out.printf("주사위의 눈: %d" , n );
    }

    private static int rollDie() {
      double x = 6 * Math.random();
      int temp = (int) x; // 형변환 (다운캐스팅)
      return temp + 1;
    }
}
