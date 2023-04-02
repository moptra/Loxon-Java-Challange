package hu.progmasters.c_callstack;

public class StackOverflow {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        solve3();
    }

    private static void solve3() {
        solve4();
    }

    private static void solve4() {
        solve();
    }
}
