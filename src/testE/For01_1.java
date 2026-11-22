package testE;

//일반 for문 버전

public class For01_1 {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }

        return Integer.parseInt(even) + Integer.parseInt(odd);
    }

    public static void main(String[] args) {
        For01_1 s = new For01_1();
        System.out.println(s.solution(new int[]{3, 4, 5, 2, 1}));  // 393
        System.out.println(s.solution(new int[]{5, 7, 8, 3}));     // 581
    }
}
