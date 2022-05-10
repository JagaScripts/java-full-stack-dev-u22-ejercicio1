package com.team2.u22.ejercicio1.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.team2.u22.ejercicio1.modelo.Cliente;
import com.team2.u22.ejercicio1.vista.Vista;

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
	private Vista vista;

	/**
	 * Contructor de clase le pasamos el moledo cliente y vista cliente
	 * @param cliente
	 * @param clienteVista
	 */
	public ClienteControler(Cliente cliente, Vista clienteVista) {
		this.cliente = cliente;
		this.vista = clienteVista;
		//this.vista.bot
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
