package Dtype;

import java.util.HashSet;
import java.util.Set;

public class Set_ {
    public static void main(String[] args) {
        // Set - 집합 -> 중복되지 않은 + 순서가 없는 값들 간의 묶음
        // HashSet 생성
        Set<String> set = new HashSet<>(); // 길이를 안정해도 됨 -> list
        // Set <...> set = new HashSet<>(길이);
        // -> 상속. 인터페이스, 다형성...
        System.out.println("set = " + set);

        // 5개 길이의 HashSet 생성
        HashSet<String> set2 = new HashSet<>(5); /// Capacity : 용량
        System.out.println("set2 = " + set2);

        //
        HashSet<String> set3 = new HashSet<>(
                Set.of("Java", "C++", "Python", "C#", "JS"));
        System.out.println("set3 = " + set3);

        // 자주 쓰이는 메소드
        set3.add("String");
        set3.contains("Java");
        set3.remove("C#");




        System.out.println("set3 = " + set3);
    }
}