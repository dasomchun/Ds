package a0106;

public class Array11 {
   public static void main(String1[] args) {
        int [][] arr =  new int [3][3];
    // ┌─────┬─────┬─────┐
    // │  1  │  2  │  3  │
    // ├─────┼─────┼─────┤
    // │  4  │  5  │  6  │
    // ├─────┼─────┼─────┤
    // │  7  │  8  │  9  │
    // └─────┴─────┴─────┘

    // ┌─────┬─────┬─────┐
    // │  1  │  2  │  3  │
    // ├─────┼─────┼─────┤
    // │  4  │  5  │  6  │
    // ├─────┼─────┼─────┤
    // │  7  │  8  │  9  │
    // └─────┴─────┴─────┘
    int num = 1;
    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[i].length; j++){
            arr[i][j] = num++;
        }
    }

     for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[i].length; j++){
           System.out.print(arr[i][j] + " ");
        }
        System.out.println(); //3개 출력 후 줄바꿈
    }



   } 
}
