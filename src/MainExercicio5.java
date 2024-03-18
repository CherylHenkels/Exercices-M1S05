import java.util.*;

public class MainExercicio5 {

    public static void main(String[] args) {
        // Criando a lista dos melhores jogadores
        List<Jogador> melhoresJogadores = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        

        // Instanciando os objetos Jogador e adicionando à lista
        do {
            System.out.println("Digite o nome do jogador:");
            String nome = scanner.nextLine();

            if (existeJogadorComNome(melhoresJogadores, nome)) {
                System.out.println("Este nome já está sendo usado. Por favor, digite outro nome.");
            } else {
                System.out.println("Digite a idade:");
                int idade = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite a pontuação:");
                int pontuacao = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o número de tentativas:");
                int numeroTentativas = scanner.nextInt();
                scanner.nextLine();

                Jogador novoJogador = new Jogador(nome, idade, pontuacao, numeroTentativas);
                melhoresJogadores.add(novoJogador);

                System.out.println("Jogador adicionado com sucesso!");
                System.out.println("Deseja adicionar outro jogador? (s/n)");
                String continuar = scanner.nextLine();
                if (!continuar.equalsIgnoreCase("s")) {
                    break;
                }
            }
        } while(true);



        // jogo
        //jogo(scanner, melhoresJogadores);

    }

    private static boolean existeJogadorComNome(List<Jogador> melhoresJogadores, String nome) {
        for (Jogador jogador : melhoresJogadores) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }


    private static void ranquear(List<Jogador> melhoresJogadores) {
        Collections.sort(melhoresJogadores, Comparator.comparing(Jogador::getPontuacao).reversed());
    }

    private static void imprimirLista(List<Jogador> melhoresJogadores) {
        ranquear(melhoresJogadores);
        System.out.println("Lista dos melhores jogadores:");
        if(melhoresJogadores.size() < 10) {
            for (int i = 0; i < melhoresJogadores.size(); i++) {
                System.out.println(melhoresJogadores.get(i).getNome() + " - " + (i + 1) + " - " + melhoresJogadores.get(i).getPontuacao() );
            }
        } else {
            for (int i = 0; i < 10; i++) {
                System.out.println(melhoresJogadores.get(i).getNome() + " - " + (i + 1) + " - " +melhoresJogadores.get(i).getPontuacao() );
            }
        }
    }

    private static void jogo (Scanner scanner, List<Jogador> melhoresJogadores){
        for(Jogador jogador : melhoresJogadores){
            System.out.println("Digite a nova pontuação do jogador: " + jogador.getNome() );
            jogador.setPontuacao(scanner.nextInt());
            scanner.nextLine();
        }
        imprimirLista(melhoresJogadores);
    }

}
