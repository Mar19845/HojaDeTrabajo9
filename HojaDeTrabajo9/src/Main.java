
/**
 * Universidad del Valle de Guatemala Algortimos y estructura de datos Seccion
 * 20
 *
 * @author Laura Tamath 19365
 * @author Juan Marroquin
 * @since 20/04/2020
 * @version 24/04/2020
 *
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        /**
         * creacion de variables que serviran para manejar los archivos de
         * textos e interactuar con el usuario
         */
        InterfaceHDT9<String, String> traduc = null;
        Factory<String, String> factory = new Factory<>();
        int contWhile = 1;
        boolean cont = false;
        while (cont != true) {
            //Solicitar al usuario la implementacion hasta que la seleccione correctamente
            String implementacion = JOptionPane.showInputDialog(null, "Bienvenidos al Traductor\nImplementar HASHING ingrese 1 \nImplementar SPLAY TREE ingrese 2");
            System.out.println(implementacion);
            switch (implementacion) {
                case "1":
                    traduc = factory.getFactory(implementacion);
                    contWhile = 0;
                    cont = true;
                    break;
                case "2":
                    traduc = factory.getFactory(implementacion);
                    contWhile = 0;
                    cont = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                    break;
            }
        }
        /**
         * Manejar visualizador de archivos
         */
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File(System.getProperty("user.dir")));

        /**
         * solicirtar archivo con traducciones
         */
        JOptionPane.showMessageDialog(null, "Ingerse diccionario ");
        jfc.showOpenDialog(null);
        File Diccionario = jfc.getSelectedFile();

        /**
         * Solicitar archivo para traducir
         */
        JOptionPane.showMessageDialog(null, "Ingerse un archivo para traduccir ");
        jfc.showOpenDialog(null);
        File traducciones = jfc.getSelectedFile();

        /**
         * llamar al traductor, que se encarga de leer y traducir los archivos
         */
        Traductor translator = new Traductor(Diccionario, traducciones, traduc);
        String oracion = translator.getOracion();
        String diccio = translator.getDiccionario();
        //translator.agregarDiccionario(diccio);
        String traduccion = translator.Traducir(oracion);
        //JOptionPane.showMessageDialog(null, oracion+"\nSe traduce como: \n"+traduccion);
    }  
}