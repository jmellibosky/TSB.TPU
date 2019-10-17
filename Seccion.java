package estructura;

import java.util.Hashtable;
import java.util.Map;

public class Seccion {
    Map<Integer, Circuito> circuitos;
    Map<Integer, Integer> totales;

    public Seccion() {
        circuitos = new Hashtable();
        totales = new Hashtable();
    }
}
