package Level3.section2;

// 1부터 n까지 짝수의 합
public class For07 {
    public int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { // 2로 나눈 나머지가 0이면 짝수
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        For07 s = new For07();
        System.out.println(s.solution(10)); // 30
    }
}
