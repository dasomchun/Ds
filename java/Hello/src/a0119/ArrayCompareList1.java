package a0119;



public class ArrayCompareList1 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("홍길동" , 20);
        students[1] = new Student("김철수" , 22);

        // Student student1 = new Student("이미주", 19);
        // 수정
        //  students[1] = new Student("이정익" , 22);
        // 삭제
        // students[1] =null;
    }
}

class Student {
    public Student(String string, int age) {
       this.name = name;
       this.age= age;
    }
    String name;
    int age;

}