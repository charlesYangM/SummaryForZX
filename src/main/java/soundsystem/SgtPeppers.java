package soundsystem;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 演示作为Spring 自动装配的效果
 * Created by CharlesYang on 2018/7/1/001.
 */
@Component
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt . Peppers's Lonely here Clue Band";
    private String artist = "The Beatles";
    private List<String> tracks;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {

        System.out.println("Playing " + title + " by " + artist);
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("play track " +
                trackNumber + " , this track is " +
                tracks.get(trackNumber));
    }
}
