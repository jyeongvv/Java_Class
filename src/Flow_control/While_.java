package Flow_control;

public class While_ {
    public static void main(String[] args) {
        // 반복문 - while
        int i = 0;
        while (i < 10) { // while(조건) {실행문} -> 조건이 True 될 때까지 실행
            System.out.println(i);
            i++; // 증가연산자  i = i + 1
        }
//
//        int i2 = 0;
//        while (i2 < 10) {
//            System.out.println(i2); // 중단 조건이 없기 때문에 계속 공급
//        }

        // python while 반복문
        // break & continue
        int i3 = 0;
        while (i3 < 10) { // while(조건) {실행문} -> 조건이 True 될 때까지 실행
            System.out.println(i);
            i3++; // 증가연산자  i = i + 1
        }

        System.out.println("-----------------------------");

        int i4 = 1;
        while (i4 < 10) {
            System.out.println(i4);
            // 3의 배수 발견시 while 강제 종료
            if (i4 % 3 == 0) {
                System.out.println("i4 = " + i4);
                break;
            }
            i4++;
        }
    }
}
