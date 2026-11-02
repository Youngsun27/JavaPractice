package Level2.section1;

// // 짝수와 홀수 구분

public class If04 {
    public void solution(int num) {
        if (num % 2 == 0) {
            System.out.println(num + "은 짝수입니다.");
        } else {
            System.out.println(num + "은 홀수입니다.");
        }
    }




    public static void main(String[] args) {
        If04 s = new If04();

        s.solution(3);  // 3은 홀수입니다.
        s.solution(4);  // 4는 짝수입니다.
    }
}