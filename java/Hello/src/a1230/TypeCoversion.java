package a1230;

public class TypeCoversion {
    public static void main(String[] args) {
        System.out.println("===자동 타입 변환 ===");

        // 1. 정수형에서 실수형으로 자동 타입 변환 int -> double
        int intValue = 100 ;
        double doubleValue = intValue; //자동 타입 변환
        System.out.println("int " +  intValue + " → double: " + doubleValue);
        // long -> float(자동변환)

        long longValue =  10000000L;
        float floatValue =  longValue;
        System.out.println("long: " + longValue + " → float: " + floatValue);

        // char -  int (자동변환 아스키코드값)
        char ch  =  'A';
        int ascii = ch; //자동변환
        System.out.println("char " +  ch + " -> int: " +ascii);

        double pi = 3.14159;
        int intPi = (int) pi; //강제변환
        System.out.println("double: "  + pi + "-> int: " +intPi);

        int num = 66;
        char character = (char) num; // 강제 변환:  "B"
        System.out.println("int:" +  num + " -> char: '" + character + "'");

        int bigNum = 300;
        byte smallByte = (byte) bigNum; // byte 범위 (-128~127)를 초과
        System.out.println("int: " +  bigNum +  " ->byte: " +smallByte + " (데이터 손실!)");

        System.out.println("\n=== 실용적인 예제 ===");

        // 정수 나눗셈을 실수로 변환
        int a = 10;
        int b = 3;
        double result1 =  a / b;
        double result2 = (double)  a / b;  //a 나 b 둘중에 하나에 (double) 붙이면 실수로 게산됨
        System.out.println("10 / 3 (정수): " +  result1);
        System.out.println("10 / 3 (정수): " +  result2);



    }
}
