package Level2.section7;

// 정수 두 개를 문자열로 변환한 후 연결하기
// 문제 : 정수 a와 b가 주어질 때,
// 두 정수를 문자열로 변환하여 이어 붙인 값을 반환하는 solution 함수를 작성하시오.

public class TypeCasting8 {
    public String solution(int a, int b) {
        return String.valueOf(a) + String.valueOf(b);
    }



    public static void main(String[] args) {
        TypeCasting8 s = new TypeCasting8();

        String result = s.solution(12, 30);
        System.out.println(result);  // 1230
    }
}