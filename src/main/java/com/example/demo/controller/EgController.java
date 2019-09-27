package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.User;

import java.util.List;
import java.util.Map;

@Controller
//passParam传参跳转到result.html，result.html调用queryList
public class EgController {
	//传参并跳转到前台
    @RequestMapping(value="/params", method = RequestMethod.GET)
    /* 后台用Map方法向前端传递参数
     * 传递的参数为message1: String, message2: String, user: User对象
     */
    public String passParam(Map <String, Object> map){

        map.put("message1", "Hello, Spring Boot!");

        map.put("message2", "Hello, Spring Boot!");

        User user = new User(18, "Bruce");

        map.put("user", user);

        return "result";

    }
    
    
    //获取前台(result.html)参数,再次跳转，到login
    //@ResponseBody注解，声明此方法用于接收前台传回的参数，使用后，返回值不能作为链接地址，尝试注了也成功
    //@ResponseBody
    //可以写postMapping（result.html用post调用），但是这样不能在浏览器直接访问（@RequestMapping就都可以）
    @RequestMapping("query")
    public String queryList(User user) {
    	//User user =new User(age, name);
    	System.out.println(user.getName());
    	System.out.println(user.getAge());
        return "login";
    }
}