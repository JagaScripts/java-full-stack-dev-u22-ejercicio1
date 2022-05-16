package com.team2.u22.ejercicio1.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * ejercicio1 - vista - Vista
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 *         Fecha de creación 10/05/2022
 */
public class Vista extends JFrame {

	public JPanel contentPane;
	public JTextField nombreCUTextField;
	public JTextField apellidoCUTextField;
	public JTextField direccionCUTextField;
	public JTextField dniCUTextField;
	public JTextField fechaCUTextField;
	public JTextField idAUTextField;
	public JTextField nombreAUTextField;
	public JTextField apellidoAUTextField;
	public JTextField direccionAUTextField;
	public JTextField dniAUTextField;
	public JTextField fechaAUTextField;
	public JTextField idBUTextField;
	public JTextArea textArea;

	public JButton botonCU;
	public JButton botonAU;
	public JButton botonFU;
	public JButton botonBU;

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelCrear = new JPanel();
		panelCrear.setBounds(10, 11, 352, 205);
		contentPane.add(panelCrear);
		panelCrear.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(10, 55, 61, 14);
		panelCrear.add(lblNewLabel_1);

		nombreCUTextField = new JTextField();
		nombreCUTextField.setBounds(65, 52, 122, 20);
		panelCrear.add(nombreCUTextField);
		nombreCUTextField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Apellido:");
		lblNewLabel_2.setBounds(10, 83, 56, 14);
		panelCrear.add(lblNewLabel_2);

		apellidoCUTextField = new JTextField();
		apellidoCUTextField.setBounds(65, 80, 86, 20);
		panelCrear.add(apellidoCUTextField);
		apellidoCUTextField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Direccion:");
		lblNewLabel_3.setBounds(167, 83, 61, 14);
		panelCrear.add(lblNewLabel_3);

		direccionCUTextField = new JTextField();
		direccionCUTextField.setBounds(230, 80, 122, 20);
		panelCrear.add(direccionCUTextField);
		direccionCUTextField.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("DNI:");
		lblNewLabel_4.setBounds(20, 108, 46, 14);
		panelCrear.add(lblNewLabel_4);

		dniCUTextField = new JTextField();
		dniCUTextField.setBounds(65, 108, 86, 20);
		panelCrear.add(dniCUTextField);
		dniCUTextField.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Fecha:");
		lblNewLabel_5.setBounds(174, 108, 46, 14);
		panelCrear.add(lblNewLabel_5);

		fechaCUTextField = new JTextField();
		fechaCUTextField.setBounds(230, 108, 86, 20);
		panelCrear.add(fechaCUTextField);
		fechaCUTextField.setColumns(10);

		botonCU = new JButton("Enviar");
		botonCU.setBounds(139, 157, 89, 23);
		panelCrear.add(botonCU);

		JLabel lblNewLabel_6 = new JLabel("Crear Usuario");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6.setBounds(20, 11, 106, 21);
		panelCrear.add(lblNewLabel_6);

		JPanel panelLeer = new JPanel();
		panelLeer.setBounds(416, 49, 352, 205);
		contentPane.add(panelLeer);
		panelLeer.setLayout(null);

		textArea = new JTextArea();
		textArea.setBounds(10, 41, 332, 124);
		panelLeer.add(textArea);

		JLabel lblNewLabel_6_1 = new JLabel("Filtrar Usuarios");
		lblNewLabel_6_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_1.setBounds(33, 9, 117, 21);
		panelLeer.add(lblNewLabel_6_1);

		botonFU = new JButton("Filtrar");
		botonFU.setBounds(143, 171, 89, 23);
		panelLeer.add(botonFU);

		JPanel panelActualizar = new JPanel();
		panelActualizar.setBounds(10, 239, 352, 205);
		contentPane.add(panelActualizar);
		panelActualizar.setLayout(null);

		JLabel lblNewLabel_6_2 = new JLabel("Actualizar Usuario");
		lblNewLabel_6_2.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_2.setBounds(10, 11, 140, 21);
		panelActualizar.add(lblNewLabel_6_2);

		JLabel lblNewLabel_7 = new JLabel("Id:");
		lblNewLabel_7.setBounds(160, 15, 25, 14);
		panelActualizar.add(lblNewLabel_7);

		idAUTextField = new JTextField();
		idAUTextField.setColumns(10);
		idAUTextField.setBounds(184, 12, 54, 20);
		panelActualizar.add(idAUTextField);

		JLabel lblNewLabel_1_1 = new JLabel("Nombre:");
		lblNewLabel_1_1.setBounds(10, 46, 61, 14);
		panelActualizar.add(lblNewLabel_1_1);

		nombreAUTextField = new JTextField();
		nombreAUTextField.setColumns(10);
		nombreAUTextField.setBounds(65, 43, 86, 20);
		panelActualizar.add(nombreAUTextField);

		JLabel lblNewLabel_2_1 = new JLabel("Apellido:");
		lblNewLabel_2_1.setBounds(170, 46, 56, 14);
		panelActualizar.add(lblNewLabel_2_1);

		apellidoAUTextField = new JTextField();
		apellidoAUTextField.setColumns(10);
		apellidoAUTextField.setBounds(230, 43, 86, 20);
		panelActualizar.add(apellidoAUTextField);

		JLabel lblNewLabel_3_1 = new JLabel("Direccion:");
		lblNewLabel_3_1.setBounds(10, 71, 61, 14);
		panelActualizar.add(lblNewLabel_3_1);

		direccionAUTextField = new JTextField();
		direccionAUTextField.setColumns(10);
		direccionAUTextField.setBounds(75, 68, 86, 20);
		panelActualizar.add(direccionAUTextField);

		JLabel lblNewLabel_4_1 = new JLabel("DNI:");
		lblNewLabel_4_1.setBounds(170, 71, 46, 14);
		panelActualizar.add(lblNewLabel_4_1);

		dniAUTextField = new JTextField();
		dniAUTextField.setColumns(10);
		dniAUTextField.setBounds(230, 68, 86, 20);
		panelActualizar.add(dniAUTextField);

		JLabel lblNewLabel_5_1 = new JLabel("Fecha:");
		lblNewLabel_5_1.setBounds(10, 102, 46, 14);
		panelActualizar.add(lblNewLabel_5_1);

		fechaAUTextField = new JTextField();
		fechaAUTextField.setColumns(10);
		fechaAUTextField.setBounds(65, 99, 86, 20);
		panelActualizar.add(fechaAUTextField);

		botonAU = new JButton("Actualizar");
		botonAU.setBounds(137, 151, 101, 23);
		panelActualizar.add(botonAU);

		JPanel panelBorrar = new JPanel();
		panelBorrar.setBounds(390, 239, 352, 205);
		contentPane.add(panelBorrar);
		panelBorrar.setLayout(null);

		JLabel lblNewLabel_6_3 = new JLabel("Borrar Usuario");
		lblNewLabel_6_3.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_3.setBounds(10, 11, 113, 21);
		panelBorrar.add(lblNewLabel_6_3);

		JLabel lblNewLabel_7_1 = new JLabel("Id:");
		lblNewLabel_7_1.setBounds(10, 46, 25, 14);
		panelBorrar.add(lblNewLabel_7_1);

		idBUTextField = new JTextField();
		idBUTextField.setColumns(10);
		idBUTextField.setBounds(34, 43, 54, 20);
		panelBorrar.add(idBUTextField);

		botonBU = new JButton("Borrar");
		botonBU.setBounds(133, 144, 89, 23);
		panelBorrar.add(botonBU);
	}
}
