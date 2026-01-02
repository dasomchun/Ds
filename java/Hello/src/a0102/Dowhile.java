package a0102;

public class Dowhile {
    public static void main(String[] args) {
        System.out.println("\n ===dowhile문===");
        int k = 10;
        do{
            System.out.println("Hellow World" +k);
            k++;
    }   while(k <=5);
    // 조건을 나중에 검사하기 때문에 최소 1번은 실행됨
    for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
    

    }
}
