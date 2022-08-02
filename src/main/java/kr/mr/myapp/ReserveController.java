package kr.mr.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.mr.mapper.VehicleMapper;
import kr.mr.model.VehicleDTO;


@Controller
public class ReserveController {
	
	@Autowired
	   private VehicleMapper vehicleMapper;
	   
	   
	   @RequestMapping("/revOneDay.do") 
	      public String reserveOneDay(Model model) {
	  


		   
		   
	       return "reserve/myDayReserv"; 
	          
	   }  
	   
	   
	   
	   
	   @RequestMapping("/revLongDay.do") 
	   public String reserveLongDay(Model model) {
		   
		   
		   
		   return "reserve/myLongReserv"; 
		   
	   }  

	}