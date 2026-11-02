package Level3.section1;

// 5부터 1까지 문자열로 출력하기 (합X 나열0)
public class For04 {
    public static void main(String[] args) {

        String result = "";

        for (int i = 5; i >= 1; i--) {
            result += i;
        }

        System.out.println(result); // 54321
    }
}