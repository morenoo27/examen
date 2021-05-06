/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author alejandro
 */
public class RegistroJSON {

    private String alumno;
    private String OACV;
    private String EA;
    private String TII;
    private String TC;
    private String ING;
    private String FOL;
    private String CEAC;
                                    

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getOACV() {
        return OACV;
    }

    public void setOACV(String OACV) {
        this.OACV = OACV;
    }

    public String getEA() {
        return EA;
    }

    public void setEA(String EA) {
        this.EA = EA;
    }

    public String getTII() {
        return TII;
    }

    public void setTII(String TII) {
        this.TII = TII;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getING() {
        return ING;
    }

    public void setING(String ING) {
        this.ING = ING;
    }

    public String getFOL() {
        return FOL;
    }

    public void setFOL(String FOL) {
        this.FOL = FOL;
    }

    public String getCEAC() {
        return CEAC;
    }

    public void setCEAC(String CEAC) {
        this.CEAC = CEAC;
    }

    @Override
    public String toString() {
        return alumno + ";" + OACV + ";" + EA + ";" + TII + ";" + TC + ";" + ING + ";" + FOL + ";" + CEAC;
    }
}
