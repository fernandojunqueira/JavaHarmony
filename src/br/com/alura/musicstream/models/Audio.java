package br.com.alura.musicstream.models;

public class Audio {
    private String title;
    private double duration;
    private int totalReproductions = 0;
    private int likes;
    private int rating;
    private double sumRating;
    private int totalRating = 0;

    public int getRating() {
        return rating;
    }

    public int getLikes() {
        return likes;
    }

    public int getTotalRating() {
        return totalRating;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void rating(int rating) {
        this.totalRating ++;
        this.sumRating += rating;
        this.rating = (int) this.sumRating / totalRating;
    }

    public void like(){
        this.likes ++;
    }

    public void reproduce(Audio audio){
        this.totalReproductions ++;
        System.out.println("Reproduzindo: " + audio.title);
    }

}
