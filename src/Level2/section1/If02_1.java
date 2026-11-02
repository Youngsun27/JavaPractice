package Level2.section1;


// 나이가 20세 이상인지 판별하기 (String과 return 사용버전)

public class If02_1 {
    public String solution(int age) {
        if (age >= 20) {
            return "성인입니다.";
        } else {
            return "미성년자입니다.";
        }
    }

    public static void main(String[] args) {
        If02_1 s = new If02_1();

        System.out.println(s.solution(25));  // 성인입니다.
        System.out.println(s.solution(18));  // 미성년자입니다.
    }
}