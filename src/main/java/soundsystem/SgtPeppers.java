package soundsystem;

import org.springframework.stereotype.Component;

/**
 * 演示作为Spring 自动装配的效果
 * Created by CharlesYang on 2018/7/1/001.
 */
@Component
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt . Peppers's Lonely here Clue Band";
    private String artist = "The Beatles";


    @Override
    public void play() {

        System.out.println("Playing " + title + " by " + artist);
    }
}
