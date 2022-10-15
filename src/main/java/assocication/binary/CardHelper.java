package assocication.binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardHelper { // utility class
    private static final List<Integer> allId;

    static {
        allId = new ArrayList<>();
    }

    private CardHelper() {}

    public static int getFreeId() {
        Random rd = new Random();
        int id = rd.nextInt(4000)+1000; // generating random id in range 1000-5000
        if (!allId.contains(id)) {
            allId.add(id);
            return id;
        } else
            return getFreeId(); // if random generated id is already in the db -> re-generate again;
    }
}
