package org.cendra.bpm.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-08T13:04:56.524Z")
@Configuration
public class SwaggerDocumentationConfig {

	ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("CendraBPM API")
				.description(
						"CendraBPM API - Sistema de gestión procesos y tareas")
				.license("").licenseUrl("").termsOfServiceUrl("")
				.version("1.0.0").contact(new Contact("", "", "")).build();
	}

	@Bean
	public Docket customImplementation() {

		String basePackageApi = "org.cendra.bpm.api";
		// String basePackageApi = "io.swagger.api";

		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage(basePackageApi))
				.build()
				.directModelSubstitute(org.joda.time.LocalDate.class,
						java.sql.Date.class)
				.directModelSubstitute(org.joda.time.DateTime.class,
						java.util.Date.class).apiInfo(apiInfo());
	}

}
