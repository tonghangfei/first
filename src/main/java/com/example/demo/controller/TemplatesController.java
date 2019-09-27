package com.example.demo.controller;

import java.util.Date;
import com.example.demo.model.User;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;

    
@Controller  
public class TemplatesController {
    @Autowired
    private RestTemplate template;
	
	
	//使用restTemplate，在java文件中调用http请求
    @GetMapping("/templates")  
    String test(HttpServletRequest request) {  
//    	String ah = "1";
//    	Object temp = template.postForObject("http://172.18.72.182:8089/fjfl/api/v1/aj/th", ah, String.class);
//    	String tt = temp.toString();
//    	JSONObject jsonobject = JSONObject.parseObject(tt);
//		Object pcrop = jsonobject.get("data");
//		
//		
//		String start = "20150101";
//		String end = "20190101";
//		Object getWay = template.getForObject("http://172.18.72.182:8089/fjfl/api/v1/tj/ajfjfx?startTime="+start+"&endTime="+end, String.class);
//        
//		Object getWay1 = template.getForObject("http://172.18.12.239:8083/uim-api/api/users", String.class);
		//逻辑处理  
        request.setAttribute("key", "hello world");  
        request.setAttribute("name", "佟航飞");
        request.setAttribute("age", "22");
        return "/index";
    }  
    
    //传给前台messqge数据并显示，成功
    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String memberShow(Model model) {
        User vo = new User();
        vo.setUid("12345678L");
        vo.setName("尼古拉丁.赵四");
        vo.setAge(59);
        vo.setSalary(1000.00);
        vo.setBirthday(new Date());
        model.addAttribute("member", vo);
        return "message";
    }
    //尝试接收ajax请求，失败
    //@ResponseBody
    @GetMapping("/calendar")
	public String Calendar(/* HttpServletRequest request */) {

            /*List<CalendarTa> lists=calendarTaRepository.findAllByName("aa");
            model.addAttribute("lists", lists);*/
    		//request.setAttribute("name", uid);
            return "asr";
        }

} 
