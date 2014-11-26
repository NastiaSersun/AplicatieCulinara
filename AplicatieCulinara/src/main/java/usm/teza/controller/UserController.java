package usm.teza.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import usm.teza.enteties.Aliment;
import usm.teza.enteties.User;
import usm.teza.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	 public String addUser(@ModelAttribute("x") User user, BindingResult result){
		
		 userService.addUser(user);
		 return "redirect:/users";
	 }
	
	@RequestMapping("/users")
	public String listAliment(Map<String, Object> map){
	
		map.put("user", new User());
        map.put("userList", userService.showUsers());
 
        return "user";
	}
	
	/*
	 @RequestMapping("/register")
	    public ModelAndView toRegister() {
	         
	        return new ModelAndView("register", "user", new User());
	    }
*/
}
