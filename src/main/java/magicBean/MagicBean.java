package magicBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * Created by CharlesYang on 2018/7/2/002.
 */


public class MagicBean {
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){
        return new MagicBean();
    }
}
