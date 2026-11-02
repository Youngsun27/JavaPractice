package Level1.section2;

//두 수의 나눗셈 (몫 구하기)
public class Oper5 {
    public double solution(int num1, int num2) {
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        Oper5 s = new Oper5();
        int num1 = 6;
        int num2 = 2;
        double result = s.solution(num1, num2);
        System.out.println(result);
    }
}
