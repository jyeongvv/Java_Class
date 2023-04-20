package Dtype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class List_ {
    public static void main(String[] args) {
        // List
        // ArrayList
        // 길이가 고정적. -> Array
        // ArrayList : 길이가 가변적. + 인덱스를 바탕으로 요소를 조회. + 공통된 타입 + 유사한 메소드(Array...)
        ArrayList menu = new ArrayList(); // new 생성자 -> ArrayList라는 타입을 지니느 ㄴ객체. 인스턴스
        menu.add("pizza"); // add <- python : append. / js : push
        menu.add("burger");
        menu.add("hotdog"); // add -> 맨 끝에 추가. menu.add(menu.size(), "hotdog");
        System.out.println("menu = " + menu);
        menu.add(0, "coke");
        System.out.println("menu = " + menu);
        menu.add(1);
        System.out.println("menu = " + menu);

        ArrayList<String> menu2 = new ArrayList(); // <> 안에다가 제한시킬 타입
        menu2.add("pizza");
//        menu2.add(1,2,3,4); -> type error
        System.out.println("menu2 = " + menu2);

        ArrayList<Integer> menu3 = new ArrayList();
        menu3.add(1);
//        menu3.add("burger"); -> type error
        System.out.println("menu3 = " + menu3);

        System.out.println(menu.get(1)); // menu arraylist의 1번째 요소를 가져옴
        menu.set(1, "salad"); // menu arraylist의 1에 salad 대입
        System.out.println("menu = " + menu);
        // get : 가져옴, set :설정함(바꿈)
        // POJO : Plain Old Java Object
        // Lombok

//        System.out.println(menu.size()); // length 업슴
        // size : arraylist의 크기
        System.out.println("menu.size() = " + menu.size());

        // contains <- python : in
        System.out.println("menu.contains(\"pizza\") = " + menu.contains("pizza"));
        System.out.println("menu.contains(\"burger\") = " + menu.contains("burger"));

        // remove
        menu.remove(0);
        System.out.println("menu = " + menu);
        // 메소드 오버로딩 (loading), 메소드 오버라이딩 (riding)
        // 로딩은 이름은 같은데 패러미터 구조가 다르면 다른 기능을 할 수 있게
        // 라이딩은 이름이 같고 패러미터 구조도 같은 상황에서, 상속 받은 상위 클래스의 메소드를 재정의
        menu.remove("salad");
        System.out.println("menu = " + menu);

        // (1) add를 통해서 만드는 방법 <- 위 참조
        // (2) Array를 ArrayList로 변환
        String[] foods = {"pizza", "burger", "hotdog"};
        ArrayList<String> foods2 = new ArrayList<>(Arrays.asList(foods));
        System.out.println("foods = " + foods);

        ArrayList<String> foods3 = new ArrayList<>(
                Arrays.asList("pizza", "burger", "hotdog") // 가변 인자로 여러 개의 String
        );
        System.out.println("foods3 = " + foods3);

        // join
        String join = String.join(", ", foods);
        // String.join -> delimiter (구분자), 배열 혹은 나열된 데이터
        System.out.println("Arrays.toString(foods) = " + Arrays.toString(foods));
        System.out.println("join = " + join);
        join = String.join("; ", foods);
        System.out.println("join = " + join); // ",".join(???)
        join = String.join("; ", foods2);
        System.out.println("join = " + join);

        // sort
        ArrayList<Integer> nums = new ArrayList<>(
                Arrays.asList(31, 12, 17)
        );
        System.out.println("nums = " + nums);
        nums.sort(null); // **오름차순(ascending) <-> 내림차순(descending)
        System.out.println("null / nums = " + nums);
        // null = none = void
        nums.sort(Comparator.naturalOrder()); // 작은 것부터 커지는게 자연적.
        System.out.println("naturalOrder / nums = " + nums);
        nums.sort(Comparator.reverseOrder()); // sort -> 1.8
        System.out.println("reverseOrder / nums = " + nums);
    }
}