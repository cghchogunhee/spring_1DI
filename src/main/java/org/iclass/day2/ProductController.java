package org.iclass.day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductController {
	private ProductService service;

	
	
//	@Autowired
//	public ProductController(ProductService service) {
//		System.out.println(":::::::::ProductController 생성사 - ProductService bean 주입 :::::::");
//		this.service = service;
//	}
	
	public ProductController() {
		System.out.println(":::::ProductController 기본 생성자::::::");
	}


	@Autowired
	public void setService(ProductService service) {
		System.out.println("---- ProductController setter ----");
		this.service = service;
	}



	public void product() {
		System.out.println("----ProductController product()메소드-----");
		service.product();
	}
}
