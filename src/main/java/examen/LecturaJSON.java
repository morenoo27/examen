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

/**
 *
 * @author alejandro
 */
public class LecturaJSON {
    
    public static ArrayList<RegistroJSON> leerFicheroJSONconLista (String nombreArchivo,String ruta) {

        String idFichero = ruta + nombreArchivo.concat(".json");
        
        ObjectMapper mapeador = new ObjectMapper();

        try {
            return mapeador.readValue(new File(idFichero),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, RegistroJSON.class));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
}
