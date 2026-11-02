package Level2.section6;

// 주민등록번호 생년월일과 성별 정보로 현재 나이 계산하기
// if, else if와 + void와 System.out.println() 사용
// 기준년도 : 2026년


public class Switch5_1 {
    public void solution(int birthYear, int gender) {
        int year = 0;

        if (gender == 1 || gender == 2) {
            year = 1900 + birthYear;
        } else if (gender == 3 || gender == 4) {
            year = 2000 + birthYear;
        } else {
            System.out.println("잘못된 성별 정보입니다.");
            return;
        }

        int age = 2026 - year;

        System.out.println("출생년도: " + year);
        System.out.println("현재 나이: " + age);
    }

    public static void main(String[] args) {
        Switch5_1 s = new Switch5_1();

        s.solution(95, 1);
        // 출생년도: 1995
        // 현재 나이: 31

        s.solution(5, 3);
        // 출생년도: 2005
        // 현재 나이: 21
    }
}
