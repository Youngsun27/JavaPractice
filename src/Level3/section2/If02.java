package Level3.section2;

// 양수, 음수, 0 판별
public class If02 {
    public String solution(int n) {
        if (n > 0) {
            return "양수";
        } else if (n < 0) {
            return "음수";
        }
        return "0";
    }

    public static void main(String[] args) {
        If02 s = new If02();
        System.out.println(s.solution(-3)); // 음수
    }
}