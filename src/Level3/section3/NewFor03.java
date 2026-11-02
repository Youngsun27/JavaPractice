package Level3.section3;

// 배열의 합 구하기
public class NewFor03 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println(total);
    }
}
