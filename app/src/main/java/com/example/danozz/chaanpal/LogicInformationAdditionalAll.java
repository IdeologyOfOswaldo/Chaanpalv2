package com.example.danozz.chaanpal;

/**
 * Created by dan on 5/10/16.
 */
public class LogicInformationAdditionalAll {
    private double peso;
    private double estatura;
    private String sintomas="";
    private boolean tiposanguineocontario;
    private String sintomasInfeccionUrinaria="";

    public void LogicInformationAdditionalAll()
    {

    }
    public String descIMC() {
        double r=getPeso() / (Math.pow(getEstatura(), 2));
        String cad ="";
        if (r < 16) {
            cad += "Delgadez severa";
        } else if (r == 16 || r <= 16.99) {
            cad += "Delgadez moderada";
        } else if (r == 17 || r <= 18.49) {
            cad += "Delgadez aceptable";
        } else if (r == 18.5 || r <= 24.99) {
            cad += "Normal";
        } else if (r == 25 || r <= 29.99) {
            cad += "Preobeso";
        } else if (r == 30 || r <= 34.99) {
            cad += "Obeso tipo I";
        } else if (r == 35 || r <= 39.99) {
            cad +=  "Obeso tipo II";
        } else if (r >= 40) {
            cad += "Obeso tipo III";
        }
        return cad;
    }
    public double imc()
    {
        double r=getPeso() / (Math.pow(getEstatura(), 2));
        double s = 0;
        if (r < 16) {
            s=r;
        } else if (r == 16 || r <= 16.99) {
            s=r;
        } else if (r == 17 || r <= 18.49) {
            s=r;
        } else if (r == 18.5 || r <= 24.99) {
            s=r;
        } else if (r == 25 || r <= 29.99) {
            s=r;
        } else if (r == 30 || r <= 34.99) {
            s=r;
        } else if (r == 35 || r <= 39.99) {
            s=r;
        } else if (r >= 40) {
            s=r;
        }
        return s;
    }

    public boolean isTiposanguineocontario() {
        return tiposanguineocontario;
    }

    public void setTiposanguineocontario(boolean tiposanguineocontario) {
        this.tiposanguineocontario = tiposanguineocontario;
    }

    public String getSintomasInfeccionUrinaria() {
        return sintomasInfeccionUrinaria;
    }

    public void setSintomasInfeccionUrinaria(String sintomasInfeccionUrinaria) {
        this.sintomasInfeccionUrinaria += sintomasInfeccionUrinaria+"\n";
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas += sintomas+"\n";
    }
}
