import java.util.*;

public class MainExercicio8 {
    public static void main(String[] args) {

        // Criando a lista dos melhores jogadores
        List<Jogador> melhoresJogadores = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("| * BEM VINDO * |");

            //Inicaializa jogador
            Jogador jogador = verificarJogador(scanner, melhoresJogadores);

            //Inicializa jogo
            Jogo jogo = new Jogo(jogador);

            System.out.println("Agora é hora de jogar!");
            System.out.println("Que jogo você quer jogar?");
            System.out.println("1 - Pedra, papel e tesoura");
            System.out.println("2 - Adivinhar o número");

            int respostaJogo = scanner.nextInt();
            scanner.nextLine();

            switch (respostaJogo) {
                case 1: // Pedra, papel e tesoura
                    jogo.jogar();
                    break;
                case 2: // Adivinhar o número
                    System.out.println("Você terá que adivinhar um número entre 0 e X");
                    System.out.println("Digite um valor para X");
                    int X = scanner.nextInt();
                    scanner.nextLine();
                    jogo.jogar(X);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

            // Opções ao final do jogo
            System.out.println("Qual das seguintes opções você deseja seguir:");
            System.out.println("1 - Ver ranking completo");
            System.out.println("2 - Ver top 10");
            System.out.println("3 - Jogar novamente");
            System.out.println("4 - Encerrar o Jogo");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: // ver ranking completo
                    imprimirLista(melhoresJogadores, false);
                    break;
                case 2: // top 10
                    imprimirLista(melhoresJogadores, true);
                    break;
                case 3: // Jogar novamente
                    break;
                case 4: // Encerrar jogo
                    System.out.println("Obrigado por jogar");
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }


        }


    }

    private static Jogador verificarJogador(Scanner scanner, List<Jogador> jogadores) {
        System.out.println("Você já tem seu perfil jogador? (s/n) ");
        String jaTemPerfil = scanner.nextLine();

        if (jaTemPerfil.equalsIgnoreCase("s")) {

            System.out.println("Digite o nome do jogador:");
            String nome = scanner.nextLine();

            for (Jogador jogador : jogadores) {
                if (jogador.getNome().equalsIgnoreCase(nome)) {
                    System.out.println("Jogador encontrado!");
                    return jogador;
                }
            }
            System.out.println("Jogador não encontrado. Vamos criar um com o nome digitado");
            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();
            scanner.nextLine();
            Jogador novoJogador = new Jogador(nome, idade, 0, 0);
            jogadores.add(novoJogador);
            System.out.println("Jogador criado com sucesso.");
            return novoJogador;
        } else if (jaTemPerfil.equalsIgnoreCase("n")) {
            System.out.println("Digite o nome do jogador:");
            String nome = scanner.nextLine();
            if (existeJogadorComNome(jogadores, nome) != null) {
                System.out.println("Jogador já existe");
                return existeJogadorComNome(jogadores, nome);
            } else {
                System.out.println("Digite sua idade:");
                int idade = scanner.nextInt();
                scanner.nextLine();
                Jogador novoJogador = new Jogador(nome, idade, 0, 0);
                jogadores.add(novoJogador);
                System.out.println("Jogador criado com sucesso.");
                return novoJogador;
            }
        }
        System.out.println("Opção inválida");
        return null;
    }

    private static Jogador existeJogadorComNome(List<Jogador> melhoresJogadores, String nome) {
        for (Jogador jogador : melhoresJogadores) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                return jogador;
            }
        }
        return null;
    }

    private static void ranquear(List<Jogador> melhoresJogadores) {
        Collections.sort(melhoresJogadores, Comparator.comparing(Jogador::getPontuacao).reversed());
    }

    private static void imprimirLista(List<Jogador> melhoresJogadores, boolean top10) {
        ranquear(melhoresJogadores);
        int limiteLista;

        if (top10) {
            System.out.println("Top 10:");
            limiteLista = Math.min(10, melhoresJogadores.size());
        } else {
            System.out.println("Ranking completo");
            limiteLista = melhoresJogadores.size();
        }

        for (int i = 0; i < limiteLista; i++) {
            System.out.println((i + 1) + " - " + melhoresJogadores.get(i).getNome() + " - " + melhoresJogadores.get(i).getPontuacao());

        }

    }


}
