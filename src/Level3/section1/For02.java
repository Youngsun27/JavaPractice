package Level3.section1;

// 1부터 5까지의 합
public class For02 {
    public int solution(int n) {
        int a = 0;
        for (int i = 1; i <= 5; i++) {
            a += i;
        }
        return a;
    }



    public static void main(String[] args) {
        For01 s = new For01();
        //int n에 5를 넣고 + 출력문
        System.out.println(s.solution(5));
    }
}
