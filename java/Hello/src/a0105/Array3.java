package a0105;

public class Array3 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 10, 2};
        int max = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) { 
                max = arr[i];  
                // arr[1] = 8 > 5 => max = 8
                // arr[2] = 3 > 8 => max = 8
            }
        }

        System.out.println("배열의 가장 큰 수는: " + max);
    }
}