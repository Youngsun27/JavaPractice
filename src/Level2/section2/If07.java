package Level2.section2;

// 절댓값 구하기
public class If07 {
    public int solution(int num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }

    public static void main(String[] args) {
        If07 s = new If07();
        int num = -7;
        int result = s.solution(num);
        System.out.println(result);
    }
}
