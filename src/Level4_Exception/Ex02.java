package Level4_Exception;

// 文字列を数値に変換するときの例外処理
// 문자열을 숫자로 변환할 때의 예외 처리

public class Ex02 {
    public static void main(String[] args) {
        String str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println("変換結果: " + num);
        } catch (NumberFormatException e) {
            System.out.println("数字に変換できない文字列です。");
        }
        System.out.println("プログラム終了");
    }
}

/*
public class Ex02 {
    public static void main(String[] args) {
        String str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println("변환 결과: " + num);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 바꿀 수 없는 문자열입니다.");
        }
        System.out.println("프로그램 종료");
    }
}
*/
