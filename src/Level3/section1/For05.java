package Level3.section1;

// 1부터 N까지 출력 (숫자 그대로)
public class For05 {
    public void solution(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        For05 s = new For05();
        s.solution(5);
    }
}
