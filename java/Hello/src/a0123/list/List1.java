package a0123.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class List1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("첫 번째");
        list.add("두 번째");
        list.add("세 번째");

        System.out.println("초기출력");
        //출력
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        // 앞에 추가
        list.add("네번째");
        System.out.println("출력2");
         for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        // 앞에 추가
        list.addFirst("맨 앞");

        list.addLast("맨 뒤");

        System.out.println("출력3");
        // 출력
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

         // 첫 번째 / 마지막 요소 가져오기
        String first = list.getFirst();
        String last = list.getLast();

        System.out.println("\n첫 번째 요소: " + first);
        System.out.println("마지막 요소: " + last);

        // 첫번쨰 요소 삭제
        // list.removeFirst();

         // 마지막 요소 삭제
        // list.removeLast();
        list.remove(2);
        // list.remove("세 번째")
        for(String s : list){
            System.out.println(s);
        }

        HashSet<String> set = new HashSet<>();

        // set은 for i=0; 증가 적용 x
        // 요소 추가
        set.add("사과");
        set.add("바나나");
        set.add("오렌지");
        set.add("사과");  // 중복 추가 시도 (무시됨)

            for(String item : set){
            System.out.println(item);
        }
        System.out.println(set.size());

        boolean hasApple = set.contains("사과");
        System.out.println(hasApple);
        set.remove("바나나");
        // 반복문으로 순회
        for(String item : set){
            System.out.println(item);
        }
        // 순서있는 입력 출력
        System.out.println("순서있는 입/출력");
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("사과");
        set1.add("바나나");
        set1.add("오렌지");

        // 삽입 순서대로 출력됨
        for (String item : set1) {
            System.out.println(item);
        }

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(5);
        set2.add(2);
        set2.add(8);
        set2.add(1);

        // 정렬된 순서로 출력: 1, 2, 5, 8
        for (Integer num : set2) {
            System.out.println(num);
        }


    }
}
