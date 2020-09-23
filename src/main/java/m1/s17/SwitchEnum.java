package m1.s17;

public class SwitchEnum {
    public static void main(String[] args) {
        WeekendDay day = WeekendDay.SATURDAY;

        // ...

        switch (day) {
        case MONDAY:
        	System.out.println("Oh no! It's monday!");
        	break;
        case SATURDAY:
            System.out.println("No alarm clock today");
            break;
        case SUNDAY:
            System.out.println("Ready for a new week?");
            break;
        }
      
    }
}