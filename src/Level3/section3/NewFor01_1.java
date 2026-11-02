package Level3.section3;

// 숫자 배열 출력 : 향상된 for문
public class NewFor01_1 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // for (입력변수 : 배열명) {}
        for (int n : arr) {
            System.out.println(n);
        }

    }
}
