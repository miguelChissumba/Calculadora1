package mz.co.miguelchissumba.model.subtracao;

import mz.co.miguelchissumba.operacao.Operacao;
import org.springframework.stereotype.Component;

@Component
public class Subtracao implements Operacao{
	
	@Override
	public long resultado(long a, long b) {
		
		return a-b;
	}

	@Override
	public boolean operador(char operator) {
		
		return '-'==operator;
	}

}
