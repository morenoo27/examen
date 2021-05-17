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
public class Alumno implements Comparable<Alumno> {
    
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
        return nombre + "\n"
                + obtenercalificaciones();
    }

    private String obtenercalificaciones() {
        
        String calificacion = null;
        
        for (Map.Entry<String, String> entry : calificaciones.entrySet()) {
            calificacion += entry.getKey() + ":" + entry.getValue();
            calificacion += " ";
        }
        return calificacion;
    }

    @Override
    public int compareTo(Alumno al) {
        return this.nombre.compareTo(al.getNombre());
    }
}
