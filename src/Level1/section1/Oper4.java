package Level1.section1;

//두 수의 나누기 (몫X)
//2つの数の 余り(	あまり 나머지)
public class Oper4 {
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