package org.summary.shiro.session;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

/**
 * Created by CharlesYang on 2018/3/16.
 */
public class SessionListener1 implements SessionListener {
    private static final Log logger = LogFactory.getLog(SessionListener1.class);

    @Override
    public void onStart(Session session) {
        logger.info("会话创建：" + session.getId());
    }

    @Override
    public void onStop(Session session) {
        logger.info("退出会话：" + session.getId());
    }

    @Override
    public void onExpiration(Session session) {//会话过期时触发
        logger.info("会话过期：" + session.getId());
    }
}
