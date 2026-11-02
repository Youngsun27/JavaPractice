package Level2.section7;

// 실수를 정수로 변환하기

// 문제 : 실수 num이 주어질 때,
// 소수점을 버리고 정수로 변환한 값을 반환하는 solution 함수를 작성하시오.
public class TypeCasting9 {
    public int solution(double num) {
        return (int) num;
    }

    public static void main(String[] args) {
        TypeCasting9 s = new TypeCasting9();

        int result1 = s.solution(3.14);
        System.out.println(result1);  // 3
    }
}