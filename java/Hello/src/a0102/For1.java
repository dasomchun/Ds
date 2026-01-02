package a0102;

public class For1 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

         for(int j=10; j>=1; j--){
            System.out.println(j);
        }
         for(int k=0; k<=10; k+=2){
            System.out.println(k);
        }

        int sum =0;
         for(int m=1; m<=10; m++){
          sum = sum + m;
        }
        System.out.println("1~10 합:" + sum);

        for(int e=1; e<=20; e++)
            if(e % 2 ==0){
                System.out.println(e);
            }
        System.out.println("==== 구구단 2단");
        for(int i=1; i<=9; i++){
            System.out.println("2 x " +i+ " = " +(2*i) );
        }
        int j;
        for(j=1; j<=9; j++){
            System.out.print(j + "  ");
        }
        System.out.println("\nfor문 종료 후 j 값:" +j);
}
} 