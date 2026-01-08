package a0106;

public class String3 {
    public static void main(String[] args) {
        String str = "Hello world";
        // chhatAt(index) : 특정 위치의 문자
        char ch = str.charAt(0);
        System.out.println("인덱스 0번 글자 " +ch);
        char ch2 = str.charAt(6);
        System.out.println("인덱스 6번 글자 " +ch2);

        int index1=str.indexOf("o");
        int index2 =str.indexOf("world");
        int index3 =str.indexOf("x");

        // lastIndexof() : 마지막 문자

        int lastindex = str.lastIndexOf("o");
        System.out.println("o 마지막 위치 :" +lastindex);
        


    }
}
