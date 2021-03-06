/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
/**
 *
 * @author Alex
 */
public class EmpleadoDAO {
    Conexion conexion;
    
    public EmpleadoDAO(){
        conexion = new Conexion();
    }
    
public Empleado verificaUsuario(String dni, String password, String privilegio){
    Empleado empleado= null;
    Connection accesoBD = conexion.getConexion();
    try {
        PreparedStatement ps = accesoBD.prepareStatement("select * from empleado where dni=? and password=? and privilegio=?");
        ps.setString(1, dni);
        ps.setString(2, password);
        ps.setString(3, privilegio);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            empleado = new Empleado();
            empleado.setDni(rs.getString(1));
            empleado.setPassword(rs.getString(2));
            empleado.setApellidos(rs.getString(3));
            empleado.setNombres(rs.getString(4));
            empleado.setPrivilegio(rs.getString(5));
        }
    } catch(Exception e){
    }
    return empleado;
}    
}
