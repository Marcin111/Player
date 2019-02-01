public class Song implements Playable{

    private String name;

    public Song(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void play(){
        System.out.println("Song " + getName());
    }

}
