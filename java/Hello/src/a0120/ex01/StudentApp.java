package a0120.ex01;

public class StudentApp extends Object {
    public static void main(String[] args) {
         Student s1 = new Student("홍길동", 20, 90);
         Student s2 = new Student("김철수", 25, 85);
         Student s3 = new Student();
         s3.name = "임말자";
         s3.age = 25;
         s3.score = 90;

         System.out.println(s1);
           System.out.println("등급: " + s1.getGrade());
         System.out.println(s2);
           System.out.println("등급: " + s2.getGrade());
         System.out.println(s3);
        //  int a;
        //  System.out.println(a);

    }
   
    
}
