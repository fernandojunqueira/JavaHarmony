package br.com.alura.musicstream.models;

public class Favorites {

    public void include(Audio audio){
        System.out.println(audio.getTitle() + ": " + (audio.getRating() > 8));
        if(audio.getRating() > 8){
            System.out.println(audio.getTitle() + " é sucesso!");
        }else {
            System.out.println("Esse é pra mais tarde kkkk");
        }
    }
}
