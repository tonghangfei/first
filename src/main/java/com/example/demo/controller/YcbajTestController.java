package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;


@RestController
//@CrossOrigin("*")
//@RequestMapping(value = "/fa",produces="text/json;charset=UTF-8")
public class YcbajTestController {
	
	  //@ResponseBody
	@GetMapping(value = "/test")
	  public String test(Message me) {
		if(me==null) {
			return "not find";
		}
		
		return "yes,I get it";
	  }
	//法官旧存数据测试接口
	  @GetMapping(value = "/jclist")
	  public List<Map<String, Integer>> jcList(String id) {
		  String [] ids = id.split("/");
		  List<String> idlist = new ArrayList<>();
		  for(int i=0;i<ids.length;i++) {
			  idlist.add(ids[i]);
		  }
		  List<Map<String, Integer>> data = new  ArrayList<>();
		  for(int i=0;i<idlist.size();i++) {
			  Map<String, Integer> temp = new  HashMap<>();
			  String idTemp = idlist.get(i);
			  Integer value = i*10;
			  temp.put(idTemp, value);
			  data.add(temp);
		  }
		  return data;
	  }
	//法官已结案数据测试接口
	  @GetMapping(value = "/yjalist")
	  public List<Map<String, Integer>> yjaList(String id) {
		  String [] ids = id.split("/");
		  List<String> idlist = new ArrayList<>();
		  for(int i=0;i<ids.length;i++) {
			  idlist.add(ids[i]);
		  }
		  List<Map<String, Integer>> data = new  ArrayList<>();
		  for(int i=0;i<idlist.size();i++) {
			  Map<String, Integer> temp = new  HashMap<>();
			  String idTemp = idlist.get(i);
			  Integer value = i*10;
			  temp.put(idTemp, value);
			  data.add(temp);
		  }
		  return data;
	  }
	  //法官办理中数据测试接口
	  @GetMapping(value = "/blzlist")
	public List<Map<String, Integer>> blzList(String id) {
		  String [] ids = id.split("/");
		  List<String> idlist = new ArrayList<>();
		  for(int i=0;i<ids.length;i++) {
			  idlist.add(ids[i]);
		  }
		  List<Map<String, Integer>> data = new  ArrayList<>();
		  for(int i=0;i<idlist.size();i++) {
			  Map<String, Integer> temp = new  HashMap<>();
			  String idTemp = idlist.get(i);
			  Integer value = i*10;
			  temp.put(idTemp, value);
			  data.add(temp);
		  }
		  return data;
	  }
	  
}
