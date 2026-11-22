package Level3.section2;

// 1부터 N까지 짝수만 출력하기
// 1からNまで偶数だけを出力する
public class For10 {
    public void solution(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    } //void 메소드 닫기

    public static void main(String[] args) {
        For10 s = new For10();
        s.solution(5);

    } //main함수 닫기
} //클래스 닫기