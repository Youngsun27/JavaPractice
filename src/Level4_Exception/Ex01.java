package Level4_Exception;

// 例外（れいがい）예외

// 0으로 나누는 예외 처리하기
// 0で割るときの例外処理

public class Ex01 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int result = a / b;
            System.out.println("結果: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0で割ることはできません。");
        }
        System.out.println("プログラム終了");
    }
}



/*
public class Ex01 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int result = a / b;
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램 종료");
    }
}
*/