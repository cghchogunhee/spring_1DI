package org.iclass.day1;

public class Day1Main {

	public static void main(String[] args) {
		//기존의 객체를 new 연산으로 직접 생성하는 예시
		//컨트롤러가 가장 앞단에서 요청을 처리하는 경우로 예시
		BuyDao dao = new BuyDao("JDBC");
		
		//dao 객체를 service 가 사용하는 방법 : 1)setter메소드로 전달하기 2)생성자로 전달하기 
		BuyService service = new BuyService();
		service.setDao(dao);
		//service 객체를 controller 가 사용
		BuyController controller = new BuyController();
		controller.setService(service);
		controller.buy();
		System.out.println("\n::::2. 커스텀 생성자로 의존관계를 설정::::");
		BuyDao dao2 = new BuyDao("mybatis");
		BuyService service2 = new BuyService(dao2);
		BuyController controller2 = new BuyController(service2);
		controller2.buy();
	}
//스프링에서는 1),2)에 해당하는 의존객체 설정을 자동으로 한다.
}
