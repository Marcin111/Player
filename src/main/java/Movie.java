public class Movie implements Playable {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void play(){
        System.out.println("Film " + getTitle());
    }

}
