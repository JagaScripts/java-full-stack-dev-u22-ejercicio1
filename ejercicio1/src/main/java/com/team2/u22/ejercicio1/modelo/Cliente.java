/**
 * 
 */
package com.team2.u22.ejercicio1.modelo;

import java.sql.Date;

import com.team2.u22.ejercicio1.modelo.gestiondb.ServicioBD;

/**
 * ejercicio1 - com.team2.u22.ejercicio1.modelo - Cliente
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 10/05/2022
 */
public class Cliente extends ServicioBD{
	
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private String fecha;
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param dirección
	 * @param dni
	 * @param fecha
	 */
	public Cliente() {
	}
	
	public Cliente(String nombre, String apellido, String dirección, int dni, String fecha) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = dirección;
		this.dni = dni;
		this.fecha = fecha;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the dirección
	 */
	public String getDirección() {
		return direccion;
	}
	/**
	 * @param dirección the dirección to set
	 */
	public void setDirección(String dirección) {
		this.direccion = dirección;
	}
	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}
	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public void usarBaseDatos(String nombreBaseDatos) {
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		super.usarBaseDatos(nombreBaseDatos);
	}
	@Override
	public void crearRegistro(String nombreBaseDatos, String tabla, String cliente) {
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		tabla = "cliente";
		super.crearRegistro(nombreBaseDatos, tabla, this.toString());
	}
	@Override
	public String leerTablaBaseDatos(String nombreBaseDatos, String tabla, int numeroAtributos) {
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		return super.leerTablaBaseDatos(nombreBaseDatos, tabla, numeroAtributos);
	}
	@Override
	public void actualizarRegistro(String nombreBaseDatos, String tabla, String atributo, String identificador) {
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		super.actualizarRegistro(nombreBaseDatos, tabla, atributo, identificador);
	}
	@Override
	public void eliminarRegistro(String nombreBaseDatos, String tabla, String identificador) {
		nombreBaseDatos = "ud22_ejercicios_db_clientes";
		super.eliminarRegistro(nombreBaseDatos, tabla, identificador);
	}
	@Override
	public String toString() {
		
		String nombreAux;
		String apellidoAux;
		String direccionAux;
		String fechaAux;
		
		if(!this.nombre.equals("")) {
			nombreAux = "'" + this.nombre + "'";
		}else {
			nombreAux = null;
		}
		
		if(!this.apellido.equals("")) {
			apellidoAux = "'" + this.apellido + "'";
		}else {
			apellidoAux = null;
		}
		
		if(!this.direccion.equals("")) {
			direccionAux = "'" + this.direccion + "'";
		}else {
			direccionAux = null;
		}
		
		if(!this.fecha.equals("")) {
			fechaAux = "'" + this.fecha + "'";
		}else {
			fechaAux = "NOW()";
		}
		
		return "(default ," + nombreAux + ", " + apellidoAux + ", " + direccionAux + ", " + dni
				+ ", " + fechaAux + ")";
	}
	
	
	
	

}
