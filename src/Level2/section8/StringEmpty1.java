package Level2.section8;

// 빈 문자열인지 확인하기
// 문제 : 문자열 str이 주어질 때,
// 문자열이 비어 있으면 true, 비어 있지 않으면 false를 반환하는 solution 함수를 작성하시오.

public class StringEmpty1 {
    public boolean solution(String str) {
        return str.isEmpty();
    }

    public static void main(String[] args) {
        StringEmpty1 s = new StringEmpty1();

        boolean result1 = s.solution("");
        System.out.println(result1);  // true

        boolean result2 = s.solution("Java");
        System.out.println(result2);  // false
    }
}
