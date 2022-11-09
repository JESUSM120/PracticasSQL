package PracticasSQL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Inscripcion extends JFrame {
	
	conexion con = new conexion();
	private void volver() {
		Menu menu = new Menu();
		menu.setVisible(true);
	}

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtIdAsignatura;
	private JTextField txtIdAlumno;
	private JTextField txtIdProfesor;
	private JTextField txtFecha;
	
	private void limpiarCajas() {
        txtID.setText(null);
        txtIdAlumno.setText(null);
        txtIdProfesor.setText(null);
        txtIdAsignatura.setText(null);
        txtFecha.setText(null);
        
    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inscripcion frame = new Inscripcion();
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
	public Inscripcion() {
		setTitle("Inscripcion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inscripcion");
		lblNewLabel.setBounds(161, 11, 67, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setBounds(27, 49, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID ASIGNATURA:");
		lblNewLabel_2.setBounds(27, 144, 105, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ID ALUMNO:");
		lblNewLabel_3.setBounds(27, 82, 89, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ID PROFESOR:");
		lblNewLabel_4.setBounds(27, 119, 105, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("FECHA:");
		lblNewLabel_5.setBounds(27, 169, 69, 14);
		contentPane.add(lblNewLabel_5);
		
		txtID = new JTextField();
		txtID.setBounds(72, 46, 86, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtIdAsignatura = new JTextField();
		txtIdAsignatura.setBounds(142, 141, 86, 20);
		contentPane.add(txtIdAsignatura);
		txtIdAsignatura.setColumns(10);
		
		txtIdAlumno = new JTextField();
		txtIdAlumno.setBounds(126, 79, 86, 20);
		contentPane.add(txtIdAlumno);
		txtIdAlumno.setColumns(10);
		
		txtIdProfesor = new JTextField();
		txtIdProfesor.setBounds(142, 116, 86, 20);
		contentPane.add(txtIdProfesor);
		txtIdProfesor.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(142, 166, 86, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con.id=txtID.getText();
				con.idalumno=txtIdAlumno.getText();
				con.idprofesor=txtIdProfesor.getText();
				con.idasignatura=txtIdAsignatura.getText();
				con.fecha=txtFecha.getText();
				
				con.InsertarInscripcion();
				
				limpiarCajas();
			}
		});
		btnGuardar.setBounds(289, 45, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con.id=txtID.getText();
		        
		        con.EliminaInscripcion();
		        limpiarCajas();
			}
		});
		btnEliminar.setBounds(289, 92, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con.id=txtID.getText();
		    	
		    	
		    	con.ModificarInscripcion();
		    	
		    	limpiarCajas();
			}
		});
		btnModificar.setBounds(289, 140, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con.id=txtID.getText();
				con.SelecionarIncripcion();
				
				txtIdAlumno.setText(con.idalumno);
				txtIdProfesor.setText(con.idasignatura);
				txtIdAsignatura.setText(con.idasignatura);
				txtFecha.setText(con.fecha);
			}
		});
		btnSeleccionar.setBounds(119, 227, 89, 23);
		contentPane.add(btnSeleccionar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCajas();
			}
		});
		btnLimpiar.setBounds(289, 188, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(289, 227, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnVolver = new JButton("MENU");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();
	        	Inscripcion.this.dispose();
				setVisible(false);
			}
		});
		btnVolver.setBounds(0, 0, 89, 23);
		contentPane.add(btnVolver);
	}
}

