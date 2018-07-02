package mock;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by CharlesYang on 2018/6/30/030.
 */
public class KnightMain {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(knightConfig.class);
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = context.getBean(Knight.class);

        knight.embarkOnQuest();
        context.close();
    }
}
