package Level2.section7;

// 글자 숫자 두 개 더하기

// 문제 : 숫자로 이루어진 문자열 a와 b가 주어질 때, 두 수를 더한 값을 정수로 반환하는 solution 함수를 작성하시오.
public class TypeCasting6 {
    public int solution(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }


public static void main(String[] args) {
    TypeCasting6 s = new TypeCasting6();
    int result = s.solution("12", "30");
    System.out.println(result);
    }
}