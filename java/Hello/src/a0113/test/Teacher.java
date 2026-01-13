package a0113.test;

public class Teacher extends Person {
    String subject;

    public Teacher(String name,int age,String subject){
        super(name, age);
        this.subject = subject;
    }

   
    @Override
    public void work() {
        System.out.println(name+"이(가) 수업을 합니다.");
    }

    public void teach(){
        System.out.println(name+"이(가) 과목을 가르칩니다.");
    }
     @Override
    public void displayinfo() {

        super.displayinfo();
        System.out.println("과목: " + subject);
    }
    
}
