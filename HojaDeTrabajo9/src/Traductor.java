
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
    private String word = "null";
    private String oracion;
    Association<String, String> asociacion;
    private InterfaceHDT9<String, String> map;

    public Traductor(File dicc, File Orar, InterfaceHDT9<String, String> mapeo) {
        diccionario = LeerArchivos(dicc);
        oracion = LeerArchivos(Orar);
        map = mapeo;
    }

    public String LeerArchivos(File archivo) {
        BufferedReader reader = null;
        String cad = "";
        try {
            String line;
            File file = archivo;
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                cad += line + "\n";
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

        return cad.substring(0, cad.length() - 1).replace(".", "");
    }

    public String getOracion() {
        return this.oracion;
    }

    public String Traducir(String oracion) {
        String[] palabras = oracion.split(" ");
        String traduccion = "";
        for (int i = 0; i < palabras.length; i++) {
            asociacion = new Association<String,String>(palabras[i], word);
            if (map.searchValue(asociacion.getKey())) {
                traduccion += this.map.get(asociacion.getKey()) + " ";
            } else {
                traduccion += "*" + palabras[i] + "* ";
            }
        }
        return traduccion;
    }

    public void agregarDiccionario(String diccionario) {
        String[] asociaciones = diccionario.split("\n");
        for (int i = 0; i < asociaciones.length; i++) {
            String[] traduccion = asociaciones[i].split("\t");
            try {
                Association<String, String> as = new Association<String, String>(traduccion[0], traduccion[1].split(", ")[0]);
                this.map.put(as);
                System.out.println("Diccionario agregado");
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
        
    }

    public String getDiccionario() {
        return this.diccionario;
    }
    
}
