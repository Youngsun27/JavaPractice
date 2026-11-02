package Level1.section5;

// "" + a : 정수 → 문자열
public class TypeCasting4 {
    public String solution(int a) {
        return "" + a;
    }




    public static void main(String[] args) {
        TypeCasting4 s = new TypeCasting4();
        int a = 123;
        String result = s.solution(a);
        System.out.println(result); // 123
    }
}