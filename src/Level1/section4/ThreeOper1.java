package Level1.section4;

// 짝수/홀수 판별
public class ThreeOper1 {
    public String solution(int num) {
        return (num % 2 == 0) ? "짝수" : "홀수";
    }





    public static void main(String[] args) {
        ThreeOper1 s = new ThreeOper1();
        int num = 7;
        String result = s.solution(num);
        System.out.println(result); // 홀수
    }
}
