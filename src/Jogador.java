public class Jogador {
    private String nome;
    private int idade;
    private int pontuacao = 0;
    private int numeroTentativas = 0;

    public Jogador(String nome,
        int idade,
        int pontuacao,
        int numeroTentativas){
        this.nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacao;
        this.numeroTentativas = numeroTentativas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNumeroTentativas() {
        return numeroTentativas;
    }

    public void setNumeroTentativas(int numeroTentivas) {
        this.numeroTentativas = numeroTentivas;
    }

    public void adicionaPontos(int pontosGanhos){
        this.pontuacao += pontosGanhos;
    }

    public void perdePontos(int pontosPerdidos){
        this.pontuacao -= pontosPerdidos;
    }

    public void adicionaTentativa(){
        this.numeroTentativas++;
    }

}
