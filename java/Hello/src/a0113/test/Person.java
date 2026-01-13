package a0113.test;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("이름은 :" +name +"입니다.");
    }
    public void work(){
        System.out.println(name+"이(가) 일을 합니다.");
    }
    public void displayinfo(){
        System.out.println("이름: " +name+", 나이: "+age);
    }
}

