package org.summary.shiro.helper;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.summary.model.User;

/**
 * Created by CharlesYang on 2018/3/14.
 */
public class PasswordHelper {

    private static String algorithmName = "md5";
    private static final int hashIterations = 1024;

    public static void encryptPassword(User user) {
        // User对象包含最基本的字段Username和Password
        // 将用户的注册密码经过散列算法替换成一个不可逆的新密码保存进数据，散列过程使用了盐
        String  newPassword = new SimpleHash(algorithmName, user.getPassword(),
                ByteSource.Util.bytes(user.getUsername()), hashIterations).toString();
        user.setPassword(newPassword);
    }
}