package Level1.section7;

// sc.next(): 문자열 입력받기
// 문제: 이름을 입력받아 "안녕하세요, 이름님" 형태로 출력해 주세요.
// 포인트: next()는 공백 전까지만 읽습니다. 그래서 김 철수를 입력하면 김만 저장되고, 공백을 포함한 한 줄 전체를 읽으려면 nextLine()을 씁니다.

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("안녕하세요, " + name + "님");
        sc.close();
    }
}