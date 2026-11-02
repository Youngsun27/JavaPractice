package Level2.section1;

// 홀수만 출력
public class If03_1 {
    public void solution(int num) {
        if (num % 2 != 0) {
            System.out.println(num);
        }
    }




    public static void main(String[] args) {
        If03_1 s = new If03_1();
        s.solution(3);   // 3 % 2 = 1 → 3을 보여줘요
        s.solution(4);   // 4 % 2 = 0 → 아무것도 안 보여줘요
    }
}
