package Level3.section2;

//짝수인지 판별 (조건문0 반복X)

public class If01 {
    public String solution(int n) {
        if (n % 2 == 0) {
            return "짝수";
        }
        return "홀수";
    }

    public static void main(String[] args) {
        If01 s = new If01();
        System.out.println(s.solution(4)); // 짝수
    }
}