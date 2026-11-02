package Level2.section6;

// 커피 메뉴 가격

// 문제 : 메뉴 이름 menu가 주어질 때, "아메리카노"는 4000, "라떼"는 4500, "녹차"는 3500, 없는 메뉴는 0을 반환하는 solution 함수를 switch문으로 작성하시오.
public class Switch6 {
    public int solution(String menu) {
        switch (menu) {
            case "아메리카노":
                return 4000;
            case "라떼":
                return 4500;
            case "녹차":
                return 3500;
            default:
                return 0;
        }
    }


        public static void main(String[] args) {
            Switch6 s = new Switch6();
            int result = s.solution("라떼");
            System.out.println(result);
        }
}
