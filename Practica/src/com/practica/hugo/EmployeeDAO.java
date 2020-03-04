package com.practica.hugo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.practica.hugo.IDBConnection.*;
import static com.practica.hugo.Database.*;

public interface EmployeeDAO extends IDBConnection {
	default ArrayList<Empleado> read() {
		
		ArrayList<Empleado> empleados = new ArrayList();
		
		try(Connection connection = connectToDB()) {
			String query = "SELECT * FROM " + TFUNCIONARIO;
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				Empleado empleado = new Empleado(
						rs.getString(TFUNCIONARIO_NOMBRE), 
						Double.valueOf(rs.getString(TFUNCIONARIO_SALARIO)));
				
				empleado.setId(Integer.valueOf(rs.getString(TFUNCIONARIO_ID)));
				empleados.add(empleado);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return empleados;
	}
}
