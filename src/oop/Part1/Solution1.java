package oop.Part1;

import oop.Part1.Student;

// 객체지향이란?
public class Solution1 {
    public static void main(String[] args) {
        Student kim = new Student();
        // 입실하기
        kim.enter();
        // 잠자기
        kim.sleep();
        // 공부
        kim.study();
        // kim아니고 다르거여도 하나씩 지정해줄 필요 없다
    }
}
