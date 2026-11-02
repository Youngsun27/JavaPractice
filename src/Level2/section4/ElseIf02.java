package Level2.section4;

// 숫자 크기 비교하기

public class ElseIf02 {
    public String solution(int num1, int num2) {
        if (num1 > num2) {
            return "num1이 더 큼";
        } else if (num1 < num2) {
            return "num2가 더 큼";
        } else {
            return "같음";
        }
    }




    public static void main(String[] args) {
        ElseIf02 s = new ElseIf02();
        String result = s.solution(7, 9);
        System.out.println(result);
    }
}