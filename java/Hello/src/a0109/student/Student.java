package a0109.student;

public class Student {

    // 접근 제어자
    private String name;
    private int korean;
    private int english;
    private int math;
    // private int sum = 0;


    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void printInfo(){
        System.out.println("=== " + name + " 학생정보 ===");
        System.out.println("국어 : " + korean + "점");
        System.out.println("영어: " + english + "점");
        System.out.println("수학: " + math + "점");
        System.out.println("총점: " + calcTotal() + "점");
        System.out.println("평균: " + String.format("%.2f", calcAvg()) + "점");
        System.out.println("등급: " + calcGrade());
    }

    // private String calcGrade() {
    //     double avg = calcAvg();
    //     if(avg>=90){ //90이상이면
    //         return "A";
    //     }else if(avg>=80){
    //         return "B";
    //     }else if(avg>=70){
    //         return "C";
    //     }else{
    //         return "D";
    //     }
        
    // }
    private String calcGrade() { //결과값이 1줄일때
        double avg = calcAvg();
        if(avg>=90) return "A";
        else if(avg>=80) return "B";
        else if(avg>=70) return "C";
        else return "D";
    }



       // private int calcTotal() {
    //   sum = korean + english + math;
    //   return sum;
    // }
       public int calcTotal() {
        return  korean + english + math;
    }
       public double calcAvg() {
        return  (double) calcTotal()/3;
    }

}
