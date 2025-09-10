public class Main {
    public static void main(String[] args) {
        // Criando um computador
        Computador pc = new Computador(16, 500, 4, 2.5f);

        // Criando sistema operacional
        SistemaOperacional so = new SistemaOperacional(pc);

        // Programas de teste
        Programa prog1 = new Programa(8, 100, 2, 10000);    // Deve rodar com sucesso
        Programa prog2 = new Programa(4, 600, 1, 5000);     // Erro de SSD
        Programa prog3 = new Programa(32, 200, 2, 20000);   // Erro de RAM

        // Testando execuções
        System.out.println("\n--- Teste Programa 1 ---");
        so.executarPrograma(prog1);

        System.out.println("\n--- Teste Programa 2 ---");
        so.executarPrograma(prog2);

        System.out.println("\n--- Teste Programa 3 ---");
        so.executarPrograma(prog3);
    }
}