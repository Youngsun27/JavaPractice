package Level2.section3;

// 조건문 + 논리연산자 : 주말인지 확인하기
// 문제 : 요일 day가 주어질 때, "토" 또는 "일"이면 "주말", 아니면 "평일"을 반환하는 solution 함수를 작성하시오.
public class Logi2 {
    public String solution(String day) {
        if (day.equals("토") || day.equals("일")) {
            return "주말";
        } else {
            return "평일";
        }
    }




    public static void main(String[] args) {
        Logi2  s = new Logi2 ();
        String result = s.solution("일");
        System.out.println(result);
    }
}
