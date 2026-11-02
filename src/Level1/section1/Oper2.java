package Level1.section1;

//두 수의 뺄셈
public class Oper2 {
    public int solution(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        Oper2 s = new Oper2();
        int num1 = 10;
        int num2 = 4;
        int result = s.solution(num1, num2);
        System.out.println(result);
    }
}