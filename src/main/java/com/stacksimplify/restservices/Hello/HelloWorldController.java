package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	//Get
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/helloworld1")
	public String helloworld()
	{
		return "Hello world 1";
	}
	@GetMapping("/helloworld-Bean")
	public UserDetails helloWorldBean()
	{
		return new UserDetails ("sruthi","Boyapati","Melbourne");
	}
}
