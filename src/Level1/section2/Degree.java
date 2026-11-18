package Level1.section2;


// 섭씨(c)를 화씨(f)로 변환
// 화씨 온도 = 섭씨 × 9 ÷ 5 + 32

// 摂氏(せっし 섭씨)を 華氏(かし 화씨)に 変換(へんかん 변환)する
// 華氏温度(かしおんど 화씨온도) = 摂氏 × 9 ÷ 5 + 32

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