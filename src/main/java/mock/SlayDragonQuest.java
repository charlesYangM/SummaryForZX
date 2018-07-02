package mock;

import java.io.PrintStream;

/**
 * Created by CharlesYang on 2018/6/30/030.
 */
public class SlayDragonQuest implements Quest {


    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
