package shiro;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.summary.shiro.helper.PasswordHelper;
import org.summary.model.User;

/**
 * Created by CharlesYang on 2018/3/14.
 */
public class MD5UtilTest {
    public static String md5(String password,String salt){
        return new Md5Hash(password,salt).toString() ;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setUsername("ymx");
        user.setPassword("1234");
        new PasswordHelper().encryptPassword(user);
//        String md5 = md5("abc123","eagle") ;

        System.out.println(user.getPassword());
    }
}
