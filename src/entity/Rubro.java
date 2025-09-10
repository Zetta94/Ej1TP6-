
package entity;

import java.util.ArrayList;
/**
 *
 * @author Manuel Zuniga
 */
public class Rubro {

    private static final ArrayList<String> rubros = new ArrayList<>();

    static {
        rubros.add(null);
        rubros.add("COMESTIBLE");
        rubros.add("LIMPIEZA");
        rubros.add("PERFUMERIA");
        rubros.add("FARMACIA");
        rubros.add("ROPA");
        
    }

    public static ArrayList<String> getRubros() {
        return rubros;
    }

    public static void agregarRubro(String nuevo) {
        if (nuevo != null && !nuevo.trim().isEmpty()) {
            String sinErrores = nuevo.trim().toUpperCase();
            if (!rubros.contains(sinErrores)) {
                rubros.add(sinErrores);
            }
        }
    }

    public static boolean isValid(String rubro) {
        return rubros.contains(rubro.trim().toUpperCase());
    }
}
