package Level3.section1;

// 1부터 n까지의 합
public class For01 {
    public int solution(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            a += i; // a = a + i
        }
        return a;
    }

    public static void main(String[] args) {
        For01 s = new For01();
        System.out.println(s.solution(5));
    }
}


/*
 For01 s = new For01();
 int result = s.solution(5);
System.out.println(result);

=

  For01 s = new For01();
  System.out.println(s.solution(5));

 */