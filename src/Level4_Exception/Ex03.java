package Level4_Exception;

// 配列の範囲外アクセスの例外処理
// 배열의 범위를 벗어나는 접근에 대한 예외 처리

public class Ex03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("存在しないインデックスです。");
        }
        System.out.println("プログラム終了");
    }
}

/*
public class Ex03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("없는 칸 번호입니다.");
        }
        System.out.println("프로그램 종료");
    }
}
*/