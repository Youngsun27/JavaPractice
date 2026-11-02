package Level2.section8;

// 문자열 비교(==가 아닌 equals)
public class Equal2 {
    public static void main(String[] args) {
        String a = new String("Java");
        String b = new String("Java");

        System.out.println(a == b);        // false
        System.out.println(a.equals(b));   // true
    }
}

