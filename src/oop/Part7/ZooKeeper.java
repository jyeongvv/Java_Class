package oop.Part7;

public class ZooKeeper {
    // feed(Tiger tiger)
    void feed(Tiger tiger) {
        System.out.println("feed apple");
    }

    void feed(Lion lion) {
        System.out.println("feed banana");
    }
    
    // 오버로딩의 장점 : 굳이 if문이나 그런거 필요없이, 메소드 자체로 분기 가능
    // 문제점 : 1. 귀찮음 - 타입 추가시 무조건 1개 이상의 메소드가 증가
    // 2. 반복적으로 등장하는 부분에 대한 패턴화가 어려움
}
