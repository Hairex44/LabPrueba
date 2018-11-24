/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Venta;

/**
 *
 * @author Usuario
 */
public class DatosVenta {
    private int numRegs;
    private Venta vect[];

     public DatosVenta(int tamVect) {
        this.numRegs = 0;
        this.vect = new Venta[tamVect];
    }

    public int getNumRegs() {
        return numRegs;
    }

    public void setNumRegs(int numRegs) {
        this.numRegs = numRegs;
    }

    public Venta[] getVect() {
        return vect;
    }

    //metodos de clases
    public boolean insertVenta(Venta ventaObj) {
        if (this.numRegs < this.vect.length - 1) {
            this.vect[numRegs] = ventaObj;
            this.numRegs++;
            return true;
        }
        return false;
    }

    public boolean eliminarVenta(int pos, Venta ventaObj) {
        if (pos >= 0 && pos < this.numRegs) {
            this.vect[numRegs] = ventaObj;
            this.numRegs--;
            return true;
        }
        return false;
    }

    public boolean editaVenta(int pos, Venta ventaObj) {
        if (pos >= 0 && pos < this.numRegs) {
            this.vect[pos] = ventaObj;
            return true;
        }
        return false;
    }

    public Venta getRegistro(int pos) {
        return this.vect[pos];
    }

    public boolean yaExiste(int numerVent) {
        if (this.numRegs != 0) {
            for (int i = 0; i < this.numRegs; i++) {
                if (this.vect[i].getNumerVent()== numerVent) {
                    return true;
                }
            }
        }
        return false;
    }
}
