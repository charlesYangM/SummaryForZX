package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by CharlesYang on 2018/7/1/001.
 */

@Configuration
public class CDConfig {

    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }
}
