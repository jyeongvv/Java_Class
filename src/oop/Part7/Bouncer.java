package oop.Part7;

public class Bouncer {
    void  barkAnimal(Animal animal) {
        if (animal instanceof Tiger) {
            System.out.println("어흥");
        } else if (animal instanceof Lion) {
            System.out.println("크왕");
        }
    }
}
