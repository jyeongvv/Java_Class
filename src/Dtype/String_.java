package Dtype;

import javax.lang.model.type.ArrayType;
import java.security.MessageDigest;
import java.text.MessageFormat;
import java.util.Arrays;

public class String_ {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 아 이ㅣ거 복습인가 ^^ 이제야 복습하나욧...

        // String : 0개 이상의 문자를 연결해서 표현
        // 원싯 자료형 타입 - 객체(참조) 자료형 타입
        // -> 기본적으로 깔려 있고, 별도의 기능 구현 X
        // 객체(참조) 자료형 타입 : 대문자로 시작

        // indexOf : 문자열에서 특정 문자열이 시작되는 위치
        String str1 = "hello world";
        System.out.println(str1.indexOf("o"));

        // contains : 문자열이 특정 문자열에 포함되어있는지
        // A.contains(B) : A라는 문자열에 B가 포함 되어 있는가?
        System.out.println(str1.contains("hello"));
        System.out.println(str1.contains("bye"));

        // charAt : char
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(str1.length()-1));

        System.out.println(str1.replaceAll("l", "L"));

        // substring
        String str2 = "hello bye..";
        System.out.println(str2.substring(6));

        // 대문자 소문자
        String str3 = "hello good!";
        System.out.println(str3.toUpperCase());

        // 쪼개기. 스플릿
        String split = "a:b:c:d";
        String[] result = split.split(":");
//        System.out.println(result);
        System.out.println(Arrays.toString(result));

        // 문자열 포맷팅
        System.out.println(String.format("나는 오늘 %d원 짜리 밥을 먹었다", 8500));
        System.out.println(String.format("나는 오늘 %s에서 밥을 먹었다", "천지회관"));
    }
}