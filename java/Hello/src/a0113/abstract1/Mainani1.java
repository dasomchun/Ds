package a0113.abstract1;

public class Mainani1 {
    public static void main(String[] args) {
        Animal dog = new Dog("뽀삐"); //다형성
        Animal cat = new Cat("나비");
        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();
        System.out.println();
    
    }
}
