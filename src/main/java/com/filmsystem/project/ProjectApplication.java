package com.filmsystem.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author 23181
 */
@SpringBootApplication(scanBasePackages = "com.filmsystem.project")
@MapperScan("com.filmsystem.project.dao")
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
