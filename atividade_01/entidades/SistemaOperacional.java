package atividade_01.entidades;

public class SistemaOperacional {

    private Computador computador;

    public SistemaOperacional(Computador computador){
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        if (p.getSsdOcupado() > computador.getSsd()) {
            System.out.println("Erro: Espaco insuficiente no armazenamento para instalar o protgrama");
            return false;
        }
        if (p.getRamAlocada() > computador.getRam()) {
            System.out.println("Erro: Memoria RAM insuficiente para execucao");
            return false;
        }

        double tempoDeExec = (double) p.getQuantOp() / (computador.getOpPorSec() * computador.getNucleos());

        System.out.println("Atividade_01.Programa executado com sucesso");
        System.out.printf("Tempo de exxecucao = %.2f segundos%n", tempoDeExec);

        return true;
    }
}
