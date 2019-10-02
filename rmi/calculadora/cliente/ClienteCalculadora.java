package rmi.calculadora.cliente;

import java.math.BigDecimal;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmi.calculadora.server.Calculadora;

public class ClienteCalculadora {
	public static void main(String[] args) {
		Calculadora calculadora;
		Registry registry;
		BigDecimal resposta;
		try {
			registry = LocateRegistry.getRegistry("127.0.0.1", 2001);
			calculadora = (Calculadora) registry.lookup("Calculadora");

			resposta = calculadora.adicao(BigDecimal.valueOf(2.1), BigDecimal.valueOf(1.1));

			System.out.println(resposta);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
