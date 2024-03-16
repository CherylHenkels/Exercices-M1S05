public class Jogador {
    String nome;
    int idade;
    int pontuacao = 0;
    int numeroTentivas = 0;


    public void adicionaPontos(int pontosGanhos){
        this.pontuacao += pontosGanhos;
    }

    public void perdePontos(int pontosPerdidos){
        this.pontuacao -= pontosPerdidos;
    }

    public void adicionaTentativa(){
        this.numeroTentivas++;
    }

}
