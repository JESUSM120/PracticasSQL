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

public class Asignaturas extends JFrame {
	conexion con = new conexion();
	
	private void volver() {
		Menu menu = new Menu();
		menu.setVisible(true);
	}
	
    private void limpiarCajas() {
        txtID.setText(null);
        txtAsignatura.setText(null);
        
    }

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtAsignatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Asignaturas frame = new Asignaturas();
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
	public Asignaturas() {
		setTitle("Asignatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 278);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Asignatura");
		lblNewLabel.setFont(new Font("Roboto Black", Font.PLAIN, 14));
		lblNewLabel.setBounds(122, 11, 87, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 47, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de la Asignatura");
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 80, 159, 14);
		contentPane.add(lblNewLabel_2);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		txtID.setBounds(63, 44, 86, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtAsignatura = new JTextField();
		txtAsignatura.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		txtAsignatura.setBounds(166, 77, 198, 20);
		contentPane.add(txtAsignatura);
		txtAsignatura.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con.id=txtID.getText();
				con.SelecionarAsignatura();
				
				txtAsignatura.setText(con.Nombre);
				
			}
		});
		btnBuscar.setBounds(10, 116, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con.id=txtID.getText();
				con.Nombre=txtAsignatura.getText();
				
				con.InsertarAsignatura();
				limpiarCajas();
			}
		});
		btnAgregar.setBounds(120, 116, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con.id=txtID.getText();
				
				con.EliminaAignatura();

			}
		});
		btnEliminar.setBounds(219, 116, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con.id=txtID.getText();
				con.Nombre=txtAsignatura.getText();
				
				con.ModificarAsignatura();
			}
		});
		btnModificar.setBounds(40, 168, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCajas();
			}
		});
		btnLimpiar.setBounds(139, 168, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnNewButton.setBounds(252, 169, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnVolver = new JButton("MENU");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();
	        	Asignaturas.this.dispose();
				setVisible(false);
			}
		});
		btnVolver.setBounds(0, 0, 89, 23);
		contentPane.add(btnVolver);
	}
}

