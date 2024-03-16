public class Main {
    public static void main(String[] args) {

        Jogador jogador = new Jogador();

        // Novo jogador
        jogador.nome = "Bob";
        jogador.idade = 20;

        // Tentativa 1
        jogador.adicionaTentativa();
        jogador.adicionaPontos(3);

        // Tentativa 2
        jogador.adicionaTentativa();
        jogador.perdePontos(1);

        // Resultado
        System.out.println("Número de tentativas: " + jogador.numeroTentivas);
        System.out.println("Pontuação final: " + jogador.pontuacao);

    }
}