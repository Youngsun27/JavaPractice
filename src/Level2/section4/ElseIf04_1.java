package Level2.section4;

// 온도에 따라 날씨 표현하기
// String과 return 사용

public class ElseIf04_1 {
    public String solution(int temp) {
        if (temp >= 30) {
            return "더워요";
        } else if (temp >= 15) {
            return "따뜻해요";
        } else {
            return "추워요";
        }
    }

    public static void main(String[] args) {
        ElseIf04_1 s = new ElseIf04_1();

        String result1 = s.solution(35);
        System.out.println(result1);  // 더워요

        String result2 = s.solution(18);
        System.out.println(result2);  // 따뜻해요

        String result3 = s.solution(10);
        System.out.println(result3);  // 추워요
    }
}
