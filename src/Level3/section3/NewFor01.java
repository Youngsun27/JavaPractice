package Level3.section3;

//위치나 특정값 : for문
// 배열의 값 : arr[i]
//vs
// 향상된 for문(배열한정) : 배열 전체 출력, 배열 전체 합계, 배열의 모든 값 확인
// 배열의 값 : n

// 숫자 배열 출력하기
public class NewFor01 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
