package Level2.section8;

// 문자열 길이 구하기
// 문제 : 문자열 str이 주어질 때,
// 문자열의 길이를 반환하는 solution 함수를 작성하시오.

public class StringLength1 {
    public int solution(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        StringLength1 s = new StringLength1();

        int result1 = s.solution("Java");
        System.out.println(result1);  // 4

        int result2 = s.solution("Programmer");
        System.out.println(result2);  // 10
    }
}