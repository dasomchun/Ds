package a0112.student;

public class Student {
    private String name;
    private int score;
    static String schoolName="한국대학교";

    public Student(String name, int score) {
        this.name = name;
        setScore(score);
    }

    public String getName() {
       return name;
    }

    public int getScore() {
      return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수 입니다. " + score + "점");
            this.score = 0;
        }else{
        this.score = score;
        }
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }


}

