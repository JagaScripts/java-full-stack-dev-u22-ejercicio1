package com.team2.u22.ejercicio1;

import java.awt.EventQueue;

import com.team2.u22.ejercicio1.controlador.ClienteControler;
import com.team2.u22.ejercicio1.modelo.Cliente;
import com.team2.u22.ejercicio1.vista.Vista;

/**
 * 
 * ejercicio1 - com.team2.u22.ejercicio1 - App
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 10/05/2022
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
					Cliente cliente = new Cliente();
					ClienteControler cc = new ClienteControler(cliente, frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    	
    
    	
    	//cliente.crearRegistro("ud22_ejercicios_db_clientes", "cliente", cliente);
       // System.out.println( "Hello World! " + cliente.toString());
        //cliente.cerrarConexion();
    }
}
