package Dtype;

import java.util.ArrayList;

public class Enum_ {
    public static void main(String[] args) {
        // Enum
        ArrayList<Language> langList = new ArrayList<Language>();
        langList.add(Language.C);
        langList.add(Language.CPP);
        langList.add(Language.PYTHON);
        langList.add(Language.JAVA);
        System.out.println("langList = " + langList);
    }
}
// 1. enum + 이름 (클래스 이름 짓듯이)
// 2. 중괄호 묶어서 그 속에 그 enum의 옵션으로 들어갈 내용들 변수명처럼 입력
// 2.1. 통상적으로 대문자
enum Language {
    JAVA, PYTHON, C, CPP // 그 타입 안에 속하는 것들
} // 내가 설정한 고유의 묶음들
// 1. enum + 이름 (클래스 이름 짓듯이)
// 2. 중괄호 묶어서 그 속에 그 enum의 옵션으로 들어갈 내용들 변수명처럼 입력
// 2.1. 통상적으로 대문자