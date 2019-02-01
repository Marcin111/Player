public class Player {

    public static void main(String[] args) {

//        INSTRUKCJA

//        Aplikacja uruchomiana jest z klasy Player. Po zainicjowaniu aplikacji zostanie odtworzona PlayLista4
//        z kolejnością sekwencyjną zawierająca filmy i utwory. PlayLista4 zawiera również podlistę, którą jest
//        PlayLista2 z kolejnością losową.
//
//        W klasie Player znajduje się kilka różnych PlayList gotowych do odtworzenia.
//        Polecenia do ich uruchomienie znajdują się w wierszach od 50-68 (wystarczy je odkomentować).

//        W aplikacji zostały również zaimplementowane proste testy jednostkowe
//        do sprawdzenia działania metod odtwarzania.

    Playlist playlist = new Playlist();
    playlist.add(new Song("The Rolling Stones, Brown Sugar"));
    playlist.add(new Song("Aerosmith, Crazy"));
    playlist.add(new Song("Guns N' Roses, November Rain"));
    playlist.add(new Movie("The Godfather"));
    playlist.add(new Movie("Casablanca"));
    playlist.add(new Movie("Terminator"));


    Playlist playlist1 = new Playlist();
    playlist1.setType(PlaylistType.LOOP);
    playlist1.add(new Song("Led Zeppelin, Stairway To Heaven"));
    playlist1.add(new Song("Metallica, Nothing Else Matters"));
    playlist1.add(new Song("Red Hot Chili Peppers, Road Trippin'"));
    playlist1.add(new Movie("Scarface"));
    playlist1.add(new Movie("Alien"));
    playlist1.add(new Movie("The Night of the Iguana"));

    Playlist playlist2 = new Playlist();
    playlist2.setType(PlaylistType.RANDOMLY);
    playlist2.add(new Song("Led Zeppelin, Stairway To Heaven"));
    playlist2.add(new Song("Metallica, Nothing Else Matters"));
    playlist2.add(new Movie("Scarface"));
    playlist2.add(new Movie("Alien"));

    Playlist playlist3 = new Playlist();
    playlist3.add(new Song("Red Hot Chili Peppers, Road Trippin'"));
    playlist3.add(new Movie("The Night of the Iguana"));
    Playlist list = new Playlist();
    list.setType(PlaylistType.RANDOMLY);
    list.add(new Movie("The Godfather"));
    list.add(new Song("The Rolling Stones, Brown Sugar"));
    playlist3.add(list);
    playlist3.add(new Movie("Casablanca"));


//        kolejność sekwencyjna
//        System.out.println("Odtwarzanie playlisty: 1\n");
//        playlist.play();
//        System.out.println("Koniec odtwarzania playlisty: 1\n");

//        kolejność zapętlona
//        System.out.println("Odtwarzanie playlisty: 2\n");
//        playlist1.play();
//        System.out.println("Koniec odtwarzania playlisty: 2\n");

//        kolejnośc losowa
//        System.out.println("Odtwarzanie playlisty: 3\n");
//        playlist2.play();
//        System.out.println("Koniec odtwarzania playlisty: 3\n");

//        kolejność sekwencyjna z podlistą losową
        System.out.println("Odtwarzanie playlisty: 4\n");
        playlist3.play();
        System.out.println("Koniec odtwarzania playlisty: 4\n");

    }
}
