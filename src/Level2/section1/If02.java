package Level2.section1;

// 나이가 20세 이상인지 판별하기 (void와 println 사용버전)
public class If02 {
    public void solution(int age) {
        if (age >= 20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }
    }




    public static void main(String[] args) {
        If02 s = new If02();
        s.solution(25);  // 성인입니다.
        s.solution(18);  // 미성년자입니다.
    }
}