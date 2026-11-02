package Level1.section8_String;

// charAt(0): 첫 글자 꺼내기
// 문제 : 문자열 "Java"의 첫 글자를 출력해 주세요.
// 포인트: 문자열의 위치(인덱스)는 1이 아니라 0부터 시작합니다.

public class CharAt1 {
    public static void main(String[] args) {
        String s = "Java";
        System.out.println(s.charAt(0)); // J
    }
}