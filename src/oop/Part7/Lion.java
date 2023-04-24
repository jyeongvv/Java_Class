package oop.Part7;

public class Lion extends Animal implements Predator {
    @Override
    public String getFood() {
//        return "banana";
        return "말고기";
    }

    @Override
    public void bark() {
        System.out.println("나는 밀림의 왕 사자다");
    }

}
