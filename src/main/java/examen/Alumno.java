/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Map;

/**
 *
 * @author alejandro
 */
public class Alumno {
    
    private String nombre;
    private Map<String, String> calificaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, String> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Map<String, String> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return null;
    }

    void setCalificaciones(Map<String, String> createMap, RegistroJSON registro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
