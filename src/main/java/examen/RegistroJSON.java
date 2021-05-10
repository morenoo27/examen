/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author alejandro
 */
public class RegistroJSON {

    
    @JsonProperty("Alumno/a") 
    private String alumno;
    @JsonProperty("OACV") 
    private String oacv;
    @JsonProperty("EA") 
    private String ea;
    @JsonProperty("TII") 
    private String tii;
    @JsonProperty("TC") 
    private String tc;
    @JsonProperty("ING") 
    private String ing;
    @JsonProperty("FOL") 
    private String fol;
    @JsonProperty("CEAC") 
    private String ceac;

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getOacv() {
        return oacv;
    }

    public void setOacv(String oacv) {
        this.oacv = oacv;
    }

    public String getEa() {
        return ea;
    }

    public void setEa(String ea) {
        this.ea = ea;
    }

    public String getTii() {
        return tii;
    }

    public void setTii(String tii) {
        this.tii = tii;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getIng() {
        return ing;
    }

    public void setIng(String ing) {
        this.ing = ing;
    }

    public String getFol() {
        return fol;
    }

    public void setFol(String fol) {
        this.fol = fol;
    }

    public String getCeac() {
        return ceac;
    }

    public void setCeac(String ceac) {
        this.ceac = ceac;
    }
    
    @Override
    public String toString() {
        return alumno + ";" + oacv + ";" + ea + ";" + tii + ";" + tc + ";" + ing + ";" + fol + ";" + ceac;
    }
}
