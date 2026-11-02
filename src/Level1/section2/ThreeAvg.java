package Level1.section2;

//세 수의 평균
public class ThreeAvg {
    public double solution(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        ThreeAvg s = new ThreeAvg();
        double result = s.solution(80, 90, 100);
        System.out.println(result);
    }
}
