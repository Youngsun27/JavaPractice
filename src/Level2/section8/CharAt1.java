package Level2.section8;

// charAt() : 문자열에서 원하는 위치의 문자 가져오기
// 문제 : 문자열 word가 주어질 때, 첫 번째 문자를 출력하시오.

public class CharAt1 {
    public char solution(String word) {
        return word.charAt(0);
    }

    public static void main(String[] args) {
        CharAt1 s = new CharAt1();

        char result = s.solution("Java");
        System.out.println(result);  // J
    }
}
