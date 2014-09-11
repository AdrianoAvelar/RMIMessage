package com.adriano.rmi.server;

import java.rmi.Naming;


public class Servidor {
	public Servidor() {
		try {
			IMensageiro m = new MensageiroImpl();
			Naming.rebind("MensageiroServico", m);
			System.out.println("Mensageiro vinculado ao serviço de nome 'MensageiroServico' ");
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getLocalizedMessage());
		}
	}
	
	public static void main(String[] args) {
		new Servidor();
	}

}
