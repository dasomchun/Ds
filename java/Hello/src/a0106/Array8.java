package a0106;

public class Array8 {
    public static void main(String1[] args) {
         int[][] arr = {
            {10, 20},
            {30, 40},
            {50, 60}
        };
        int sum = 0;
        
        for(int i=0; i < arr.length; i++){ //행
            for(int j = 0; j < arr[i].length; j++){ //열
               sum = sum + arr[i][j];
            }
           
        }System.out.println("합 : " + sum);
    }
}
