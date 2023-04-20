package Dtype;

import java.util.HashMap;

public class Map_ {
    public static void main(String[] args) {
        // Map <- Dictionary
        // Hash -> #

        HashMap<String, String> map = new HashMap<>();
        // HashMap : 타입 이름, 클래스 이름
        // <key, Value>
        // new -> 생성.

        // map의 CRUD 메소드
        // put(key, value) - Create
        map.put("name", "김지영"); // 넣기
        map.put("age", "23");
        map.put("address", "anyang");
        map.put("phone", "010-3328-8124");

        System.out.println("map = " + map);

        // get(key) - Read
        String name = map.get("name");
        System.out.println("name = " + name);

        String age = map.get("age");
        System.out.println("age = " + age);

        // remove(key) - Delete
        map.remove("age");
        System.out.println("map = " + map);

        //make map copy
        // HashMap<String, String> map2 =map; // shallow copy
        HashMap<String, String> map2 = new HashMap<>(map); // deep copy
        System.out.println("map2 = " + map2);
        // clear - 아예 지워버림
        map2.clear();
        System.out.println("map2 = " + map2);

        // map의 크기 확인
        System.out.println("map.size() = " + map.size());

        // dictionary : ket, value -> key list, value list, k-v list
        // key list // set -> 중복을 허용하지 않음 + 키이자 값.
        System.out.println("map.keySet() = " + map.keySet());
        // value list
        System.out.println("map.values() = " + map.values());
        // k-v list
        System.out.println("map.entrySet() = " + map.entrySet());

        // 키가 포함되어 있는지, 값이 포함되어 있는지
        // python -> in? 키 혹은, 리스트라면 값.
        // contain key
        System.out.println("map.containsKey(\"name\") = " + map.containsKey("name"));
    }
}