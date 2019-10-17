package estructura;

import java.util.Hashtable;
import java.util.Map;

public class Distrito {
    Map<Integer, Seccion> secciones;
    Map<Integer, Integer> totales;

    public Distrito() {
        secciones = new Hashtable();
        totales = new Hashtable();
    }
}
