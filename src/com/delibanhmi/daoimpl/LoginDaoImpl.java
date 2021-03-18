package com.delibanhmi.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.delibanhmi.daofactory.DaoFactory;
import com.delibanhmi.daointerface.LoginDaoInterface;

public class LoginDaoImpl implements LoginDaoInterface {
DaoFactory daoFactory;
	public LoginDaoImpl(DaoFactory daoFactory) {
		this.daoFactory=daoFactory;
	}


	


	public String trouverUser(HttpServletRequest request) {
		Connection connection=null;
		PreparedStatement preparedStatement= null;
		ResultSet resultset=null;
		boolean trouverUser=false;
		String typeUser;
		String email="admin@gmail.com";
		try {
			connection=daoFactory.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query="select * from user where email=? and password=?";
		
		
		try {
			preparedStatement=connection.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			preparedStatement.setString(1, request.getParameter("email"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			preparedStatement.setString(2, request.getParameter("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			resultset=preparedStatement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			trouverUser=resultset.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(trouverUser) {
			if(request.getParameter("email").equals(email)) {
				typeUser="admin";
				//return typeUser;
			}else {
				typeUser="client";
				//return typeUser;
			}
		}else {
			typeUser="votre mail et password ne sont pas correct";
			//return typeUser;
		}
		return typeUser;
	}

}
