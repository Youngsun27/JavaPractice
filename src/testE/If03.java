package testE;

//10보다 작은 정수가 입력되면 small 을 출력,
// 그 이상의 수가 입력되면 big 을 출력하시오.
public class If03 {
    public void solution(int num) {
        if (num < 10) {
            System.out.println("small");
        } else {
            System.out.println("big");
        }
    }

    public static void main(String[] args) {
        If03 s = new If03();
        s.solution(5);   // small
        s.solution(10);  // big
        s.solution(15);  // big
    }
}
