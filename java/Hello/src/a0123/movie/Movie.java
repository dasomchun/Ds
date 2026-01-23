package a0123.movie;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        HashMap<String, Double> movies = new HashMap<>();
        movies.put("인터스텔라", 9.2);
        movies.put("어벤져스", 8.5);
        movies.put("기생충", 9.0);
        movies.put("겨울왕국", 8.7);
        movies.put("토이스토리", 9.1);
        movies.put("라라랜드", 8.8);
        movies.put("매트릭스", 8.9);

    
        HashMap<String, Double> userrating = new HashMap<>();

        while (true) {
            System.out.println("\n=== 영화 목록 ===");
            for (Map.Entry<String, Double> entry : movies.entrySet()) {
                System.out.println(entry.getKey() + " : 평점 : " + entry.getValue() + "점");
            }

            System.out.print("\n평점을 입력할 영화 제목 (종료: '종료') : ");
            String movieTitle = scanner.nextLine();

            if (movieTitle.equals("종료")) {
                break;
            }

            if (!movies.containsKey(movieTitle)) {
                System.out.println("해당 영화가 없습니다. 다시입력해 주세요");
                continue;
            }
          
            System.out.print(movieTitle + "의 평점을 입력하세요 : ");
            Double rating = scanner.nextDouble();
            scanner.nextLine(); 

            if (rating < 0 || rating > 10) {
                 System.out.println("평점은 0.0부터 10.0 사이여야 합니다.");
                continue;
            }

           
            userrating.put(movieTitle, rating);

            System.out.println("\n=== 사용자 입력 평점내역 ===");
            double total = 0;
           
            for (Map.Entry<String, Double> entry : userrating.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue() + "점");
                total += entry.getValue();
            }
            
          
            if (!userrating.isEmpty()) {
                System.out.printf("평균 평점: %.2f점\n", total / userrating.size());
            }
        }

        System.out.println("\n=== 추천 영화 (9.0점 이상) ===");
        boolean found = false;
        for (Map.Entry<String, Double> entry : movies.entrySet()) {
         
            if (entry.getValue() >= 9.0 && !userrating.containsKey(entry.getKey())) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + "점");
                found = true;
    }
        }

        if (!found) {
            System.out.println("추천할 영화가 없습니다.");
        }

    }
    }
    
