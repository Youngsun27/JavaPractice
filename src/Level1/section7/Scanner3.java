package Level1.section7;

// sc.nextLine(): 한 줄 전체 입력받기
// 문제: 이름을 공백까지 포함해 입력받아 "안녕하세요, 이름님" 형태로 출력해 주세요.
// 포인트: nextLine()은 공백을 포함해 줄바꿈 전까지 한 줄 전체를 읽습니다. 같은 입력을 next()로 받으면 김만 저장됩니다.

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("안녕하세요, " + name + "님");
        sc.close();
    }
}

