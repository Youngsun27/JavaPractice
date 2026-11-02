package Level1.section4;

// 1 또는 0을 입력받아 반대로 출력
// (boolean) a 형변환은 java에서 불가능
public class ThreeOper5 {
    public int solution(int a) {
        boolean value = (a == 1);
        return !value ? 1 : 0;
    }

/*
// 1 또는 0을 입력받아 반대로 출력
public class ThreeOper5 {
    public int solution(int a) {
        return (a == 1) ? 0 : 1;
    }
 */



    public static void main(String[] args) {
        ThreeOper5 s = new ThreeOper5();
        int a = 1;
        int result = s.solution(a);
        System.out.println(result); // 0
    }
}