package mz.co.miguelchissumba.SpringAplicationBuilder;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import mz.co.miguelchissumba.CalculadoraAplication;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CalculadoraAplication.class);
	}

}