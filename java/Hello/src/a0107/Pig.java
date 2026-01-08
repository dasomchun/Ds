package a0107;

public class Pig {
    public static void main(String[] args) {
    int oneServing = 180; 
    int servings = 3;    
    
    int totalGram = oneServing * servings;
    double kcalPerGram = 5.179;


    double total = calculateKcal(totalGram, kcalPerGram);
    
    System.out.printf("삼겹살 %d인분(%dg)의 총 칼로리: %.3f kcal", servings, totalGram, total);
}

private static double calculateKcal(int gram, double kcal) {
   return gram * kcal;
}
}