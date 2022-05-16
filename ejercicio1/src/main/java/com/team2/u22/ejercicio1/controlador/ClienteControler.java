package com.team2.u22.ejercicio1.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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
 *         Fecha de creación 10/05/2022
 */
public class ClienteControler implements ActionListener {

	private Cliente cliente;
	private Vista vista;

	/**
	 * Contructor de clase le pasamos el moledo cliente y vista cliente
	 * 
	 * @param cliente
	 * @param clienteVista
	 */
	public ClienteControler(Cliente cliente, Vista clienteVista) {
		this.cliente = cliente;
		this.vista = clienteVista;

		// Boton de Crear Usuario
		this.vista.botonCU.addActionListener(this);
		this.vista.botonFU.addActionListener(this);
		this.vista.botonBU.addActionListener(this);
		this.vista.botonAU.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String nombre = null;
		String apellido = null;
		String direccion = null;
		int dni = 0;
		String fecha = null;
		
		if (this.vista.botonCU == e.getSource()) {
			try {
				boolean campoVacio = false;
				
				if (!"".equals(this.vista.nombreCUTextField.getText())) {
					nombre = this.vista.nombreCUTextField.getText();
				}else {
					campoVacio = true;
				}

				if (!"".equals(this.vista.apellidoCUTextField.getText())) {
					apellido = this.vista.apellidoCUTextField.getText();
				}else {
					campoVacio = true;
				}

				if (!"".equals(this.vista.direccionCUTextField.getText())) {
					direccion = this.vista.direccionCUTextField.getText();
				}else {
					campoVacio = true;
				}

				if (!"".equals(this.vista.dniCUTextField.getText())) {
					dni = Integer.parseInt(this.vista.dniCUTextField.getText());
				}else {
					campoVacio = true;
				}

				if (!"".equals(this.vista.fechaCUTextField.getText())) {
					fecha = this.vista.fechaCUTextField.getText();
					
				}else {
					campoVacio = true;
					
				}

				if(!campoVacio) {
					cliente = new Cliente(nombre, apellido, direccion, dni, fecha);
					cliente.actualizarRegistro("ud22_ejercicios_db_clientes", "cliente", "Joan", vista.idAUTextField.getText());
				}
			
				System.out.println(cliente);

			} catch (Exception e2) {
				
				JOptionPane.showMessageDialog(null, "Error");
			}
		}else if(this.vista.botonFU == e.getSource()) {
			
			vista.textArea.setText(cliente.leerTablaBaseDatos("ud22_ejercicios_db_clientes", "cliente", 6));
			
		}else if(this.vista.botonAU == e.getSource()) {
			
			
		}else if(this.vista.botonBU == e.getSource()) {
			
			cliente.eliminarRegistro("ud22_ejercicios_db_clientes", "cliente","id = " + vista.idBUTextField.getText());
			
		}

	}

}
