package org.summary.dao;

/**
 * Created by CharlesYang on 2018/1/23.
 */
import org.apache.ibatis.annotations.Param;
import org.summary.model.User;

public interface IUserDao {

    /**
     *
     * @param username
     * @return
     */
    User login(@Param("username")String username,@Param("password")String password);

    /**
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    int signup(@Param("username")String username,@Param("password")String password);


    /**
     * 根据用户名获取信息
     * @param username
     * @return
     */
     User getByUsername(@Param("username")String username);
}