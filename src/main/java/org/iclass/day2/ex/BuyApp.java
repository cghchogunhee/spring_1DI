package org.iclass.day2.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BuyApp 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(BuyConfig.class);
		
		BuyDao dao = context.getBean(BuyDao.class);
		dao.buy();
	}	// main end
}	// Class end
