package mz.co.miguelchissumba.model.multiplicacao;

import mz.co.miguelchissumba.operacao.Operacao;
import org.springframework.stereotype.Component;

@Component
public class Multiplicaocao implements Operacao {

	@Override
	public long resultado(long a, long b) {
		
		return a*b;
	}

	@Override
	public boolean operador(char operator) {
		
		return '*'==operator;
	}

}
