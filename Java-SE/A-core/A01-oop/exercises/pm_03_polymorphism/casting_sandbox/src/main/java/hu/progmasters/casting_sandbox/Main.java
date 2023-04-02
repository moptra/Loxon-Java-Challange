package hu.progmasters.casting_sandbox;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        A c = new C();

        b.someFunctionFromA();
        ((B) b).someFunctionFromB();

        c.someFunctionFromA();
        ((C) c).someFunctionFromB();
        ((C) c).someFunctionFromC();

    }

}
