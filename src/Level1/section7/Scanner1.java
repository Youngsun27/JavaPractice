package Level1.section7;

// sc.nextInt(): 정수 입력받기
//문제: 두 정수를 입력받아 합을 출력해 주세요. (scanner)
// 포인트: nextInt()는 공백이나 줄바꿈을 기준으로 정수를 하나씩 읽습니다. 정수가 아닌 값을 입력하면 InputMismatchException 오류가 납니다.

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        sc.close();
    }
}
