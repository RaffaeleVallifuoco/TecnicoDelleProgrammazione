package it.raffo.springboot_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import it.raffo.springboot_example.MODEL.Computer;

@SpringBootApplication
public class SpringbootExampleApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringbootExampleApplication.class, args);

		ApplicationContext context = SpringApplication.run(SpringbootExampleApplication.class, args);
		Computer computer = context.getBean(Computer.class);

		computer.setModello("MacbookPro");
		computer.getSchedaVideo().setMemoria(02);

	}

}
