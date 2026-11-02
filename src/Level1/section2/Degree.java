package Level1.section2;


// 섭씨(c)를 화씨(f)로 변환
// 화씨 온도 = 섭씨 × 9 ÷ 5 + 32
public class Degree {
    public double solution(int c) {
        return c * 9 / 5.0 + 32;
    }

    // c : 섭씨온도
    // d : Degree클래스의 객체
    // result : 화씨 온도
    public static void main(String[] args) {
        Degree d = new Degree();
        int c = 30;
        double result = d.solution(c);
        System.out.println(result);
    }
}