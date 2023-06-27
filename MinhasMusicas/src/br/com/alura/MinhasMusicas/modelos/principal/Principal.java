package br.com.alura.MinhasMusicas.modelos.principal;

import br.com.alura.MinhasMusicas.modelos.MinhasPreferidas;
import br.com.alura.MinhasMusicas.modelos.musica;
import br.com.alura.MinhasMusicas.modelos.podcast;

public class Principal {
    public static void main(String[] args) {
        musica minhaMusica = new musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        podcast meuPodcast = new podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
           
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
