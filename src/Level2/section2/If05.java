package Level2.section2;

// 3의 배수만 출력

public class If05 {
    public void solution(int num) {
        if (num % 3 == 0) {
            System.out.println(num);
        }
    }


    public static void main(String[] args) {
        If05 s = new If05();
        s.solution(9);    // 9 % 3 = 0 → 9를 보여줘요
        s.solution(10);   // 10 % 3 = 1 → 아무것도 안 보여줘요
    }
}
