package org.iclass.day2.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuyController 
{
	private BuyService service;
	
	@Autowired
	public BuyController(BuyService service) 
	{
		System.out.println(":::: BuyController custom constructor - BuyService bean 주입:::::");
		this.service=service; //객체 참조 
	}	// method end
			
	public void buy() 
	{
		System.out.println("---- Buycontroller buy() method ----");
		service.buy();		//참조되는 객체가 없으면? service 변수는 null -> NullPointerException
	}	// method end
}	// Class end
