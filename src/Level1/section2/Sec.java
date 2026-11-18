package Level1.section2;

// 초를 분과 초로 바꾸기
// 문제 : 정수 sec(초)가 주어질 때, 몇 분인지와 남은 초를 한 줄씩 출력하는 solution 함수를 작성하시오.

// 秒を 分と 秒に 変える
//問題(もんだい 문제) : 整数 sec(秒)が 与えられた とき、何分かと 残りの 秒を 一行ずつ 出力する solution 関数を 作成しなさい。
//단어 : 整数(せいすう 정수), 関数(かんすう 함수)を 作成(さくせい 작성)しなさい。

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
