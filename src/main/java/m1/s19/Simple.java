package m1.s19;

public class Simple {
    static String h() {
        return "Hi";
    }

    int f(int a, int b) {
        return a * b;
    }

    void g(boolean flag) {
        if (flag) {
            System.out.println("Hello");
            return;
        }

        System.out.println("Goodbye");
    }
}