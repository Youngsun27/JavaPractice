package Level2.section2;

// 비밀번호 반환하기
// 문제 : 입력한 비밀번호 pw가 주어질 때, "1234"와 같으면 "로그인 성공", 다르면 "비밀번호 틀림"을 반환하는 solution 함수를 작성하시오.

public class If09 {
    public String solution(String pw) {
        if (pw.equals("1234")) {
            return "로그인 성공";
        } else {
            return "비밀번호 틀림";
        }
    }

    public static void main(String[] args) {
        If09 s = new If09();
        String result = s.solution("1234");
        System.out.println(result);
    }
}