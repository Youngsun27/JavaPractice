package Level3.section2;

// 두 수 중 큰 수 구하기
public class If03 {
    public int solution(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        If03 s = new If03();
        System.out.println(s.solution(7, 3)); // 7
    }
}
