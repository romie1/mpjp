package m1.s09;

public class MoreStrings {
    public static void main(String[] args) {
        char c = 'x';
        System.out.println(c);
        
        String s = new String("hello");
        System.out.println(s);

        String t = "hello";
        System.out.println(t);
        
       System.out.println(" " + t.repeat(3));

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
    }
}
