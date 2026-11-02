package Level1.section4;

// 배수 판별
public class ThreeOper2 {
    public int solution(int num, int n) {
        return (num % n == 0) ? 1 : 0;
    }




    public static void main(String[] args) {
        ThreeOper2 s = new ThreeOper2();
        int num = 12;
        int n = 3;
        int result = s.solution(num, n);
        System.out.println(result); // 1
    }
}
