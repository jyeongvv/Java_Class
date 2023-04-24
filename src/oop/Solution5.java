package oop;

public class Solution5 {
    public static void main(String[] args) {
        
        // Cartoon 객체 생성
        Cartoon cartoon = new Cartoon();
        System.out.println("cartoon.author = " + cartoon.author);
        System.out.println("cartoon.name = " + cartoon.name);

        // 직접 대입 연산자로 할당
        cartoon.author = "오다 에이치로";
        cartoon.name = "";
        System.out.println("cartoon.author = " + cartoon.author);
        System.out.println("cartoon.name = " + cartoon.name);

        // 메소드를 사용해서 할당
        cartoon.setName("유유백서");
        System.out.println("cartoon.name = " + cartoon.name);
        cartoon.setName("");
        System.out.println("cartoon.name = " + cartoon.name);

        // 생성자 (Constructor)
        // 초기화 기능 이씀
        Cartoon cartoon2 = new Cartoon("스파이더맨", "스탠 리");
        System.out.println("cartoon2.author = " + cartoon2.author);
        System.out.println("cartoon2.name = " + cartoon2.name);

    }
}
