package org.iclass.day2.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuyService 
{
	
	private BuyDao dao;
	
	@Autowired
	public BuyService(BuyDao dao) 
	{
		System.out.println("::: BuyService custom constructor - BuyDao bean 주입 :::");
		this.dao = dao;
	}	// method end

	//일반 메소드
	public void buy() 
	{
		System.out.println("---- BuyService buy() method ----");
		dao.buy();
	}	// method end
}	// Class end
