package a0107;

public class Move {
    public static void main(String[] args) {
        double oil = 8.86;
        double move = 182.736;
        
        double yeon = volume(oil, move);
        
        System.out.printf("휘발유 %.2fL 이동거리 %.3fkm fh 연비는 %.2f km/L 입니다.\n", oil, move,yeon);
        
    }

    private static double volume(double oil, double move) {
      
        return move / oil; 
    }
}