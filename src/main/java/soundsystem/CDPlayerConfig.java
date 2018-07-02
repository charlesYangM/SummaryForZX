package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by CharlesYang on 2018/7/1/001.
 */
@Configuration
//@ComponentScan
@Import(CDConfig.class)
public class CDPlayerConfig {
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
