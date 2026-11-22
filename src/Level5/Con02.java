package Level5;

// 매개변수가 없는 생성자
// 引数のないコンストラクタ
class Cat {
    String name;
    int age;
    public Cat() {
        name = "초코";
        age = 1;
        System.out.println("Dog 생성자 실행");
    }
}
public class Con02 {
    public static void main(String[] args) {
        Cat d = new Cat();
        System.out.println(d.name + ", " + d.age);
    }
}
