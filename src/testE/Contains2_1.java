package testE;

// 삼항 연산자로 1 0 풀이

public class Contains2_1 {
    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }

    public static void main(String[] args) {
        Contains2_1 s = new Contains2_1();
        System.out.println(s.solution("abc", "aabcc"));  // 1
        System.out.println(s.solution("tbt", "tbbttb")); // 0
    }
}