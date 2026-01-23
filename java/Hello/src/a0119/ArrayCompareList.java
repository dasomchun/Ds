package a0119;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCompareList {
    public static void main(String[] args) {
        // array 크기 고정 3개 고정
        int [] arr = new int[3];
        arr [0] =10;
        arr [1] =20;
        arr [2] =30;

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        // 향상 포문
        for(int n : arr ){
            System.out.println(n);
        }
        // array 삭제불가
        // arr[1] = 0
        // 새배열 생성 후 복사해서 함(번거러움)

        // array 수정
        // arr[1] =99;
            // 검색방법
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 20){
                System.out.println("찾음");
            }
        }




        // 크기가 자동 증가
        //컬렉션<제네릭>
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

         for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        for(int n : arr ){
            System.out.println(n);
        }
        System.out.println();
        // 통째로 출력
        System.out.println(list);

        list.remove(1); //인덱스로 삭제 가능
        // list.remove("사과"); // 값으로 삭제
        // 자동으로 앞으로 당겨짐

        // Arraylist 수정
        // list.set(1, 99);

        // ArrayList 검색
        if(list.contains(10)){
            System.out.println("있음");
        }
        // 검색 인덱스값을 반환 없으면 -1을 반환
        int index =list.indexOf(10);

        // array -> ArrayList로 변환
        String[] arr1 = {"사과","배"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));

    }
}
