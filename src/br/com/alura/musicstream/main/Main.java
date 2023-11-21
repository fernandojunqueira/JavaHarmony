package br.com.alura.musicstream.main;

import br.com.alura.musicstream.models.Favorites;
import br.com.alura.musicstream.models.Music;
import br.com.alura.musicstream.models.PodCast;

public class Main {
    public static void main(String[] args) {

        Music music = new Music();
        music.setTitle("Roselyn");
        music.setArtist("Bon Iver");

        for (int i = 0; i < 100; i++) {
            music.like();
        }

        PodCast podcast = new PodCast();
        podcast.setTitle("Flow");
        for (int i = 0; i < 300; i++) {
            podcast.like();
        }

        Favorites favorites = new Favorites();
        favorites.include(music);
        favorites.include(podcast);
    }
}