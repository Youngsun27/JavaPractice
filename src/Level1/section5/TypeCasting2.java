package Level1.section5;

// String.valueOf(a) : 정수 → 문자열
public class TypeCasting2 {
    public String solution(int a) {
        return String.valueOf(a);
    }




    public static void main(String[] args) {
        TypeCasting2 s = new TypeCasting2();
        int a = 123;
        String result = s.solution(a);
        System.out.println(result); // 123
    }
}