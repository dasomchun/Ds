package a1231;

public class Ex08 {
    public static void main(String[] args) {
        String id = "admin";
        String pw = "1234";
        
        boolean idid = id.equals("admin");
        boolean pwpw = pw.equals("1234");

        if (idid && pwpw) {
            System.out.println("로그인 성공");
        } else{
            System.out.println("로그인 실패");
        }     
        }
    }

    // 문제8 로그인 id가 admin pw가 1234가 일치하면 로그인 성공, 일치하지 않으면 로그인 실패