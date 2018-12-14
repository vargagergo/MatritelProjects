package tuesdayCDExercise;

public class Track  {


    private String trackName;

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    private int durationInSeconds;

    public Track(String trackName, int durationInSeconds) {
        this.trackName = trackName;
        this.durationInSeconds = durationInSeconds;
    }

    public String getTrackName() {
        return this.trackName;
    }


    public int getJustTheSeconds(){
        return this.durationInSeconds % 60;
    }

    public int getJustTheMinutes(){
        return this.durationInSeconds / 60;
    }

    public String showDurationInMinutes(){
        int minutes = this.durationInSeconds / 60;
        int seconds = this.durationInSeconds % 60;

        String duration = "" + minutes + " minutes, " + "" + seconds + " seconds.";
        return duration;

    }

    @Override
    public String toString() {
        return "Track{" +
                "TrackName='" + trackName + '\'' +
                ", Duration=" + showDurationInMinutes() +
                '}';
    }
}
