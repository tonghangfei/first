package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

/**
 * 列表页面初始化
 */
@Api(tags="自动分案服务")
@RestController
public class ListController {

	@ApiOperation(value="test1", notes="test1")
    @ApiResponse(code=200, message="成功")
    @GetMapping("/list")
    //简单打印JSon
    public List<Message> list(){
        List<Message> list=new ArrayList<>();
        Message message=new Message();
        message.setId("1");
        message.setCommand("许嵩");
        message.setDescription("歌手");
        message.setContent("最佳歌手");
        Message message1=new Message();
        message1.setId("2");
        message1.setCommand("蜀云泉");
        message1.setDescription("程序员");
        message1.setContent("不断成长的程序员");
        list.add(message);
        list.add(message1);
        return list;
    }

  //@ResponseBody
    @GetMapping("/getdata")
    //尝试不用ResponseBody，接收前台参数，成功
    @ApiOperation(value="test2", notes="test2")
    @ApiResponse(code=200, message="成功")
    public List<Message> list(String username,String password){
        List<Message> list=new ArrayList<>();
        Message message=new Message();
        message.setId("1");
        message.setCommand(username);
        message.setDescription(password);
        message.setContent("最佳歌手");
        Message message1=new Message();
        message1.setId("2");
        message1.setCommand("蜀云泉");
        message1.setDescription("程序员");
        message1.setContent("不断成长的程序员");
        list.add(message);
        list.add(message1);
        return list;
    }
}