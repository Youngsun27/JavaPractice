package Level1.section5;

// Integer.toString(a) : 정수 → 문자열
public class TypeCasting3 {
    public String solution(int a) {
        return Integer.toString(a);
    }




    public static void main(String[] args) {
        TypeCasting3 s = new TypeCasting3();
        int a = 123;
        String result = s.solution(a);
        System.out.println(result); // 123
    }
}
