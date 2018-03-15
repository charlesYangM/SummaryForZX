package org.summary.controller;

/**
 * Created by CharlesYang on 2018/1/23.
 */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.summary.dto.LoginExecution;
import org.summary.dto.Result;
import org.summary.dto.SignUpExecution;
import org.summary.enums.LoginEnum;
import org.summary.enums.SignUpEnum;

import org.summary.exception.NoUserException;
import org.summary.model.User;
import org.summary.service.IUserService;

import org.springframework.stereotype.Controller;
import org.summary.shiro.helper.PasswordHelper;


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
    /***************************************************************************************
     *
     *                                      register
     *
     ***************************************************************************************/
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

        PasswordHelper passwordHelper = new PasswordHelper();
        passwordHelper.encryptPassword(user);//将user的密码进行md5加密
        try {
            int isSign = this.userService.signup(user.getUsername(), user.getPassword());
            if (isSign == 0) {
                return new Result<>(true, new SignUpExecution(user.getUsername(), SignUpEnum.NO_NUMBER));
            } else {
                return new Result<>(true, new SignUpExecution(user.getUsername(), SignUpEnum.SUCCESS));
            }
        }catch (Exception e){
            logger.error("register POST error .........");
            return new Result<>(false, new SignUpExecution(user.getUsername(), SignUpEnum.INNER_ERROR));
        }
    }
    /***************************************************************************************
     *
     *                                      login
     *
    ***************************************************************************************/
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm() {
        return "loginForm";//跳转到登录页面
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = {
            "application/json; charset=utf-8"})
    @ResponseBody
    public Result<LoginExecution> login(
            @RequestBody User user){
        Subject subject = SecurityUtils.getSubject() ;
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword()) ;
        try {
            subject.login(token);
            return new Result<>(true, new LoginExecution(user.getUsername(), LoginEnum.SUCCESS));
        }catch (UnknownAccountException e){
            logger.info(e);
            return new Result<>(true, new LoginExecution(user.getUsername(), LoginEnum.NO_NUMBER));
        } catch (Exception e){
            //这里将异常打印关闭是因为如果登录失败的话会自动抛异常
            e.printStackTrace();
            return new Result<>(false, new LoginExecution(user.getUsername(), LoginEnum.INNER_ERROR));
        }
    }
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
