package org.iclass.day1;

public class BuyService {
	
	private BuyDao dao;		//의존관계의 클래스 : BuyService 객체는 BuyDao 객체를 사용합니다.
	
	public BuyService() {	//기본 생성자
		System.out.println("::::: BuyService 기본 생성자 :::::");
	}
	
	public BuyService(BuyDao dao2) {
		this.dao = dao2;
	}

	//의존관계 주입 : setter
	public void setDao(BuyDao dao) {
		this.dao = dao;
	}
	
	//일반 메소드
	public void buy() {
		System.out.println("~~~~~ service buy() ~~~~~ ");
		dao.buy();
	}
	

}
