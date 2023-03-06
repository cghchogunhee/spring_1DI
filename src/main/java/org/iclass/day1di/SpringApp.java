package org.iclass.day1di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
	public static void main(String[] args) {
		//spring-context : bean에 접근하기위해 사용. bean은 스프링 컨테이너에 저장.
		ApplicationContext context =
				new AnnotationConfigApplicationContext(BuyConfig.class);
		
		//1)여기까지 코딩하고 실행시키면 객체가 생성된것을 확인할 수 있다.
		//2)생성된 bean을 가져온다.
		Buy2Controller controller = context.getBean(Buy2Controller.class);
		//인스턴트 메소드 buy() 실행하기
		controller.buy();
	}
}
