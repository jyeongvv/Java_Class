package oop;

public class Car {
    String name; // 멤버변수 name, String(문자열만 받을 수 있음)
    int price; // 멤버변수 price <- 정수

    // 입력X (매개변수 없음 / 이미 작업이 정해져있거나, ), 출력X
    void introduce() {
        System.out.println("난 " + name + "!");
        // 조건문 : this.price가 1000 이상이라면 '억원'으로 표시
        if (this.price >=10000){
            int firstNumber = this.price / 10000;
            int SecondNumber = this.price % 10000;
            System.out.println(
                    String.format("이 차의 가격은 %d억 %d 만원입니다",
                            firstNumber, SecondNumber)
            );
            return; // 없을 때는 아래 실행문도 출력됨
        }
        System.out.println("난 " + price + "만원!");
        // return을 하는 순간 함수는 종료


//        void discount() {
//            this.price = this.price * 90 / 100; // 10퍼센트 할인
        }


        // 입력이 없고 반환만 있는
        // 10번 할인했을 때의 가격을 알려주는

    }

