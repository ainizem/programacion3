package com.centrosanluis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.centrosanluis.model.Rol;

public class RolDAO {

	public ArrayList<Rol> getRoles() {

		ArrayList<Rol> listadoRoles = new ArrayList<Rol>();

		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		// Usuario u = new Usuario();

		String sql = "SELECT id, rol " + "FROM roles ";

		try {
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {

				Rol r = new Rol(); // hacer el new user dentro del while

				r.setId(rs.getInt("id"));
				r.setRol(rs.getString("rol"));

				listadoRoles.add(r);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		System.out.println("DAO: "+listadoRoles);
		return listadoRoles;

	}
}
