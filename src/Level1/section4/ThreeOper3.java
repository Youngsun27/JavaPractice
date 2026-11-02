package Level1.section4;

// 두 수 중 큰 수 찾기
public class ThreeOper3 {
    public int solution(int a, int b) {
        return (a > b) ? a : b;
    }





    public static void main(String[] args) {
        ThreeOper3 s = new ThreeOper3();
        int a = 8;
        int b = 3;
        int result = s.solution(a, b);
        System.out.println(result); // 8
    }
}


/*
// 두 수 중 큰 수의 제곱
class Solution {
    public int solution(int a, int b) {
        int max = a > b ? a : b;
        return max * max;
    }
}
 */