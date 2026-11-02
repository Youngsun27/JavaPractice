package Level1.section3;

// 삼각형의 넓이 구하기
public class Oper8 {
    public double solution(int width, int height) {
        return (double) width * height / 2;
    }





    public static void main(String[] args) {
        Oper8 s = new Oper8();
        int width = 3;
        int height = 5;
        double result = s.solution(width, height);
        System.out.println(result); // 7.5
    }
}