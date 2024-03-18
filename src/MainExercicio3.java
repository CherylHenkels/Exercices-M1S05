import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainExercicio3 {

    public static void main(String[] args) {

        // Criando a lista dos melhores jogadores
        List<Jogador> melhoresJogadores = new ArrayList<>();

        // Instanciando os objetos Jogador e adicionando à lista
        Jogador jogador1 = new Jogador("Bob", 21, 100, 5);
        melhoresJogadores.add(jogador1);

        Jogador jogador2 = new Jogador("Larissa", 28, 150, 2);
        melhoresJogadores.add(jogador2);

        Jogador jogador3 = new Jogador("Fernando", 20, 120, 4);
        melhoresJogadores.add(jogador3);

        //Ordenando em ordem crescente de pontuação
        Collections.sort(melhoresJogadores, Comparator.comparing(Jogador::getPontuacao).reversed());

        // Imprimindo lista
        System.out.println("Lista dos melhores jogadores:");
        for (int i = 0; i < melhoresJogadores.size(); i++) {
            System.out.println((i + 1) + " - " + melhoresJogadores.get(i).getNome() + " - Pontuação: " + melhoresJogadores.get(i).getPontuacao());
        }
    }

}
