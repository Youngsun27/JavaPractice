package Level1.section3;

// 원의 넓이 구하기
public class Oper6 {
public double solution(int r) {
        return r * r * 3.14;
    }





public static void main(String[] args) {
    Oper6 s = new Oper6();
    int r = 5;
    double result = s.solution(r);
    System.out.println(result);
    }
}
