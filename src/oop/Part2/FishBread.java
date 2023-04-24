package oop.Part2;

public class FishBread {
    //붕어빵 안에 '이름'이라는 '속성'
    // '속성' == '변수' -> 객체나 클래스에 소속된 변수
    protected String name; // 변수 선언
    // 객체에게 속한 변수.

    public void setName(String name) { // 매개변수? 패러미터?
        // 매개변수를 통해서 전달 받은 '값' => 인자, 인수 arguments
        this.name = name; // this -> 파이썬에서 self : 객체 자신
    }
}
