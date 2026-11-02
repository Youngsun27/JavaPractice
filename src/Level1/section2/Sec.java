package Level1.section2;

// 초를 분과 초로 바꾸기
// 문제 : 정수 sec(초)가 주어질 때, 몇 분인지와 남은 초를 한 줄씩 출력하는 solution 함수를 작성하시오.
public class Sec {
    public void solution(int sec) {
        System.out.println(sec / 60);
        System.out.println(sec % 60);
    }



    public static void main(String[] args) {
        Sec s = new Sec();
        int sec = 125;
        s.solution(sec);
    }
}
