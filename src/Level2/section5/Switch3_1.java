package Level2.section5;

// 점수에 따른 학점 구하기
// void와 System.out.println() 사용

public class Switch3_1 {
    public void solution(int score) {
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

        System.out.println(grade);
    }

    public static void main(String[] args) {
        Switch3_1 s = new Switch3_1();

        int score = 85;
        s.solution(score);  // B
    }
}
