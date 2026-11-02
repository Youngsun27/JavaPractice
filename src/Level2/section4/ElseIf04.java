package Level2.section4;

// 온도에 따라 날씨 표현하기
// void와 System.out.println() 사용

public class ElseIf04 {
    public void solution(int temp) {
        if (temp >= 30) {
            System.out.println("더워요");
        } else if (temp >= 15) {
            System.out.println("따뜻해요");
        } else {
            System.out.println("추워요");
        }
    }

    public static void main(String[] args) {
        ElseIf04 s = new ElseIf04();

        s.solution(35);  // 더워요
        s.solution(18);  // 따뜻해요
        s.solution(10);  // 추워요
    }
}
