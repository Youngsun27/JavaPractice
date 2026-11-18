package test_Paiza;

// 七五三（しちごさん）の 年齢確認  — 시치고산(의) 나이 확인하기

// 문제 : 11月15日は 七五三の日です。
// 七五三は、子どもが 3歳、5歳、7歳に なった年に 成長を お祝いする行事です。
//
//子どもの年齢 n が与えられるので、その子どもが七五三のお祝いをする
// 年齢であれば「Yes」、そうでなければ「No」と出力して下さい。

/* 단어 + 숙어
3歳	さんさい 3세
年齢	ねんれい (넨레이) 나이(연령)
お祝い おいわい 축하
行事	ぎょうじ(쿄오지) 행사
年	とし	(토시) 년,해,나이
与える (あたえる) (아타에루) 주다
与えられる (あたえられる) (아타에라레루) 주어지다
〜と 出力して下さい	〜と しゅつりょくしてください ~라고 출력해주세요
〜歳になる	〜さいになる     ~세가 되다
 */


import java.util.*;

public class D_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 3 || n == 5 || n == 7) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}