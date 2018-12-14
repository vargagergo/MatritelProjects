package tuesdayCDExercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CD  {



    private String title;
    private String artist;
    private LocalDate releaseDate;
    private List<Track> listOfTracks;



    public CD(String title, String artist, LocalDate releaseDate) {
        this.title = title;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.listOfTracks = new ArrayList<Track>();
    }


    public List<Track> getListOfTracks() {
        return this.listOfTracks;
    }


    public void addTrackToCD (Track track){
        listOfTracks.add(track);
    }



    public String getTitle() {
        return title;
    }

    public String getArtist() {

        return artist;
    }

    @Override
    public String toString() {
        return "CD{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
