/*
 * here we will make sure that no other class than 'B' and 'C' can inherit class 'A'.
 * we will use concept of seal class where we will seal class 'A'.
 */

sealed class A permits B,C{
    public void getA(){ 
        System.out.println("Class A");
    }
}

non-sealed class B extends A{
    public void getB(){
        System.out.println("Class B");
    }
}
final class C extends A{
    public void getC(){
        System.out.println("Class C");
    }
}
class D extends B{
    public void getD(){
        System.out.println("Class D");
    }
}

public class sealClassDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.getA();
        System.out.println();

        b.getA();
        b.getB();
        System.out.println();
        c.getA();
        c.getC();
        System.out.println();
        d.getA();
        d.getB();
        d.getD();

    }
}