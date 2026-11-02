package Level1.section4;

// 두 수가 같으면 0, 다르면 1 출력
public class ThreeOper4 {
    public int solution(int a, int b) {
        return (a == b) ? 0 : 1;
    }





    public static void main(String[] args) {
        ThreeOper4 s = new ThreeOper4();
        int a = 5;
        int b = 3;
        int result = s.solution(a, b);
        System.out.println(result); // 1
    }
}
