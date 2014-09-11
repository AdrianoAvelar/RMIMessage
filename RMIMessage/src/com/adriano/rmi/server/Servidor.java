package com.adriano.rmi.server;

import java.rmi.Naming;

import com.adriano.rmi.base.IMensageiro;
import com.adriano.rmi.base.MensageiroImpl;

public class Servidor {
	public Servidor() {
		try {
			IMensageiro m = new MensageiroImpl();
			Naming.rebind("MensageiroServico", m);
			System.out.println("Mensageiro vinculado ao servi�o de nome 'MensageiroServico' ");
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getLocalizedMessage());
		}
	}
	
	public static void main(String[] args) {
		new Servidor();
	}

}
