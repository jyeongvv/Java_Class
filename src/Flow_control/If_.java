package Flow_control;

import java.util.Random;

public class If_ {
    public static void main(String[] args) {
        // if 조건문
        int age = (int)(Math.random() * 100) + 1;

//        Random rand = new Random();
//        int age = rand.nextInt(100) + 1; // 위에 코드와 동일
        // nextInt(100) 메소드는 0 이상 99 이하의 값을 생성하므로, 1을 더해주면 최종적으로 1 이상 100 이하의 값을 생성

        System.out.println("age = " + age);

        if (age >= 20) {
            System.out.println("adult");
        }
        else {
            System.out.println("children");
        }
    }
}