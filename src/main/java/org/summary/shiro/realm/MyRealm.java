package org.summary.shiro.realm;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;

import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import org.summary.model.User;
import org.summary.service.IUserService;

/**
 * Created by CharlesYang on 2018/3/14.
 */
public class MyRealm extends AuthorizingRealm {
    private static final Log logger = LogFactory.getLog(MyRealm.class);

    @Autowired
    private IUserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal(); // 获取用户名
//        logger.info("doGetAuthenticationInfo invoke username is "+ username
//                    +" password is ");
        User user = userService.getByUsername(username);
        if(user != null) {
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUsername(),
                    user.getPassword(), ByteSource.Util.bytes(user.getUsername()), getName());
            return authcInfo;
        } else {
            throw new UnknownAccountException("no user exist for login");
        }
    }
}
