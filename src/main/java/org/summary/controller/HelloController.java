package org.summary.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by CharlesYang on 2018/3/7.
 */
public class HelloController implements Controller {
    private static final Log logger = LogFactory.getLog(HelloController.class);
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("handlerRequest invoke");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "hello world, my name is charles");
        mv.setViewName("welcome");
        return mv;
    }
}
