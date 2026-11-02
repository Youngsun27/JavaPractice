package Level2.section7;

import Level1.section5.TypeCasting1;

    // Integer.parseInt(a) : 문자열 → 정수
    public class TypeCasting5 {
        public int solution(String a) {
            return Integer.parseInt(a);
        }





        public static void main(String[] args) {
            TypeCasting5 s = new TypeCasting5();
            String a = "123";
            int result = s.solution(a);
            System.out.println(result); // 123
        }
    }
