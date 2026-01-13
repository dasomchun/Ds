package a0113.test;

public class Student extends Person{

    String major;

    public Student(String name,int age,String major){
        super(name, age);
        this.major=major;
    }

    @Override
    public void work() {
        System.out.println(name+"이(가) 공부를 합니다.");
    }
    
    public void study(){
        System.out.println(name+"이(가) 전공을 공부합니다.");
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("전공: " +major);
    }
    
}
