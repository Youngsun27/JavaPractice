package Level4_Exception;

// nullのオブジェクトを使用するときの例外処理
// null인 객체를 사용할 때의 예외 처리

public class Ex04 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("nullのオブジェクトは使用できません。");
        }
        System.out.println("プログラム終了");
    }
}

/*
public class Ex04 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("null인 객체는 사용할 수 없습니다.");
        }
        System.out.println("프로그램 종료");
    }
}
*/