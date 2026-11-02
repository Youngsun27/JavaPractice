package Level2.section4;

// 나이에 따른 버스 요금 계산하기
// int와 return 사용

// 문제 : 나이 age가 주어질 때, 8살 미만은 0원, 20살 미만은 1000원, 나머지는 1500원을 반환하는 solution 함수를 작성하시오.
public class ElseIf05 {
    public int solution(int age) {
        if (age < 8) {
            return 0;
        } else if (age < 20) {
            return 1000;
        } else {
            return 1500;
        }
    }

    public static void main(String[] args) {
        ElseIf05 s = new ElseIf05();

        int result1 = s.solution(5);
        System.out.println(result1);  // 0

        int result2 = s.solution(13);
        System.out.println(result2);  // 1000

        int result3 = s.solution(25);
        System.out.println(result3);  // 1500
    }
}

