package rmi.calculadora.server;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImplementacao extends UnicastRemoteObject implements Calculadora {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2924000165294588367L;

	protected CalculadoraImplementacao() throws RemoteException {
		super();
	}

	@Override
	public BigDecimal adicao(BigDecimal op1, BigDecimal op2) throws RemoteException {
		return op1.add(op2);
	}
	
	public BigDecimal multiplicacao(BigDecimal op1, BigDecimal op2) {
		return op1.multiply(op2);
	}

}
