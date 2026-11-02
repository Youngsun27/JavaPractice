package Level3.section1;

// 1부터 5까지 문자열로 출력하기 (합X 나열0)
public class For03 {
    public static void main(String[] args) {

        String result = "";

        for (int i = 1; i <= 5; i++) {
            result += i;
        }

        System.out.println(result); // 12345
    }
}
