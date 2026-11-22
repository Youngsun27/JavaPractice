package Level5;

// 매개변수가 있는 생성자
// 引数のあるコンストラクタ
class Dog {
    String name;
    int age;
    // 引数
    public Dog(String n, int a) {
        name = n;
        age = a;
    }
}
public class Con03 {
    public static void main(String[] args) {
        // 引数
        Dog d1 = new Dog("초코", 3);
        Dog d2 = new Dog("보리", 5);
        System.out.println(d1.name + ", " + d1.age);
        System.out.println(d2.name + ", " + d2.age);
    }
}