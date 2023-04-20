package Flow_control;

public class Switch_ {
    public static void main(String[] args) {
        // switch, case -> case에 맞춰서 결과값이 switching

//        int a = 1;
        // 1부터 5사이의 값이 임의로 주어지는 a 값
        int a = (int)(Math.random() * 5) + 1;
        System.out.println(a);
        switch (a) {
            case 1:
                System.out.println("a is 1");
                break; // 만약 case를 만족시켰다면 더이상 뒤의 case를 검토하지 마세욧
            case 2:
                System.out.println("a is 2");
                break;
            case 3:
                System.out.println("a is 3");
                break;
            default: // 아무 케이스도 거치지 못하고 끝까지 왔을 때 처리해줌
                System.out.println("a is not 1, 2, or 3");
                // default는 옵션.
        }
        // switch문 작성
        // python, java, c, cpp의 case가 있음
        // 4개의 값 중 랜덤으로 1가지를 뽑아 lang이라는 변수에 넣고
        // lang 변수를 switch 문으로 통해서 검사
        // default로 '해당없음'이라는 메세지를 출력

        String[] langs = {"python", "c", "java", "cpp"};
        String lang = langs[(int)(Math.random() * langs.length)];
        System.out.println(lang);

        switch (lang) {
            case "python":
                System.out.println("lang is python");
                break;
            case "c":
                System.out.println("lang is c");
                break;
            case "java":
                System.out.println("lang is java");
                break;
            case "cpp":
                System.out.println("lang is cpp");
                break;
            default:
                System.out.println("해당 없음");

        }

        // LunchMenu 중에 랜덤으로 하나 뽑고 switch case로 검사
        LunchMenu menu = LunchMenu.values()[(int)(Math.random() * LunchMenu.values().length)];
        System.out.println("menu = " + menu);
        switch (menu) {
            case KIMCHI:
                System.out.println("menu is KIMCHI");
                break;
            case BANANA:
                System.out.println("menu is BANANA");
                break;
            case SOUP:
                System.out.println("menu is SOUP");
                break;
            case BREAD:
                System.out.println("menu is BREAD");
                break;
            case PASTA:
                System.out.println("menu is PASTA");
                break;
            default:
                System.out.println("NONE");
        }
    }
}

enum LunchMenu { // enum, 상수집합
    KIMCHI, BANANA, SOUP, BREAD, PASTA, RAMEN // enum에 넣고 위 실행문에 언급하지 않아도 결과물에 나올 수 있음
}