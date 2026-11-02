package Level1.section8_String;

//문제 : 공백 한 칸으로 단어가 나뉜 문자열 str이 주어질 때, 단어의 개수를 반환하는 solution 함수를 작성하시오.
// "I love java"

public class String4 {
        public int solution(String str) {
            String[] words = str.split(" ");
            return words.length;
        }

    public static void main(String[] args) {
        String4 s = new String4();
        int result = s.solution("I love java");
        System.out.println(result);
    }
    }