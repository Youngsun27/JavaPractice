package Level1.section3;

// 사각형의 넓이 구하기
public class Oper7 {
    public double solution(int width, int height) {
        return width * height;
    }





    public static void main(String[] args) {
        Oper7 s = new Oper7();
        int width = 4;
        int height = 5;
        double result = s.solution(width, height);
        System.out.println(result); // 20.0
    }
}
