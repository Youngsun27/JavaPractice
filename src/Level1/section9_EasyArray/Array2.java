package Level1.section9_EasyArray;


// 문제: ① int형 배열 arr를 선언하세요.
//      ② 크기 10인 배열을 만든 후 할당하세요.
//      ③ 2번째 칸에 숫자 3을 할당하세요.
// 포인트: 인덱스는 0부터 시작하므로 2번째 칸은 arr[1]입니다.
public class Array2 {
    public static void main(String[] args) {
        int[] arr; // ① 선언
        arr = new int[10]; // ② 생성 후 할당
        arr[1] = 3; // ③ 2번째 칸에 3 할당

        System.out.println(arr[1]); // 3
        System.out.println(arr[0]); // 0
        System.out.println(arr.length); // 10
    }
}