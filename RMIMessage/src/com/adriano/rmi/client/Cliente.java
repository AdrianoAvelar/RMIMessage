package com.adriano.rmi.client;

import java.rmi.Naming;

import javax.swing.JOptionPane;

import com.adriano.rmi.server.IMensageiro;

/**
 * 
 * @author Adriano Avelar
 */
public class Cliente {
	
	private static final String LOCATION = "localhost";
	private static final String SERVICE_NAME = "MensageiroServico";
	
	public Cliente(){
		try {
			String uri = new String("rmi://" +LOCATION+"/"+SERVICE_NAME);
			IMensageiro m = (IMensageiro) Naming.lookup(uri);
			
			String name = JOptionPane.showInputDialog(null, "Digite seu nome:");
			String respostaDoServidor = m.doCommunication(name);
			
			JOptionPane.showMessageDialog(null,respostaDoServidor,"Resposta",JOptionPane.INFORMATION_MESSAGE);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Cliente();
	}
}