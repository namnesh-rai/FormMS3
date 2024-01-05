package com.rai.FormMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.rai.FormMS.service.FormDataService")
public class FormMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormMsApplication.class, args);
	}

}
