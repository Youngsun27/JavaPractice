package Level2.section7;

// String.valueOf(a) : 정수 → 문자열
public class TypeCasting7 {
    public String solution(int a) {
        return String.valueOf(a);
    }




    public static void main(String[] args) {
       TypeCasting7 s = new TypeCasting7();
        int a = 123;
        String result = s.solution(a);
        System.out.println(result); // 123
    }
}
