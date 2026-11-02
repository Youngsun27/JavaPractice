package Level2.section1;

// 양수인지 음수인지 판별하기
public class If01 {
    public void solution(int num) {
        if (num > 0) {
            System.out.println("양수입니다.");
        } else {
            System.out.println("음수 또는 0입니다.");
        }
    }



    public static void main(String[] args) {
        If01 s = new If01();
        s.solution(5);   // 양수입니다.
        s.solution(-3);  // 음수 또는 0입니다.
    }
}