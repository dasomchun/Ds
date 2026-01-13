package a0112.student;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("--- 학생 관리 시스템 ---");
        Student s1 = new Student("김철수", 90);

        Student s2 = new Student("이영희", -10);

        System.out.println("--- 초기 정보 출력 ---");   
        System.out.println("학교: " + Student.schoolName);
        System.out.println("학생1: " + s1.getName() + ", " + s1.getScore()+"점");
        System.out.println("학생2: " + s2.getName() + ", " + s2.getScore()+"점");     
        s2.setScore(-10);
        System.out.println("\n--- 정보 수정 후 ---");
     
        s2.setScore(95);
        
        // 다시 출력
        System.out.println("학생2 수정 후: " + s2.getName() + ", 점수: " + s2.getScore());
    }

}


// 문제: 학생 관리 시스템 (Student Class)
// 다음 조건에 맞는 Student 클래스를 작성하고, Main 클래스에서 객체를 생성하여 결과를 출력하세요.

// 1. 조건 (Student 클래스)
// 필드(멤버 변수): * 이름(name - 문자열), 점수(score - 정수)를 가집니다. (접근 제어자는 private으로 설정)

// 학생들이 속한 학교 이름(schoolName)은 모든 학생이 "한국대학교"로 동일하므로 static 변수로 선언하고 초기화하세요.

// 생성자: * 이름과 점수를 매개변수로 받아 필드를 초기화하는 생성자를 만드세요.

// Getter/Setter:

// name과 score에 대한 Getter와 Setter를 만드세요.

// 단, Setter에서 점수(score)를 설정할 때, 0점 미만이거나 100점을 초과하는 값이 들어오면 "잘못된 점수입니다"를 출력하고 값을 0으로 설정하세요.

// 2. 조건 (Main 클래스)
// 학생 객체 2개를 생성하세요. (학생1: 김철수, 90점 / 학생2: 이영희, -10점)

// Getter를 사용하여 두 학생의 정보를 출력하세요.

// Setter를 사용하여 이영희 학생의 점수를 95점으로 수정하고 다시 출력하세요.