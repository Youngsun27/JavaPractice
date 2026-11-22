package test1;

// 첫번째, 중간, 마지막 데이터 출력

// 첫 줄에 데이터의 개수 N(N은 홀수)이 입력되고,
// 그 다음 줄에 N개의 데이터가 입력된다.
//여기서 첫번째 데이터, 중간 데이터, 마지막 데이터를 출력하시오.

import java.util.Scanner;
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(arr[0] + " " + arr[n / 2] + " " + arr[n - 1]);
    }
}