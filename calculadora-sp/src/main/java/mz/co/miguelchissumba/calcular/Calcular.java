package mz.co.miguelchissumba.calcular;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import mz.co.miguelchissumba.operacao.Operacao;

public class Calcular {

	
	Logger logger=LoggerFactory.getLogger(getClass());
	
	private List<Operacao> operacaoes;
	
	public Calcular(List<Operacao> operacaoes) {
		super();
		this.operacaoes = operacaoes;
	}
	
	public void calculo(long a, long b, char operador) {
		for (Operacao o : operacaoes) {
			if (o.operador(operador)) {
				long output = o.resultado(a, b);
				logger.info(a + " " + operador + " " + b + " = " + output);
				return;
			}
			throw new IllegalArgumentException("Operador ilegal: "+operador);
		}
	}
}
