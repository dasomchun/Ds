package a0107;

public class Method7 {
    public static void main(String[] args) {
        int n = 5;

        int v = volume(n);
      
        System.out.printf("한 변이 %d인 정육면체의 부피는 %d입니다.", n, v);
    }

    private static int volume(int n) {
        return n * n * n; 
    }
}