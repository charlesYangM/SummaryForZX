import mock.BraveKnight;
import mock.Quest;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by CharlesYang on 2018/6/30/030.
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
