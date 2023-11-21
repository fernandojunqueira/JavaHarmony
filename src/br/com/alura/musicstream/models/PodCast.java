package br.com.alura.musicstream.models;

public class PodCast extends Audio{
    private String host;
    private String description;

    @Override
    public int getRating() {
        if(this.getLikes() > 500){
            return 10;
        }else{
            return 8;
        }
    }
}
