/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Venta {
    private int NumerVent;
    private int NumProg;
    private Date Hora;
    private Date Fecha;   

    public Venta(int NumerVent, int NumProg, Date Hora, Date Fecha) {
        this.NumerVent = NumerVent;
        this.NumProg = NumProg;
        this.Hora = Hora;
        this.Fecha = Hora;
    }
    public Venta() {
        this.NumerVent = 0;
        this.NumProg = 0;
        this.Hora = null;
        this.Fecha =null;
    }

    public int getNumerVent() {
        return NumerVent;
    }

    public void setNumerVent(int NumerVent) {
        this.NumerVent = NumerVent;
    }

    public int getNumProg() {
        return NumProg;
    }

    public void setNumProg(int NumProg) {
        this.NumProg = NumProg;
    }

    public Date getHora() {
        return Hora;
    }

    public void setHora(Date Hora) {
        this.Hora = Hora;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
            
}
