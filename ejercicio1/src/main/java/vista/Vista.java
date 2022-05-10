package vista;

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

/**
 * 
 * ejercicio1 - vista - Vista
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 10/05/2022
 */
public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		
		textField = new JTextField();
		textField.setBounds(44, 52, 54, 20);
		panelCrear.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id:");
		lblNewLabel.setBounds(20, 55, 25, 14);
		panelCrear.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(108, 55, 61, 14);
		panelCrear.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 52, 122, 20);
		panelCrear.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido:");
		lblNewLabel_2.setBounds(10, 83, 56, 14);
		panelCrear.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(65, 80, 86, 20);
		panelCrear.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Direccion:");
		lblNewLabel_3.setBounds(167, 83, 61, 14);
		panelCrear.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(230, 80, 122, 20);
		panelCrear.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DNI:");
		lblNewLabel_4.setBounds(20, 108, 46, 14);
		panelCrear.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(65, 108, 86, 20);
		panelCrear.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha:");
		lblNewLabel_5.setBounds(174, 108, 46, 14);
		panelCrear.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(230, 108, 86, 20);
		panelCrear.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(139, 157, 89, 23);
		panelCrear.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Crear Usuario");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6.setBounds(20, 11, 106, 21);
		panelCrear.add(lblNewLabel_6);
		
		JPanel panelLeer = new JPanel();
		panelLeer.setBounds(390, 11, 352, 205);
		contentPane.add(panelLeer);
		panelLeer.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 41, 332, 124);
		panelLeer.add(textArea);
		
		JLabel lblNewLabel_6_1 = new JLabel("Filtrar Usuarios");
		lblNewLabel_6_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_6_1.setBounds(33, 9, 117, 21);
		panelLeer.add(lblNewLabel_6_1);
		
		JButton btnNewButton_1 = new JButton("Filtrar");
		btnNewButton_1.setBounds(143, 171, 89, 23);
		panelLeer.add(btnNewButton_1);
		
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
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(184, 12, 54, 20);
		panelActualizar.add(textField_6);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre:");
		lblNewLabel_1_1.setBounds(10, 46, 61, 14);
		panelActualizar.add(lblNewLabel_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(65, 43, 86, 20);
		panelActualizar.add(textField_7);
		
		JLabel lblNewLabel_2_1 = new JLabel("Apellido:");
		lblNewLabel_2_1.setBounds(170, 46, 56, 14);
		panelActualizar.add(lblNewLabel_2_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(230, 43, 86, 20);
		panelActualizar.add(textField_8);
		
		JLabel lblNewLabel_3_1 = new JLabel("Direccion:");
		lblNewLabel_3_1.setBounds(10, 71, 61, 14);
		panelActualizar.add(lblNewLabel_3_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(75, 68, 86, 20);
		panelActualizar.add(textField_9);
		
		JLabel lblNewLabel_4_1 = new JLabel("DNI:");
		lblNewLabel_4_1.setBounds(170, 71, 46, 14);
		panelActualizar.add(lblNewLabel_4_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(230, 68, 86, 20);
		panelActualizar.add(textField_10);
		
		JLabel lblNewLabel_5_1 = new JLabel("Fecha:");
		lblNewLabel_5_1.setBounds(10, 102, 46, 14);
		panelActualizar.add(lblNewLabel_5_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(65, 99, 86, 20);
		panelActualizar.add(textField_11);
		
		JButton btnNewButton_2 = new JButton("Actualizar");
		btnNewButton_2.setBounds(137, 151, 101, 23);
		panelActualizar.add(btnNewButton_2);
		
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
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(34, 43, 54, 20);
		panelBorrar.add(textField_12);
		
		JButton btnNewButton_3 = new JButton("Borrar");
		btnNewButton_3.setBounds(133, 144, 89, 23);
		panelBorrar.add(btnNewButton_3);
	}
}
