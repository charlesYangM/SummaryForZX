package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by CharlesYang on 2018/7/3/003.
 */

//@Configuration
@ComponentScan(basePackages = {"spittr"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
        value = EnableWebMvc.class))
public class RootConfig {
}
