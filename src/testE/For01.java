package testE;

// num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로
// 이어 붙인 수의 합을 return

// 문자열 변환이 이어붙이기 편함
// 향상된 for문 쓰는 3가지 경우
// 배열은 필수 : 배열의 값을 하나씩 출력할 때, 합계나 개수, List 출력 List<Integer> nums

public class For01 {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";

        for (int num : num_list) {
            if (num % 2 == 0) {
                even += num + "";
            } else {
                odd += num + "";
            }
        }

        return Integer.parseInt(even) + Integer.parseInt(odd);
    }

    public static void main(String[] args) {
        For01 s = new For01();
        System.out.println(s.solution(new int[]{3, 4, 5, 2, 1}));  // 393
        System.out.println(s.solution(new int[]{5, 7, 8, 3}));     // 581
    }
}