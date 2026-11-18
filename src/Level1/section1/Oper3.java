package Level1.section1;

//두 수의 곱셈
//2つの数の 掛け算(かけざん 곱셈)
public class Oper3 {
    public int solution(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Oper1 s = new Oper1();
        int num1 = 3;
        int num2 = 5;
        int result = s.solution(num1, num2);
        System.out.println(result);
    }
}
