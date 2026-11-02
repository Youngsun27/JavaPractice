package Level1.section8_String;

// String: 내용을 변경할 수 없어 이어 붙일 때마다 새 문자열이 만들어짐 (반복문때 느림)
// 문제: 1부터 5까지의 숫자를 String으로 이어 붙여 출력해 주세요.
// 포인트: result += i는 기존 문자열을 수정하지 않고, 새 문자열을 만들어 result에 다시 대입합니다.
public class String1 {
    public static void main(String[] args) {
        String result = "";

        for (int i = 1; i <= 5; i++) {
            result += i;
        }

        System.out.println(result); // 12345
    }
}