/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Sala {
    private int idSala;
    private int CantButacas;

    public Sala(int idSala, int CantButacas) {
        this.idSala = idSala;
        this.CantButacas = CantButacas;
    }

    public Sala() {
        this.idSala = 0;
        this.CantButacas = 0;
    }
    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getCantButacas() {
        return CantButacas;
    }

    public void setCantButacas(int CantButacas) {
        this.CantButacas = CantButacas;
    }
    
    
    
}
