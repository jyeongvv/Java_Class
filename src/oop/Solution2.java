package oop;

public class Solution2 {
    public static void main(String[] args) {
        // 특정한 타입의 객체를 만들 때 사용하는 키워드 new
        FishBread fb = new FishBread();
        // 이름 지정
        FishBread fb1 = new FishBread();
        fb1.name = "피자붕어빵"; // 객체에 소속된 변수인 '속성'에 값을 부여
        System.out.println("fb1.name = " + fb1.name); // 그 값을 호출해서 사용
        fb1.name = "마라붕어빵";
        System.out.println("fb1.name = " + fb1.name);
        fb1.setName("애플붕어빵");
        System.out.println("fb1.name = " + fb1.name);

    }
}
