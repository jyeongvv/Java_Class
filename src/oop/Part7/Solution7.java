package oop.Part7;

public class Solution7 {
    public static void main(String[] args) {
//        ZooKeeper keeper = new ZooKeeper(); // 사육사 객체 생성
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(lion);
        bouncer.barkAnimal(tiger);
    }
}
