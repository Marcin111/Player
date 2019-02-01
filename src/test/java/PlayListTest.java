import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlayListTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    private Playlist examplePlayList = new Playlist();

    @Before
    public void setUp(){
        examplePlayList.add(new Song("The Rolling Stones, Brown Sugar"));
        examplePlayList.add(new Song("Aerosmith, Crazy"));
        Playlist list = new Playlist();
        list.add(new Movie("The Godfather"));
        list.add(new Song("Guns N' Roses, November Rain"));
        examplePlayList.add(list);
        examplePlayList.add(new Movie("Casablanca"));
    }

    @Test
    public void testPlaySequence(){
        examplePlayList.play();
        String expectedResult = "Song The Rolling Stones, Brown Sugar\r\n"+
                "Song Aerosmith, Crazy\r\n"+"Film The Godfather\r\n"+
                "Song Guns N' Roses, November Rain\r\n"+"Film Casablanca\r\n";
        assertEquals(expectedResult,systemOutRule.getLog());
    }

    @Test
    public void testPlayLoop(){
        examplePlayList.setType(PlaylistType.LOOP);
        examplePlayList.play();
        String expectedResult = "Song The Rolling Stones, Brown Sugar\r\n"+
                "Song Aerosmith, Crazy\r\n"+"Film The Godfather\r\n"+
                "Song Guns N' Roses, November Rain\r\n"+"Film Casablanca\r\n"+
                "Song The Rolling Stones, Brown Sugar\r\n"+
                "Song Aerosmith, Crazy\r\n"+"Film The Godfather\r\n"+
                "Song Guns N' Roses, November Rain\r\n"+"Film Casablanca\r\n"+
                "Song The Rolling Stones, Brown Sugar\r\n"+
                "Song Aerosmith, Crazy\r\n"+"Film The Godfather\r\n"+
                "Song Guns N' Roses, November Rain\r\n"+"Film Casablanca\r\n"+
                "Song The Rolling Stones, Brown Sugar\r\n"+
                "Song Aerosmith, Crazy\r\n"+"Film The Godfather\r\n"+
                "Song Guns N' Roses, November Rain\r\n"+"Film Casablanca\r\n"+
                "Song The Rolling Stones, Brown Sugar\r\n"+
                "Song Aerosmith, Crazy\r\n"+"Film The Godfather\r\n"+
                "Song Guns N' Roses, November Rain\r\n"+"Film Casablanca\r\n";
        assertEquals(expectedResult,systemOutRule.getLog());
    }

    @Test
    public void testPlayRandomly(){
        examplePlayList.setType(PlaylistType.RANDOMLY);
        examplePlayList.play();
        String result = "Song The Rolling Stones, Brown Sugar\r\n"+
                "Song Aerosmith, Crazy\r\n"+"Film The Godfather\r\n"+
                "Song Guns N' Roses, November Rain\r\n"+"Film Casablanca\r\n"+
                "Song The Rolling Stones, Brown Sugar\r\n"+
                "Song Aerosmith, Crazy\r\n"+"Film The Godfather\r\n"+
                "Song Guns N' Roses, November Rain\r\n"+"Film Casablanca\r\n"+
                "Song The Rolling Stones, Brown Sugar\r\n"+
                "Song Aerosmith, Crazy\r\n"+"Film The Godfather\r\n"+
                "Song Guns N' Roses, November Rain\r\n"+"Film Casablanca\r\n"+
                "Song The Rolling Stones, Brown Sugar\r\n"+
                "Song Aerosmith, Crazy\r\n"+"Film The Godfather\r\n"+
                "Song Guns N' Roses, November Rain\r\n"+"Film Casablanca\r\n"+
                "Song The Rolling Stones, Brown Sugar\r\n"+
                "Song Aerosmith, Crazy\r\n"+"Film The Godfather\r\n"+
                "Song Guns N' Roses, November Rain\r\n"+"Film Casablanca\r\n";
        assertNotEquals(result,systemOutRule.getLog());
    }
}
