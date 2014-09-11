package com.adriano.rmi.base;

/**
 * Implementa as regras da interface
 * @author Adriano Avelar
 */
import java.rmi.RemoteException;

public class MensageiroImpl extends RemoteException implements IMensageiro {
	private static final long serialVersionUID = 3338526139192818203L;
	public MensageiroImpl() {
		super();
	}

	@Override
	public String doCommunication(String name) throws RemoteException {
		return "\nServidor diz: Olá " + name+ "\n";
	}
}