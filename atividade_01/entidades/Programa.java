package atividade_01.entidades;

public class Programa {

    public int ramAlocada;
    public int ssdOcupado;
    public int nucleos;
    public int quantOp;

    public Programa(int ramAlocada, int ssdOcupado, int nucleos, int quantOp) {
        this.ramAlocada = ramAlocada;
        this.ssdOcupado = ssdOcupado;
        this.nucleos = nucleos;
        this.quantOp = quantOp;
    }

    public int getRamAlocada() {
        return ramAlocada;
    }
    public void setRamAlocada(int ramAlocada) {
        this.ramAlocada = ramAlocada;
    }

    public int getSsdOcupado() {
        return ssdOcupado;
    }
    public void setSsdOcupado(int ssdOcupado) {
        this.ssdOcupado = ssdOcupado;
    }

    public int getNucleos() {
        return nucleos;
    }
    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getQuantOp() {
        return quantOp;
    }
    public void setQuantOp(int quantOp) {
        this.quantOp = quantOp;
    }
}
