package andr7st.funciones;
/**
 * @author Andrés Segura.
 */

import java.io.File;
import java.io.PrintWriter;

public class Escribir {
    
    public Escribir(String nombre, Object[] Contenido) {

        File ArchivoEscribir = new File(nombre);
            
        try {
    
            PrintWriter EscribirLinea = new PrintWriter(ArchivoEscribir);
    
            for(int i=0; i<Contenido.length; i++) {
    
                EscribirLinea.println(Contenido[i]);
    
            }
    
            EscribirLinea.close();
    
        } catch (Exception err) {
    
            System.out.println(err.getMessage());
        }
    }

}
