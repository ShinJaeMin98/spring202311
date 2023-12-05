package exam;

public class C extends B {
    int numC = 30;

    public C() {
        super();    // B() 생성자라고 생각하면 됨
        System.out.println("C 생성자!!! - 사실은 자동으로 생성되어있지롱");
    }
}
