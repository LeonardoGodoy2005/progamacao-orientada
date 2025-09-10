public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        // Verifica espaço em disco
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro na instalação do programa: SSD insuficiente.");
            return false;
        }

        // Verifica memória RAM
        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Erro na execução do programa: Memória RAM insuficiente.");
            return false;
        }

        // Execução com sucesso
        System.out.println("Programa executado com sucesso!");
        double tempoExecucao = (double) p.getQuantidadeOperacoes() /
                (computador.getOperacoesPorSegundo() * computador.getNucleos());
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos.");
        return true;
    }
}