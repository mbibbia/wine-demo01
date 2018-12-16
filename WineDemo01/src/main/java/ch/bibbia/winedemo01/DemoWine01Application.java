package ch.bibbia.winedemo01;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch.bibbias.winedemo01.service.WineManager;

@SpringBootApplication
public class DemoWine01Application {

	public static void main(String[] args) {
		// SpringApplication.run(DemoWine01Application.class, args);
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-data-config-hi.xml");
		WineManager manager = context.getBean(WineManager.class);

		manager.manage();

		context.close();
	}

}
