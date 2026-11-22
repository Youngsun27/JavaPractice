package testE;

//변수명.contains() 문법

//문자열 "Hello Java" 안에
// "Java"가 포함되어 있는지 확인하여 결과를 출력하시오.
public class Contains1 {
    public static void main(String[] args) {
        String s = "Hello Java";
        System.out.println(s.contains("Java"));  // true
    }
}

// contains()는 대소문자를 구분하므로 s.contains("java")는 false입니다.