package a0112.acount2;

public class AcountTest {
    

    public static void main(String[] args) {
        Acount a = new Acount("철수", 10000);
        Acount b = new Acount("영희", 2000);

        System.out.println(" ==== 입금 ====");
        a.deposit(5000);
        
         System.out.println(" ==== 출금 ====");
        a.withdraw(3000);
        a.withdraw(20000);

        System.out.println("=== 송금 ===");
        a.transfer(b,3000);
        
        System.out.println("\n===반복송금===");
        while(a.transfer(b,3000)){
            ;
        }
    }
}
