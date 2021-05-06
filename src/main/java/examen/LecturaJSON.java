/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandro
 */
public class LecturaJSON {
    
    public static ArrayList<RegistroJSON> leerFicheroJSONconLista (String nombreArchivo,String ruta) {

        String idFichero = ruta + nombreArchivo.concat(".csv");
        
        ObjectMapper mapeador = new ObjectMapper();

        try {
            return mapeador.readValue(new File(idFichero),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, RegistroJSON.class));
        } catch (IOException ex) {
            Logger.getLogger(LecturaJSON.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
