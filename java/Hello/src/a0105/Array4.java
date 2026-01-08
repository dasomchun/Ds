package a0105;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        int[] numbers = new int[3];
                    
        System.out.print("정수 3개 입력 : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt(); 
            // System.out.println(numbers[i]);
        }
     
        for (int i = numbers.length -1; i>=0; i--) {
            System.out.println(numbers[i]);
        }
    }
}