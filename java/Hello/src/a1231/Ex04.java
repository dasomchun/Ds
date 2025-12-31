package a1231;

public class Ex04 {
    public static void main(String[] args) {
        int age = 6;
        int height = 130;
        boolean parent = false;
        boolean hearchDease = false;
        boolean take = ((age >= 6 && height >= 120) || (height >=120 && parent==true)) && hearchDease ==false;

        System.out.println(take);
        // 신장이 120이상 이면서 나이가 6세 이상에 보호자 동반되고 심장질환x
    }
}
