package PracticasSQL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Menu extends JFrame {

	private JPanel contentPane;
	
	static Menu frame= null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame=new Menu();
					//frame.setVisible(true);
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Centro Escolar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 326);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Centro Escolar");
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(123, 4, 154, 28);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Alumnos");
		btnNewButton.setBackground(SystemColor.textHighlightText);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Jesus Maldonado\\Downloads\\Alumno.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Escuela1 A1= new Escuela1();
				A1.setVisible(true);
				frame.setVisible(false);
				Menu.this.dispose();
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("MS UI Gothic", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(243, 56, 179, 103);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Asignatura");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Jesus Maldonado\\Downloads\\Asignatura.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Asignaturas M1 = new Asignaturas();
				M1.setVisible(true);
				frame.setVisible(false);
				Menu.this.dispose();
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("MS UI Gothic", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_1.setBounds(29, 176, 198, 93);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Profesor");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Jesus Maldonado\\Downloads\\Profesor1.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profesor P1 = new Profesor();
				P1.setVisible(true);
				Menu.this.dispose();
				frame.setVisible(false);
				Menu.this.dispose();
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("MS UI Gothic", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_2.setBounds(29, 56, 179, 103);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Inscripción");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Jesus Maldonado\\Downloads\\Incripcion.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inscripcion I1 = new Inscripcion();
				I1.setVisible(true);
				frame.setVisible(false);
				Menu.this.dispose();
				setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("MS UI Gothic", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_3.setBounds(243, 176, 179, 93);
		contentPane.add(btnNewButton_3);
	}
}
