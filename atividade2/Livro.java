public class Livro extends Material {
    private String edicao;

    public Livro(String titulo, String autor, int anoPublicacao, String edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void descricao() {
        System.out.println("Livro: " + getTitulo() + " | Autor: " + getAutor() + 
                           " | Ano: " + getAnoPublicacao() + " | Edição: " + edicao);
    }
}
