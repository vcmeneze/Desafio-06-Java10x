package desafio06;

public class Ninja {

    private String nome;
    private int idade;
    private String vila;

    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getVila() {
        return vila;
    }
    public void setVila(String vila) {
        this.vila = vila;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // constructors
    public Ninja() {
    }
    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + " anos, Vila: " + vila;
    }


}

