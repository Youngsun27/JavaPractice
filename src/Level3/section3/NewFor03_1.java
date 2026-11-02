package Level3.section3;

// 배열의 합 구하기 : 향상된 for문
public class NewFor03_1 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};
        int total = 0;

        for (int n : arr) {
            total += n;
        }

        System.out.println(total);
    }
}