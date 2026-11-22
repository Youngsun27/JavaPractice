package testE;

// 10보다 작은 수가 입력되면 small 을 출력,
// 10이상이면 아무것도 출력하지 마시오.
public class If02 {
    public void solution(int num) {
        if (num < 10) {
            System.out.println("small");
        }
    }

    public static void main(String[] args) {
        If02 s = new If02();
        s.solution(5);   // small
        s.solution(10);  // 출력 없음
        s.solution(15);  // 출력 없음
    }
}