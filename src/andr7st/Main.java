package andr7st;
/**
 * @author Andrés Segura.
 * 
 * Escribir un archivo de texto plano.
 */
public class Main {
    public static void main(String[] args) {

        
        //Sistema sistema = new Sistema();
        
        String contenido[] = new String[6];
        
        contenido[0] = "Name:          Andrés Segura";
        contenido[1] = "Nickname:      Andr7st";
        contenido[2] = "Job:           Soldado CST SLR-B";
        contenido[3] = "Target:        Aprender a programar";
        contenido[4] = "Initial year:  2020";
        contenido[5] = "\nArchivo de texto generado desde un programa: created by Andr7st.";
        
        //sistema.ArchivoEscribir(contenido);
        
        System.out.println("Archivo escrito: Andr7st");
        
        new andr7st.funciones.Escribir("Andr7st", contenido);
    }
}
/*
class Sistema {

    public void ArchivoEscribir(Object[] Contenido){

        File ArchivoEscribir = new File("Andr7st.txt");
        
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
}*/