package Level3.section2;

// 1부터 n까지 짝수의 개수
// a는 1부터 n까지 짝수의 개수를 저장하는 변수 (count)
public class For08 {
    public int solution(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                a++; // a = a + 1
            }
        }
        return a;
    }

    public static void main(String[] args) {
        For08 s = new For08();
        System.out.println(s.solution(10)); // 5
    }
}
