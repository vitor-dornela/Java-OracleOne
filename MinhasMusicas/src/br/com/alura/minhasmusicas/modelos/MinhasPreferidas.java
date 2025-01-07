package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void incluirPreferida(Audio audio) {
        String tipoAudio = audio.getClass().getSimpleName();
        String tipoAudioReescrito = tipoAudio.equals("Musica") ? "uma música" : "um podcast";

        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é " + tipoAudioReescrito + " considerado um sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo() + " é " + tipoAudioReescrito + " que muitas pessoas gostam!");
        }
    }

}
