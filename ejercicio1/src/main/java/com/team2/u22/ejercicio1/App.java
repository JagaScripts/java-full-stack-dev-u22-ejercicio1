package com.team2.u22.ejercicio1;

import com.team2.u22.ejercicio1.modelo.Cliente;

/**
 * Hello world!
 *
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
    	
    	Cliente cliente = new Cliente("Jose","González","Avd Carrasco nº 5", 12345678,"23-05-1982");
    	cliente.crearRegistro("ud22_ejercicios_db_clientes", "cliente", cliente);
        System.out.println( "Hello World! ");
    }
}
