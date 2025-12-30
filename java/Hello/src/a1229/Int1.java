package a1229;

public class Int1 {
    public static void main(String[] args) {
        int var1 = 10;
        System.out.println(var1);
        // int 2var = 20; 숫자로 시작 불가
        int _var2 = 20;
        int $var3 = 30;
        // int var4$ = 40;
        // int var5 = 10000000000; // int 범위 초과
        long var6 = 10000000000L; // long 접미사 L or l
        double doubleVar = 3.14159265389793;
        float floatVar = 3.14F; // float 접미사 F or f
        System.out.println(doubleVar);
        byte byteVar = 127; // -128 ~ 127
        System.out.println(byteVar);

        // 문자형
        char charVar = 'A';
        System.out.println(charVar);
        char koreanChar = '가';
        System.out.println(koreanChar);
        char unicodeChar = '\u0041'; //유니코드로 표현
        System.out.println(unicodeChar);

        // 논리형
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue);
        System.out.println(isFalse);
        boolean result = (5 > 3);
        System.out.println(result);
    }
}
