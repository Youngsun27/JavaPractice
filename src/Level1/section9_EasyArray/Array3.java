package Level1.section9_EasyArray;

// 문제: 크기 3인 int형 배열 arr를 만들어 10, 20, 30을 차례로 할당한 뒤,
//      첫 번째 값과 마지막 값을 출력해 주세요.
// 포인트: 마지막 칸의 인덱스는 arr.length - 1입니다.
public class Array3 {
    public static void main(String[] args) {
        int[] arr = new int[3];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(arr[0]); // 10
        System.out.println(arr[arr.length - 1]); // 30
    }
}


/*
public class Array3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        System.out.println(arr[0]); // 10
        System.out.println(arr[arr.length - 1]); // 30
    }
}
 */