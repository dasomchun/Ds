package a0107;

public class Fork {
   public static void main(String[] args) {
     int n =3;
     double x = calc(n);
     System.out.printf("삼겹살 %d 인분의 칼로리: %.2f kcal",n,x);
   }

   private static double calc(int n) {
        int total = n * 180; 
        double totalkal = total * 5.179;
        return totalkal;
   } 

}
