package Level1.section8_String;

// toString(): StringBuilder → String
// 문제: StringBuilder에 "Hello"를 담은 뒤 String으로 바꿔 출력해 주세요.
// 포인트 : StringBuilder와 String은 다른 타입이라 String result = sb;처럼 바로 대입할 수 없습니다. toString()으로 변환해야 합니다.
public class ToString1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        String result = sb.toString();
        System.out.println(result); // Hello
    }
}
