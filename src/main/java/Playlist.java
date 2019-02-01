import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist implements Playable{

    private List<Playable> elements = new ArrayList<>();

    public void add(Playable playable){
        elements.add(playable);
    }

    private PlaylistType type;

    public PlaylistType getType() {
        return type;
    }

    public Playlist(){
        type = PlaylistType.SEQUENCE;
    }

    public Playlist(PlaylistType type) {
        this.type = type;
    }

    public void setType(PlaylistType type) {
        this.type = type;
    }

    public void playRandomly() {
        Random random = new Random();
        //dodano warunek końca dla bezpieczeństwa
        int count = 4;

        for (int i = 0; i<elements.size(); i++){

            int param = random.nextInt(elements.size());
            elements.get(param).play();

            if (i==elements.size()-1 && count != 0){
                i=-1;
                count--;
            }
        }
        //elements.get(e->e.get(e.size()).play());
    }

    public void playSequence() {
        elements.forEach(e-> e.play());
    }

    public void playLoop() {
        //dodano warunek końca dla bezpieczeństwa
        int count = 4;

        for (int i = 0; i<elements.size(); i++){

            elements.get(i).play();

            if (i==elements.size()-1 && count != 0){
                i=-1;
                count--;
            }
        }
    }

    @Override
    public void play(){
        switch (this.type){
            case LOOP:
                playLoop();
                break;
            case SEQUENCE:
                playSequence();
                break;
            case RANDOMLY:
                playRandomly();
                break;
        }
    }
}
