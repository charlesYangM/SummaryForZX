package org.summary.dao;

/**
 * Created by CharlesYang on 2018/1/23.
 */
import org.summary.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private IUserDao dao;

    @Test
    public void testSelectUser() throws Exception {
        String username = "zzh";
        String password = "123";
        User user = dao.login(username, password);
        System.out.println(user.getUsername());
    }

}
