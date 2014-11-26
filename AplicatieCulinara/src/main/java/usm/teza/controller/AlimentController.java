package usm.teza.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import usm.teza.enteties.Aliment;
import usm.teza.service.AlimentService;


@Controller
public class AlimentController {
	
	@Autowired
	private AlimentService alimentService;
	
	@RequestMapping("/aliments")
	public String listAliment(Map<String, Object> map){
	
		map.put("aliment", new Aliment());
        map.put("alimentList", alimentService.listAliment());
 
        return "aliment";
	}
	
	 @RequestMapping(value = "/add", method = RequestMethod.POST)
	 public String addAliment(@ModelAttribute("x") Aliment aliment, BindingResult result){
		 alimentService.addAliment(aliment);
		 return "redirect:/aliments";
	 }
	 
	 @RequestMapping("/delete/{alimentId}")
	 public String deleteAliment(@PathVariable("alimentId") Integer alimentId){
		  
		 alimentService.findAliment(alimentId);
		 return "redirect:/aliments";
	 }
	 
	 @RequestMapping(value = "/edit", method = RequestMethod.POST)
	 public String editAliment(@ModelAttribute("aliment") Aliment aliment, BindingResult result){
		 alimentService.editAliment(aliment);
		 return "redirect:/aliments";
	 }
	
}