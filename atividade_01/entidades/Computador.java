package atividade_01.entidades;

public class Computador {

    private int ram;
    private int ssd;
    private int nucleos;
    private double opPorSec;

    public Computador(int ram, int ssd, int nucleos, double opPorSec){
        this.ram = ram;
        this.ssd = ssd;
        this.nucleos = nucleos;
        this.opPorSec = opPorSec;
    }

    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }
    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getNucleos() {
        return nucleos;
    }
    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getOpPorSec() {
        return opPorSec;
    }
    public void setOpPorSec(double opPorSec) {
        this.opPorSec = opPorSec;
    }
}
