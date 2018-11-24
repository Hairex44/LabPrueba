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
public class Cantidad {
    private Double precUnit;
    private Double Total;

    public Cantidad(Double precUnit, Double Total) {
        this.precUnit = precUnit;
        this.Total = Total;
    }
    public Cantidad() {
        this.precUnit=0.0;
        this.Total=0.0;
    }
   

    public Double getPrecUnit() {
        return precUnit;
    }

    public void setPrecUnit(Double precUnit) {
        this.precUnit = precUnit;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }
    
    
    
}
