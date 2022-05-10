package com.team2.u22.ejercicio1;

import com.team2.u22.ejercicio1.modelo.Cliente;

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
    	/*
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
    	
    	Cliente cliente = new Cliente("Jose","González","Avd Carrasco n 5", 12345678,"1982-05-23");
    	//cliente.crearRegistro("ud22_ejercicios_db_clientes", "cliente", cliente);
        System.out.println( "Hello World! " + cliente.toString());
        cliente.cerrarConexion();
    }
}
