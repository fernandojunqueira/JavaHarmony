package br.com.alura.musicstream.models;

public class Audio {
    private String title;
    private double duration;
    private int totalReproductions;
    private int likes;
    private double rating;
    private double sumRating;
    private int totalRating;

    public double getRating() {
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
        this.rating = (double) this.sumRating / totalRating;
    }

    public void like(){
        this.likes ++;
    }
}
