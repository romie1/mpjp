package m1.s18;

public class Forever {
    public static void main(String[] args) {
        boolean something = false;

        for (;;) {
            System.out.println("something is " + something);

            if (something) {
                break;
            }

            something = true;
        }
    }
}
