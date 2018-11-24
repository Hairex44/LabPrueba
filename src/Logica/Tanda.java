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
public class Tanda {
    private int IdTanda;
    private Date Hora;

    public Tanda(int IdTanda, Date Hora) {
        this.IdTanda = IdTanda;
        this.Hora = Hora;
    }
    public Tanda() {
        this.IdTanda = 0;
        this.Hora = null;
    } 

    public int getIdTanda() {
        return IdTanda;
    }

    public void setIdTanda(int IdTanda) {
        this.IdTanda = IdTanda;
    }

    public Date getHora() {
        return Hora;
    }

    public void setHora(Date Hora) {
        this.Hora = Hora;
    }
    
    
}
