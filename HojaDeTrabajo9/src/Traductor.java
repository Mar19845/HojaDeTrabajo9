
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 * @author Laura Tamath 19365
 * @author Juan Marroquin
 */
public class Traductor {
    private String diccionario;
    private String oracion;
    private InterfaceHDT9<String,String> mapeo;

    public Traductor(File diccionario, File oracion,InterfaceHDT9<String,String>mapeo) {
        this.diccionario = LeerArchivos(diccionario);
        this.oracion = LeerArchivos(oracion);
        this.mapeo = mapeo;
    }
    public String LeerArchivos(File archivo){
        BufferedReader reader = null;
        String cad = "";
        try {
            String line;
            File file = archivo;
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                cad += line+"\n";
            }
        
        } catch (IOException e) {
            System.out.println("Ingrese la direccion a un archivo valido");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        return cad.substring(0, cad.length()-1).replace(".", "");
    }
    public String getOracion(){
        return this.oracion;
    }
}
