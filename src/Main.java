public class Main {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Bob", 24, 0,0);

        // Acesso aos atributos utilizando os getters
        System.out.println("Nome: " + jogador.getNome());
        System.out.println("Idade: " + jogador.getIdade());
        System.out.println("Pontuação: " + jogador.getPontuacao());
        System.out.println("Tentativas: " + jogador.getNumeroTentativas());

        // Tentativa 1
        jogador.adicionaTentativa();
        jogador.adicionaPontos(3);

        // Tentativa 2
        jogador.adicionaTentativa();
        jogador.perdePontos(1);

        // Acesso aos atributos atualizados
        System.out.println("Nova Pontuação: " + jogador.getPontuacao());
        System.out.println("Novas Tentativas: " + jogador.getNumeroTentativas());

        // Modificação dos atributos utilizando os setters
        jogador.setPontuacao(150);
        jogador.setNumeroTentativas(7);

        // Acesso aos atributos atualizados
        System.out.println("Nova Pontuação: " + jogador.getPontuacao());
        System.out.println("Novas Tentativas: " + jogador.getNumeroTentativas());







    }
}