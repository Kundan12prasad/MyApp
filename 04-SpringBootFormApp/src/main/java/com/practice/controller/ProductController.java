package com.practice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController 
{
   @GetMapping(value={"/","/loadForm"})
	public String getForm()
	{		
		return "index";
		
	}   
   
   @PostMapping(value="/savedProduct")
   public String handleSubmitBtn(HttpServletRequest req,Model model)
   { 	   
	 //Sending Data from UI to Client	   
	   String pid=req.getParameter("pid");
	   String pname=req.getParameter("pname");
	   String productPrice=req.getParameter("productPrice");
	   System.out.println("ProductId::" +pid);
	   System.out.println("ProductName::" +pname);
	   System.out.println("ProductPrice::" +productPrice);	   
	   model.addAttribute("msg", "Product Saved to catalog successfully");
	   return "success";
	   
   }
	
	
}
