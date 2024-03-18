import java.util.Scanner;

public class Jogo {

    private Jogador melhorJogador;
    private int numeroJogadas;

    public Jogo(Jogador melhorJogador) {
        this.melhorJogador = melhorJogador;
        this.numeroJogadas = 0;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        while (true) {
            System.out.println("Digite ");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            System.out.println("0 - Sair");
            int jogadaJogador = scanner.nextInt();
            scanner.nextLine();

            // Verificar se o jogador escolheu uma opção válida
            if (jogadaJogador == 0){
                break;
            } else if (jogadaJogador != 1 && jogadaJogador != 2 && jogadaJogador != 3 && jogadaJogador != 0 ) {
                System.out.println("Jogada inválida.");
                continue;
            }

            // Número aleatório entre 0 e 1. Multiplicado pelo tamanho do array opcoes. Casting para número inteiro
            int jogadaComputador = ((int) (Math.random() * opcoes.length)) + 1 ;

            // Imprime as jogadas
            System.out.println("Você jogou: " + " " + jogadaJogador + " " + opcoes[jogadaJogador - 1]);
            System.out.println("O computador jogou: " + " " + jogadaComputador + " "  + opcoes[jogadaComputador - 1]);

            // Verifica o resultado do jogo
            if (jogadaJogador == jogadaComputador) {
                System.out.println("Empate!");
            } else if (jogadaJogador == (jogadaComputador + 1)){
                System.out.println("Você ganhou!");
                melhorJogador.setPontuacao(melhorJogador.getPontuacao() + 1);
            } else if (jogadaJogador == 1 && jogadaComputador == 3){
                System.out.println("Você ganhou!");
                melhorJogador.setPontuacao(melhorJogador.getPontuacao() + 1);
            } else {
                System.out.println("Você perdeu!");
            }

            // Incrementa o número de jogadas e tentativas
            numeroJogadas++;
            melhorJogador.setNumeroTentativas(melhorJogador.getNumeroTentativas() + 1);

            // Pergunta ao jogador se ele quer jogar novamente
            System.out.println("Deseja jogar novamente? (s/n)");
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        // Imprime o número total de jogadas e a pontuação do melhor jogador
        System.out.println("Número total de jogadas: " + numeroJogadas);
        System.out.println("Pontuação do melhor jogador: " + melhorJogador.getPontuacao());
    }

    public void jogar(int num) {
        Scanner scanner = new Scanner(System.in);

        int numeroSorteado = (int) (Math.random() * (num + 1));

        while (true) {
            System.out.println("Tente adivinhar o número. Digite um valor entre 0 e " + num + " :");

            int tentativa = scanner.nextInt();
            scanner.nextLine();


            if (tentativa == numeroSorteado) {
                System.out.println("Você acertou! O número sorteado é " + numeroSorteado);
                melhorJogador.setPontuacao(melhorJogador.getPontuacao() + 1);
            } else {
                System.out.println("Você errou!");
                melhorJogador.setPontuacao(melhorJogador.getPontuacao() - 1);
            }


            // Incrementa o número de jogadas e tentativas
            numeroJogadas++;
            melhorJogador.setNumeroTentativas(melhorJogador.getNumeroTentativas() + 1);

            // Pergunta ao jogador se ele quer jogar novamente
            System.out.println("Deseja jogar novamente? (s/n)");
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        // Imprime o número total de jogadas e a pontuação do melhor jogador
        System.out.println("Número total de jogadas: " + numeroJogadas);
        System.out.println("Pontuação do melhor jogador: " + melhorJogador.getPontuacao());
    }

}
