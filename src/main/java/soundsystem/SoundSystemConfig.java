package soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by CharlesYang on 2018/7/1/001.
 */
@Configuration
@Import(CDPlayerConfig.class)
//@ImportResource("classpath:cd-config.xml")
public class SoundSystemConfig {

}
