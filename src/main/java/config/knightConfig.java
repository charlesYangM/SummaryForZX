package config;

import mock.BraveKnight;
import mock.Knight;
import mock.Quest;
import mock.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by CharlesYang on 2018/6/30/030.
 */

@Configuration
public class knightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

}
