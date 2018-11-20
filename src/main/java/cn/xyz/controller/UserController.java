package cn.xyz.controller;

import cn.xyz.entity.User;
import cn.xyz.service.UserServiceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImp;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/regist")
    public String regist(){
        return "regist";
    }
    @RequestMapping("/dologin")
    @ResponseBody
    public String doLogin(User user,Map<String,Object> map){
        User user1 = userServiceImp.selectUser(user.getUsername(),user.getPassword());
        System.out.print(user1);
         if(user1==null){
             map.put("msg", "密码或账号错误!");
            return "fail";
         }else {
             map.put("msg", "登入成功");
             return "success";
         }
    }
    @RequestMapping("/doregist")
    public String doRegist(User user,Map<String,Object> map) {
        userServiceImp.inserUser(user.getUsername(), user.getPassword());
        map.put("msg","注册成功");
        return "success";
    }
}
