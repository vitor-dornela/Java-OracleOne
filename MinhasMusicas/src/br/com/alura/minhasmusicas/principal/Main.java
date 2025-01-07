package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("In the End");
        minhaMusica.setCantor("Linkin Park");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Syntax");
        meuPodcast.setDescricao("Podcast sobre tecnologias front-end");
        meuPodcast.setApresentador("Desenvolvedores");

        for (int i = 0; i < 2000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 200; i++) {
            minhaMusica.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.incluirPreferida(meuPodcast);
        preferidas.incluirPreferida(minhaMusica);


    }

}
