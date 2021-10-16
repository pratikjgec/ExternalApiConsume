package com.apiConsume.ApiConsumeGetPost.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.apiConsume.ApiConsumeGetPost.entity.Data;
import com.apiConsume.ApiConsumeGetPost.entity.Member;
import com.apiConsume.ApiConsumeGetPost.entity.RequestData;



@RestController
public class HomeController {

	 String get_url="https://hzivq3xfxe.execute-api.ap-south-1.amazonaws.com/production/auth/testget";
	 String post_url="https://hzivq3xfxe.execute-api.ap-south-1.amazonaws.com/production/auth/testpost";

	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/")
	String home()
	{
		return "Application working..";
	}
	@GetMapping("/get")
	Data getData()
	{
		Data response =restTemplate.getForObject(get_url, Data.class);
		System.out.println(response.toString());
		return response ;
	}
	
	@PostMapping("/post")
	Member postData(@RequestBody RequestData requestData)
	{
		//System.out.println("input body data="+requestData);
		Member result=restTemplate.postForObject(post_url,requestData, Member.class);
		
		return result;
	}
	
}
