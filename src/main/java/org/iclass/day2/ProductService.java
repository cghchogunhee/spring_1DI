package org.iclass.day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
	
	private ProductDao dao;
	
	//3)setter 주입을 위해서 기본생성자
	public ProductService() {
		System.out.println(":::::PorductService 기본 생성자::::::");
	}
	
//	//2)생성자 주입
//	@Autowired
//	public ProductService(ProductDao dao) {
//		System.out.println(":::::PorductService 커스텀 생성자 - ProductDao bean 주입::::::");
//		this.dao = dao;
//	}
	@Autowired
	public void setDao(ProductDao dao) {
		System.out.println("---- ProductService setter ----");
		this.dao = dao;
	}

	public void product() {
		System.out.println(":::::PorductService Product()메소드::::::");
		dao.product();
	}
	
	
}
