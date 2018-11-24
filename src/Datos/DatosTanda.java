/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Tanda;

/**
 *
 * @author Usuario
 */
public class DatosTanda {

    private int numRegs;
    private Tanda vect[];

    public DatosTanda(int tamVect) {
        this.numRegs = 0;
        this.vect = new Tanda[tamVect];
    }

    public int getNumRegs() {
        return numRegs;
    }

    public void setNumRegs(int numRegs) {
        this.numRegs = numRegs;
    }

    public Tanda[] getVect() {
        return vect;
    }

    //metodos de clases
    public boolean insertTanda(Tanda tandaObj) {
        if (this.numRegs < this.vect.length - 1) {
            this.vect[numRegs] = tandaObj;
            this.numRegs++;
            return true;
        }
        return false;
    }

    public boolean eliminarTanda(int pos, Tanda tandaObj) {
        if (pos >= 0 && pos < this.numRegs) {
            this.vect[numRegs] = tandaObj;
            this.numRegs--;
            return true;
        }
        return false;
    }

    public boolean editaTanda(int pos, Tanda tandaObj) {
        if (pos >= 0 && pos < this.numRegs) {
            this.vect[pos] = tandaObj;
            return true;
        }
        return false;
    }

    public Tanda getRegistro(int pos) {
        return this.vect[pos];
    }

    public boolean yaExiste(int idTanda) {
        if (this.numRegs != 0) {
            for (int i = 0; i < this.numRegs; i++) {
                if (this.vect[i].getIdTanda() == idTanda) {
                    return true;
                }
            }
        }

        return false;
    }

}
