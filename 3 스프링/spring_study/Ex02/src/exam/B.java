package exam;

public class B extends A{
    int numB = 20;

    public B() {
        super();    // A() 생성자라고 생각하면 됨
        System.out.println("B 생성자 - 사실은 나도 기본적으로 생성되어있지롱");
    }
}
