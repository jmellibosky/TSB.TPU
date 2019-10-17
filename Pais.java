package estructura;

import java.util.Hashtable;
import java.util.Map;

public class Pais {

    //<codigoDistrito, distrito>
    Map<Integer, Distrito> distritos;

    //<codigoPartido, cantidadVotos>
    Map<Integer, Integer> totales;

    public Pais() {
        distritos = new Hashtable();
        totales = new Hashtable();
    }
}
