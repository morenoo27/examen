/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author aleja
 */
public class Estadística {

    private ArrayList<Integer> calificaciones;

//  COINSTRUCTOR
    public Estadística(String iniciales, ArrayList<RegistroJSON> registros) {

        this.calificaciones = filtradoCalificaciones(iniciales, registros);
    }

//  GETTERS AND SETTERS
    public ArrayList<Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

//  TO STRING
    @Override
    public String toString() {
        return mostrarNotas();
    }

//  METODOS NECESARIOS
    /**
     * Metodo que hace una muestra de todas las notas de una asginatura.Se
     * muestran por pantalla
     *
     * @return Todas las nostas del curso
     */
    public String mostrarNotas() {

        String textoAMostrar = "Nostas:" + "\n";

        textoAMostrar = calificaciones.stream()
                .map(nota -> String.valueOf(nota) + "\n")
                .reduce(textoAMostrar, String::concat);

        return textoAMostrar;
    }

    /**
     * Metodo que realiza una seleccion de las notas de un modulo en una lista
     * de registros<pre>
     *El procedimiento es el siguiente:
     *    -Almacenamos el registro en  una lista de objetos Alumno
     *    -De cada objeto Alumno nos quedamos con la estructura map con sus
     *calificaciones
     *    -Nos centramos en aquellas que sean las iniciales del modulo en concreto
     *    -De ese nuevo map, amacenamos los values en la lista que querremos
     *devolver
     * </pre>
     *
     * @param iniciales iniciales del modulo que queremos
     * @param registros lista con lso registros
     * @return lista con las notas de ese modulo
     */
    private List<String> calificacionesModulo(String iniciales, ArrayList<RegistroJSON> registros) {

        List<String> notas = null;

        Map<String, String> calificacionesModulo = (Map<String, String>) RegistrosToAlumnado.registrosALista(registros).stream()
                .map(alumno -> alumno.getCalificaciones())
                .filter(calif -> calif.containsKey(iniciales));

        calificacionesModulo.entrySet().forEach(entry -> {
            notas.add(entry.getValue());
        });

        return notas;
    }

    /**
     * Mettodo que obtiene l;a representacion numerica a partir de una cadena de
     * texto, si la cadena es un texto devolvera -1
     *
     * @param resultado Cadena que queremos convertir
     * @return representacion numerica especifica || -1 si es un texto
     */
    private int obtenerResultado(String resultado) {

        if (resultado.equalsIgnoreCase("apro") || resultado.equalsIgnoreCase("ne")) {
            return -1;
        }

        return Integer.parseInt(resultado);
    }

    /**
     * Metodo para construir una lista de objetos integer teneindo en cuenta
     * solo las notas mayores o iguales a 0
     *
     * @param iniciales iniciales del modulo que queremos
     * @param registros lista con lso registros
     * @return ArrayList ocn las notas iguales o superiores a 0
     */
    private ArrayList<Integer> filtradoCalificaciones(String iniciales, ArrayList<RegistroJSON> registros) {

        ArrayList<Integer> totalCalificaiones = new ArrayList<>();

        List<String> califSupA0 = calificacionesModulo(iniciales, registros);

        califSupA0.forEach(nota -> {
            totalCalificaiones.add(obtenerResultado(nota));
        });

        return (ArrayList<Integer>) totalCalificaiones.stream()
                .filter(calificacion -> calificacion >= 0);
    }

}
