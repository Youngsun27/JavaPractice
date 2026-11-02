package Level2.section5;

// 사칙연산 계산기

public class Switch4 {
    public int solution(int a, char op, int b) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }



    public static void main(String[] args) {
        Switch4 s = new Switch4();
        int a = 10;
        char op = '*';
        int b = 3;
        int result = s.solution(a, op, b);
        System.out.println(result);
    }
}