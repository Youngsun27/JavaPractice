package test1;

// n 번째 원소부터 마지막 원소까지의 개수(리스트)
public class Solution1 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[n - 1 + i];
        }
        return answer;
    }
}

/* import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}
 */