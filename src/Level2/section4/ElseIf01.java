package Level2.section4;

// 조건이 3개 이상이면 else if 사용
// 양수, 음수, 0 판별
public class ElseIf01 {
    public String solution(int num) {
        if (num > 0) {
            return "양수";
        } else if (num < 0) {
            return "음수";
        } else {
            return "0";
        }
    }

    public static void main(String[] args) {
        ElseIf01 s = new ElseIf01();
        String result = s.solution(-3);
        System.out.println(result);
    }
}
