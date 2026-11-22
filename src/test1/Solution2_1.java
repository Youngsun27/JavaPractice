package test1;

//자릿수 구하기
// scanner 대신 입력값

public class Solution2_1 {
public static void main(String[] args) {
    int n = 10;

    int count = 0;
    while (n > 0) {
        n = n / 10;
        count++;
    }

    System.out.println(count); // 2
}
}