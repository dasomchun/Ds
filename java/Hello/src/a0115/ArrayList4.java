package a0115;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList4 {
    public static void main(String[] args) {
        String[] array ={"홍길동", "김철수","이영희"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));

        System.out.println("등록된 학생: " +list);
        System.out.println();
        System.out.println("=== 학생 목록 ===");
        for(int i = 0; i<list.size(); i++){
            System.out.println((i+1) + " 번: " + list.get(i));
        }
        System.out.println();
        System.out.println("=== 학생 정보 수정 ===");
        System.out.println("수정 전: " +list);
        list.set(1,   "김민수");
         System.out.println("수정 후: " +list);
         System.out.println();
         System.out.println("=== 학생 삭제 ===");
         System.out.println("삭제 전: " +list);
         list.remove(2);
         System.out.println("삭제 후: " +list);
        System.out.println();
        System.out.println("최종 학생 목록: "+list);
        System.out.println("총 학생 수: "+list.size());
        
    }


}
