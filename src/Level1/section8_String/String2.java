package Level1.section8_String;

package section8_String;

// StringBuilder: 내용을 변경할 수 있어 기존 객체에 계속 이어 붙임 (문자열 새로 생성이 아닌, 단순 객체추가 : 반복문에서 빠름)
// 문제: 1부터 5까지의 숫자를 StringBuilder로 이어 붙인 뒤 String으로 바꿔 출력해 주세요.
// 포인트: sb.append(i)는 새 문자열을 만들지 않고 기존 객체에 내용을 추가합니다.
public class String2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append(i);
        }

        String result = sb.toString();
        System.out.println(result); // 12345
    }
}