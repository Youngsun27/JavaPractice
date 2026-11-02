package Level3.section3;

/*
for (자료형 변수이름 : 배열이름) {
   실행문;
    }
*/


// 문자열 배열 출력하기 : 향상된 for문, 자료형 변수 n
public class NewFor02_1 {
    public static void main(String[] args) {

        String[] a = {"사과", "딸기", "포도"};

        for (String n : a) {
            System.out.println(n);
        }

    }
}
