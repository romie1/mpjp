package m1.s17;

public class SwitchInt {
    public static void main(String[] args) {
        int value = 1;

        // ...

        switch (value) {
        case 1:
        case 3:
        case 5:
            System.out.println("value is odd and small");
            break;
        case 2:
        case 4:
        case 6:
            System.out.println("value is even and small");
            break;
        default:
            System.out.println("value is something else");
            break;
        }
        
		if (value == 1 || value == 3 || value == 5) {
			System.out.println("value is odd and small");
		} else if (value == 2 || value == 4 || value == 6) {
			System.out.println("value is even and small");
		} else {
			System.out.println("value is something else");
		}
        
        System.out.println("done");
    }
}
