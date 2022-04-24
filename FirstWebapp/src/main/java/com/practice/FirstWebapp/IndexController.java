package com.practice.FirstWebapp;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController

{
  @RequestMapping(value="/index")
  public String index()
  {
	return "index";
	
  }
  
  //from server to client through HttpServletRequest
  
  /* @RequestMapping(value="/result")
  public String result(HttpServletRequest request)
  {
	  String name=request.getParameter("data");
	  System.out.println("Value is: " +name);
	  HttpSession session=request.getSession();
	  session.setAttribute("value", name );
	  return "result"; */
	  
	//Client to server through @RequestParam  
	 /* @RequestMapping(value="/result")
	  public String result(@RequestParam("data") String name,HttpSession session )
	  {
		  //String name=request.getParameter("data");
		  System.out.println("Value is: " +name);
		  //HttpSession session=request.getSession();
		  session.setAttribute("value", name );
		  return "result";

       } */
  
  //Client to server through Model interface
   /* @RequestMapping(value="/result")
  public String result(@RequestParam("data") String name,Model model )
  {
	  System.out.println("Value is: " +name);	
	  model.addAttribute("value", name);
	  return "result"; 
	   }*/
  
  /* @RequestMapping(value="/result")
  public ModelAndView result(@RequestParam("data") String name)
      {
	  Map<String,String> map=new HashMap<String,String>();	  	
	  map.put("value", name);
	  return new ModelAndView("result",map);	  
	  } */
  
  //Client to server from ModelAndView Class
  
   @RequestMapping(value="/result")
   public ModelAndView result(@RequestParam("data") String name)
   {
 	  ModelAndView mv=new ModelAndView("result"); 	
 	  mv.addObject("value", name);
 	  return mv;	  
   }
   
  
  
}