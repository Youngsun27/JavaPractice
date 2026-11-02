package Level2.section5;

// break 없는 switch (Fall through)
// switch문에서 break가 없으면 어떻게 될까요?
//다음 case로 계속 내려가면서 실행됩니다. 이것을 Fall Through라고 합니다.

// 문제 : 정수 num이 주어질 때, break가 없는 case를 이용해 num단계부터 3단계까지 차례로 출력하는 solution 함수를 switch문으로 작성하시오.
public class Switch2 {
    public void solution(int num) {
        switch (num) {
            case 1:
                System.out.println("1단계");
            case 2:
                System.out.println("2단계");
            case 3:
                System.out.println("3단계");
                break;
            default:
                System.out.println("끝");
        }
    }


        public static void main(String[] args) {
            Switch2 s = new Switch2();
            int num = 2;
            s.solution(num);
        }
}
