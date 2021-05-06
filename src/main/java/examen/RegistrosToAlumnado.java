/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;

/**
 *
 * @author alejandro
 */
public class RegistrosToAlumnado {
    
    public static ArrayList<Alumno> registrosALista (ArrayList<RegistroJSON> registroJSON) {
        
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        
        for (RegistroJSON registro : registroJSON) {
            
            listaAlumnos.add(registro);
        }
        
        
        return null;
    }
}
