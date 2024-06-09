package com.example.tutorial;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(TutorialApplication.class, args);

		//System.out.println("Hello World!");

		// Lion l = new Lion();
		// l.show();
		Lion l = context.getBean(Lion.class);
		l.show();
	}

}
