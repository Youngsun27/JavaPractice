package Level3.section4;

// 1부터 n까지의 합
// void, System.out.println() 버전

public class While02 {
    public void solution(int n) {
        int a = 0;
        int i = 1;
        while (i <= n) {
            a += i; // a = a + i
            i++;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        While02 s = new While02();
        s.solution(5);
    }
}
