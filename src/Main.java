import br.com.alura.musicstream.models.Music;

public class Main {
    public static void main(String[] args) {

        Music music = new Music();
        music.setTitle("Rosyln");
        music.setDuration(4.49);
        music.rating(5);
        music.rating(5);
        music.rating(4);
        music.like();


        System.out.println(music.getDuration());
        System.out.println(music.getLikes());
        System.out.println(music.getRating());
        System.out.println(music.getTitle());
    }
}