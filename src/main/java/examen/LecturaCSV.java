/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import com.sun.tools.javac.Main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author alejandro
 */
public class LecturaCSV {

    /**
     * Metodo que lee un archivo de tipo .csv y almacena en un Map el contenido
     * del archivo
     *
     * @param nombreArchivo Nombre del archivo
     * @param ruta Directorio del archivo (acabada en / para buscar dentro del
     * directorio)
     * @return Estructura Map con formato: inicial -> nombre completo
     */
    public static Map<String, String> leerArchivoCSV(String nombreArchivo, String ruta) {
        
//      VARIABLES NECESARIAS
        String idFichero = ruta + nombreArchivo.concat(".csv");
        ArrayList<String[]> totalAsignaturas = new ArrayList<>();

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {

//          VARIABLES NECESARIAS
            String linea;
            String[] tokens;

//          eliminamos la primera linea, ya que es la que nos da la info de que
//          campos tenemos que almacenar
            datosFichero.nextLine();

            while (datosFichero.hasNextLine()) {

//              Almacenamos la informacion de la linea en un string
                linea = datosFichero.nextLine();

//              dividimos la linea con le caracter que divide cada uno de los
//              diferentes campos y los metemos en un array
                tokens = linea.split(";");
                
//              almacenamos cada array de token en una lista
                totalAsignaturas.add(tokens);

            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }

        
        return totalAsignaturas.stream().collect(Collectors.toMap(token -> token[0], token -> token[1]));
    }
}
