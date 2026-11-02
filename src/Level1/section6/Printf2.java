package Level1.section6;

// 문제: 문자 'A'와 문자열 "철수"를 아래처럼 두 줄로 출력해 주세요.
//%c는 문자 하나(char), %s는 문자열(String)
public class Printf2 {
    public static void main(String[] args) {
        char grade = 'A';
        String name = "철수";
        System.out.printf("등급: %c\n이름: %s", grade, name);
    }
}
