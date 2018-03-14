package org.summary.controller;

/**
 * Created by CharlesYang on 2018/1/23.
 */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.summary.dto.Result;
import org.summary.dto.SignUpExecution;
import org.summary.enums.SignUpEnum;

import org.summary.model.User;
import org.summary.service.IUserService;

import org.springframework.stereotype.Controller;


import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private static List<User> userList;

    public UserController() {
        userList = new ArrayList<User>();
    }

    private static final Log logger = LogFactory.getLog(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/showUser.do", method = RequestMethod.POST, produces = {
            "application/json; charset=utf-8"})
    @ResponseBody
    public Result<SignUpExecution> login(@RequestParam("username") String username,
                                         @RequestParam("password") String password) throws IOException {
        username = URLDecoder.decode(username, "utf-8");
        System.out.println("username is " + username);
        User user = this.userService.login(username, password);

        return new Result<>(true, new SignUpExecution(user.getUsername(), SignUpEnum.SUCCESS));
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm() {
        return "registerForm";//跳转到注册页面
    }

    @RequestMapping(value = "/registerDate", method = RequestMethod.GET)
    public String registerDateForm() {
        return "registerDateForm";
    }
//    @RequestMapping(value = "/registerDate", method = RequestMethod.POST)
//    public String registerDate(
//            @ModelAttribute User user,Model model
//    ){
//        logger.info(user);
//        user.setBirthday(new Date());
//        model.addAttribute("user",user);
//        return "success";
//    }

    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = {
            "application/json; charset=utf-8"} )
    @ResponseBody
    public Result<SignUpExecution> register(
            @RequestBody User user) {
        logger.info("register POST invoke........");
        int isSign = this.userService.signup(user.getUsername(), user.getPassword());
        if (isSign == 0) {
            return new Result<>(true, new SignUpExecution(user.getUsername(), SignUpEnum.NO_NUMBER));
        } else {
            return new Result<>(true, new SignUpExecution(user.getUsername(), SignUpEnum.SUCCESS));
        }
    }

//    @RequestMapping("/login")
//    public String login(
//            @RequestParam("username") String username,
//            @RequestParam("password") String password,
//            Model model
//    ){
//        logger.info("login name is " + username + "the password is " + password);
//        for (User user : userList){
//            if (user.getUsername().equals(username)
//                    &&user.getPassword().equals(password)){
//                model.addAttribute("user", user);
//                return "welcome";
//            }
//        }
//        return "loginForm";
//    }
}
