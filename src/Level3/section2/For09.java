package Level3.section2;

// 1부터 n까지 홀수의 개수
// a는 1부터 n까지 홀수의 개수를 저장하는 변수 (count)
public class For09 {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // 2로 나눈 나머지가 0이 아니면 홀수
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        For09 s = new For09();
        System.out.println(s.solution(9)); // 5
    }
}
