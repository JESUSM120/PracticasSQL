package PracticasSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class conexion {
	String id;
	String Nombre;
	String Apellido;
	String Direccion;
	String Fecha_nacimiento;
	String nivel_academico;
	String idasignatura;
	String idalumno;
	String idprofesor;
	String fecha;
	
	private void limpiarCajas() {
        id=" ";
        Nombre=" ";
        Apellido="";
        Direccion=" ";
        Fecha_nacimiento=" ";
        nivel_academico=" ";
        idasignatura=""; 
        idalumno=" ";
        idprofesor=" ";
        fecha=" ";
    }
	
	
	Connection conexion = null;

    String usuario = "sa";
    String contrasena = "123";
    String db = "Escuela2";
    String puerto = "1433";

    public Connection obtenerConexion() {
        try {
            String cadena = "jdbc:sqlserver://DESKTOP-SH31L6B: " + puerto + ";" + "databaseName=" + db;
            conexion = DriverManager.getConnection(cadena, usuario, contrasena);
            System.out.println("Conexion exitosa :)");
        } catch (Exception e) {
            System.out.printf("Error: " + e.toString());
        }
        return conexion;
    }
    
    //Conexion Alumnos
    
    
    public PreparedStatement InsertarAlumno() {
    	conexion op=new conexion();
    	Connection cn=null;
    	PreparedStatement ps=null;
    	try {
    		cn=op.obtenerConexion();
    		String insert="INSERT INTO Alumnos0 VALUES(?,?,?,?,?)";
    		ps=cn.prepareStatement(insert);
    	
			
			ps.setString(1, id);
			ps.setString(2, Nombre);
			ps.setString(3, Apellido);
			ps.setString(4, Direccion);
			ps.setString(5, Fecha_nacimiento);
			
			ps.executeUpdate();
			System.out.print("Registro Insertado");
			JOptionPane.showMessageDialog(null, "Registro Agregado");
    	}catch(Exception e) {
    		System.out.print("Registro No Insertado");
    		e.printStackTrace();
    	}
    		
    		
		return ps;
    }
    public PreparedStatement EliminaAlumno() {
    	conexion op = new conexion();
    	Connection cn=null;
    	PreparedStatement ps = null;
    	try {
    		cn=op.obtenerConexion();
    		String query="DELETE FROM Alumnos0 WHERE id =?";
    		ps=cn.prepareStatement(query);
    				
			ps.setString(1, id);
    		
			int res = ps.executeUpdate();
			
			if (res > 0) {
                JOptionPane.showMessageDialog(null, "Alumno Eliminado");
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                
            }
			cn.close();
			
    	
    	}catch(Exception e) {
    		System.out.println("Error al eliminar");
    		e.printStackTrace();
    	}
    	return ps;
    	
    }
    public PreparedStatement SelecionaAlumno() {
    	conexion con = new conexion();
    	Connection cn = null;
    	PreparedStatement ps = null;
    	ResultSet rs=null;
    	try {
    		cn=con.obtenerConexion();
			String seleccionar="Select * from Alumnos0 where id=?";
			ps=cn.prepareStatement(seleccionar);
			ps.setString(1, id);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				id=rs.getString(1);
				Nombre=rs.getString(2);
				Apellido=rs.getString(3);
				Direccion=rs.getString(4);
				Fecha_nacimiento=rs.getString(5);
				System.out.println("Seleccion exitosa");
			}else {
				JOptionPane.showMessageDialog(null, "No existe una persona con ese ID");
				limpiarCajas();
				
			}
    	}catch(Exception e) {
    		System.out.println("Error al seleccionar");
    		e.printStackTrace();
    	}
    	return ps;
    }
    public PreparedStatement ModificarAlumno() {
    	conexion con = new conexion();
    	Connection cn = null;
    	PreparedStatement ps=null;
    	try {
    		cn=con.obtenerConexion();
    		String modificar="UPDATE Alumnos0 SET Nombre=?, Apellido=?,Direccion=?, Fecha_nacimiento=? WHERE ID = ?";
    		ps=cn.prepareStatement(modificar);
    		ps.setString(1, Nombre);
    		ps.setString(2, Apellido);
    		ps.setString(3, Direccion);
    		ps.setString(4, Fecha_nacimiento);
    		ps.setString(5, id);
    		
    		ps.executeUpdate();
    		
    		System.out.println("Registro Modificado");
    		JOptionPane.showMessageDialog(null, "Registro Actualizado");
    	}catch (Exception e) {
			// TODO: handle exception
    		System.out.println("Error al modificar");
    		e.printStackTrace();
		}
    	return ps;
    }
    
    
    //Tabla Asignatura
    
    public PreparedStatement InsertarAsignatura(){
    	conexion op=new conexion();
    	Connection cn=null;
    	PreparedStatement ps=null;
    	try {
    		cn=op.obtenerConexion();
    		String insert="INSERT INTO asignatura0 VALUES(?,?)";
    		ps=cn.prepareStatement(insert);
    	
			
			ps.setString(1, id);
			ps.setString(2, Nombre);
			ps.executeUpdate();
			
			System.out.print("Registro Insertado");
			JOptionPane.showMessageDialog(null, "Registro Agregado");
    	}catch(Exception e) {
    		System.out.print("Registro No Insertado");
    		e.printStackTrace();
    	}	
		return ps;
    }
    
    public PreparedStatement SelecionarAsignatura() {
    	conexion con = new conexion();
    	Connection cn = null;
    	PreparedStatement ps = null;
    	ResultSet rs=null;
    	try {
    		cn=con.obtenerConexion();
			String seleccionar="Select * from asignatura0 where id=?";
			ps=cn.prepareStatement(seleccionar);
			ps.setString(1, id);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				id=rs.getString(1);
				Nombre=rs.getString(2);
				}else {
					JOptionPane.showMessageDialog(null, "No existe una asignatura con ese ID");
					limpiarCajas();
				}
    	}catch(Exception e) {
    		System.out.println("Error al seleccionar");
    		e.printStackTrace();
    	}
    	return ps;
    }
    
    public PreparedStatement EliminaAignatura() {
    	conexion op = new conexion();
    	Connection cn=null;
    	PreparedStatement ps = null;
    	try {
    		cn=op.obtenerConexion();
    		String query="DELETE FROM asignatura0 WHERE id =?";
    		ps=cn.prepareStatement(query);
    				
			ps.setString(1, id);
    		
			int res = ps.executeUpdate();
			
			if (res > 0) {
                JOptionPane.showMessageDialog(null, "Asignatura Eliminado");
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                
            }
			cn.close();
			
    	
    	}catch(Exception e) {
    		System.out.println("Error al eliminar");
    		e.printStackTrace();
    	}
    	return ps;
    	
    }
    public PreparedStatement ModificarAsignatura() {
    	conexion con = new conexion();
    	Connection cn = null;
    	PreparedStatement ps=null;
    	try {
    		cn=con.obtenerConexion();
    		String modificar="UPDATE asignatura0 SET nomnre=? WHERE ID = ?";
    		ps=cn.prepareStatement(modificar);
    		ps.setString(1, Nombre);
    		ps.setString(2, id);
    		
    		ps.executeUpdate();
    		System.out.println("Registro Modificado");
    		JOptionPane.showMessageDialog(null, "Registro Actualizado");
    	}catch (Exception e) {
			// TODO: handle exception
    		System.out.println("Error al modificar");
    		e.printStackTrace();
		}
    	return ps;
    }
    
    //Conexion Profesor
    //--------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------
    public PreparedStatement InsertarProfesor(){
    	conexion op=new conexion();
    	Connection cn=null;
    	PreparedStatement ps=null;
    	try {
    		cn=op.obtenerConexion();
    		String insert="INSERT INTO profesor0 VALUES(?,?,?,?,?,?)";
    		ps=cn.prepareStatement(insert);
    	
			
			ps.setString(1, id);
			ps.setString(2, Nombre);
			ps.setString(3, Apellido);
			ps.setString(4, Direccion);
			ps.setString(5, Fecha_nacimiento);
			ps.setString(6, nivel_academico);
			
			ps.executeUpdate();
			System.out.print("Registro Insertado");
			JOptionPane.showMessageDialog(null, "Registro Agregado");
    	}catch(Exception e) {
    		System.out.print("Registro No Insertado");
    		e.printStackTrace();
    	}
    		
    		
		return ps;
    }
    
    public PreparedStatement SelecionarProfesor() {
    	conexion con = new conexion();
    	Connection cn = null;
    	PreparedStatement ps = null;
    	ResultSet rs=null;
    	try {
    		cn=con.obtenerConexion();
			String seleccionar="Select * from profesor0 where id=?";
			ps=cn.prepareStatement(seleccionar);
			ps.setString(1, id);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				id=rs.getString(1);
				Nombre=rs.getString(2);
				Apellido=rs.getString(3);
				Direccion=rs.getString(4);
				Fecha_nacimiento=rs.getString(5);
				nivel_academico=rs.getString(6);
				}else {
					JOptionPane.showMessageDialog(null, "No existe una persona con ese ID");
					limpiarCajas();
				}
    	}catch(Exception e) {
    		System.out.println("Error al seleccionar");
    		e.printStackTrace();
    	}
    	return ps;
    }
    
    public PreparedStatement EliminaProfesor() {
    	conexion op = new conexion();
    	Connection cn=null;
    	PreparedStatement ps = null;
    	try {
    		cn=op.obtenerConexion();
    		String query="DELETE FROM profesor0 WHERE id =?";
    		ps=cn.prepareStatement(query);
    				
			ps.setString(1, id);
    		
			int res = ps.executeUpdate();
			
			if (res > 0) {
                JOptionPane.showMessageDialog(null, "Alumno Eliminado");
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                
            }
			cn.close();
			
    	
    	}catch(Exception e) {
    		System.out.println("Error al eliminar");
    		e.printStackTrace();
    	}
    	return ps;
    	
    }
    public PreparedStatement ModificarProfesor() {
    	conexion con = new conexion();
    	Connection cn = null;
    	PreparedStatement ps=null;
    	try {
    		cn=con.obtenerConexion();
    		String modificar="UPDATE profesor0 SET Nombre=?, Apellido=?,Direccion=?, Fecha_nacimiento=?, nivel_academico=? WHERE ID = ?";
    		ps=cn.prepareStatement(modificar);
    		ps.setString(1, Nombre);
    		ps.setString(2, Apellido);
    		ps.setString(3, Direccion);
    		ps.setString(4, Fecha_nacimiento);
    		ps.setString(5, nivel_academico);
    		ps.setString(6, id);
    		
    		ps.executeUpdate();
    		System.out.println("Registro Modificado");
    		JOptionPane.showMessageDialog(null, "Registro Actualizado");
    	}catch (Exception e) {
			// TODO: handle exception
    		System.out.println("Error al modificar");
    		e.printStackTrace();
		}
    	return ps;
    }
    
    //Conexion Incripcion.
    public PreparedStatement InsertarInscripcion(){
    	conexion op=new conexion();
    	Connection cn=null;
    	PreparedStatement ps=null;
    	try {
    		cn=op.obtenerConexion();
    		String insert="INSERT INTO inscripcion0 VALUES(?,?,?,?,?)";
    		ps=cn.prepareStatement(insert);
    	
			
			ps.setString(1, id);
			ps.setString(2, idasignatura);
			ps.setString(3, idalumno);
			ps.setString(4, idprofesor);
			ps.setString(5, fecha);
			
			ps.executeUpdate();
			
			System.out.print("Registro Insertado");
			JOptionPane.showMessageDialog(null, "Registro Agregado");
    	}catch(Exception e) {
    		System.out.print("Registro No Insertado");
    		e.printStackTrace();
    	}
    		
    		
		return ps;
    }
    public PreparedStatement SelecionarIncripcion() {
    	conexion con = new conexion();
    	Connection cn = null;
    	PreparedStatement ps = null;
    	ResultSet rs=null;
    	try {
    		cn=con.obtenerConexion();
			String seleccionar="Select * from inscripcion0 where id=?";
			ps=cn.prepareStatement(seleccionar);
			ps.setString(1, id);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				id=rs.getString(1);
				idalumno=rs.getString(2);
				idprofesor=rs.getString(3);
				idasignatura=rs.getString(4);
				fecha=rs.getString(5);
				
				}else {
					JOptionPane.showMessageDialog(null, "No existe una incripcion con ese ID");
					limpiarCajas();
				}
    	}catch(Exception e) {
    		System.out.println("Error al seleccionar");
    		e.printStackTrace();
    	}
    	return ps;
    }
    
    public PreparedStatement EliminaInscripcion() {
    	conexion op = new conexion();
    	Connection cn=null;
    	PreparedStatement ps = null;
    	try {
    		cn=op.obtenerConexion();
    		String query="DELETE FROM inscripcion0 WHERE id =?";
    		ps=cn.prepareStatement(query);
    				
			ps.setString(1, id);
    		
			int res = ps.executeUpdate();
			
			if (res > 0) {
                JOptionPane.showMessageDialog(null, "Incripcion Eliminada");
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                
            }
			cn.close();
			
    	
    	}catch(Exception e) {
    		System.out.println("Error al eliminar");
    		e.printStackTrace();
    	}
    	return ps;
    	
    }
    public PreparedStatement ModificarInscripcion() {
    	conexion con = new conexion();
    	Connection cn = null;
    	PreparedStatement ps=null;
    	try {
    		cn=con.obtenerConexion();
    		String modificar="UPDATE inscripcion0 SET id=?, idalumno=?,idprofesor=?, idasignatura=?, fecha=? WHERE ID = ?";
    		ps=cn.prepareStatement(modificar);
    		ps.setString(1, id);
    		ps.setString(2, idalumno);
    		ps.setString(3, idprofesor);
    		ps.setString(4, idasignatura);
    		ps.setString(5, fecha);

    		
    		ps.executeUpdate();
    		System.out.println("Registro Modificado");
    		JOptionPane.showMessageDialog(null, "Registro Actualizado");
    	}catch (Exception e) {
			// TODO: handle exception
    		System.out.println("Error al modificar");
    		e.printStackTrace();
		}
    	return ps;
    }

}
