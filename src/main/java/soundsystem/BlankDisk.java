package soundsystem;

import java.util.List;

/**
 * Created by CharlesYang on 2018/7/1/001.
 */
public class BlankDisk implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




    @Override
    public void play() {
        System.out.println("BlankDisk{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", tracks=" + tracks +
                '}');
    }
}
