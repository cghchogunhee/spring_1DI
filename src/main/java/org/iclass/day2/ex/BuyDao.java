package org.iclass.day2.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BuyDao 
{
	private String dbFactory;
	
	public BuyDao(@Value("Mybatis") String dbFactory) 
	{
		System.out.println("::::: BuyDao custom constructor - String value 전달 :::::");
		this.dbFactory = dbFactory;
	}	// method end

	public void buy() 
	{
		System.out.println("---- BuyDao buy() method ----");
		System.out.println(dbFactory + "를 이용하여 db에 연결합니다.");
	}	// method end
}	// Class end
