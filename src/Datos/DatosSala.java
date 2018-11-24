/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Sala;

/**
 *
 * @author Usuario
 */
public class DatosSala {

    private int numRegs;
    private Sala vect[];

    public DatosSala(int tamVect) {
        this.numRegs = 0;
        this.vect = new Sala[tamVect];
    }

    public int getNumRegs() {
        return numRegs;
    }

    public void setNumRegs(int numRegs) {
        this.numRegs = numRegs;
    }

    public Sala[] getVect() {
        return vect;
    }

    //metodos de clases
    public boolean insertSala(Sala salaobj) {
        if (this.numRegs < this.vect.length - 1) {
            this.vect[numRegs] = salaobj;
            this.numRegs++;
            return true;
        }
        return false;
    }

    public boolean eliminarSala(int pos,Sala salaObj) {
        if (pos >= 0 && pos < this.numRegs) {
            this.vect[numRegs] = salaObj;
            this.numRegs--;
            return true;
        }
        return false;
    }

    public boolean editaSala(int pos, Sala salaObj) {
        if (pos >= 0 && pos < this.numRegs) {
            this.vect[pos] = salaObj;
            return true;
        }
        return false;
    }

    public Sala getRegistro(int pos) {
        return this.vect[pos];
    }

    public boolean yaExiste(int idSala) {
        if (this.numRegs != 0) {
            for (int i = 0; i < this.numRegs; i++) {
                if (this.vect[i].getIdSala() == idSala) {
                    return true;
                }
            }
        }

        return false;
    }

}
