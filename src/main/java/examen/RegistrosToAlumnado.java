/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author alejandro
 */
public class RegistrosToAlumnado {

    public static ArrayList<Alumno> registrosALista(ArrayList<RegistroJSON> registroJSON) {

        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        for (RegistroJSON registro : registroJSON) {

            Alumno newAlumno = crearAlumno(registro);

            listaAlumnos.add(newAlumno);
        }

        return listaAlumnos;
    }

    /**
     * Metodo que crea un alumno a partir de un objeto tipo RegistroJSON
     *
     * @param registro registro que queremos convertir
     * @return Objeto de tipo alumno
     */
    private static Alumno crearAlumno(RegistroJSON registro) {

        Alumno alumno = new Alumno();

        alumno.setNombre(registro.getAlumno());
        alumno.setCalificaciones(createMap(obtenerIniciales(), registro));

        return alumno;
    }

    /**
     * Metodo que , llamando al metodo de la clase LeerCSV obtiene las iniciales de cada modulo
     * 
     * @return Lista con las inicales de los modulos
     */
    private static ArrayList<String> obtenerIniciales() {

        Map<String, String> asignaturas = LecturaCSV.leerArchivoCSV("nombresModulos", "./");
        
        ArrayList<String> iniciales = new ArrayList<>();
        
        for (Map.Entry<String, String> entry : asignaturas.entrySet()) {

            iniciales.add(entry.getKey());
        }
        
        return iniciales;
    }

    /**
     * Metodo que crea una estructura Map con relaicon inicial->nota
     *
     * @param iniciales iniciales de los modulos
     * @param registro registro en cuestion
     * @return estructura Map con relaicon inicial->nota
     */
    private static Map<String, String> createMap(ArrayList<String> iniciales, RegistroJSON registro) {

        Map<String, String> calificaiocnes = new TreeMap<>();

        for (String inicial : iniciales) {

            switch (inicial) {
                case "OACV":
                    calificaiocnes.put(inicial, registro.getOACV());
                    break;
                case "EA":
                    calificaiocnes.put(inicial, registro.getEA());
                    break;
                case "TII":
                    calificaiocnes.put(inicial, registro.getTII());
                    break;
                case "TC":
                    calificaiocnes.put(inicial, registro.getTC());
                    break;
                case "ING":
                    calificaiocnes.put(inicial, registro.getING());
                    break;
                case "FOL":
                    calificaiocnes.put(inicial, registro.getFOL());
                    break;
                case "CEAC":
                    calificaiocnes.put(inicial, registro.getCEAC());
                    break;
            }
        }

        return calificaiocnes;
    }
}
