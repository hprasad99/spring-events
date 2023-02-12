package com.spring.events.springevents;

import com.spring.events.springevents.config.AppConfig;
import com.spring.events.springevents.publisher.ZeeCafePublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEventsApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ZeeCafePublisher bean = context.getBean("zeeCafePublisher", ZeeCafePublisher.class);
		bean.streamBigBangTheory("EP - 0102");
	}

}
