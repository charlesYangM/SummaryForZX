package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by CharlesYang on 2018/7/1/001.
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void paly(){
        cd.play();
    }
}
