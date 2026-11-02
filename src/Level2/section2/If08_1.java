package Level2.section2;

// 숫자 비교하기
public class If08_1 {
    public int solution(int num1, int num2) {
        if (num1 == num2) {
            return 1;
        } else {
            return -1;
        }
    }




    public static void main(String[] args) {
        If08_1 s = new If08_1();
        int num1 = 11;
        int num2 = 11;
        int result = s.solution(num1, num2);
        System.out.println(result);
    }
}