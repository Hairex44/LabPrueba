/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Cantidad;

/**
 *
 * @author Usuario
 */
public class DatosCantidad {
    private int numRegs;
    private Cantidad vect[];

    public DatosCantidad(int tamVect) {
        this.numRegs = 0;
        this.vect = new Cantidad[tamVect];
    }

    public int getNumRegs() {
        return numRegs;
    }

    public void setNumRegs(int numRegs) {
        this.numRegs = numRegs;
    }

    public Cantidad[] getVect() {
        return vect;
    }

    //metodos de clases
    public boolean insertCant(Cantidad cantobj) {
        if (this.numRegs < this.vect.length - 1) {
            this.vect[numRegs] = cantobj;
            this.numRegs++;
            return true;
        }
        return false;
    }

    public boolean eliminarCant(int pos,Cantidad cantObj) {
        if (pos >= 0 && pos < this.numRegs) {
            this.vect[numRegs] = cantObj;
            this.numRegs--;
            return true;
        }
        return false;
    }

    public boolean editaCant(int pos,Cantidad cantObj) {
        if (pos >= 0 && pos < this.numRegs) {
            this.vect[pos] = cantObj;
            return true;
        }
        return false;
    }

    public Cantidad getRegistro(int pos) {
        return this.vect[pos];
    }
}
