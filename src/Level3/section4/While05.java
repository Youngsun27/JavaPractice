package Level3.section4;

// 1부터 N까지 홀수만 출력하기
// 1からNまで奇数だけを出力する
public class While05 {
    public void solution(int n) {
        int i = 1;

        while (i <= n) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    } // void 메소드 닫기

    public static void main(String[] args) {
        While05 s = new While05();
        s.solution(5);

    } // main함수 닫기
} // 클래스 닫기
