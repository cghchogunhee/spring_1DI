package org.iclass.day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductDao {
	
	private int count;
	
	public ProductDao() {
		System.out.println("---- ProductDao 기본 생성자 ----");
	}

	//2)생성자 주입
	public ProductDao(@Value("10")int count) {
		System.out.println("---- ProductDao 커스텀 생성자 - int value 전달 ----");

		this.count = count;
	}
	@Autowired
	public void setCount(@Value("10")int count) {
		System.out.println("---- ProductDao setter 생성자 ----");
		this.count = count;
	}

	public void product() {
		System.out.println("---- ProductDao product()메소드 ----");
		System.out.println("---- 수량 : "+count);
	}

}
