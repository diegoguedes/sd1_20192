package rmi.calculadora.server;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorRMI {
	public static void main(String[] args) {
		CalculadoraImplementacao calculadora;
		Registry registry;

		try {
			// Criar Registry
			registry = LocateRegistry.createRegistry(2002);

			//registry = LocateRegistry.getRegistry(2000);
			calculadora = new CalculadoraImplementacao();
			registry.rebind("Calculadora", calculadora);

			System.out.println("Servidor em execução");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
