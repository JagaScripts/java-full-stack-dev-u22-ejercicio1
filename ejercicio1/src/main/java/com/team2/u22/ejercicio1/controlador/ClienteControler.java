package com.team2.u22.ejercicio1.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * ejercicio1 - com.team2.u22.ejercicio1.controlador - ClienteControler
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 10/05/2022
 */
public class ClienteControler implements ActionListener{
	
	private Cliente cliente;
	private ClienteVista clienteVista;

	/**
	 * Contructor de clase le pasamos el moledo cliente y vista cliente
	 * @param cliente
	 * @param clienteVista
	 */
	public ClienteControler(Cliente cliente, ClienteVista clienteVista) {
		this.cliente = cliente;
		this.clienteVista = clienteVista;
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
