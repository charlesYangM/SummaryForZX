package spittr.config;

import org.springframework.context.annotation.Bean;
import spittr.data.SpittrRepo;
import spittr.data.SpittrRepository;

/**
 * Created by CharlesYang on 2018/7/3/003.
 */
//@Configuration
public class SpittleConfig {

    @Bean
    public SpittrRepository spittrRepository(){
        return new SpittrRepo();
    }
}
