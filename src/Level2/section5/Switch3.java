package Level2.section5;

// 점수로 학점 구하기
// String과 return 사용

public class Switch3 {
    public String solution(int score) {
        String grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            default:
                grade = "F";
        }
        return grade;
    }


    public static void main(String[] args) {
        Switch3 s = new Switch3();
        int score = 85;
        String result = s.solution(score);
        System.out.println(result);
    }
}
