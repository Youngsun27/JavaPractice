package Level2.section6;

// 월로 계절 구하기

// 문제 : 월 month가 주어질 때, 3~5월은 봄, 6~8월은 여름, 9~11월은 가을, 12~2월은 겨울이라고 출력하는 solution 함수를 switch문으로 작성하시오.
public class Switch7 {
    public void solution(int month) {
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을입니다.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울입니다.");
                break;
        }   // switch 닫기
    }       // solution 메서드 닫기 (이 줄이 빠져 있었어요)

    public static void main(String[] args) {
        Switch7 s = new Switch7();
        int month = 8;
        s.solution(month);
    }
}