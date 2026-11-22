package test1;

// 첫번째, 중간, 마지막 데이터 출력

public class Solution3_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;

        System.out.println(arr[0] + " " + arr[n / 2] + " " + arr[n - 1]); // 1 2 3
    }
}
