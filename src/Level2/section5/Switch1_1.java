package Level2.section5;

// 레벨별 달리기
// 문제 : 레벨 level이 주어질 때,
// 1은 2km, 2는 5km, 3은 10km를 달린다고 출력하고
// 그 외에는 존재하지 않는 레벨이라고 출력하는 solution 함수를 if문으로 작성하시오.

public class Switch1_1 {
    public void solution(int level) {
        if (level == 1) {
            System.out.println("2km 달립니다.");
        } else if (level == 2) {
            System.out.println("5km 달립니다.");
        } else if (level == 3) {
            System.out.println("10km 달립니다.");
        } else {
            System.out.println("존재하지 않는 레벨입니다.");
        }
    }

    public static void main(String[] args) {
        Switch1_1 s = new Switch1_1();

        int level = 2;
        s.solution(level);  // 5km 달립니다.
    }
}
