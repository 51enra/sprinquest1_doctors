package com.wildcodeschool.springquest_doctors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringquestDoctorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringquestDoctorsApplication.class, args);
	}
	 @RequestMapping("/")
	    @ResponseBody
	    public String index() {
	    String myPage = "<H1> The Doctor Index </H1> " + 
	    "<ul> <li> <a href = '/doctor/3'> John Pertwee </a></li> " +
	    		"<li> <a href = '/doctor/5'> Peter Davison</a></li> " +
	    		"<li> <a href = '/doctor/7'> Sylvester McCoy</a></li> " +	    
	    		"<li> <a href = '/doctor/9'> Christopher Eccleston</a></li> </ul>";		 
		 return myPage;
	    }
	 
	 @RequestMapping("/doctor/3")
	    @ResponseBody
	    public String doctor3() {
	    	return "Hello, my name is John Pertwee.";
	    }
	 
	 @RequestMapping("/doctor/5")
	    @ResponseBody
	    public String doctor5() {
	    	return "Hello, my name is Peter Davison.";
	    }
	
	 @RequestMapping("/doctor/7")
	    @ResponseBody
	    public String doctor7() {
	    	return "Hello, my name is Sylvester McCoy.";
	    }
	 
	 @RequestMapping("/doctor/9")
	    @ResponseBody
	    public String doctor9() {
	    	return "Hello, my name is Christopher Eccleston.";
	    }
}
