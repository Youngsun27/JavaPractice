package Level1.section5;

// Integer.parseInt(a) : 문자열 → 정수
public class TypeCasting1 {
    public int solution(String a) {
        return Integer.parseInt(a);
    }





    public static void main(String[] args) {
        TypeCasting1 s = new TypeCasting1();
        String a = "123";
        int result = s.solution(a);
        System.out.println(result); // 123
    }
}