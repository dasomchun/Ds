package a0112.acount2;

public class Acount {
    String owner; //예금주
    int balance; //잔액
    public Acount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(int money) {
        balance += money;
        System.out.printf("[%s] %d원 입금->잔액: %d원\n",owner,money,balance);
    }
    public boolean withdraw(int money) {
        if(balance < money){
            System.out.printf("[%s] 출금실패(잔액부족) \n",owner);
            return false;
        }

        balance -=money;
        System.out.printf("[%s] %d원 출금->잔액: %d원\n",owner,money,balance);
        return true;
    }
    public boolean transfer(Acount target, int money) {
        // 3️⃣ 실행 흐름 설명
        // 💰 입금
        // 철수 계좌에 5000원 추가

        // 💸 출금

        // 잔액 충분 → 출금 성공

        // 잔액 부족 → 출금 실패 (false 반환)

        // 🔁 송금

        // 보내는 계좌(this)에서 차감

        // 받는 계좌(target)에 증가

        // 성공 시 true, 실패 시 false

       if (balance < money) {
        System.out.printf("(%s => %s) 송금 실패(잔액부족)\n",owner,target.owner);
        return false;
       }
       this.balance -= money;
       target.balance += money;
        System.out.printf("(%s => %s) %d 송금 완료\n",owner,target.owner,money);
        System.out.printf("[%s , 잔액 : %d원]\n",owner,balance);
        System.out.printf("[%s , 잔액 : %d원]\n",target.owner,target.balance);
        return true;
    } 
}
