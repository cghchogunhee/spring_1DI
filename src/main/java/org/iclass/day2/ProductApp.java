package org.iclass.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class ProductApp {

	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(ProductConfig.class);
		
		ProductDao dao = context.getBean(ProductDao.class);
		dao.product();
		System.out.println("\n");
		ProductService service = context.getBean(ProductService.class);
		service.product();
		log.debug("org.iclass 패키지 로그 출력 수준이 debug일때 나옵니다");
		log.info("org.iclass 패키지 로그 출력 수준이 info일때 나옵니다");
		
		((AbstractApplicationContext)context).close();
	}

}
