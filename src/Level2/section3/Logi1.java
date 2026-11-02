package Level2.section3;

// 논리연산자는 영어로 Logical Operators

// 조건문 + 논리연산자 : 범위 안에 있는지 확인
// 문제 : 정수 num이 주어질 때, num이 1 이상 10 이하이면 "범위 안", 아니면 "범위 밖"을 반환하는 solution 함수를 작성하시오.
public class Logi1 {
    public String solution(int num) {
        if (num >= 1 && num <= 10) {
            return "범위 안";
        } else {
            return "범위 밖";
        }
    }

    public static void main(String[] args) {
        Logi1 s = new Logi1();
        String result = s.solution(7);
        System.out.println(result);
    }
}