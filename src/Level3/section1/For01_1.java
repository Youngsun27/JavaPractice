package Level3.section1;

// 1부터 n까지의 합
//void + System.out.println() 버전
// a는 1부터 n까지 더한 값을 누적해서 저장하는 변수 (sum)

public class For01_1 {
    public void solution(int n) {
        int a = 0;

        for (int i = 1; i <= n; i++) {
            a += i; // a = a + i
        }

        System.out.println(a);
    }

    public static void main(String[] args) {
        For01_1 s = new For01_1();
        s.solution(5);
    }
}
