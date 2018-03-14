package org.summary.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by CharlesYang on 2018/3/7.
 */
@Controller
public class HelloControllerAnotion {
    private static final Log logger = LogFactory.getLog(HelloControllerAnotion.class);

    @RequestMapping(value = "/hello")
    public ModelAndView hello(){
        logger.info("handlerRequest invoke");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "hello world, my name is charles");
        mv.setViewName("welcome");
        return mv;
    }

    @RequestMapping("/helloWorld")
    public String helloWorld(Model model){
        model.addAttribute("message", "hello  world!");
        return "welcome";
    }

    @RequestMapping("/welcome")
    public void welcome(){
        logger.info("void welcome invoke ............");
    }
}
