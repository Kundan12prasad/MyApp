package com.practice.RegistrationWebApp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController 
{
	@RequestMapping("/regform")
	public String Register()
	{
		return "registration";
	}
	
	
	@RequestMapping("/userdetails")
	public ModelAndView  userInfo(UserRegistration reg )
	{
		ModelMap map=new ModelMap();
		map.addAttribute("name",reg.getUname());		
		map.addAttribute("emailid",reg.getEmailId());
		map.addAttribute("gender",reg.getGender()==Integer.parseInt("1") ? "Male" : "Female" );
		map.addAttribute("hobbies",reg.getHobby());		
		
		ModelAndView mv=new ModelAndView("userdetails");
		mv.addObject("regobj", map);
		
		//System.out.println("Details here....");
		return mv;
	}
}
