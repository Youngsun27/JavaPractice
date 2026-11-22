package Level3.section4;

// N부터 1까지 거꾸로 출력
// Nから1まで逆順に出力する
public class While06 {
    public void solution(int n) {
        int i = n;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void main(String[] args) {
        While06 s = new While06();
        s.solution(5);
    }
}