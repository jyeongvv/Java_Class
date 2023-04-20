package Dtype;

public class TypeCasting_ {
    public static void main(String[] args) {
        // Type Casting
        // String to int
        String str = "100";
        System.out.println("str = " + str);
        int num = Integer.parseInt(str); // parsing - 분석.
        // int wrapper -> wrap -> primitive(원시형) -> 메소드나 속성X -> 도우미
        System.out.println("num = " + num);
        // num의 타입 확인
        // "100" parseint -> 100(int)

        // "-100" -> -100(int)
        System.out.println("Integer.parseInt(\"-100\") = " + Integer.parseInt("-100"));
        // 형변환은 조건이 맞아야지만 가능
    }
}