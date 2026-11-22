package Level3.section4;

// 1부터 N까지 출력 (숫자 그대로)
// 1からNまで出力する（数字はそのまま）
public class While03 {
    public void solution(int n) {
        int i = 1;

        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }


    public static void main(String[] args) {
        While03 s = new While03();
        s.solution(5);
    }
}
