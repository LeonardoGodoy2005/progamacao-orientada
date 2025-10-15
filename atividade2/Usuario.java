public class Usuario extends Pessoa {
    private int matricula;

    public Usuario(String nome, String email, int matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Usuário: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + matricula);
    }
}
