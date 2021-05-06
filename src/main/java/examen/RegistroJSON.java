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
    public String alumno;
    @JsonProperty("OACV") 
    public String oacv;
    @JsonProperty("EA") 
    public String ea;
    @JsonProperty("TII") 
    public String tii;
    @JsonProperty("TC") 
    public String tc;
    @JsonProperty("ING") 
    public String ing;
    @JsonProperty("FOL") 
    public String fol;
    @JsonProperty("CEAC") 
    public String ceac;


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
