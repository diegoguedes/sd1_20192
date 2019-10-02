package rmi.calculadora.server;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
	public BigDecimal adicao(BigDecimal op1, BigDecimal op2) throws RemoteException;
}
