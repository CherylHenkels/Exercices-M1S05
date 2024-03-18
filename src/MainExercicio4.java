import java.util.*;

public class MainExercicio4 {
    public static void main(String[] args) {
        // Criando a lista dos melhores jogadores
        List<Jogador> melhoresJogadores = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Instanciando os objetos Jogador e adicionando à lista
        Jogador jogador1 = new Jogador("Bob", 21, 100, 5);
        melhoresJogadores.add(jogador1);

        Jogador jogador2 = new Jogador("Larissa", 28, 150, 2);
        melhoresJogadores.add(jogador2);

        Jogador jogador3 = new Jogador("Fernando", 20, 120, 3);
        melhoresJogadores.add(jogador3);

        Jogador jogador4 = new Jogador("Eduardo", 20, 130, 4);
        melhoresJogadores.add(jogador4);

        Jogador jogador5 = new Jogador("José", 22, 133, 7);
        melhoresJogadores.add(jogador5);

        Jogador jogador6 = new Jogador("Maria", 23, 144, 4);
        melhoresJogadores.add(jogador6);

        Jogador jogador7 = new Jogador("Ana", 40, 200, 2);
        melhoresJogadores.add(jogador7);

        Jogador jogador8 = new Jogador("Alice", 32, 300, 4);
        melhoresJogadores.add(jogador8);

        Jogador jogador9 = new Jogador("Antonio", 33, 22, 5);
        melhoresJogadores.add(jogador9);

        Jogador jogador10 = new Jogador("Alberto", 34, 55, 3);
        melhoresJogadores.add(jogador10);

        Jogador jogador11 = new Jogador("Catarina", 25, 123, 1);
        melhoresJogadores.add(jogador11);


        // jogo
        jogo(scanner, melhoresJogadores);

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
