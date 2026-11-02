package Level2.section4;

// 점수로 등급 출력

public class ElseIf03 {
    public void solution(int score) {
        if (score >= 81) {
            System.out.println("A등급입니다");
        } else if (score >= 61) {
            System.out.println("B등급입니다");
        } else {
            System.out.println("C등급입니다");
        }
    }




    public static void main(String[] args) {
        ElseIf03 s = new ElseIf03();
        int score = 60;
        s.solution(score);
    }
}