package org.cendra.bpm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "org.cendra.bpm")
public class CendraBpmApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CendraBpmApiApplication.class, args);
	}
}
