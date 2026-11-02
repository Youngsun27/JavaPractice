package Level2.section2;

// 음수이면 0으로 바꾸고, 양수이면 그대로 반환하기

public class If08 {
    public int solution(int num) {
        if (num < 0) {
            return 0;
        } else {
            return num;
        }
    }

    public static void main(String[] args) {
        If08 s = new If08();

        System.out.println(s.solution(-5));  // 0 반환
        System.out.println(s.solution(10));  // 10 반환
        System.out.println(s.solution(0));   // 0 반환
    }
}

