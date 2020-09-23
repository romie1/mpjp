package m4.s07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AsList {
    private static final Logger LOG = Logger.getGlobal();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(12, 18, -5, -2233));
        System.out.println(list);

        System.out.println("At index 2: " + list.get(2));

        int value = -997;
        int pos = 2;
        list.add(pos, value);
        System.out.println(String.format("Inserting at position %d element %d: %s", pos, value, list));
        System.out.println(String.format("Index of %d: %d", value, list.indexOf(-997)));

        try {
            int badPos = 100;
            list.add(badPos, value);
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, "Careful with indices!", ex);
        }

        pos = 3;
        value = list.remove(pos);
        System.out.println(String.format("Removing at position %d element %d: %s", pos, value, list));

        value = 42;
        int old = list.set(pos, value);
        System.out.println(String.format("Set at position %d element %d, was %d: %s", pos, value, old, list));
    }
}
