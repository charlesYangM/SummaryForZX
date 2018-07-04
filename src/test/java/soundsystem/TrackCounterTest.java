package soundsystem;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by CharlesYang on 2018/7/2/002.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter(){
        cd.playTrack(0);
        cd.playTrack(1);
        cd.playTrack(1);
        cd.playTrack(0);
        cd.playTrack(1);
        cd.playTrack(1);

        assertEquals(2, counter.getPlayCount(0));
        assertEquals(4, counter.getPlayCount(1));

    }

}
