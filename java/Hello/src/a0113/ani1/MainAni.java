package a0113.ani1;

public class MainAni {
    public static void main(String[] args) {
        Dog dog = new Dog("뽀삐", 3, "골든 리트리버");
        Cat cat = new Cat("나비", 2, "검은색");

        //부모 클래스의 메서드 사용
        dog.eat(); //상속받은 메서드
        dog.sleep();
        dog.makeSound(); //오버라이드
        dog.bark();
        dog.displayInfo();
        System.out.println();

        cat.eat(); //상속받은 메서드
        cat.sleep();
        cat.makeSound(); //오버라이드
        cat.scratch();
        cat.displayInfo();
        System.out.println();


    }
}
// 상속의 특징
// 단일 상속만 가능 : 자바는 하나의 부모클래스만 상속사능
// super 키워드 : 부모 클래스의 생성자, 메서드, 필드 접근
// 메서드 오버라이딩 ;
// -도그 - makesound(),displayinfo()
// 모든 클래스는 object 클래스 상속