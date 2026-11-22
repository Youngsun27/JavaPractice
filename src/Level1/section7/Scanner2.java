package Level1.section7;

// sc.next(): 문자열 입력받기
// 문제: 이름을 입력받아 "안녕하세요, 이름님" 형태로 출력해 주세요.
// 포인트: next()는 공백 전까지만 읽습니다. 그래서 김 철수를 입력하면 김만 저장되고, 공백을 포함한 한 줄 전체를 읽으려면 nextLine()을 씁니다.

// sc.next()：文字列を入力する
//問題：名前を入力して、「こんにちは、名前さん」という形式で出力してください。
//ポイント：next()は空白の前までしか読み取りません。そのため、「キム チョルス」と入力すると、「キム」だけが保存されます。空白を含む1行全体を読み取るには、nextLine()を使います。
import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("안녕하세요, " + name + "님");
        sc.close();
    }
}