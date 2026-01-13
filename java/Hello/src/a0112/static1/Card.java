package a0112.static1;

public class Card {

    // static 변수(모든 카드 공통) - 클래스 변수
    static int width =  60;
    static int height = 80;
    // 모든 카드의 모양은 동일 -> 공유데이터 static을 사용


    // 멤버변수 , 인스턴스변수 (카드마다 다름) 
    String shape; //무늬(하트, 스페이드 등)
    int number; //숫자를 나타내는(1~13)
    public Card(String shape, int number) {
        this.shape = shape;
        this.number = number; 
    }
    

}
