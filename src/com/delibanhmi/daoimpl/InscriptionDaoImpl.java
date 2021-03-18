package com.delibanhmi.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.delibanhmi.daofactory.DaoFactory;
import com.delibanhmi.daointerface.InscriptionDaoInterface;
import com.delibanhmi.model.User;
import com.delibanhmi.verification.InscriptionVerification;

public class InscriptionDaoImpl implements InscriptionDaoInterface {

	DaoFactory daoFactory;


	public InscriptionDaoImpl(DaoFactory daoFactory) {
		this.daoFactory=daoFactory;
	}
	
	public boolean ajouterUser(User user) throws SQLException{
		boolean inscription=false;
		Boolean resultat=false;
		ResultSet rs=null;
		Connection connection=null;
		PreparedStatement preparedStatement1=null;
		PreparedStatement preparedStatement=null;
		
		String query="INSERT INTO user (email, password, name, address, telephone) VALUES (?,?,?,?,?)";
		String query1="select * from user where email=?";
		try {
			connection=daoFactory.getConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			preparedStatement1=connection.prepareStatement(query1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		preparedStatement1.setString(1, user.getEmail());
		rs=preparedStatement1.executeQuery();
		resultat=rs.next();
		if(resultat==true) {
		inscription=false;
		
		}else{
			
		preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, user.getEmail());
		preparedStatement.setString(2, user.getPassword());
		preparedStatement.setString(3, user.getName());
		preparedStatement.setString(4, user.getAddress());
		preparedStatement.setString(5, user.getTelephone());
		
		preparedStatement.executeUpdate();
		inscription=true;
		
		}
		return inscription;
	}
	
}






