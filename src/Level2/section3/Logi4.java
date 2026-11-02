package Level2.section3;

// 논리연산자 및 비교연산자 : ==
// 문제 : 정수 num이 5와 같으면 "5입니다",
// 아니면 "5가 아닙니다"를 반환하는 solution 함수를 작성하시오.

public class Logi4 {
    public String solution(int num) {
        if (num == 5) {
            return "5입니다";
        } else {
            return "5가 아닙니다";
        }
    }

    public static void main(String[] args) {
        Logi4 s = new Logi4();

        String result1 = s.solution(5);
        System.out.println(result1);  // 5입니다

        String result2 = s.solution(3);
        System.out.println(result2);  // 5가 아닙니다
    }
}
