/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author alejandro
 */
public class AlumnadoToTSV {

    public static void escribirTSV(Alumno alumno, Map<String, String> asignaturas) {

        String idFichero = "./alumnado/" + alumno.getNombre().concat(".tsv").replace(" ", "");

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            flujo.write(alumno.getNombre());
            flujo.newLine();

            for (Map.Entry<String, String> entry : alumno.getCalificaciones().entrySet()) {

                String nombreAsignatura, inicial;

                inicial = entry.getKey();

                nombreAsignatura = buscarNombre(asignaturas, inicial);
                
                flujo.write(nombreAsignatura + "\t" + entry.getValue());

            }

            System.out.println("Fichero " + alumno.getNombre().concat(".tsv").replace(" ", "") + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Busca el nombre completo de la asignatura a traves de sus iniciales
     *
     * @param asignaturas map con las asignaturas
     * @param inicial inicial de la asignatura que queremos encontrar
     * @return nombre de la asignatura
     */
    private static String buscarNombre(Map<String, String> asignaturas, String inicial) {

        for (Map.Entry<String, String> entry : asignaturas.entrySet()) {

            if (inicial.equalsIgnoreCase(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

}
