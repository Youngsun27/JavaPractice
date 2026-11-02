package Level1.section6;

// 줄바꿈 출력하기2 : printf
// 문제: printf를 한 번만 써서 이름 "철수"와 나이 20을 아래처럼 두 줄로 출력해 주세요.
// 포인트: %s에는 문자열인 name이, %d에는 정수인 age가 순서대로 들어갑니다. printf도 자동으로 줄을 바꾸지 않아서 \n을 직접 넣었습니다.
public class Print3 {
    public static void main(String[] args) {
        String name = "철수";
        int age = 20;
        System.out.printf("이름: %s\n나이: %d", name, age);
    }
}