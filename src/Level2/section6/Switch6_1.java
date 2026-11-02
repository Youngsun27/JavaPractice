package Level2.section6;

// 커피 메뉴 가격
// 문제 : 메뉴 이름 menu가 주어질 때,
// "아메리카노"는 4000, "라떼"는 4500,
// "녹차"는 3500, 없는 메뉴는 0을 반환하는 solution 함수를 if문으로 작성하시오.
// if와 else if + int와 return 사용

public class Switch6_1 {
    public int solution(String menu) {
        if (menu.equals("아메리카노")) {
            return 4000;
        } else if (menu.equals("라떼")) {
            return 4500;
        } else if (menu.equals("녹차")) {
            return 3500;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Switch6_1 s = new Switch6_1();

        int result1 = s.solution("라떼");
        System.out.println(result1);  // 4500

        int result2 = s.solution("아메리카노");
        System.out.println(result2);  // 4000

        int result3 = s.solution("녹차");
        System.out.println(result3);  // 3500

        int result4 = s.solution("콜라");
        System.out.println(result4);  // 0
    }
}
