/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author alejandro
 */
public class Programa {

    public static void main(String[] args) {

//      EJERCICIO 1
//      ALMACENAMOS EL ARCHIVO EN UN MAP
        Map<String, String> asignaturas = LecturaCSV.leerArchivoCSV("nombresModulos", "./");
//      MOSTRAMOS POR PANTALLA LOS VALORES DE LA ESTRUCTURA MAP
        mostrarMapeado(asignaturas);

//      EJERCICIO 2
        ArrayList<RegistroJSON> listaAlumnos = LecturaJSON.leerFicheroJSONconLista("calificacionesGrupo", "./");
        mostrarArrayList(listaAlumnos);
        
        ArrayList<Alumno> alumnos = RegistrosToAlumnado.registrosALista(listaAlumnos);
        
        alumnos.forEach(alumno -> {
            System.out.println(alumno.toString());
        });

    }

    /**
     * Metodo que muestra, a traves de un forEach, la relacion key-value de una
     * estructura Map
     *
     * @param asignaturas Estructura Map que queremos mostrar
     */
    private static void mostrarMapeado(Map<String, String> asignaturas) {

        asignaturas.entrySet().forEach((var folder) -> {

            System.out.println(folder.getKey() + "-->" + folder.getValue());
        });
    }

    /**
     * Metdo que realiza una muestra por pantalla de todos los registros de un
     * archivo .json
     *
     * @param listaAlumnos Lista que queremos ver
     */
    private static void mostrarArrayList(ArrayList<RegistroJSON> listaAlumnos) {

        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno.toString());
        });
    }
}
