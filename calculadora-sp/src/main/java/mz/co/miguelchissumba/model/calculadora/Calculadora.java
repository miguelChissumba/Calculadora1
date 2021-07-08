package mz.co.miguelchissumba.model.calculadora;


public class Calculadora {

	private long valorA;
	
	private long valorB;
	
	private char operator;

	public Calculadora() {
		
	}
	
	public Calculadora(long valorA, long valorB, char operator) {
		super();
		this.valorA = valorA;
		this.valorB = valorB;
		this.operator = operator;
	}

	public long getValorA() {
		return valorA;
	}

	public void setValorA(long valorA) {
		this.valorA = valorA;
	}

	public long getValorB() {
		return valorB;
	}

	public void setValorB(long valorB) {
		this.valorB = valorB;
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	
	
	
}
