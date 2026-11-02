package Level1.section6;

// 문제: 정수 90과 실수 85.5를 아래처럼 두 줄로 출력해 주세요.
//%d : 정수 / %f : 실수
public class Printf1 {
    public static void main(String[] args) {
        int score = 90;
        double avg = 85.5;
        System.out.printf("점수: %d\n평균: %.1f", score, avg);
    }
}