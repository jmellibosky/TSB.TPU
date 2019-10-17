package estructura;

import java.util.Hashtable;
import java.util.Map;

public class Circuito {
    Map<Integer, Mesa> mesas;
    Map<Integer, Integer> totales;

    public Circuito() {
        mesas = new Hashtable();
        totales = new Hashtable();
    }
}
