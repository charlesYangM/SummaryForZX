package mock;

import java.io.PrintStream;

/**
 * Created by CharlesYang on 2018/6/30/030.
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("Fa la la ,the knight is so brave!");
    }

    public void singAfterQuest(){
        stream.println("Tee hee hee , the brave knight di embark on a quest!");
    }
}