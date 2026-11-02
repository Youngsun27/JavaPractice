package Level2.section4;

// 세 수 중 최댓값 구하기
// int와 return 사용

public class ElseIf06 {
    public int solution(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }



    public static void main(String[] args) {
        ElseIf06 s = new ElseIf06();

        int result1 = s.solution(3, 9, 5);
        System.out.println(result1);  // 9

        int result2 = s.solution(10, 4, 7);
        System.out.println(result2);  // 10

        int result3 = s.solution(2, 5, 12);
        System.out.println(result3);  // 12
    }
}
