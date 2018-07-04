package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CharlesYang on 2018/7/2/002.
 */
@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        BlankDisk cd  = new BlankDisk();
        cd.setTitle("SgT . Pepper's Lonely Hearts Club Band");
        cd.setArtist("the Beatles");
        List<String> tracks = new ArrayList<>();

        tracks.add("with a Little Help");
        tracks.add("Getting Better");

        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
