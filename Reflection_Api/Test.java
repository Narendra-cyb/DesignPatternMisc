package Reflection_Api;

public class Test {

    int a =5,b=5;

    public Test() {
        System.out.println("0 param constructor");
    }



    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Test [a=" + a + ", b=" + b + "]";
    }

    
    
    
}
