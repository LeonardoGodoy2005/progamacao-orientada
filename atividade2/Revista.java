public class Revista extends Material {
    private String edicao;

    public Revista(String titulo, String autor, int anoPublicacao, String edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void descricao() {
        System.out.println("Revista: " + getTitulo() + " | Autor: " + getAutor() +
                           " | Ano: " + getAnoPublicacao() + " | Edição: " + edicao);
    }
}
