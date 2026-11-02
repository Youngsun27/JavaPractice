package Level2.section3;

// 조건문 + 논리연산자 : 비 안 오면 산책
// 문제 : 비가 오는지 나타내는 isRaining이 주어질 때, 비가 오지 않으면 "산책 가요", 비가 오면 "우산 챙겨요"를 반환하는 solution 함수를 작성하시오.
public class Logi3 {
    public String solution(boolean isRaining) {
        if (!isRaining) {
            return "산책 가요";
        } else {
            return "우산 챙겨요";
        }
    }




    public static void main(String[] args) {
        Logi3 s = new Logi3();
        String result = s.solution(false);
        System.out.println(result);
    }
}
