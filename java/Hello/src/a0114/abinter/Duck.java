package a0114.abinter;

// 자식 클래스
class Duck extends Animal implements Flyable,Swimmable{
    private String color;

    public Duck(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
       System.out.println(name+"이(가) 꽥꽥 웁니도.");
    }

    @Override
    public void move() {
        System.out.println(name+"이(가) 걸어갑니다.");
    }

    @Override
    public void fly() {
        System.out.println(name+"이(가) 낮게 납니다.");
    }

    @Override
    public void swim() {
        System.out.println(name+"이(가) 수영을 합니다.");
    }
    

    
}
