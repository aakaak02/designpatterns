package com.aak.javapatterns;

import com.aak.javapatterns.creational.Parser;
import com.aak.javapatterns.creational.ParserFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavapatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavapatternsApplication.class, args);
		System.out.println("test");
		ParserFactory parserFactory = new ParserFactory();
		Parser parser = parserFactory.process("BA");
		Parser parser1 = parserFactory.process("JPMC");
		Parser parser2 = parserFactory.process("WFC");
	}

}
