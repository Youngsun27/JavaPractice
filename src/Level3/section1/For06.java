package Level3.section1;

// N부터 1까지 거꾸로 출력
public class For06 {
    public void solution(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        For06 s = new For06();
        s.solution(5);
    }
}