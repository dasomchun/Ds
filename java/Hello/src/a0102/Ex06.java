package a0102;

public class Ex06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {               
            int star = 1 + (i - 1) * 2;         
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}