package Level2.section2;

// 10보다 큰 숫자만 출력

public class If06 {
    public void solution(int num) {
        if (num > 10) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        If06 s = new If06();

        s.solution(5);    // 5 → 아무것도 안 보여줘요
        s.solution(10);   // 10 → 아무것도 안 보여줘요
        s.solution(15);   // 15 → 15를 보여줘요
    }
}
