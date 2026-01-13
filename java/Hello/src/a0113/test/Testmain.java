package a0113.test;

public class Testmain {
    public static void main(String[] args) {
        Student student = new Student("민수", 20, "컴퓨터공학");
        Teacher teacher = new Teacher("김선생", 40, "자바");

        System.out.println("민수입니다.");
        student.work();
        student.study();
        student.displayinfo();

        System.out.println();
        System.out.println("김선생입니다.");
        teacher.work();
        teacher.teach();
        teacher.displayinfo();

    }
}
