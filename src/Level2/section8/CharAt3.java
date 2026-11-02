package Level2.section8;

// 문자열의 특정 위치 문자 가져오기
// 문제 : 문자열 my_string과 정수 n이 주어질 때,
// my_string의 n번째 문자를 반환하는 solution 함수를 작성하시오.
// 단, n은 1부터 시작합니다.

public class CharAt3 {
    public char solution(String my_string, int n) {
        return my_string.charAt(n - 1);
    }

    public static void main(String[] args) {
        CharAt3 s = new CharAt3();

        char result1 = s.solution("Programmer", 1);
        System.out.println(result1);  // P

        char result2 = s.solution("Programmer", 3);
        System.out.println(result2);  // o

        char result3 = s.solution("Java", 4);
        System.out.println(result3);  // a
    }
}
