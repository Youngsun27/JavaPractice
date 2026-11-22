package testE;

//조건 3개 이상부터 else if 필수
// if else if else 구조

/*
문제
a가 b보다 크면  > 를 출력,
b가 a보다 크면  < 를 출력,
a와 b가 같으면  = 를 출력한다.
 */

public class If04 {
    public void solution(int a, int b) {
        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }
    }

    public static void main(String[] args) {
        If04 s = new If04();
        s.solution(5, 3);  // >
        s.solution(2, 7);  // <
        s.solution(4, 4);  // =
    }
}