package PracticasSQL;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Profesor extends JFrame {
	
	conexion con = new conexion();
	private void volver() {
		Menu menu = new Menu();
		menu.setVisible(true);
	}
    
    private void limpiarCajas() {
        txtID.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtDireccion.setText(null);
        txtFecha.setText(null);
        txtNivel.setText(null);
    }

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtFecha;
	private JTextField txtNivel;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profesor frame = new Profesor();
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
	public Profesor() {
		setTitle("Profesor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Profesor");
		lblNewLabel.setFont(new Font("Roboto Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(187, 11, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(26, 55, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(26, 80, 83, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido:");
		lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(26, 105, 83, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Direccion:");
		lblNewLabel_4.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(26, 133, 83, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de Nacimiento: ");
		lblNewLabel_5.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(26, 155, 138, 20);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Nivel Academico:");
		lblNewLabel_6.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(26, 186, 138, 14);
		contentPane.add(lblNewLabel_6);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		txtID.setBounds(118, 52, 155, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		txtNombre.setBounds(119, 77, 154, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		txtApellido.setBounds(119, 102, 154, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		txtDireccion.setBounds(119, 130, 154, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setFont(new Font("Roboto Medium", Font.PLAIN, 11));
		txtFecha.setBounds(187, 155, 86, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		txtNivel = new JTextField();
		txtNivel.setFont(new Font("Roboto Medium", Font.PLAIN, 11));
		txtNivel.setBounds(162, 183, 111, 20);
		contentPane.add(txtNivel);
		txtNivel.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con.id=txtID.getText();
				con.SelecionarProfesor();
				
				txtNombre.setText(con.Nombre);
				txtApellido.setText(con.Apellido);
				txtDireccion.setText(con.Direccion);
				txtFecha.setText(con.Fecha_nacimiento);
				txtNivel.setText(con.nivel_academico);
				
			}
		});
		btnBuscar.setBounds(302, 51, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 con.id=txtID.getText();
				 con.Nombre=txtNombre.getText();
				 con.Apellido=txtApellido.getText();
				 con.Direccion=txtDireccion.getText();
				 con.Fecha_nacimiento=txtFecha.getText();
				 con.nivel_academico=txtNivel.getText();
				 
				 con.InsertarProfesor();
				 limpiarCajas();
			}
		});
		btnGuardar.setBounds(302, 96, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con.id=txtID.getText();
		        
		        con.EliminaProfesor();
		        limpiarCajas();
				
			}
		});
		btnEliminar.setBounds(302, 140, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCajas();
			}
		});
		btnLimpiar.setBounds(187, 214, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con.id=txtID.getText();
		    	con.Nombre=txtNombre.getText();
		    	con.Apellido=txtApellido.getText();
		    	con.Direccion=txtDireccion.getText();
		    	con.Fecha_nacimiento=txtFecha.getText();
		    	con.nivel_academico=txtNivel.getText();
		    	
		    	con.ModificarProfesor();
		    	limpiarCajas();
				
			}
		});
		btnModificar.setBounds(302, 182, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(302, 215, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();
	        	Profesor.this.dispose();
				setVisible(false);
			}
		});
		btnMenu.setBounds(0, 0, 89, 23);
		contentPane.add(btnMenu);
	}
}
