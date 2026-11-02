package Level1.section3;

// 일의 자리 숫자 구하기
// 문제 : 정수 num이 주어질 때, num의 일의 자리 숫자를 반환하는 solution 함수를 작성하시오.
public class Oper9 {
    public int solution(int num) {
        return num % 10;
    }



    public static void main(String[] args) {
        Oper9 s = new Oper9();
        int num = 1234;
        int result = s.solution(num);
        System.out.println(result);
    }
}
