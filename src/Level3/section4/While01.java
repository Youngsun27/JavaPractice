package Level3.section4;

// 1부터 n까지의 합
// int, return 버전

public class While01 {
    public int solution(int n) {
        int a = 0;
        int i = 1;
        while (i <= n) {
            a += i; // a = a + i
            i++;
        }
        return a;
    }

public static void main(String[] args) {
    While01 s = new While01();
    System.out.println(s.solution(5));
    }
}