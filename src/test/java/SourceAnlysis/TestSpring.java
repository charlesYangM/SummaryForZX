package SourceAnlysis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.summary.service.IUserService;

/**
 * Created by CharlesYang on 2018/1/29.
 */
public class TestSpring {
    public static void main(String[] args) throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        IUserService userService=(IUserService)context.getBean("userServiceImpl");

    }
}
