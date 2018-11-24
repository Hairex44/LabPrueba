/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Pelicula;

/**
 *
 * @author Usuario
 */
public class DatosPelicula {

    private int numRegs;
    private Pelicula vect[];

    public DatosPelicula(int numRegs, Pelicula[] vect) {
        this.numRegs = numRegs;
        this.vect = vect;
    }

    public DatosPelicula(int tamVect) {
        this.numRegs = 0;
        this.vect = new Pelicula[tamVect];
    }

    public int getNumRegs() {
        return numRegs;
    }

    private void setNumRegs(int numRegs) {
        this.numRegs = numRegs;
    }

    public Pelicula[] getVect() {
        return vect;
    }

    //metodos de clases
    public boolean insertPelicula(Pelicula peliobj) {
        if (this.numRegs < this.vect.length - 1) {
            this.vect[numRegs] = peliobj;
            this.numRegs++;
            return true;
        }
        return false;
    }
     public boolean eliminarPelicula (int pos, Pelicula peliObj){
        if (pos>=0 && pos < this.numRegs){
            this.vect[numRegs] = peliObj;
            this.numRegs--;
            return true;
        }
        return false;
    }
    public boolean editaPelicula (int pos, Pelicula peliObj){
        if (pos>=0 && pos < this.numRegs){
            this.vect[pos]=peliObj;
            return true;
        }
        return false;
    }

    public Pelicula getRegistro(int pos) {
        return this.vect[pos];
    }

    public boolean yaExiste(int id) {
        if (this.numRegs != 0) {
            for (int i = 0; i < this.numRegs; i++) {
                if (this.vect[i].getId() == id) {
                    return true;
                }
            }
        }

        return false;
    }

}
