package com.adriano.rmi.base;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface com os metodos do servidor.
 * 
 * @author Adriano Avelar
 */
public interface IMensageiro extends Remote {
	public String doCommunication(String name) throws RemoteException;
}