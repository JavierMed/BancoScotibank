package com.projectsoftsolution.bancoscotibank;

public class Entidad {
    private String nameTarjeta;
    private Number numTarjeta;
    private Number lineCredit;

    public Entidad(String nameTarjeta,Number numTarjeta,Number lineCredit){
        this.nameTarjeta=nameTarjeta;
        this.numTarjeta=numTarjeta;
        this.lineCredit=lineCredit;
    }

    public Number getLineCredit() {
        return lineCredit;
    }

    public Number getNumTarjeta() {
        return numTarjeta;
    }

    public String getNameTarjeta() {
        return nameTarjeta;
    }
}
