package com.ynov.biblio.com.ynov.biblio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ynov.biblio.com.ynov.biblio.config.AppConfiguration;

import lombok.extern.log4j.Log4j;

@SpringBootApplication
public class ExercicesApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ExercicesApplication.class, args);
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
	}
}
