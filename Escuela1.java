package PracticasSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Escuela1 extends javax.swing.JFrame {

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
        
    }

    public Escuela1() {
    	setTitle("Alumno");
    	getContentPane().setBackground(new Color(255, 255, 128));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        txtID = new javax.swing.JTextField();
        txtID.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        txtID.setBackground(new Color(255, 255, 255));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        txtNombre = new javax.swing.JTextField();
        txtNombre.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        txtApellido = new javax.swing.JTextField();
        txtApellido.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        txtFecha = new javax.swing.JTextField();
        txtFecha.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        btnGuardar = new javax.swing.JButton();
        btnGuardar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        btnModificar = new javax.swing.JButton();
        btnModificar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        btnEliminar = new javax.swing.JButton();
        btnEliminar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        btnLimpiar = new javax.swing.JButton();
        btnLimpiar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        btnBuscar = new javax.swing.JButton();
        btnBuscar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        txtDireccion = new javax.swing.JTextField();
        txtDireccion.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("Roboto Black", Font.PLAIN, 14));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Fecha de Nacimiento");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Direccion:");

        jLabel6.setText("ALUMNOS");
        
        JButton btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        btnSalir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
    				System.exit(0);
        	}
        });
        
        JButton btnMenu = new JButton("MENU");
        btnMenu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	volver();
        	Escuela1.this.dispose();
			setVisible(false);
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(25, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel6)
        					.addGap(166))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jLabel5)
        									.addGap(18)
        									.addComponent(txtDireccion, 178, 178, 178))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jLabel3)
        									.addGap(18)
        									.addComponent(txtApellido, 184, 184, 184))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jLabel4)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(txtFecha, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(jLabel2)
        										.addComponent(jLabel1))
        									.addGap(18)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(txtNombre, 184, 184, 184)
        										.addComponent(txtID, 184, 184, 184))))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(btnBuscar)
        								.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(btnGuardar)
        							.addGap(18)
        							.addComponent(btnModificar)
        							.addGap(18)
        							.addComponent(btnEliminar)
        							.addGap(18)
        							.addComponent(btnLimpiar)))
        					.addGap(20)))
        			.addGap(20))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addComponent(btnMenu)
        			.addContainerGap(342, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(btnMenu)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel6)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnBuscar)))
        				.addComponent(jLabel1))
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel2)
        						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel3)
        						.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel5)
        						.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(19)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(txtFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel4))
        					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnSalir)
        					.addGap(18)))
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnGuardar)
        				.addComponent(btnModificar)
        				.addComponent(btnEliminar)
        				.addComponent(btnLimpiar))
        			.addGap(23))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	con.id=txtID.getText();
    	con.Nombre=txtNombre.getText();
    	con.Apellido=txtApellido.getText();
    	con.Direccion=txtDireccion.getText();
    	con.Fecha_nacimiento=txtFecha.getText();
    	
    	con.InsertarAlumno();
    	limpiarCajas();
    }                                          

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    	con.id=txtID.getText();
		con.SelecionaAlumno();
		
		
		txtNombre.setText(con.Nombre);
		txtApellido.setText(con.Apellido);
		txtDireccion.setText(con.Direccion);
		txtFecha.setText(con.Fecha_nacimiento);
		
		
		
		
        
    }                                         

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    	con.id=txtID.getText();
    	con.Nombre=txtNombre.getText();
    	con.Apellido=txtApellido.getText();
    	con.Direccion=txtDireccion.getText();
    	con.Fecha_nacimiento=txtFecha.getText();
    	
    	con.ModificarAlumno();
    	limpiarCajas();
        
    }                                            

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        con.id=txtID.getText();
        
        con.EliminaAlumno();
        limpiarCajas();
        
    }                                           

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        limpiarCajas();
    }                                          

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Escuela1().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
}
