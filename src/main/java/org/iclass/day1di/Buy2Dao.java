package org.iclass.day1di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Buy2Dao {
	
	@Value("마이바티스")
	private String dbFactory;
	
//	public Buy2Dao(String dbFactory) {
//		System.out.println("::::: Buy2Dao 커스텀 생성자 - dbFactory 주입 :::::");
//		this.dbFactory=dbFactory;
//	}
	
	public Buy2Dao() {
		System.out.println("~~~~~ Buy2Dao 기본 buy()~~~~~~");
	}
	
	public void setDbFactory(String dbFactory) {
		System.out.println("---- Buy2Dao setter ----");
		this.dbFactory = dbFactory;
	}
	
	public void buy() {
		System.out.print("~~~~~ Buy2Dao buy()~~~~~~");
		System.out.println();
	}
}
